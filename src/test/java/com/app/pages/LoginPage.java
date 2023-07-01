package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver = null;

	public LoginPage(WebDriver actualDriver) {
		driver = actualDriver;
	}

	public static By emailAddressLocator = By.id("email_input");
	public static By passwordLocator = By.id("password_input");
	public static By loginButtonLocator = By.id("login_button");
	public static By loggedInUserLocator = By.xpath("//li[@id='nav_user']/a");

	public void loginIntoApp(String emailAddress, String password) throws InterruptedException {

		WebElement userEmailAddressElement = driver.findElement(emailAddressLocator);
		userEmailAddressElement.sendKeys(emailAddress);

		WebElement userPasswordElement = driver.findElement(passwordLocator);
		userPasswordElement.sendKeys(password);

		WebElement loginBtnElement = driver.findElement(loginButtonLocator);
		loginBtnElement.click();
		Thread.sleep(6000);

	}

	public String getLoggedInUserName() throws InterruptedException {

		return driver.findElement(loggedInUserLocator).getText();
	}

}
