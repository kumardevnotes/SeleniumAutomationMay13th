package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SpeakLangTests {
 
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
		
		
		WebElement logInLink  = driver.findElement(By.id("nav_login"));
		logInLink.click();
		Thread.sleep(2000); 
		
		WebElement userEmailAddressTextField  =driver.findElement(By.id("email_input"));
		userEmailAddressTextField.sendKeys("johnnitesh2@gmail.com");
		
		
		WebElement userPwdTextField  =driver.findElement(By.id("password_input"));
		userPwdTextField.sendKeys("Testing@123");
		
		WebElement loginButton  =driver.findElement(By.id("login_button"));
		loginButton.click();
		
		Thread.sleep(8000); 
		
		driver.quit(); //driver.close()
		
		
  }
  
  @Test
  public void locatorsDemo() throws InterruptedException {
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
		
		WebElement languageList  = driver.findElement(By.className("resources_inner"));
		boolean displayedOrNot  = languageList.isDisplayed();
		System.out.println(displayedOrNot);
		
		WebElement headerTag  =driver.findElement(By.tagName("h1"));
		displayedOrNot  = headerTag.isDisplayed();
		System.out.println(displayedOrNot);
		
		WebElement signUpLink  = driver.findElement(By.partialLinkText("Sign up"));
		signUpLink.click();
		Thread.sleep(2000); 
		
		WebElement firstNameTextField  = driver.findElement(By.name("first_name"));
		firstNameTextField.sendKeys("John");
		Thread.sleep(2000); 
		
		WebElement lastNameTextField  = driver.findElement(By.name("last_name"));
		lastNameTextField.sendKeys("Miller");
		Thread.sleep(2000); 
		
		driver.quit(); //driver.close()
		
		
  }
}
