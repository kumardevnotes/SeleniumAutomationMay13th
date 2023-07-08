package com.testng.demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	WebDriver driver = null;
	String rootFolder = System.getProperty("user.dir");

	public void initialize() {

		System.setProperty("webdriver.chrome.driver",
				rootFolder + "//src//test//java//com//resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.speaklanguages.com/");

		driver.quit();
		System.out.println("Browser is closed");
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void enterText(By locator, String text) {
		WebElement element = returnElement(locator, "clickable");
		element.sendKeys(text);
	}

	public void clearText(By locator, String text) {
		WebElement element = returnElement(locator, "clickable");
		element.clear();
	}

	public String getText(By locator, String text) {
		WebElement element = returnElement(locator, "visible");
		return element.getText();
	}

	public void clickElement(By locator, String text) {
		WebElement element = returnElement(locator, "clickable");
		element.click();
	}

	public static void captureScreenshot(WebDriver driver, int screenshotID) throws IOException {
		String rootFolder = System.getProperty("user.dir");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(rootFolder + "//Screenshots//myScreenshot_" + screenshotID + ".png");
		FileHandler.copy(src, destination);
	}
	
	
	public void setPage(String pageUrl) {
		driver.get(pageUrl);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	private WebElement returnElement(By locator, String action) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		switch (action) {
		case "visible":
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			element = driver.findElement(locator);
			break;
		case "clickable":
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			element = driver.findElement(locator);
			break;
		case "presenceOfElement":
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			element = driver.findElement(locator);
			break;
		default:
			System.out.println("Please pass a valid driver action");
		}
		return element;
	}

}
