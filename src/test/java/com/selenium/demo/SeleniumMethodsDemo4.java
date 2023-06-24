package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//appUserEmailID=johnnitesh2@gmail.com
//apppassword=Testing@123

public class SeleniumMethodsDemo4 {

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

		// How to scroll down to an element in Selenium until it is visible ?

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement langMenu = driver.findElement(By.id("language_menu"));

		js.executeScript("arguments[0].scrollIntoView();", langMenu);

		Thread.sleep(3000);

		Actions action = new Actions(driver);
		action.moveToElement(langMenu).build().perform();
		Thread.sleep(3000);

		/*
		 * WebElement sourceOrFromElement = driver.findElement(By.id("language_menu"));
		 * WebElement targetOrToElement = driver.findElement(By.id("language_menu"));
		 * action.dragAndDrop(sourceOrFromElement, targetOrToElement).build().perform();
		 */

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);

		/*
		 * .getText() – Gets the text of an alert 
		 * .sendKeys(String) – Send string to the alert
		 * .accept() – Clicks the “Ok” button of the alert 
		 * .dismiss() – Clicks the “Cancel” button of the alert
		 */

		Alert myAlert = driver.switchTo().alert();

		// String textOnAlertBox = myAlert.getText();
		// System.out.println(textOnAlertBox);

		myAlert.accept(); // to click on OK button
		// myAlert.dismiss(); // to click on Cancel button
		Thread.sleep(3000);

		// quit() will close all opened tabs
		driver.quit();

	}

}
