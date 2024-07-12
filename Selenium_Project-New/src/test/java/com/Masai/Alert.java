package com.Masai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriver driver = new ChromeDriver(); 
        
//        call implicit wait here
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertBox")).click();
		
		
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 Wait.until(ExpectedConditions.alertIsPresent());
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.id("confirmBox")).click();
		 
		 Wait.until(ExpectedConditions.alertIsPresent());
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().dismiss();
		 
		 driver.findElement(By.xpath("//*[@id='promptBox']")).click();
		 
		 Wait.until(ExpectedConditions.alertIsPresent());
		 
		 Thread.sleep(2000);
		 //Prompt alert
		 
		 Alert al = (Alert) driver.switchTo().alert();
		 
		 al.sendkeys("Shivani");
		 al.accept();
		 
	}

	private void accept() {
		// TODO Auto-generated method stub
		
	}

	private void sendkeys(String string) {
		// TODO Auto-generated method stub
		
	}
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
				
//	