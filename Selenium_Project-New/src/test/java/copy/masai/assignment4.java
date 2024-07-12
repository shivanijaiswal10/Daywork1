package copy.masai;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver(); 
	        
//        call implicit wait here
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertBox")).click();
		
		
//		alert will appear
//		alert with only ok button
		Thread.sleep(1000);
		driver.switchTo().alert().accept(); //this will check on ok button in the alert
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 300);");
		
//		confirmation alert-2 option- ok & cancel
		driver.findElement(By.id("confirmBox")).click();		
		Thread.sleep(1000);				
		driver.switchTo().alert().dismiss(); //dismiss is used for cancel
		
	// do practice this projct --- Run this project check its working
		
		driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
//		prompt Alert
		
		Alert al = driver.switchTo().alert();
		al.sendKeys("Shivani");
		al.accept();// this will check onok
		

		
	}



			

	}


