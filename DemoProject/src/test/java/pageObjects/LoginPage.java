package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath= "//h2[normalize-space()='Login']")
	WebElement msgLogin;
	
	public boolean isLoginPageExists()
	{
		try
		{
		return msgLogin.isDisplayed();
		}catch( Exception e)
		{
			return false;
		}
	}
	
}
