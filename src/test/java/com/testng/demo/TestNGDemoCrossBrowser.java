package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestNGDemoCrossBrowser {
  
	//Cross browser testing. You run the same testcase in 2 different browsers
  @Test
  public void speakLangInChrome() throws InterruptedException {
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
		Thread.sleep(3000); //3ms = 3sec
		
		driver.quit(); //driver.close()
  }
  
  @Test
  public void speakLangInEdge() throws InterruptedException {
	//To set driver property to launch Edge browser
			String rootFolder  = System.getProperty("user.dir");
			System.setProperty("webdriver.edge.driver", rootFolder+"//src//test//java//com//resources//msedgedriver.exe");
			
			//Browser is launched
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new EdgeDriver(options);
			
			//maximize the browser
			driver.manage().window().maximize();
			driver.get("https://www.speaklanguages.com/");
			Thread.sleep(3000); //3ms = 3sec
			
			driver.quit(); //driver.close()
  }
}
