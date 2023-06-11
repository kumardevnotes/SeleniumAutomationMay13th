package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo {

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
		driver.get("https://google.co.in");
		Thread.sleep(3000); // 3000 ms = 3 sec
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.4.0");
		Thread.sleep(3000);
		
		//to close browser
		driver.quit();
	}

}
