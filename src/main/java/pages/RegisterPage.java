package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enterFirstname(String first) {
		driver.findElement(By.id("customer.firstName")).sendKeys(first);
	}
	public void enterLastname(String last) {
		 driver.findElement(By.id("customer.lastName")).sendKeys(last);
	}
	public void enterAddress(String address) {
		driver.findElement(By.id("customer.address.street")).sendKeys(address);
	}
	public void enterCity(String city) {
		driver.findElement(By.id("customer.address.city")).sendKeys(city);
	}
	public void enterState(String state) {
		driver.findElement(By.id("customer.address.state")).sendKeys(state);
	}
	public void enterZipCode(String zipcode){//site is accepting alphas also for zipcode
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipcode);
	} 
	public void enterPhoneNumber(String number) {
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(number);
	}
	public void enterSSN(String ssn) {
		driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
	}
	
	public void enterUsername(String user) {
		driver.findElement(By.id("customer.username")).sendKeys(user);
	}
	public void enterPassword(String pass) {
		driver.findElement(By.id("customer.password")).sendKeys(pass);
	}
	public void enterConfirm(String pass) {
		driver.findElement(By.id("repeatedPassword")).sendKeys(pass);
	}
	public void clickRegister() {
		driver.findElement(By.cssSelector("input[value='Register']")).click();
	}
	
	

}
