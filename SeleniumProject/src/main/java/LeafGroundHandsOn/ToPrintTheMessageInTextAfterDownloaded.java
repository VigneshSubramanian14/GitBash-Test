package LeafGroundHandsOn;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToPrintTheMessageInTextAfterDownloaded {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.navigate().to("http://www.leafground.com/pages/download.html");
		
		
		
		WebElement text = driver.findElement(By.xpath("//a[(text()='Download Text')]"));
		text.click();
		
		File file = new File("C:\\Users\\b.g.balasubramanian\\Downloads");
		
	File[] downloadedfile =	file.listFiles();
	
	for (File file2 : downloadedfile) {
		
		if(file2.equals("Download Text"));{
		System.out.println("File is downloaded");
		break;
		}
		
		
		
	}
	
	}
	
	
	

}
