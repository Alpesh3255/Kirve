package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutAgainLogin 
{
	@FindBy(xpath="//input[@type='password']") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")  private WebElement ck;

	


	public LogoutAgainLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}
	
	public void inpLogoutAgainLoginEnterpassword(String psw) 
	{
	 pass.sendKeys(psw);
	}
	
	public void ClickLogoutAgainLoginclick()
	{
		ck.click();
	}
	
	


}
