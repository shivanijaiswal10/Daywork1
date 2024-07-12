package maySeven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver(); 
         
//		   call implicit wait here
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		driver.manage().window().maximize();
		
//		driver.get(WebDriver driver = new ChromeDriver();
		/*
		"https://demo.guru99.com/test/simple_context_menu.html");
		
		*/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // this is rahul shetty page link
		
//		driver.findElement(By.id("email")).sendKeys("shivani");
		
		driver.findElement(By.partialLinkText("Free Access to InterviewQues/ResumeAssistance/Material")).click(); // this is partial link one methode forget this is click methode
				
//		
		
		
		

	}

}
