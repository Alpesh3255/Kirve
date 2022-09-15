package Module1_loginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.BaseClass;
import Library_Files.Util_Class;
import Module1_Login.LoginPage1;
import Module1_Login.LoginPage2;
import Module1_Login.LogoutAgainLogin;
import Module1_Login.LogoutAgainLoginPIN;
import Module1_Login.LogoutPage;
import Module1_Login.homePage;

public class KiteTestClass_TestNG  extends BaseClass
{
	
	Sheet sh;
	LoginPage1 login1;
	LoginPage2 login2;
	homePage homepage;
	LogoutPage logout;
    int TCID;
    LogoutAgainLogin lag;
    LogoutAgainLoginPIN lagp;

	@BeforeClass
	public void BrowserOpen() throws InterruptedException, EncryptedDocumentException, IOException
	{
		 OpenBrowser();
	     login1=new LoginPage1(driver);
	     login2=new LoginPage2(driver);
	     homepage=new homePage(driver);
	     logout=new LogoutPage(driver);
	     lag=new LogoutAgainLogin(driver);
		 lagp=new LogoutAgainLoginPIN(driver);
	}
	
	@BeforeMethod
    public void KiteLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{		
		login1.inploginpage1ID(Util_Class.getPCdata("UI"));
		login1.inploginpage1PWD(Util_Class.getPCdata("PSW"));
		login1.clickloginpage1Loginbtn();
		login2.inploginpage2PIN(Util_Class.getPCdata("PIN"));
		login2.clickloginpage2ConBtn();		  
	}

    
	@Test 
    public void VerifyUserID() throws EncryptedDocumentException, IOException
    {
		TCID =101;
		String ActualR=homepage.VerifyUserID();
		String ExpectedR=Util_Class.GetTestData(0, 3);
	
		Assert.assertEquals(ActualR, ExpectedR, "Failed: Result not Same - ");
    }

	@Test 
    public void VerifyUserID1() throws EncryptedDocumentException, IOException
    {
		TCID =102;
		String ActualR=homepage.VerifyUserID();
		String ExpectedR=Util_Class.GetTestData(0, 3);
	
		Assert.assertEquals(ActualR, ExpectedR, "Failed: Result not Same - ");
    }
	

    @AfterMethod
    public void KiteLogout(ITestResult s1) throws IOException
    {
    	if (s1.getStatus()==ITestResult.FAILURE)
    	{
    		Util_Class.FailedTCscreenshot(driver,TCID);
		}
	    logout.ClicklogoutpageRAGE218();
	    logout.ClickLogoutPageLogout();    	
    }
    
    @AfterClass
    public void BrowserClose() 
    {
    	driver.quit();
    }


}
