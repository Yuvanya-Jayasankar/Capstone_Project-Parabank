package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	} 
	public void loginUsername(String user) {
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(user);
	}
	public void loginPassword(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);
	}
	public void clickLogin() {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
