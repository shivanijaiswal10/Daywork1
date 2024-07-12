package com.masai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlinks {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("\"https://www.flipkart.com/\"");
		
		list<WebWlement> links = driver.findElements(By.tagName(""))
		
	
	
	
	}

}

