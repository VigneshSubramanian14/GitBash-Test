package SeleniumHandsOn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://www.leafground.com");
	
	//Actions class
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//h5[(text()='Edit')]")));
	Thread.sleep(5000);
	action.click();
	action.build().perform();
	
	//Webelement method:
	
	Actions checkbox = new Actions(driver);
	checkbox.moveToElement(driver.findElement(By.xpath("//input[(@id='email')]")));
	checkbox.click();
	checkbox.sendKeys("vigneshrio14@gamil.com");
	Thread.sleep(3000);
	checkbox.build().perform();
	
	/*WebElement append = driver.findElement(By.xpath("//input[(@value='Append ')]"));
	append.clear();
	append.sendKeys("vignesh");*/

	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement append = driver.findElement(By.xpath("//input[(@value='Append ')]"));
	
	js.executeScript("arguments[0].value='vigneshrio'",append);
	
	
	
	}

}
