package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class SaucedemoStepDefinition {

    WebDriver driver;

    @Given("User is on the SauceDemo login page")
    public void user_is_on_the_saucedemo_login_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) throws InterruptedException {
    	Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    @Then("appropriate result should be displayed")
    public void appropriate_result_should_be_displayed() throws InterruptedException {
    	Thread.sleep(3000);
        if (driver.getCurrentUrl().contains("inventory.html")) {
            // login success → navigated to inventory page
            Assert.assertTrue(true);
        } else {
            // login failure → error message appears
            WebElement errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']"));
            Assert.assertTrue(errorMsg.isDisplayed());
        }
        driver.quit();
    }
}
