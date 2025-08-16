package aug14class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Upload the file (no extra quotes in path)
        WebElement fileupload = driver.findElement(By.id("file-upload"));
        fileupload.sendKeys("C:\\Users\\akhil\\OneDrive\\Desktop\\Pictures\\Screenshots\\Screenshot (1).png");
        Thread.sleep(2000);

        // Click submit
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);

        // Validate success message
        WebElement validationmsg = driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
        Thread.sleep(2000);
        if (validationmsg.isDisplayed()) {
            System.out.println("The message is displayed properly");
        } else {
            System.out.println("The message is not displayed");
        }

        driver.quit();
    }
}
