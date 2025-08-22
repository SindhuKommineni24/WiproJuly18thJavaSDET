package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage;
import utils.DriverFactory;

public class StepDefinitions {
	
	WebDriver driver = DriverFactory.getDriver();
	
	/*@Given("User is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);
	  
	}

	@When("user enters the username")
	public void user_enters_the_username() throws InterruptedException {
		
        // Enter username
		Thread.sleep(3000);
        
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        
        username.sendKeys("Admin");
        
        Thread.sleep(5000);
	    
	}

	@When("user enters teh password")
	public void user_enters_teh_password() throws InterruptedException {
		
        // Enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        
        password.sendKeys("admin123");
        
        Thread.sleep(5000);
	   
	}*/

	/*@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		
		// Click on login button
        Thread.sleep(5000); // Optional wait before clicking
        
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        
        loginButton.click();

        // Wait to see result (optional)
        Thread.sleep(5000);
	   
	}

	@Then("user is naqvigated to home page")
	public void user_is_navigated_to_home_page() {
		
		WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
		 
		if (admin.isDisplayed()) {
			System.out.println("User is on the home page");
		} else {
 
			System.out.println("User is not on the home page");   	
	}
	
}
/*	//Invalid credentials
	
	@Given("User is on the invalid credentials page")
	public void user_is_on_the_invalid_credentials() throws InterruptedException {
	
		ChromeOptions chromeOptions = new ChromeOptions();
		Thread.sleep(5000);
    	WebDriverManager.chromedriver().setup();

    	driver = new ChromeDriver(chromeOptions);

    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    	Thread.sleep(5000);
    
	}

	@When("user enters the Invalid username")
	public void user_enters_the_invalid_username() throws InterruptedException {
	
    	// Enter username
    
    	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    
    	username.sendKeys("Admi2");
    
    	Thread.sleep(5000);
    
	}

	@When("user enters the Invalid password")
	public void user_enters_the_invalid_password() throws InterruptedException {
	
	 // Enter password
    	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
    
    password.sendKeys("admin34");
    
    Thread.sleep(5000);  
}

@Then("an error message Invalid username and password should be displayed")
public void an_error_message_invalid_username_and_password_should_be_displayed() throws InterruptedException {
	
	WebElement errorMsg = driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]"));
    if (errorMsg.isDisplayed()) {
        System.out.println("Error displayed: " + errorMsg.getText());
    } else {
    	 System.out.println("Expected error not displayed");
    }
}
@When("user enters the {string} and {string}")
public void user_enters_the(String username , String password ) throws InterruptedException {
	WebElement username1 = driver.findElement(By.name("usernam"));

	username1.sendKeys(username);

	Thread.sleep(5000);


	WebElement password1 = driver.findElement(By.name("password"));

	password1.sendKeys(password);

	Thread.sleep(5000);

}*/


//-----------------------------------------------------------
//---------------Multipleusers------------------
/*@Given("User is on the login page")
public void user_is_on_the_login_page() throws InterruptedException {

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    Thread.sleep(5000);
  
}
@And("user clicks on the login button")
public void user_clicks_on_the_login_button() throws InterruptedException {
	
	// Click on login button
    Thread.sleep(5000); // Optional wait before clicking
    
    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    
    loginButton.click();

    // Wait to see result (optional)
    Thread.sleep(5000);
   
}

@Then("user is naqvigated to home page")
public void user_is_navigated_to_home_page() {
	
	WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
	 
	if (admin.isDisplayed()) {
		System.out.println("User is on the home page");
	} else {

		System.out.println("User is not on the home page");   	
}

}
@When("user enters credentials")
public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

	

	List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

	for (Map<String, String> user : users) {


		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(10000);

		String username = user.get("username");
		String password = user.get("password");

		WebElement username1 = driver.findElement(By.name("username"));

		Thread.sleep(4000);

		username1.sendKeys(username);

		Thread.sleep(2000);

		WebElement password1 = driver.findElement(By.name("password"));

		password1.sendKeys(password);

		Thread.sleep(2000);

		


		}
	}
}*/
	
	
	//_____________________loginpage_______________________
	
	loginpage lp = new loginpage(driver);
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() throws InterruptedException {
		// launch the application on the chrome browser
				Thread.sleep(10000);
 
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
				Thread.sleep(2000);
 
	}
 
	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
 
	lp.enterCredentials(username, password);
	}
 
	@Then("the user should be navigated to the home page")
	public void the_user_should_be_navigated_to_the_home_page() {
		lp.clickLogin();
	}
}

