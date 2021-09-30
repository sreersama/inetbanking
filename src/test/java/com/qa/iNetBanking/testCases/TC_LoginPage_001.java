package com.qa.iNetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.iNetBanking.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass{
	
	@Test
	public void LoginTest() throws IOException
	{
		//driver.get(BaseURL);
		logger.info("URL is opened");
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(uName);
		logger.info("entring user name");
		lp.setPassword(Password);
		logger.info("entring password");

		lp.clickLoginBtn();
		logger.info("logging into application");

		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("TestCase Passed");
		}
		else
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("TestCase Failed");
		}
	}

}
