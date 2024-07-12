package maySeven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); 
		
//		   call implicit wait here
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
 // Step 1- first find the locator for option1 and click on it.
  
       driver.findElement(By.id("checkBoxOption1")).click();
       driver.findElement(null);
		  
		
        
				
		
		
		
	}

}
//is this right? ok write webdrive and assign chrome driveryea ok wait
// everything wrong  write own