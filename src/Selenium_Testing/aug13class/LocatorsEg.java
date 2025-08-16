package aug13class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEg {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
	
		Thread.sleep(2000);
		//enter text in password field
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		//click on login button
		
		Thread.sleep(2000);
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(2000);
	}

}
