package masai;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseHovere_ebay {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void Test1() throws InterruptedException {
		
			
//			Creating a actions object
			Actions action = new Actions(driver);
//			call mouseHover
			WebElement electronics = driver.findElement(ByXPath.xpath("(//a[text()='Electronics'])[2]"));
			Thread.sleep(2000);
			WebElement fashion = driver.findElement(ByXPath.xpath("(//a[text()='Fashion'])[2]"));
			Thread.sleep(2000);
			WebElement electronics1 = driver.findElement(ByXPath.xpath("(//a[text()='Electronics'])[2]"));
			Thread.sleep(2000);
			WebElement refurbished = driver.findElement(ByXPath.xpath("//a[text()='Refurbished']"));
			Thread.sleep(2000);
			
			action.moveToElement(electronics).build().perform();
			Thread.sleep(2000);
			action.moveToElement(fashion).build().perform();
			Thread.sleep(2000);
			action.moveToElement(electronics1).build().perform();
			Thread.sleep(2000);
			action.moveToElement(refurbished).build().perform();
			
			driver.close();

		}

}


