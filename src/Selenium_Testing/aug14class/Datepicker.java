package aug14class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://ui.shadcn.com/docs/components/date-picker");
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//open date picker
		WebElement datepicker=driver.findElement(By.xpath("//*[@id='date']"));
		datepicker.click();
		Thread.sleep(2000);
		
		//select first date
		WebElement daypicker1=driver.findElement(By.xpath("//button[@aria-label='Wednesday, August 13th, 2025, selected']"));
		daypicker1.click();
		Thread.sleep(2000);
		
		//open the date picker again
		datepicker.click();
		Thread.sleep(2000);
		
		//select the second date
		WebElement datepicker2=driver.findElement(By.xpath("//button[@aria-label='Thursday, August 21st, 2025, selected']"));
		datepicker2.click();
		Thread.sleep(2000);
		
		
	}

}
