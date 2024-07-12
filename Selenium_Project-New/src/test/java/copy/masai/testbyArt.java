package copy.masai;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbyArt {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		
		driver.findElement(By.xpath("//*[@id=\\\"promptBox\\\"]"));
		Alert al = driver.switchTo().alert();
		al.sendKeys("Testing");
		al.accept();

	}

}
