package aug14class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEg {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        try {
            ChromeOptions chromeOption = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOption);
            driver.get("https://jqueryui.com/droppable/");
            
            driver.manage().window().maximize();

            // Switch to iframe
            WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
            driver.switchTo().frame(frame);

            Thread.sleep(2000);

            // Locate draggable and droppable elements
            WebElement drag = driver.findElement(By.id("draggable"));
            WebElement drop = driver.findElement(By.id("droppable"));

            // Perform drag and drop
            Actions act = new Actions(driver);
            act.dragAndDrop(drag, drop).perform();

            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
