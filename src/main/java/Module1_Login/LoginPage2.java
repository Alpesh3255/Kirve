package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[normalize-space()='Continue']") private WebElement click;

	public LoginPage2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inploginpage2PIN(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void clickloginpage2ConBtn()
	{
		click.click();
	}
	
	
}
