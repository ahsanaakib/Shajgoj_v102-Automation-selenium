package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_LogoDisplayTest extends BaseClass{

	@Test
	public void verifyDisplay()
	{
		logger.info("** starting TC001_LogoDisplayTest **");
		try
		{
		HomePage hp= new HomePage(driver);
		boolean logo=hp.islogoDisplay();
		
		if(logo==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		}catch(Exception e)
		{
			logger.error("Test failed...");
			Assert.fail();
		}
		logger.info("** finished TC001_LogoDisplayTest **");
	}
}
