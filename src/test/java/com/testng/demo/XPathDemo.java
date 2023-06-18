package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class XPathDemo {
 
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
		Thread.sleep(5000); //3ms = 3sec
		
		WebElement following_SiblingElement = driver.findElement(By.xpath("//a[.='Privacy policy']/following-sibling::a[1]"));
		System.out.println(following_SiblingElement.getText());
		Thread.sleep(2000);
		
		WebElement preceding_SiblingElement = driver.findElement(By.xpath("//a[.='Contact us']/preceding-sibling::a[1]"));
		System.out.println(preceding_SiblingElement.getText());
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[.='Sign up']")).click();
	
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("johnmiller@gmail.com");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("johnmiller@gmail.com");
		Thread.sleep(3000);
		
		WebElement SignupHeader = driver.findElement(By.xpath("//h1[contains(text(),'Sign up')]"));
		System.out.println(SignupHeader.isDisplayed());
		Thread.sleep(5000);
		
	
		driver.quit(); //driver.close()
		
		
  }

}
