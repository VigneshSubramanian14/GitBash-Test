import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/elements");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,360)","");
		Thread.sleep(5000);
		executor.executeScript("window.scroll(0,-360)","");
		Thread.sleep(10000);
		driver.quit();
	}

}
