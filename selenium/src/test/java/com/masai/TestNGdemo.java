package com.masai;

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
		
		
			String num = driver.findElement(By.xpath("//table[@name = 'cource']/tbody/tr[7])/td[3]")).getText();
			System.out.println(num);
		
		
		
	}

}
