package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationdemo {

	public static void main(String[] args)throws InterruptedException {
		
		
		WebDriver ss = new ChromeDriver();
		ss.get("https://www.sarkariresult.com/");   ////variablename.manage().window().maximize();  - use ctrl + spacebar when yoiu write it
		ss.manage().window().maximize();
	   
		
		ss.findElement(By.partialLinkText("ResumeAssistance/Material")).click();

		
//		refresh
		
		ss.navigate().refresh();
		// TODO Auto-generated method stub

	}

}
