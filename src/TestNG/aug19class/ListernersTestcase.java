
package labsessionaug19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListeners.class)   
public class ListernersTestcase {
	
	@Test
	public void cart() throws InterruptedException {
	
	    ChromeOptions chromeoptions = new ChromeOptions();
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver(chromeoptions);
	
	    driver.get("https://www.demoblaze.com/index.html");
	    driver.manage().window().maximize();
	
	    Thread.sleep(2000);
	    
	    //item selection
	    WebElement mobile = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
	    mobile.click();
	    Thread.sleep(2000);
	    
	    //add to cart
	    WebElement cart = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
	    cart.click();
	    Thread.sleep(2000);
	    
	    Alert alt = driver.switchTo().alert();
	    alt.accept();  //click ok
	    
	    //home page
	    WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
	    home.click();
	    Thread.sleep(2000);
	    
	    //cart
	    WebElement Atc = driver.findElement(By.xpath("//a[normalize-space()='Cart']"));
	    Atc.click();
	    Thread.sleep(2000);
	    
	    //place order  
	    WebElement placeorder = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
	    placeorder.click();
	    Thread.sleep(2000);
	    
	    //name
	    WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
	    name.sendKeys("smith");
	    Thread.sleep(2000);
	    
	    //country  
	    WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
	    country.sendKeys("India");
	    Thread.sleep(2000);
	    
	    //city
	    WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
	    city.sendKeys("Hyderabad");
	    Thread.sleep(2000);
	    
	    //credit card
	    WebElement card = driver.findElement(By.xpath("//input[@id='card']"));
	    card.sendKeys("9778 8755 7577 7567");
	    Thread.sleep(2000);
	    
	    //month
	    WebElement month = driver.findElement(By.xpath("//input[@id='month']"));
	    month.sendKeys("April");
	    Thread.sleep(2000);
	    
	    //year
	    WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
	    year.sendKeys("2022");
	    Thread.sleep(2000);
	    
	    //purchase
	    WebElement purchase = driver.findElement(By.xpath("//button[normalize-space()='Purchase']"));
	    purchase.click();
	    Thread.sleep(2000);
	    
	    //ok
	    WebElement ok = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	    ok.click();
	    
	    driver.quit();
	}
}
