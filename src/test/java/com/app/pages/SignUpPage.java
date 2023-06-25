package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class SignUpPage {
	
	WebDriver driver = null;
	
	public SignUpPage(WebDriver actualDriver) {
		driver = actualDriver;
	}
	
	public static By firstNameLocator = By.id("first_name");
	public static By lastNameLocator = By.name("last_name");
	public static By emailAddressLocator = By.name("email");
	public static By passwordLocator = By.name("password");
	public static By genderLocator = By.name("sex");
	public static By dayLocator = By.name("dob_day");
	public static By monthLocator = By.name("dob_month");
	public static By yearLocator = By.name("dob_year");
	public static By signUpLocator = By.xpath("//input[@value='Sign up']");

	public void signUpWithApp() throws InterruptedException {
		
		Faker faker = new Faker();
		
		driver.findElement(firstNameLocator).sendKeys(faker.name().firstName());
		driver.findElement(lastNameLocator).sendKeys(faker.name().lastName());
		driver.findElement(emailAddressLocator).sendKeys(faker.internet().emailAddress());
		driver.findElement(passwordLocator).sendKeys("abcABC9989");
		
		WebElement sexDDElement  = driver.findElement(genderLocator);
		Select sexDD = new Select(sexDDElement);
		sexDD.selectByVisibleText("Male");
		
		WebElement dayDDElement  = driver.findElement(dayLocator);
		Select dayDD = new Select(dayDDElement);
		dayDD.selectByVisibleText("10");
		
		
		WebElement monthDDElement  = driver.findElement(monthLocator);
		Select monthDD = new Select(monthDDElement);
		monthDD.selectByVisibleText("January");
		
		WebElement yearDDElement  = driver.findElement(yearLocator);
		Select yearDD = new Select(yearDDElement);
		yearDD.selectByVisibleText("1988");
		
		driver.findElement(signUpLocator).click();
		Thread.sleep(8000);
		
	}
}
