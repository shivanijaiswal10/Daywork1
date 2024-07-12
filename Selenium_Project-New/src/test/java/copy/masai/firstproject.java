package copy.masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstproject {


	public static void main(String[] args) {
		
		WebDriver ss = new ChromeDriver();
		ss.get("https://www.sarkariresult.com/");   ////variablename.manage().window().maximize();  - use ctrl + spacebar when yoiu write it
		ss.manage().window().maximize();
	
		ss.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		ss.findElement(By.id("checkBoxOption1")).click();

	}

}
