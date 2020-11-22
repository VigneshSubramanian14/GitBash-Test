package LeafGroundHandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ButtonHandsOn {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		//Maximize the screen:
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		
		WebElement colourbutton = driver.findElement(By.xpath("//button[(@id='color')]"));

		String colour = colourbutton.getCssValue("background-color");
		
		System.out.println(colour);
		
		
	}

}
