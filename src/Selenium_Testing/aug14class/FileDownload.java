package aug14class;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.get("https://the-internet.herokuapp.com/download");
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement filedownload=driver.findElement(By.xpath("//a[normalize-space()='test-file.txt']"));
		filedownload.click();
		
		//download the text file
		
		File f=new File("\"C:\\Users\\akhil\\Downloads\\test-file.txt\"");
		
		//check whether the file is existing in the folder or not
		if(f.exists()) {
			System.out.println("The file is present");
		}else {
			System.out.println("The file is not present");
		}
	}
}
