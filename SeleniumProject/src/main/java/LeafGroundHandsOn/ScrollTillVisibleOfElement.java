package LeafGroundHandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollTillVisibleOfElement {

	public static void main(String[] args) throws InterruptedException {
		
	
				System.setProperty("webdriver.chrome.driver","C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
				// To start the window maximized
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				
				WebDriver driver = new ChromeDriver(options);
				
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				
				driver.navigate().to("http://www.leafground.com/home.html");
				
				Thread.sleep(4000);
				
				// TO scroll till it finds the text
				
				WebElement bottom = driver.findElement(By.xpath("(//img[(@alt='logo Testleaf')])[2]"));
				
				executor.executeScript("arguments[0].scrollIntoView();",bottom);
				
				Thread.sleep(4000);
				
				//To get that scroll down text:
				
				String leaf = driver.findElement(By.xpath("(//img[(@alt='logo Testleaf')])[2]")).getAttribute("alt");
				System.out.println(leaf);
				
					
				
			}



}


