package copy.masai;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFb {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		 WebDriver driver = new ChromeDriver(); 
        
	    	driver.manage().window().maximize();
	    	driver.get("https://www.facebook.com/");
	    	
	    	//step-1 - We have mention to have path of excel file using a FileInputStream.
	    	
	    	FileInputStream fis= new FileInputStream("C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\selenium\\src\\main\\resources\\Fbdata\\New Microsoft Excel Worksheet.xlsx");
	    	
	    	
	    //step-2- using workbook factory use create() and specify the fis reference
	    			    	
	    	Workbook book = WorkbookFactory.create(fis);
	    	
	    //using POI method to get value from excel	
	 String email =  book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	 String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	    
	    driver.findElement(By.id("email")).sendKeys(email ); // hard coading is bad practice
    	driver.findElement(By.id("pass")).sendKeys(password);
    	driver.findElement(By.name("login")).click();
    	
    	book.close(); //after doing all the opreations, we have to close the workbook instance
	    
	    
	}

	
	}


