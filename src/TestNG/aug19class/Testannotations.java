package labsessionaug19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testannotations {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
    	
        System.out.println("Incorrect Login");
    }

    @AfterTest
    public void afterTest() {
    	
        System.out.println("Incorrect Logout");
    }
    
    @BeforeSuite
    public void beforeSuite() {
    	
        System.out.println("Login");
    }

    @AfterSuite
    public void afterSuite() {
    	
        System.out.println("Logout");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Initializing WebDriver");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        
        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver(chromeOptions);
        
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
    	
        System.out.println("Closing WebDriver");
        
        Thread.sleep(1000);
        
        driver.quit();
    }
    
    @BeforeClass
    public void beforeClass() {
    	
        System.out.println("Login Incorrect password");
    }

    @AfterClass
    public void afterClass() {
    	
        System.out.println("Logout Incorrect password");
    }

    // Test Case 1: Positive Login Test
    @Test
    public void positiveLoginTest() throws InterruptedException {
    	
        driver.get("https://practicetestautomation.com/practice-test-login/");
        
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.id("username"));
        
        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        
        password.sendKeys("Password123");

        WebElement submitButton = driver.findElement(By.id("submit"));
        
        submitButton.click();

        Thread.sleep(2000);

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("logged-in-successfully")) {
            System.out.println("logged-in-successfully");
        } else {
            System.out.println("login failed");
        }

        WebElement message = driver.findElement(By.tagName("h1"));
        if (message.getText().contains("Logged In Successfully")) {
            System.out.println("Success Message Verified");
        } else {
            System.out.println("Success message not found");
        }

        WebElement logoutBtn = driver.findElement(By.linkText("Log out"));
        if (logoutBtn.isDisplayed()) {
            System.out.println("Log out Button is displayed");
        } else {
            System.out.println("Log out button is not displayed!");
        }
    }

    // Test Case 2: Negative Username Test
    @Test
    public void negativeUsernameTest() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("helouser");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();

        Thread.sleep(2000);

        WebElement error = driver.findElement(By.id("error"));
        if (error.isDisplayed()) {
            String actualError = error.getText();
            if (actualError.equals("Your username is invalid!")) {
                System.out.println("Correct error message displayed.");
            } else {
                System.out.println("Unexpected error message");
            }
        } else {
            System.out.println("Error message not displayed!");
        }
    }

    // Test Case 3: Negative Password Test
    @Test
    public void negativePasswordTest() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password7654");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();

        Thread.sleep(2000);

        WebElement error = driver.findElement(By.id("error"));
        if (error.isDisplayed()) {
            String actualError = error.getText();
            if (actualError.equals("Your password is invalid!")) {
                System.out.println("Correct error message displayed");
            } else {
                System.out.println("Unexpected error message");
            }
        } else {
            System.out.println("Error message not displayed!");
        }
    }
}