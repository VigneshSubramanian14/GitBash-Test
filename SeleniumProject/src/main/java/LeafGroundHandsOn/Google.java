package LeafGroundHandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.navigate().to("https://www.google.com");
		
		WebElement google = driver.findElement(By.xpath("//input[(@title='Search')]"));
		google.sendKeys("google"+Keys.ENTER);
		

	}

}
