import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ListWebelement {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\b.g.balasubramanian\\Selenium\\eclipse-workspace\\SeleniumProject\\Drivers\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.demoqa.com/elements");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[starts-with(@id,'item')]")).click();
			Thread.sleep(2000);
			
		//Use of Find Elements 
			List<WebElement> textboxes = driver.findElements(By.xpath("//input[contains(@id,'user')]"));
			
			
			textboxes.get(0).sendKeys("Vignesh");
			textboxes.get(1).sendKeys("vignesh@accenture.com");
			
		//	List<WebElement> textboxes1 = driver.findElements(By.xpath("//textarea[contains(@class,'form-control')]"));
			List<WebElement> textboxes1 = driver.findElements(By.xpath("//textarea[starts-with(@class,'form')]"));
			textboxes1.get(0).sendKeys("Chidambaranar Street,AdalNagar");
			textboxes1.get(1).sendKeys("Kandambakkam post");

	}

}
