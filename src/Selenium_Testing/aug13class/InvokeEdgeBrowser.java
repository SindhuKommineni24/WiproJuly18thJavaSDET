package aug13class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class InvokeEdgeBrowser {
    public static void main(String[] args) {
        // Set the EdgeDriver path (no extra quotes)
        System.setProperty("webdriver.edge.driver", "C:\\Users\\akhil\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Optional Edge options
        EdgeOptions options = new EdgeOptions();

        // Launch Edge
        WebDriver driver = new EdgeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.quit();
    }
}


