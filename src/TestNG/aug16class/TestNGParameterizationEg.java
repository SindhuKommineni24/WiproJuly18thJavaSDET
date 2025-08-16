package com.wiprojuly.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterizationEg {
	@Parameters({ "browser", "platform" })
	@Test
	public void testparameters(String browser, String platform) {
		if (browser.equals("chrome")) {
			if(platform.equals("widnows")) {
			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			}
		}else {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Harsha Patil\\Desktop\\Corporate Trainings\\IIHT\\Screen shots\\edgedriver_win64\\msedgedriver.exe");
		    // Create EdgeDriver instance
		    WebDriver driver = new ChromeDriver();
		    // Open a webpage
		    driver.get("https://www.google.com");
		}

	}	

}
