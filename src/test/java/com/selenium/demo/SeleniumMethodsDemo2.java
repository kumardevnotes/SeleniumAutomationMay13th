package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * 
TC: Verify login

1. Launch Chrome browser
2. Launch app in the above browser https://www.speaklanguages.com/
3. Then click on Log in link
4. Enter valid email address and password and then click on Log in button
5. User should be able to login into the app
appUserEmailID=johnnitesh2@gmail.com
apppassword=Testing@123
 * */

public class SeleniumMethodsDemo2 {

	public static void main(String[] args) throws InterruptedException {

		// To set driver property to launch chrome browser
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				rootFolder + "//src//test//java//com//resources//chromedriver.exe");

		// Browser is launched
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		// maximize the browser
		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);

		WebElement loginElement = driver.findElement(By.id("nav_login"));
		loginElement.click();

		// driver.findElement(By.id("email_input")).sendKeys("user@gmail.com");
		WebElement userEmailAddressElement = driver.findElement(By.id("email_input"));
		userEmailAddressElement.sendKeys("johnnitesh2@gmail.com");

		WebElement userPasswordElement = driver.findElement(By.id("password_input"));
		userPasswordElement.sendKeys("Testing@123");

		WebElement loginBtnElement = driver.findElement(By.id("login_button"));
		loginBtnElement.click();
		Thread.sleep(8000);

		// quit() will close all opened tabs
		driver.quit();

	}

}
