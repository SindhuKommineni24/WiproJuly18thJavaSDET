package com.wiprojuly.datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    @Test
    public void login() throws IOException {
    	File src = new File("C:\\Users\\akhil\\OneDrive\\Desktop\\javasdet\\TestData\\login.xlsx");

    	System.out.println("Looking for file: " + src.getAbsolutePath());

    	if (!src.exists()) {
    	    throw new IOException("❌ File not found at: " + src.getAbsolutePath());
    	}


        FileInputStream fis = new FileInputStream(src);

        // Load the workbook
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);

        // Loop through rows
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOptions);

            // Launch the url
            driver.get("https://www.facebook.com/login");
            driver.manage().window().maximize();

            // Username
            cell = sheet.getRow(i).getCell(0);
            WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
            email.sendKeys(cell.getStringCellValue());

            // Password
            cell = sheet.getRow(i).getCell(1);
            WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
            password.sendKeys(cell.getStringCellValue());
        }

        // Close workbook after reading
        workbook.close();
    }
}
