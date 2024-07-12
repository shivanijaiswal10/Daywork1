package com.masai;


public class JavaScriptDemo {
	static WebDriver driver;
	public static void captured(int number) throws IOException{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\samir\\Downloads\\7-MAy\\ScreenShoot" + number + ".png");
		
		// copying file1 and file2
		
		FileUtils.copyFile(file1, file2);
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('checkBoxOption1').click();");
		
		js.executeScript("document.getElementById('autocomplete').value = 'Hi I am Samir'");
		
		captured(1);
		
		js.executeScript("window.scrollBy(0, 1000);");
		
		captured(2);
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, -1000)");
		
		Thread.sleep(2000);
		WebElement brokenlink = driver.findElement(By.linkText("Broken Link"));
		
		js.executeScript("arguments[0].scrollIntoView();", brokenlink);
		
		captured(3);
	
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.name("radioButton")));
		
		
		driver.close();
	}
	
	
	
}
 






}
	
