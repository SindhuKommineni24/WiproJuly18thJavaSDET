package com.wiprojuly.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDependency {

    WebDriver driver;

    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        System.out.println("Login successful");
    }

    // This test will only run if login() passes
    @Test(dependsOnMethods = "login")
    public void testcheckbox() throws InterruptedException {
        WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        checkbox.click();
        Thread.sleep(2000);

        System.out.println("Checkbox clicked");
        driver.quit();
    }
}
