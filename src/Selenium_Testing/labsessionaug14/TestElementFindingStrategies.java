package labsessionaug14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementFindingStrategies {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOption);

        driver.get("https://github.com/login");
        Thread.sleep(2000);

        highlight(driver, driver.findElement(By.id("login_field")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.name("password")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.className("header-logo")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.linkText("Forgot password?")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.partialLinkText("Create an")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.tagName("h1")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
        Thread.sleep(2000);

        driver.quit();
    }

    public static void highlight(WebDriver driver, WebElement element) throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Store original style
        String originalStyle = element.getAttribute("style");

        // Blink effect: highlight -> remove -> highlight
        for (int i = 0; i < 2; i++) {
            jsExecutor.executeScript(
                "arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow;')", 
                element
            );
            Thread.sleep(500);
            jsExecutor.executeScript(
                "arguments[0].setAttribute('style', arguments[1])", 
                element, originalStyle
            );
            Thread.sleep(500);
        }
    }
}
