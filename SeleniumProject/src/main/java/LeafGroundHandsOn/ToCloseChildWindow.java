package LeafGroundHandsOn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToCloseChildWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\b.g.balasubramanian\\\\Selenium\\\\eclipse-workspace\\\\SeleniumProject\\\\Drivers\\\\ChromeDriver\\\\chromedriver.exe");
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("http://www.leafground.com/pages/Window.html");
	
	//Get Window Handle
	
	String parentwindow = driver.getWindowHandle();
	
	WebElement parentwindow1 = driver.findElement(By.xpath("//button[(text()='Open Multiple Windows')]"));	
	parentwindow1.click();
	
Set<String> Childwindow1 = 	driver.getWindowHandles();

for (String ctcw : Childwindow1) {
	
	if(!ctcw.equals(parentwindow)) {  
		
		//parentwindow is the first window Step:26
		//ctwc is the new two windows
		
		
		
		driver.switchTo().window(ctcw);
		
	driver.close();
		
	}
	
}

	}

}
