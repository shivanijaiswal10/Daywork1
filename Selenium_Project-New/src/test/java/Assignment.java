import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	       
			driver.get("https://ilaindia.co.in/registration");
			
			driver.manage().window().maximize();
			
			WebElement title = driver.findElement(By.id("jfrom_title"));
			Select s = new Select(title);
			/*
            s.selectByIndex("")
			
			*/
	}

}
