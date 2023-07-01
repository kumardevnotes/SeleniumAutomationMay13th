package com.testng.demo;

import org.testng.annotations.Test;

import com.app.pages.LandingPage;
import com.app.pages.LoginPage;
import com.app.pages.SignUpPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

/*
 * Browser is launched
verifyLandingPage is tested and found no issues
Browser is closed*/

public class MyAppTests {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		// To set driver property to launch chrome browser
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				rootFolder + "//src//test//java//com//resources//chromedriver.exe");

		// Browser is launched
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		// maximize the browser
		driver.manage().window().maximize();

		driver.get("https://www.speaklanguages.com/");
		System.out.println("Browser is openedand app is launched");
	}

	@Test
	public void verifyLandingPage() throws IOException {
		LandingPage landingPageObj = new LandingPage(driver);
		boolean isPageLoaded = landingPageObj.isHeaderDisplayed();
		// isPageLoaded = false;
		if (isPageLoaded) {
			System.out.println("verifyLandingPage is tested and found no issues");
		} else {
			String failedMessage = "LandingPage is not loaded properly. Please check";
			System.out.println(failedMessage);
			captureScreenshot(driver, "verifyLandingPage");
			Assert.fail(failedMessage);
		}
	}

	@Test
	public void verifyLogin() throws InterruptedException, IOException {
		LandingPage landingPageObj = new LandingPage(driver);
		LoginPage loginPageObj = new LoginPage(driver);

		landingPageObj.navigateToLogin();

		String rootFolder = System.getProperty("user.dir");
		FileReader myFile = new FileReader(rootFolder + "//src//test//java//com//resources//appData.properties");
		Properties props = new Properties();
		props.load(myFile);

		loginPageObj.loginIntoApp(props.getProperty("appUserEmailID"), props.getProperty("apppassword"));

		String loggedInUserNameExpected = props.getProperty("appUserName"); // nitesh

		String loggedInUserNameActual = loginPageObj.getLoggedInUserName();

		// after login, capture logged in username using getText() and verify this using
		// if..else

		if (loggedInUserNameExpected.equals(loggedInUserNameActual)) {
			System.out.println("verifyLogin is tested and found no issues");
		} else {
			String failedMessage = "verifyLogin is not successful. Please check";
			System.out.println(failedMessage);
			captureScreenshot(driver, "verifyLogin");
			Assert.fail(failedMessage);
		}
	}

	@Test(invocationCount = 1)
	public void verifySignup() throws InterruptedException, IOException {
		LandingPage landingPageObj = new LandingPage(driver);
		SignUpPage signUpPage = new SignUpPage(driver);
		landingPageObj.navigateToSignup();
		signUpPage.signUpWithApp();

		String signUpSuccessMessage = signUpPage.getSignupSuccessMessage(); //""

		if (!signUpSuccessMessage.isEmpty()) { // true
			System.out.println("verifySignup is tested and found no issues");
		} else {
			String failedMessage = "verifySignup is not successful. Please check";
			System.out.println(failedMessage);
			captureScreenshot(driver, "verifySignup");
			Assert.fail(failedMessage);
		}

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("Browser is closed");
	}

	private static void captureScreenshot(WebDriver driver, String TCName) throws IOException {
		String rootFolder = System.getProperty("user.dir");
		// Capturing screenshot in Selenium
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(rootFolder + "//Screenshots//myScreenshot_" + TCName + ".png");
		FileHandler.copy(src, destination);
	}

}
