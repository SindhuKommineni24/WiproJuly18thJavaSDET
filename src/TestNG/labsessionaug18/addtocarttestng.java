package labsessionaug18;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class addtocarttestng {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Test(groups = {"Sanity"})
    public void addProductsAndCheckout() throws InterruptedException {
        // Select iPhone
        driver.findElement(By.xpath("//a[normalize-space()='Iphone 6 32gb']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        alt.accept();

        // Go back home
        driver.findElement(By.xpath("//a[@class='nav-link' and text()='Home ']")).click();

        // Select Laptop
        driver.findElement(By.xpath("//a[text()='Laptops']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='MacBook air']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click();
        Thread.sleep(2000);
        Alert alt1 = driver.switchTo().alert();
        alt1.accept();

        // Go to Cart
        driver.findElement(By.id("cartur")).click();

        // Place Order
        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
        driver.findElement(By.id("name")).sendKeys("Sindhu");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Khammam");
        driver.findElement(By.id("card")).sendKeys("4581 4455 9999");
        driver.findElement(By.id("month")).sendKeys("August");
        driver.findElement(By.id("year")).sendKeys("2025");
        driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();

        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
