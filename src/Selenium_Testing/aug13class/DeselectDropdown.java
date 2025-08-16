package aug13class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeselectDropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.navigate().to("https://grotechminds.com/multiple-select/?");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//webelement for drop down
		WebElement drdwn=driver.findElement(By.xpath("//select[@id='automobiles']"));
		Select sel=new Select(drdwn);
		
		//select the visible text
				sel.selectByVisibleText("Option1");
				Thread.sleep(2000);
				
				//select by value
				sel.selectByValue("option2");
				Thread.sleep(2000);
				
				//select by index
				sel.selectByIndex(3);
				
				//select the visible text
				sel.deselectByVisibleText("Option1");
				Thread.sleep(2000);
				
				//select by value
				sel.deselectByValue("option2");
				Thread.sleep(2000);
				
				//select by index
				sel.deselectByIndex(3);
	}

}
