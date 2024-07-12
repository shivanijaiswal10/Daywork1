package com.Masai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); 
        
//         call implicit wait here
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
//		click on date to open the calender
		
		driver.findElement(By.id("datepicker")).click();
		
//		logic- we have to keep clicking onnext untilwe get october text
		
	
		
		String actualmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		String actualyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		

//		this is for selecting month
		while(!(actualmonth.equals("october")&&actualyear.equals("2024"))) {

//			clicking on next
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			actualmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			actualyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		
//		clicking on 2nd october
		driver.findElement(By.xpath("//td[@data-handle='selectDay']/a[.='2')")).click();
	

	}

}

		

	


