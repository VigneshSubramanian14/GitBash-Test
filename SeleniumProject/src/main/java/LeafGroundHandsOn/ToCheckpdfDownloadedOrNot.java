package LeafGroundHandsOn;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToCheckpdfDownloadedOrNot {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.navigate().to("http://www.leafground.com/pages/download.html");
		
		
		WebElement pdf = driver.findElement(By.xpath("//a[(text()='Download PDF')]"));
		pdf.click();
		
		//File method
		
		File file = new File("C:\\Users\\b.g.balasubramanian\\Downloads");
		File[] downloaded = file.listFiles();
		
		for (File file2 : downloaded) {
			
		if	(file2.getName().equals("Download PDF"));{
			System.out.println("PDF file is downloaded");
			break;
		}
		
			
		}
		
		
		
	}

}
