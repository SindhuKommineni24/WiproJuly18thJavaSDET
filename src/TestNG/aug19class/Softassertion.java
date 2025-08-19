package labsessionaug19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Softassertion {
	
	@Test
	public void cart()throws InterruptedException {
	
	ChromeOptions chromeoptions = new ChromeOptions();
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver(chromeoptions);
	
	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	String actualtitle = driver.getTitle();
	
	System.out.println(actualtitle);
	
	String expectedtitle = "techg";
	
	// soft assertion  - the validation is captured  if the assertion is failing and continues with further execution
	
	SoftAssert soft = new SoftAssert();
	
	soft.assertEquals(actualtitle, expectedtitle);
	
	// Enter Firstname
    
    WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
    
    firstname.sendKeys("Smith");
    
    Thread.sleep(2000);
    
    // Enter Lasttname
    
    WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
    
    lastname.sendKeys("gold");
    
    Thread.sleep(2000);
    
    //Gender
    
    WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
	
	gender.click();
	
	Thread.sleep(2000);
    
	//years of experince
	
    WebElement exp = driver.findElement(By.xpath("//input[@id='exp-2']"));
	
	exp.click();
	
	Thread.sleep(2000);
	
	//Date
	
    WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
	
	date.sendKeys("17-09-2022");
	
	Thread.sleep(2000);
	
	//profession
	
    WebElement profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
	
    profession.click();
	
	Thread.sleep(2000);
	
	//Tools
	
    WebElement tools = driver.findElement(By.xpath("//input[@id='tool-2']"));
	
    tools.click();
	
	Thread.sleep(2000);
	
	//continents
	
    WebElement conti = driver.findElement(By.xpath("//select[@id='continents']"));
	
	Select sel = new Select(conti);
	
	//select by visible text
	
	sel.selectByVisibleText("Asia");
	
	Thread.sleep(2000);
	
    //commands
	
    WebElement command = driver.findElement(By.xpath("//option[normalize-space()='Switch Commands']"));
	
	command.click();
	
	Thread.sleep(2000);
	
	// file upload
	
    WebElement fileupload = driver.findElement(By.xpath("//input[@id='photo']"));
	
	fileupload.sendKeys("C:\\Users\\pranavi\\Downloads\\image.png");
	
	Thread.sleep(2000);
	
	//submit
	
    WebElement Button = driver.findElement(By.xpath("//button[@id='submit']"));
    
    Button.click();
    
    soft.assertAll();
}
}