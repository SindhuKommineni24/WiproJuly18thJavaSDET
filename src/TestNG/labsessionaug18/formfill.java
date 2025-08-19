package labsessionaug18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class formfill {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
    }

    @Test(groups = {"Sanity"})
    public void fillFormAndSubmit() throws InterruptedException {
        // enter first name
        driver.findElement(By.name("firstname")).sendKeys("Sindhu");

        // enter last name
        driver.findElement(By.name("lastname")).sendKeys("Kommineni");

        // select gender
        driver.findElement(By.id("sex-1")).click();

        // select years of experience
        driver.findElement(By.id("exp-0")).click();

        // enter date
        driver.findElement(By.id("datepicker")).sendKeys("18/8/2025");

        // select profession
        driver.findElement(By.id("profession-1")).click();

        // select automation tool
        driver.findElement(By.id("tool-2")).click();

        // select continent
        driver.findElement(By.id("continents")).click();
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();
        Thread.sleep(2000);

        // upload file
        driver.findElement(By.id("photo")).sendKeys("C:\\Users\\akhil\\Downloads\\image.png");
        Thread.sleep(2000);

        // submit form
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
