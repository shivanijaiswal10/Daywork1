package copy.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGdemo {
	@Test
	 
	
	public void webtabletest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		
			String num = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[9]/td[2]")).getText();
			System.out.println(num);
		
		// Your path is wrong then how to it is work ?
			
			// Now do yourself another I check it what are you write wrong
			// create one new class and write one code 
			
			
		
	}

}
