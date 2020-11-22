import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLearning1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/login.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//driver.findElement(By.linkText("REGISTER")).click();
	
	driver.findElement(By.partialLinkText("REGIST")).click();
	System.out.println(driver.getTitle());
	Thread.sleep(1000);
	driver.findElement(By.tagName("tr")).click();
	
	driver.quit();

	}

}
