package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC003_LoginTest extends BaseClass{

	@Test
	public void verify_Loginbtn()
	{
		logger.info("** starting TC003_LoginTest **");
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickLogin();
		
		LoginPage lp= new LoginPage(driver);
		boolean targetPage=lp.isLoginPageExists();
		
		Assert.assertTrue(targetPage);	
		}
		catch(Exception e)
		{
			logger.error("Test failed...");
			Assert.fail();
		}
		logger.info("** finished TC003_LoginTest **");
	}
}
