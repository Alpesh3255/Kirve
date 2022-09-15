package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutAgainLoginPIN 
{
	@FindBy(xpath="//input[@id='pin']") WebElement pin;
    @FindBy(xpath="//button[@type='submit']") WebElement Click;
    
    public LogoutAgainLoginPIN(WebDriver driver) 
    {
    	PageFactory.initElements(driver, this);
	}
	
    
    public void inpLogoutAgainLoginPIN(String PIN) 
    {
		pin.sendKeys(PIN);
	}
    
    public void ClickLogoutAgainLoginPINClickPIN()
    {
		Click.click();
	}
}

