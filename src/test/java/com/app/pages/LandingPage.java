package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver = null;
	
	public LandingPage(WebDriver actualDriver) {
		driver = actualDriver;
	}
	

	public static By appLogoLocator = By.id("logo");
	public static By searchFieldLocator = By.id("search_input");
	public static By searchButtonLocator = By.id("search_submit");
	public static By loginLinkLocator = By.id("nav_login");
	public static By signUpLinkLocator = By.id("nav_signup");
	
	public boolean isHeaderDisplayed() {
		return driver.findElement(appLogoLocator).isDisplayed() &&
				driver.findElement(searchFieldLocator).isDisplayed() &&
				driver.findElement(searchButtonLocator).isDisplayed() &&
				driver.findElement(loginLinkLocator).isDisplayed() &&
				driver.findElement(signUpLinkLocator).isDisplayed();
	}
	
	// true && true && true && true && false --> false

	
	public void navigateToLogin() {
		driver.findElement(loginLinkLocator).click();
	}
	
	public void navigateToSignup() {
		driver.findElement(signUpLinkLocator).click();
	}
}
