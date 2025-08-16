package labsessionaug14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class studentRegistrationform {
	public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        //enter name
        WebElement firstname=driver.findElement(By.xpath("//input[@id='name']"));
		firstname.sendKeys("Sindhu");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("sindhukommineni2401@gmail.com");
		
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender']"));
		gender.click();
		
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='mobile']"));
		mobileno.sendKeys("8978608021");
		
		
		WebElement dateofbirth=driver.findElement(By.xpath("//input[@id='dob']"));
		dateofbirth.sendKeys("24/08/2004");
		
		WebElement subjects=driver.findElement(By.xpath("//input[@id='subjects']"));
		subjects.sendKeys("java");
		
		List<WebElement> chkboxes=driver.findElements(By.xpath("//input[@id='hobbies']"));
		int size=chkboxes.size();
		System.out.println(size);
		//for loop to iterate in the lis of checkboxes
		for(int i=0;i<size;i++) {
			Thread.sleep(1000);
			chkboxes.get(i).click();
		Thread.sleep(2000);
		}
		
		
		WebElement fileupload = driver.findElement(By.id("picture"));
        fileupload.sendKeys("C:\\Users\\akhil\\OneDrive\\Desktop\\Pictures\\Screenshots\\Screenshot (1).png");
        Thread.sleep(2000);
        
        WebElement currentaddress=driver.findElement(By.xpath("//textarea[@id='picture']"));
		currentaddress.sendKeys("palwancha,telangana");
		
		WebElement drdwn=driver.findElement(By.xpath("//select[@id='state']"));
		Select sel=new Select(drdwn);
		sel.selectByVisibleText("Uttar Pradesh");
		Thread.sleep(2000);
		
		WebElement drdwn1=driver.findElement(By.xpath("//select[@id='city']"));
		Select sel1=new Select(drdwn1);
		sel1.selectByVisibleText("Lucknow");
		Thread.sleep(2000);
		
		
		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		
	}		
		
}
