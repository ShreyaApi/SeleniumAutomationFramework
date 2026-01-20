package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utility.Log;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() throws InterruptedException
	
	{
	Log.info("Stating Login test..");
	LoginPage loginPage=new LoginPage(driver);
	
	Log.info("Entering Credentials..");
	loginPage.enterUsername("admin@yourstore.com");
	loginPage.enterPassword("admin");
	loginPage.clickLogin();
	System.out.println("Title of the page is : "+driver.getTitle());
	Log.info("Verifying title of page..");
	Assert.assertEquals(driver.getTitle(), "Just a moment...");
	
	}
	
	
}
