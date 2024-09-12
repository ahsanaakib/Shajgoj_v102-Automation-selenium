package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC002_SearchProduct extends BaseClass{
	
	@Test
	public void verify_search()
	{
		logger.info("** starting TC002_SearchProduct **");
		try
		{
		HomePage hp= new HomePage(driver);
		hp.productSearch("shampoo");
		}catch(Exception e)
		{
			logger.error("Test failed...");
			Assert.fail();
		}
		logger.info("** finished TC002_SearchProduct **");
	}

}
