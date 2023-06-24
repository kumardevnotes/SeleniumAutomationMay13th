package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//appUserEmailID=johnnitesh2@gmail.com
//apppassword=Testing@123

public class SeleniumMethodsDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		//To set driver property to launch chrome browser
		String rootFolder  = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder+"//src//test//java//com//resources//chromedriver.exe");
		
		//Browser is launched
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);
		
		WebElement  loginElement  = driver.findElement(By.id("nav_login"));
		loginElement.click();
		
		//driver.findElement(By.id("email_input")).sendKeys("user@gmail.com");
		WebElement  userEmailAddressElement  = driver.findElement(By.id("email_input"));
		userEmailAddressElement.sendKeys("johnnitesh2@gmail.com");
		
		
		WebElement  userPasswordElement   = driver.findElement(By.id("password_input"));
		userPasswordElement.sendKeys("Testing@123");
		
		
		WebElement  loginBtnElement   = driver.findElement(By.id("login_button"));
		loginBtnElement.click();
		Thread.sleep(8000);
		
		WebElement loggedInUserName  = driver.findElement(By.xpath("//li[@id='nav_user']/a"));
		String userName  = loggedInUserName.getText();
		System.out.println(userName);
		
		System.out.println(loggedInUserName.getAttribute("href"));
		
		WebElement emailMessages  = driver.findElement(By.xpath("//li[@id='nav_user']/a"));
		System.out.println(emailMessages.getAttribute("href"));
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//quit() will close all opened tabs
		driver.quit();
		
		
		
	}

}
