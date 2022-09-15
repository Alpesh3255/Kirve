package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage 
{
	@FindBy(xpath="//span[text()='RAG218']") private WebElement userID;
	
	public homePage(WebDriver driver) 
	{ 
       PageFactory.initElements(driver, this);
	}

	
/*	public void VerifiyhomepageuserID(String expectedID)
	{
		String actualID=userID.getText();
		
		if(actualID.equals(expectedID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}*/
   
    public String VerifyUserID()
    {
		String ActualID = userID.getText();
		return ActualID;
	}
}
