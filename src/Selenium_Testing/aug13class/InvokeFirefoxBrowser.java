package aug13class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFirefoxBrowser {
    public static void main(String[] args) {
        // Setup Firefox WebDriver
        WebDriverManager.firefoxdriver().setup();

        // Create FirefoxOptions (for custom settings if needed)
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        // Launch Firefox browser
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        // Maximize window
        driver.manage().window().maximize();

        // Open URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Close browser
        driver.quit();
    }
}
