package labsessionaug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelementsPractice {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		WebElement radiobutton=driver.findElement(By.xpath("//legend[normalize-space()='Radio Button Example']"));
		radiobutton.click();
		Thread.sleep(2000);
		
		WebElement country=driver.findElement(By.xpath("//legend[normalize-space()='Suggession Class Example']"));
		country.sendKeys("India");
		Thread.sleep(2000);
		
		//webelement for drop down
		WebElement drdwn=driver.findElement(By.xpath("//legend[normalize-space()='Dropdown Example']"));
		Select sel=new Select(drdwn);
		sel.selectByVisibleText("Option1");
		Thread.sleep(2000);
		
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Sindhu");
		Thread.sleep(2000);
		
		WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alert.click();
		Thread.sleep(2000);
		
		WebElement confirm=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirm.click();
		Thread.sleep(2000);
		
	}
		
		

}
