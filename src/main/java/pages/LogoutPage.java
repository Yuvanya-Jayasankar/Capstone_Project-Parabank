package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
   
	public void logout() {
        driver.findElement(By.linkText("Log Out")).click();
    }
}
