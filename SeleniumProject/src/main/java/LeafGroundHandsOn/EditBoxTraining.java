package LeafGroundHandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Argument;

public class EditBoxTraining {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");

		//Best method to maximize screen:
		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeoptions);

		
		  //Dimension method to maximize screen: 
		/*Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);*/
		 

		driver.manage().deleteAllCookies();

		driver.get("http://www.leafground.com/home.html");

		// Testing by Text:

		WebElement edit = driver.findElement(By.xpath("//h5[(text()='Edit')]"));
		edit.click();

		Thread.sleep(4000);

		// Enter your email address

		WebElement first = driver.findElement(By.xpath("//input[(@id='email')]"));
		first.sendKeys("vignesh");

		/*
		 * JavascriptExecutor execute = (JavascriptExecutor)driver;
		 * 
		 * WebElement email =
		 * driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		 * 
		 * execute.executeScript("arguments[0].value='vignesh'", email);
		 */

		Thread.sleep(4000);

		// Mouse movement

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[contains(@value,'Append')]")));
		action.click();
		action.sendKeys("vigneshrio");
		action.build().perform();

		// To get default text

		WebElement third = driver.findElement(By.xpath("(//input[(@name='username')])[1]"));
		String method = third.getAttribute("value");
		System.out.println(method);

		Thread.sleep(4000);
		
		//To scroll down to last page:
		
		

		// To clear the text

		/*
		 * WebElement clear =
		 * driver.findElement(By.xpath("(//input[(@name='username')])[2]"));
		 * clear.clear();
		 */

		// Method2 to overwrite the text

		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		WebElement clear = driver.findElement(By.xpath("(//input[(@name='username')])[2]"));
		executor1.executeScript("arguments[0].value='vignesh'", clear);

		// Boolean method

		WebElement disabled = driver.findElement(By.xpath("(//input[(@type='text')])[last()]"));
		Boolean value = disabled.isEnabled();
		System.out.println(value);

	}

}
