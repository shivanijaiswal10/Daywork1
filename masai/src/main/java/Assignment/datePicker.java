package Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class datepicker() {
	WebDriver driver;
	
	@BeforeTest
	 public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		
	}
	@Test
	public void testCase() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control hasDatepicker']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
	    
		Thread.sleep(2000);
		
		String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		Thread.sleep(2000);
		
		String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
//		for selecting month
		while(!(currentmonth.equals("October") && currentyear.equals("2001"))) {
		
//		for clicking on next
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
//		New month and year value storing in variables
		 currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	     currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		
		driver.findElement(By.xpath("//a[text()='31']")).click();
		

	}

}
	
	

}
