package copy.masai;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {
	public static void main(String[] args) {
		
		WebDriver ss = new ChromeDriver();
		ss.get("https://www.sarkariresult.com/");   ////variablename.manage().window().maximize();  - use ctrl + spacebar when yoiu write it
		ss.manage().window().maximize();
		
		WebElement dropdown = ss.findElement(By.id("https://rahulshettyacademy.com/AutomationPractice/"));
		
		Select s = new Select(dropdown);
				
				s.selectByIndex(3);
		s.selectByIndex(3);
		
		//Thread.sleep(2000);
		
		//s.selectByIndex("option2");
		
		//Thread.sleep(2000);
		//s.selectVisibleText("Option");
		
		
	}
	
			

}
