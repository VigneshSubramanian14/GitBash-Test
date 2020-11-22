package SeleniumHandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandsOn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		
		//Radio button which is selected
		
		//When there are same locators for two radio buttons use the below method
		
		WebElement checked = driver.findElement(By.xpath(" (//input[(@name='news')])[2]"));
		
		// or if there us 100 radio button with same element type if you want to select the last one use the below code
		
		// (//input[(@name='news')])[last()]
		
		checked.click();
		
		Boolean status = checked.isSelected();
		
		System.out.println(status);
		
		
		

	}

}
