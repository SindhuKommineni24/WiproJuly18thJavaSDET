package aug16class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/tables");

        // maximize the window
        driver.manage().window().maximize();

        // find the number of rows present
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        int rowcount = rows.size();
        System.out.println("Row count: " + rowcount);

        // find the number of columns present
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']/thead/tr[1]/th"));
        int columncount = columns.size();
        System.out.println("Column count: " + columncount);

        // text of a specific cell
        WebElement celltext = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]"));
        String actualcelltext = celltext.getText();
        String expectedcelltext = "tconway@earthlink.net";

        if (actualcelltext.equalsIgnoreCase(expectedcelltext)) {
            System.out.println("The text matches");
        } else {
            System.out.println("The text does not match");
        }

        driver.quit();
    }
}
