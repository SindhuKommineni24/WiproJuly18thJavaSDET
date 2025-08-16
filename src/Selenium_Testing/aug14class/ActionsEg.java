package aug14class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEg {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;  // declared outside try
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);

            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();

            Actions act = new Actions(driver);

            // Double click on "Sell"
            WebElement sell = driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
            act.doubleClick(sell).perform();
            Thread.sleep(4000);

            driver.navigate().back();
            Thread.sleep(6000);

            // Right click on "Mobiles"
            WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
            act.contextClick(mobiles).perform();
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            if (driver != null) {
                driver.quit(); // quit closes all browser windows
            }
        }
    }
}
