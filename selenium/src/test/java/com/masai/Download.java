package com.masai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			
		   	driver.get(");
			driver.manage().window().maximize();
			
				
					driver.manage().window().maximize();
					
					driver.get("https://rahulshettyacademy.com/AutomationPractice/");
					
					
					String txt = driver.findElement(By.xpath("(//table[@id='product'])[2]/tbody/tr[3]/td[3]")).getText();
					
					System.out.println(txt);
				}






			
			

		
	}

}
