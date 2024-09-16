package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@class='flex']//img[@alt='shajgoj-logo']")
	WebElement lnkLogo;
	
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands...']")
	WebElement lnkSearch;
	
	@FindBy(xpath = "//a[normalize-space()='LOGIN']")
	WebElement btnLogin;
	
	public boolean islogoDisplay()
	{
		return lnkLogo.isDisplayed();
	}

	public void productSearch(String searchkey)
	{
		lnkSearch.sendKeys(searchkey);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
}
