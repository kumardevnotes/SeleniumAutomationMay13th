package com.selenium.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMethodsDemo1 {

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
		
		//To launch an application by passing app URL as parameter in below get(String appUrl)
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(2000);
		
		driver.navigate().back(); // I will goto Rediff
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		//Launch a new tab and launch https://in.search.yahoo.com/
		driver.switchTo().newWindow(WindowType.TAB); //WINDOW
		
		Dimension dimension = new Dimension(700, 400);
		driver.manage().window().setSize(dimension);
		
		driver.get("https://in.search.yahoo.com/");
		Thread.sleep(5000);
		
		//close() will close only current tab
		driver.close();
		Thread.sleep(1000);
		
		//quit() will close all opened tabs
		driver.quit();
	}

}
