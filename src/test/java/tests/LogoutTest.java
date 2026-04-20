package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.Log;
import pages.LogoutPage;

public class LogoutTest extends BaseTest{
	
	@Test(priority = 2, dependsOnMethods = "tests.RegisterTest.RegisterDetails",
			retryAnalyzer = utils.RetryAnalyzer.class)
	public void LogoutUser() throws InterruptedException {
		Log.info("Starting Logout Test.");

		LogoutPage lop = new LogoutPage(getDriver());
		lop.logout();
		Thread.sleep(2000);
		String expected = "Customer Login";
		WebElement element = getDriver().findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));
		String actual = element.getText();
		Assert.assertEquals(actual,expected);
		
		Log.info("Logged Out...");
	}
}
