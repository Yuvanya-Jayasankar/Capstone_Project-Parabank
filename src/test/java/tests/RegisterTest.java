package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.Log;
import pages.RegisterPage;
import utils.TestData;

public class RegisterTest extends BaseTest{
	
	@Test(priority = 1)
	public void RegisterDetails() {
		Log.info("Starting Registration.");
		RegisterPage rp = new RegisterPage(getDriver());
		Log.info("Adding info...");
		
		rp.enterFirstname("Stuart");
		rp.enterLastname("Little");
		rp.enterAddress("123 Main St.");
		rp.enterCity("Chennai");
		rp.enterState("Tamil Nadu");
		rp.enterZipCode("12345");
		rp.enterPhoneNumber("0123456789");
		rp.enterSSN("123");
		
		rp.enterUsername(TestData.username);
		rp.enterPassword(TestData.password);
		rp.enterConfirm(TestData.password);
		
		rp.clickRegister();
		
		String expected = "Welcome Stuart Little";
		WebElement element = getDriver().findElement(By.className("smallText"));
		String actual = element.getText();
		Assert.assertEquals(actual, expected);
		Log.info("Verified");
		Log.info("Registration Completed!!!");
	}

}
