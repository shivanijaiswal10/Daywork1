package com.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		
		
		 WebDriver driver = new ChromeDriver();
			
		   	driver.get("https://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();

			driver.findElement(By.className("upload_txt")).sendKeys("C:\\Users\\shiva\\OneDrive\\Desktop");
			
			driver.findElement(By.id("terms")).click();
			
			driver.findElement(By.id("terms")).click();
			driver.findElement(By.id("submition")).click();
			
			
	}

}
