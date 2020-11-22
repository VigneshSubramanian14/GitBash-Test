package testNG_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteUsing_testNG {
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;

	@BeforeSuite

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				
	"C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	}

	@Test(priority=0)
	
	public void google() {
		
	starttime = System.currentTimeMillis();
		driver.get("https://www.google.com/");
	}

	@Test(priority=1)
	public void gmail() {
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
	}

	@Test(priority=2)
	public void orkut() {
		driver.get("http://www.orkut.com/index.html");
	}
	
	@Test(priority=-1)
	
	public void instagram()
	{
		driver.get("https://www.instagram.com/?hl=en");
	}

	@AfterSuite
	
	public void closebrowser()
	{
		endtime = System.currentTimeMillis();
		
		totaltime = endtime-starttime;
		
		System.out.println(totaltime);
		
		
		driver.quit();
	}
}
