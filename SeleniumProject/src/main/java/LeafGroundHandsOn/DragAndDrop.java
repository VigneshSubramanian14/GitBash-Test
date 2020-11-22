package LeafGroundHandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\b.g.balasubramanian\\\\Selenium\\\\eclipse-workspace\\\\SeleniumProject\\\\Drivers\\\\ChromeDriver\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.navigate().to("http://www.leafground.com/home.html");
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		WebElement drag = driver.findElement(By.xpath("//img[(@alt='Draggable')]"));
		executor.executeScript("arguments[0].scrollIntoView", drag);
		drag.click();
		
		// Draggable 
		
		Actions actions = new Actions(driver);

		
		Thread.sleep(4000);
		
		//Use build and perform at last
		
		actions.dragAndDropBy(driver.findElement(By.xpath("//div[(@id='draggable')]")), 253, 96).build().perform();

		Thread.sleep(5000);
		
		//Now click on Test Leaf and goto Homescreen
		
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		
		WebElement testleaf = driver.findElement(By.xpath("//img[(@alt='logo Testleaf')]"));
		executor1.executeScript("arguments[1].scrollIntoView();", testleaf);
		testleaf.click();
		
		//Scroll till droppable and click
		
		Thread.sleep(4000);
		
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		
	    WebElement droppable = driver.findElement(By.xpath("//img[(@alt='drop')]"));
	    executor2.executeScript("arguments[2].scrollIntoView();", droppable);
	    droppable.click();
	    
	    
	}

}
