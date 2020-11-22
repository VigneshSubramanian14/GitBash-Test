import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListWebelement_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> textboxes = driver.findElements(By.xpath("//input[contains(@name,'Name') and contains(@maxlength,'60')]"));
		textboxes.get(0).sendKeys("Bala");
		Thread.sleep(5000);
		textboxes.get(1).sendKeys("Vignesh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("9953446677");
		driver.findElement(By.xpath("//input[contains(@id,'userName')]")).sendKeys("vigneshrio");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; // To scroll to page
		js.executeScript("window.scroll(16,318.667)","");
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@name,'country')]")));
		select.selectByVisibleText("BOUVET ISLAND");
		

	}

}
