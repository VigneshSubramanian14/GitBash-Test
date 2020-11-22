package LeafGroundHandsOn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingMultipleWindows1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		
		// To start the window maximized

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);
		
		JavascriptExecutor execute = (JavascriptExecutor) driver;

		driver.navigate().to("http://www.leafground.com/home.html");
		
		Thread.sleep(5000);
		
		
		WebElement windows = driver.findElement(By.xpath("//h5[(text()='Window')]"));
		
		execute.executeScript("arguments[0].scrollIntoView;",windows);
		
		Thread.sleep(4000);
		
		windows.click();
		Thread.sleep(4000);
		//Handle method:
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement firstbutton = driver.findElement(By.xpath("//button[(@id='home')]"));
		
		firstbutton.click();
		
		Thread.sleep(4000);
		
	Set<String> handles = driver.getWindowHandles();
	
	for (String secondwindow : handles) {
		
		driver.switchTo().window(secondwindow);
	}
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		//Scroll to mouse hover and click
		
		Thread.sleep(4000);
		
	JavascriptExecutor mouse = (JavascriptExecutor)driver;
	
	WebElement hover = driver.findElement(By.xpath("//h5[(text()='Mouse Hover')]"));
	
	mouse.executeScript("arguments[0].scrollIntoView;", hover);
	hover.click();
		
		
	}
		
		}
		


