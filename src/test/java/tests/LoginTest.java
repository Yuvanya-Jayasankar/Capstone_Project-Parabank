package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.Log;
import pages.LoginPage;
import utils.TestData;

public class LoginTest extends BaseTest{
	
	@Test(priority = 3, dependsOnMethods = "tests.RegisterTest.RegisterDetails")
	public void LoginUser(){
		
		 Log.info("Starting Login Test.");
	        
		LoginPage lp = new LoginPage(getDriver());
		
		lp.loginUsername(TestData.username);
		
		lp.loginPassword(TestData.password);
		
		lp.clickLogin();
		
		Log.info("Login Username: "+ TestData.username);
		Log.info("Login Password: "+ TestData.password);
		
		String expected = "Welcome Stuart Little";
		WebElement element = getDriver().findElement(By.className("smallText"));
		String actual = element.getText();
		Assert.assertEquals(actual, expected);
	        
        Log.info("Successfully Logged In :)");
	}

}
