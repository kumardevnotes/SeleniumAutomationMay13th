package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//To get root folder in your computer
		String rootFolder = System.getProperty("user.dir");
		
		//to set the chrome driver property
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//java//com//resources//chromedriver.exe");
		
		//Browser is launched
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//Browser is maximized
		driver.manage().window().maximize();
		
		//Browser launches Rediff email login page
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Wait for 5 seconds
		Thread.sleep(5000); // 4000ms = 4seconds
		
		//This will close the browsers
		driver.close();

	}

}
