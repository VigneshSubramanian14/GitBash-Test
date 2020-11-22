package SeleniumHandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\b.g.balasubramanian\\\\Selenium\\\\eclipse-workspace\\\\SeleniumProject\\\\Drivers\\\\ChromeDriver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	
	Thread.sleep(4000);
	
	//Select by Index
	WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@id,'dropdown1')]"));
	Select select = new Select(dropdown1);
	select.selectByValue("3");
	
	Thread.sleep(4000);
	
	//Select by Text
	WebElement dropdown2 = driver.findElement(By.xpath("//select[(@name='dropdown2')]"));
	Select select1 = new Select(dropdown2);
	select1.selectByVisibleText("Appium");

	Thread.sleep(4000); 
	
	//Select by Value
	WebElement dropdown3 = driver.findElement(By.xpath("//select[contains(@id,'dropdown3') and contains (@name,'dropdown3')]"));
	Select select2 = new Select(dropdown3);
	select2.selectByValue("1");
	}

}
