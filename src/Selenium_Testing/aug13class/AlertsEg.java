package aug13class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEg {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//click on simple alert
		WebElement simplealert=driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		simplealert.click();
		
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		
		//click on ok button
		alt.accept();
		Thread.sleep(2000);
		
		//click on confirmational alert
		WebElement confirmalert=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		confirmalert.click();
		
		Thread.sleep(2000);
		
		Alert alt1=driver.switchTo().alert();
		
		//click on cancel button
		alt1.dismiss();
		Thread.sleep(2000);
		
		//click on prompt alert
		WebElement promptalert=driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		promptalert.click();
		
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();
		
		//click on ok button
		String alerttext=alt2.getText();
		System.out.println(alerttext);
		alt2.sendKeys("sindhu");
		Thread.sleep(2000);
		alt2.accept();
		Thread.sleep(2000);
		
	}
		

}
