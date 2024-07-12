package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		
		
		WebDriver ss = new ChromeDriver();
		ss.get("https://www.facebook.com/");   ////variablename.manage().window().maximize();  - use ctrl + spacebar when yoiu write it
		ss.manage().window().maximize();
		
		
		ss.findElement(By.id("email")).sendKeys("shivanijaiswal");
		ss.findElement(By.id("pass")).sendKeys("shivi@123");
		
		
		
		// TODO Auto-generated method stub

	}

}
