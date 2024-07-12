package copy.masai;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSwitchWindow {

	private static String singlehandle;

	public static void main(String[] args, WebElement dropdown) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver(); 
		  
	        
//        call implicit wait here
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		
		driver.get(" https://the-internet.herokuapp.com/login");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Elemental Selenium']\"))")).click();
		
		
		driver.manage().window().maximize();
		
		Set<String> allhands = driver.getWindowHandles();
		
		for(String singlehandle : allhands); {
			
			driver.switchTo().window(singlehandle);
			
			 if(driver.getTitle().equals("Home | Element Selenium")) {
//				 break;
				 
			 }
		}
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shivanijaiswal06@gmail.com");
		
		WebElement dropElement = driver.findElement(By.id("options"));
		 
		Select s = new Select(dropdown);
		
		s.deselectByValue("phython");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		driver.switchTo().window(parenthandle);
		
		
		
		
		
		
		
		
		
		

	}

}
