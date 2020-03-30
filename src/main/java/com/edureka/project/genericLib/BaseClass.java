package com.edureka.project.genericLib;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.edureka.project.ObjectRepo.WelcomeMecuryToursLoginPage;

/**
 * Author: Gautham Raju
 *
 */
public class BaseClass {

	public static WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports extent;
	public static ExtentTest logger;
	FileLib flib = new FileLib();
	Logger log = Logger.getLogger(BaseClass.class);

	@BeforeClass
	public void launchSelectBrowser() throws Throwable {
		String Browser = flib.getCommonData("browser");
		if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equals("chrome")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		    Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("enable-automation");
			options.addArguments("--headless");
			options.addArguments("--window-size=1920,1080");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-extensions");
			options.addArguments("--dns-prefetch-disable");
			options.addArguments("--disable-gpu");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.addArguments("--headless");
			options.addArguments("--no-sandbox");
			driver = new ChromeDriver(options);

		} else {
			driver = new InternetExplorerDriver();
		}
	}

	@BeforeMethod
	public void loginTo() throws Throwable {
		log.info("*****************Test Case Started***********************");
		WelcomeMecuryToursLoginPage log = PageFactory.initElements(driver, WelcomeMecuryToursLoginPage.class);
		FileLib flib = new FileLib();
		String URL = flib.getCommonData("url");
		String USER = flib.getCommonData("user");
		String PASSWORD = flib.getCommonData("password");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);

		log.getUsernameEdit().sendKeys(USER);
		log.getPasswordEdit().sendKeys(PASSWORD);
		log.getLoginClk().click();
		/*
		 * //facebook Facebook fb = PageFactory.initElements(driver, Facebook.class);
		 * fb.getEmailEdit().sendKeys(USER); fb.getPasswordEdit().sendKeys(PASSWORD);
		 * fb.getLoginBtn().click();
		 */

	}

	@AfterMethod

	public void logout() {
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
		log.info("*****************Test Case Executed***********************");
	}

}
