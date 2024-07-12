package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	
	public static void main(String[] args) {
		
		WebDriver ss = new ChromeDriver();
		ss. get("https://rahulshettyacademy.com/AutomationPractice/");   ////variablename.manage().window().maximize();  - use ctrl + spacebar when yoiu write it
		ss.manage().window().maximize();
		
//		 now i have to enter text in to text field.
		ss.findElement(By.id("autocomplete")).sendKeys("This batch is awesome!");
		
		
	}
	
	
	

}
