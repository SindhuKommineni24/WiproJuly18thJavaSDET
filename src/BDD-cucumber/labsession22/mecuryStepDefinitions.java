package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class mecuryStepDefinitions {
	
	WebDriver driver = DriverFactory.getDriver();
	
	@Given("User is on the registration page")
	public void user_is_on_the_registration_page() throws InterruptedException {
	    
		Thread.sleep(7000);

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		Thread.sleep(2000);

	}

	@When("user enters the credentials")
	public void user_enters_the_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
		 
		for (Map<String, String> user : users) {

			String Firstname = user.get("firstname");
			String Lastname = user.get("lastname");
			String Phone = user.get("phone");
			String Email = user.get("email");
			String Address = user.get("address");
			String City = user.get("city");
			String State = user.get("state");
			String Postalcode = user.get("postalcode");
			String Country = user.get("country");
			String Username = user.get("username");
			String Password = user.get("password");
			String Confirmpassword = user.get("confirmpassword");
 
			WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
 
			Thread.sleep(4000);
 
			firstname.sendKeys(Firstname);
 
			Thread.sleep(2000);
 
			WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
 
			lastname.sendKeys(Lastname);
 
			Thread.sleep(2000);
			
			WebElement Phonenum = driver.findElement(By.xpath("//input[@name='phone']"));
			 
			Phonenum.sendKeys(Phone);
 
			Thread.sleep(2000);
			
			WebElement emailid = driver.findElement(By.xpath("//input[@id='userName']"));
			 
			emailid.sendKeys(Email);
 
			Thread.sleep(2000);
			
			WebElement addr = driver.findElement(By.xpath("//input[@name='address1']"));
			 
			addr.sendKeys(Address);
 
			Thread.sleep(2000);
			
			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
			 
			city.sendKeys(City);
 
			Thread.sleep(2000);
			
			WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
			 
			state.sendKeys(State);
 
			Thread.sleep(2000);
			
			WebElement pc = driver.findElement(By.xpath("//input[@name='postalCode']"));
			 
			pc.sendKeys(Postalcode);
 
			Thread.sleep(2000);
			
			WebElement con = driver.findElement(By.xpath("//select[@name='country']"));
			 
			con.sendKeys(Country);
 
			Thread.sleep(2000);
			
			WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
			 
			un.sendKeys(Username);
 
			Thread.sleep(2000);
			
			WebElement ps = driver.findElement(By.xpath("//input[@name='password']"));
			 
			ps.sendKeys(Password);
 
			Thread.sleep(2000);
			
			WebElement cp = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
			 
			cp.sendKeys(Confirmpassword);
 
			Thread.sleep(2000);
		}
	}
	@Then("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() throws InterruptedException {
	    
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		 
		submit.click();

		Thread.sleep(2000);
	}

}