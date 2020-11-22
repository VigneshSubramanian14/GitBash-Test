package LeafGroundHandsOn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FramesConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");

		//To start in expanded form
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");

		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().deleteAllCookies();

		driver.get("http://www.leafground.com/pages/frame.html");
		
		//Switching to Frame:
		
		driver.switchTo().frame(0);
		
		WebElement singleframe = driver.findElement(By.xpath("//button[(@id='Click')]"));
		
		Thread.sleep(5000);
		
		singleframe.click();
		
		String text = driver.findElement(By.xpath("//button[(@id='Click')]")).getText();
		
		System.out.println(text);
		
		//To come out from frame
		
		driver.switchTo().defaultContent();
		
		//Switching to nested frame(frame inside frame)
		
		//Switching to nested fame 1:
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		Thread.sleep(4000);
		
		WebElement multipleframe = driver.findElement(By.xpath("//button[(@id='Click1')]"));
		
		multipleframe.click();
		
		//To get the text
		
		String output = driver.findElement(By.xpath("//button[(@id='Click1')]")).getText();
		
		System.out.println(output);
		
		driver.switchTo().defaultContent();
		
		//To get the number of Frames:
		
		List <WebElement> framelist = driver.findElements(By.tagName("iframe"));
		int number = framelist.size();
		
		System.out.println(number);
	}

}
