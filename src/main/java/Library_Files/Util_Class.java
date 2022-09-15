package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.description.method.MethodDescription.AbstractBase;

public class Util_Class
{	
	    //@Author Name: Alpesh
		//this method is use to get test data from excel sheet
		//need to pass 2 inputs: 1. rowIndex , 2.colIndex
	
	public static String GetTestData(int row, int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Alpesh3255\\eclipse-workspace\\Maven_Project2\\TestData\\Alpesh.xlsx");
	    Sheet sh = WorkbookFactory.create(file).getSheet("POMDDF");
	    String TestData = sh.getRow(row).getCell(cell).getStringCellValue(); 
	    return TestData;		
	}
	
	public static void FailedTCscreenshot(WebDriver driver, int TCID) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Alpesh3255\\eclipse-workspace\\Maven_Project2\\ScreenShot\\TestCaseID"+TCID+".png"	);
		org.openqa.selenium.io.FileHandler.copy(scr, des);
	}
	
	public static String getPCdata(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Alpesh3255\\eclipse-workspace\\Maven_Project2\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);											
		return value;
		
		
	}
}
