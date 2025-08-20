package com.wiprojuly.seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HelperClass {

    // remote web driver to support remote computers and browsers
    // Thread local is for the parallel execution support
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

    public static String remote_url = "http://192.168.0.102:4444";

    @BeforeMethod
    public void setDriver() throws MalformedURLException {
        // ✅ you can switch between Chrome and Edge here
        // --- Use Edge ---
        // EdgeOptions options = new EdgeOptions();
        // driver.set(new RemoteWebDriver(new URL(remote_url), options));

        // --- Or use Chrome (recommended if Edge driver fails) ---
        ChromeOptions options = new ChromeOptions();
        driver.set(new RemoteWebDriver(new URL(remote_url), options));

        driver.get().get("https://opensource-demo.orangehrmlive.com/");
        driver.get().manage().window().maximize();
        
        
        FirefoxOptions options1 = new FirefoxOptions();
		driver.set(new RemoteWebDriver(new URL(remote_url), options1));
		driver.get().get("https://opensource-demo.orangehrmlive.com/");
		driver.get().manage().window().maximize();	
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void closeBrowser() {
        if (driver.get() != null) {
            //driver.get().quit();   // ✅ properly closes browser
            //driver.remove();       // ✅ clears ThreadLocal reference
        }
    }
}
