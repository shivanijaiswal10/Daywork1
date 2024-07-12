package masai;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupFacebook {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
	}
	@Test
	public void testCase() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("shivani");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("jaiswal");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("shivi123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("shivi123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("S143@shi@#$12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Feb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()=1997]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();	
		
	}

}



