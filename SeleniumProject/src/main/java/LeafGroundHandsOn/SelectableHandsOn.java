package LeafGroundHandsOn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SelectableHandsOn {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.navigate().to("http://www.leafground.com/pages/selectable.html");
		
	List	<WebElement> tagname = driver.findElements(By.xpath("//ol[(@id='selectable')]/li"));
		
	/*int output=	tagname.size();
	
	System.out.println(output);*/
	
	//To select 4 items
	
	Actions action = new Actions(driver);
	action.clickAndHold(tagname.get(0));
	action.clickAndHold(tagname.get(1));
	action.clickAndHold(tagname.get(2));
	action.clickAndHold(tagname.get(3));
	action.build().perform();
	
	
	}

}
