package com.selenium.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

/*
 * TC: Verify language links on the landing page of  https://www.speaklanguages.com/
1. Launch Chrome browser
2. Launch app in the above browser https://www.speaklanguages.com/
3. Capture the links and open each link in new tab and close it
 * */

public class SeleniumMethodsDemo5 {

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
		
		String  firstWidnow  = driver.getWindowHandle();
		
		List<WebElement> langWebElements = driver.findElements(By.xpath("//p[@class='site_link']/a"));
	
		List<String> langLinks  =  new ArrayList<String>();
		
		for(WebElement element : langWebElements) {
			langLinks.add(element.getAttribute("href"));
			System.out.println(element.getText());
		}
		
		for(String link : langLinks) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(link);
			Thread.sleep(1000);
			driver.close();
			driver.switchTo().window(firstWidnow);
		}

		driver.quit();

	}

}
