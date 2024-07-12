package com.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		
		 WebDriver driver = new ChromeDriver(); 
         
	    	driver.manage().window().maximize();
	    	driver.get("https://www.facebook.com/");
	    	
	    	driver.findElement(By.id("email")).sendKeys('shivanijaiswal1011@gmail.com");
	    	driver.findElement(By.id("pass")).sendKeys("shivani");
	    	driver.findElement(By.name("login")).click();
	    	
		

	}

}
