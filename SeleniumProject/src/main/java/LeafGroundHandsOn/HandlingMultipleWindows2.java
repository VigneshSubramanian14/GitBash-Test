package LeafGroundHandsOn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingMultipleWindows2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\b.g.balasubramanian\\\\Selenium\\\\eclipse-workspace\\\\SeleniumProject\\\\Drivers\\\\ChromeDriver\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement oldwindow = driver.findElement(By.xpath("//button[(text()='Open Multiple Windows')]"));
		oldwindow.click();
		
		//To Print the number of total winodws
		/*int numberofnewwindow = driver.getWindowHandles().size();
		
		System.out.println(numberofnewwindow);*/
		
		
	Set<String> navigate = driver.getWindowHandles();
		for (String secondwindows : navigate) {
			
			driver.switchTo().window(secondwindows);
			
		}
		
		Set<String>newtwowindows = driver.getWindowHandles();
		
	for (String finalwindow : newtwowindows) {
		
		// if ! means if not
		
		if(!finalwindow.equals(parentwindow)) { //parentWindow is where you declared object for window handle at first
			driver.switchTo().window(finalwindow);
			driver.close();
		}
		
	}
		
		
		
		}
	

	}

