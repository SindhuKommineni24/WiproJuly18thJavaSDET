/*package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeStepDefinition {
    WebDriver driver;

    @Given("the user is on the practice registration page")
    public void the_user_is_on_the_practice_registration_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        System.out.println("Browser launched and navigated to practice page");
    }

    @When("the user fills in the registration form with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_in_the_registration_form(String name, String email, String gender,
                                                        String mobile, String dob, String subjects,
                                                        String hobbies, String address, String picture,
                                                        String state, String city) throws InterruptedException {
        // Name
        driver.findElement(By.id("name")).sendKeys(name);
        Thread.sleep(3000);

        // Email
        driver.findElement(By.id("email")).sendKeys(email);
        Thread.sleep(3000);

        // Gender
        driver.findElement(By.id("gender")).sendKeys(gender);
        Thread.sleep(3000);

        // Mobile
        driver.findElement(By.id("mobile")).sendKeys(mobile);
        Thread.sleep(3000);

        // Date of Birth
        driver.findElement(By.id("dob")).sendKeys(dob);
        Thread.sleep(3000);

        // Subjects
        driver.findElement(By.id("subjects")).sendKeys(subjects);
        Thread.sleep(3000);

        // Hobbies
        driver.findElement(By.xpath("//input[@id='hobbies']")).click();
        Thread.sleep(3000);

        // Address
        driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys(address);
        Thread.sleep(3000);

        // Picture Upload (from local system)
        driver.findElement(By.id("picture")).sendKeys(picture);
        Thread.sleep(3000);

        // State
        driver.findElement(By.id("state")).sendKeys(state);
        Thread.sleep(3000);

        // City
        driver.findElement(By.id("city")).sendKeys(city);
        Thread.sleep(3000);

        // Submit
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(4000);
    }

    @Then("the form should be submitted successfully")
    public void the_form_should_be_submitted_successfully() throws InterruptedException {
        System.out.println("Form submitted successfully");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Browser closed");
    }
}*/


package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PracticeLoginPage;

public class PracticeStepDefinition {

    WebDriver driver;
    PracticeLoginPage loginPage;

    @Given("the user is on the practice registration page")
    public void the_user_is_on_the_practice_registration_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        loginPage = new PracticeLoginPage(driver);
        System.out.println("Browser launched and navigated to practice page");
    }

    @When("the user fills in the registration form with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_in_the_registration_form(String name, String email, String gender,
                                                        String mobile, String dob, String subjects,
                                                        String hobbies, String address, String picture,
                                                        String state, String city) throws InterruptedException {

        loginPage.enterName(name);
        loginPage.enterEmail(email);
        loginPage.enterGender(gender);
        loginPage.enterMobile(mobile);
        loginPage.enterDob(dob);
        loginPage.enterSubjects(subjects);
        loginPage.selectHobbies();
        loginPage.enterAddress(address);
        loginPage.uploadPicture(picture);
        loginPage.enterState(state);
        loginPage.enterCity(city);
        loginPage.submitForm();
    }

    @Then("the form should be submitted successfully")
    public void the_form_should_be_submitted_successfully() throws InterruptedException {
        System.out.println("Form submitted successfully");
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Browser closed");
    }
}