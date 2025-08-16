package aug14class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElementEg {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;  // declared outside try
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            

            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
//Actions class is used to stimulate the mouse related activities
            Actions act = new Actions (driver);
    		WebElement prime = driver.findElement
    				(By.xpath("//span[normalize-space()='Prime']"));
    		act.moveToElement(prime).perform();
    		Thread.sleep(4000);
    		WebElement joinnow = driver.findElement
    				(By.xpath("//a[@href ='/prime']"));
    		act.click(joinnow).perform();
    		Thread.sleep(2000);			
        }catch(Exception e) {
        	System.out.println("Error: " + e);
        } finally {
            if (driver != null) {
                driver.quit(); // quit closes all browser windows
            }
        }
	}

}
