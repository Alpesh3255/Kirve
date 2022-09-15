package Library_Files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public WebDriver driver;
	
	public void OpenBrowser() throws InterruptedException, IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alpesh3255\\eclipse-workspace\\Maven_Project2\\Browser\\chromedriver.exe");
	    driver=new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	    Thread.sleep(2000);
	    driver.get(Util_Class.getPCdata("URL"));
        driver.manage().window().maximize();
        
		
	}

}
