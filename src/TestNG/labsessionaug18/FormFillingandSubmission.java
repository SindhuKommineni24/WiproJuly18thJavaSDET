package labsessionaug18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillingandSubmission {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		//enter first name
        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Sindhu");
		
		//enter last name
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Kommineni");
		
		//select the gender
		WebElement gender=driver.findElement(By.xpath("//input[@id='sex-1']"));
		gender.click();
		
		//select the gender
		WebElement yearofexperience=driver.findElement(By.xpath("//input[@id='exp-0']"));
		yearofexperience.click();
		
		
		//enter the date
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("18/8/2025");
		
		//select the profession
		WebElement profession=driver.findElement(By.xpath("//input[@id='profession-1']"));
		profession.click();
		
		//select the automationtools
		WebElement automationtools=driver.findElement(By.xpath("//input[@id='tool-2']"));
		automationtools.click();
		
		//select the continent
		WebElement continents = driver.findElement(By.xpath("//select[@id='continents']"));
		continents.click();
		
		WebElement commands = driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']"));
		commands.click();
		Thread.sleep(2000);
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='photo']"));
		upload.sendKeys("C:\\Users\\akhil\\Downloads\\image.png");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(2000);
		
		driver.quit();
		
		}
}

