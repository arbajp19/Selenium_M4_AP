package com.shoppersStack.genericutility;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.shoppersStack.Pom.Home_Page;
import com.shoppersStack.Pom.Login_Page;
import com.shoppersStack.Pom.Update_Address_Page;
import com.shoppersStack.Pom.Welcome_Page;

public class BaseTest {
	public WebDriver driver;
	public static WebDriver listnerDriver;
	public FileUtility utility=new FileUtility();
	public Welcome_Page welcomePage;
	public Login_Page loginPage;
	public Update_Address_Page updatePage;
	public Home_Page homePage;
	public Java_utility javautility=new Java_utility();
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public WebDriver_Utility webdriverutil=new WebDriver_Utility();
	public ExtentTest test;
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	    spark=new ExtentSparkReporter(FrameWorkConstants.reportPath+javautility.localDateTime()+".html");
		report=new ExtentReports();

        report.attachReporter(spark);

        test= report.createTest("Demo");
	}
	@BeforeClass
	public void beforeClass() throws IOException {
		
		System.out.println("Beforee Class");
		String browser=FrameWorkConstants.chromeValue;
		String url= utility.readDataFromPropertyFile("url");
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Enter Valid Browser");
		}
		listnerDriver=driver;
		welcomePage=new Welcome_Page(driver);
		loginPage=new Login_Page(driver);
		homePage=new Home_Page(driver);
		updatePage=new Update_Address_Page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
	}
	@BeforeMethod
	public void beforeMethods() throws IOException {
		System.out.println("Before method");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));


		welcomePage.getLoginBtn().click();
		loginPage.getEmail().sendKeys(utility.readDataFromPropertyFile("email"));
		loginPage.getPassword().sendKeys(utility.readDataFromPropertyFile("password"));
		loginPage.getLoginBtn().click();
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		homePage.getAccountSettingBtn().click();
		homePage.getLogOutBtn().click();
		
	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("After Class");
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		report.flush();
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}


}