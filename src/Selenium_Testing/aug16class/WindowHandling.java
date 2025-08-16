package aug16class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//click on the link to open the child tab
		WebElement clickhere=driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		clickhere.click();
		Thread.sleep(2000);
		
		//fetch all the windows handles-there will be two[0]-default,[1]
		//click on link to open a new window
		Object[] windowHandles=driver.getWindowHandles().toArray();
		System.out.println(windowHandles);
		driver.switchTo().window((String) windowHandles[1]);
		
		
		//assert on title of new window
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		driver.close();
		driver.switchTo().window((String) windowHandles[0]);
		driver.quit();
	}

}
