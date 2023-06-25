package com.selenium.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumMethodsDemo6 {

	public static void main(String[] args) throws InterruptedException, IOException {

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
		
		driver.findElement(By.linkText("Sign up")).click();
		
		WebElement sexDDElement  = driver.findElement(By.name("sex"));
		Select sexDD = new Select(sexDDElement);
		
		sexDD.selectByVisibleText("Male");
		Thread.sleep(3000);
		
		sexDD.selectByValue("Female");
		Thread.sleep(3000);
		
		sexDD.selectByIndex(1);
		Thread.sleep(3000);
		
		//Captures dropdown screenshot as we are in dropdown element for Sign up page
		captureScreenshot(driver, 1);
		
		//Captures landing page
		driver.navigate().back();
		Thread.sleep(2000);
		captureScreenshot(driver, 2);
		
		//captures login page
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		captureScreenshot(driver, 3);
		
		driver.quit();

	}

	private static void captureScreenshot(WebDriver driver, int screenshotID) throws IOException {
		String rootFolder = System.getProperty("user.dir");
		//Capturing screenshot in Selenium
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File destination  =  new File(rootFolder+"//Screenshots//myScreenshot_"+screenshotID+".png");
				FileHandler.copy(src, destination);
	}

}
