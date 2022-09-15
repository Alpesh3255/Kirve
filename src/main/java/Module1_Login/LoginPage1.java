package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
	@FindBy(xpath="//input[@id='userid']") private WebElement id;
	@FindBy(xpath="//input[@id='password']") private WebElement psw;
	@FindBy(xpath="//button[normalize-space()='Login']") private WebElement loginclick;
	
	public LoginPage1(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
    public void inploginpage1ID(String userID)
    {
    	try
    	{
    		if(id.isDisplayed())
        	{
        		id.sendKeys(userID);
        	}
    	
		} catch (Exception e)
    	{
			System.out.println(e);
		}
	}
    
    public void inploginpage1PWD(String userPWD)
    {
	  psw.sendKeys(userPWD);	
	}
	
    public void clickloginpage1Loginbtn()
    {
		loginclick.click();
	}

}
