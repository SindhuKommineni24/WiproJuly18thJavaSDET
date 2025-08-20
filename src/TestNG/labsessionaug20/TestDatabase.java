package com.wiprojuly.fetchfromdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.wiprojuly.testing.TestNGTestcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerHelper;

public class TestDatabase {
    private static final org.apache.logging.log4j.Logger log = LoggerHelper.getLogger(TestNGTestcase.class);

    @Test
    public void readfromDBTest() throws ClassNotFoundException, SQLException, InterruptedException {

        // fetch the db url , password and username of the my sql db
        String dbURL = "jdbc:mysql://localhost:3306/lab26";
        String username = "root";
        String password = "1234";

        // load the my sql driver file
        Class.forName("com.mysql.cj.jdbc.Driver");

        // create a connection to the data base
        Connection con = DriverManager.getConnection(dbURL, username, password);

        // create the statement object
        java.sql.Statement st = con.createStatement();

        String query = "select * from Persons";

        // pass the query to result set
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            String usrname = rs.getString("FirstName");
            String paswd = rs.getString("LastName");

            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOptions);

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            Thread.sleep(4000);
            log.info("Invoking the browser");

            // enter username
            WebElement us1 = driver.findElement(By.xpath("//input[@name = 'username']"));
            log.info("Entering the username");
            us1.sendKeys(usrname);

            Thread.sleep(4000);

            // enter password
            WebElement pwd1 = driver.findElement(By.xpath("//input[@name = 'password']"));
            log.info("Entering the password");
            pwd1.sendKeys(paswd);

            // click login
            Thread.sleep(2000);
            WebElement loginbutton = driver.findElement(By.xpath("//button[@type = 'submit']"));
            loginbutton.click();

            Thread.sleep(2000);

            driver.quit(); // ✅ close browser after each iteration
        }

        rs.close();
        st.close();
        con.close(); // ✅ close db connection
    }
}
