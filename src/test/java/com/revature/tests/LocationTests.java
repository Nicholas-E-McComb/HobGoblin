package com.revature.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LocationMethods.McCombLogin;

public class LocationTests {
	static WebDriver wd;
	@BeforeSuite
	public void setup() {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
	    options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		McCombLogin.login(wd);
	}
	
	@AfterSuite
	public void tearDown() {
		wd.close();
	}
	
	@Test
	public void navigationTest() {
		  assertTrue(LocationMethods.PageMethods.navigateTo(wd).equals("https://dev.assignforce.revaturelabs.com/locations"));
	}
}
