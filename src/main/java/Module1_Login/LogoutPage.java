package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	@FindBy(xpath="//span[text()='AR']") private WebElement RAG218;
	@FindBy(xpath="//a[@target='_self']") private WebElement Logout;
	
	
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClicklogoutpageRAGE218()
	{
		RAG218.click();
	}
	
	public void ClickLogoutPageLogout() 
	{
	    Logout.click();	
	}

}
