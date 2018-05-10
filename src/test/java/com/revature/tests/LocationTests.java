package com.revature.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LocationMethods.AddLocationMethods;
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
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		McCombLogin.login(wd);
	}
	
	@AfterSuite
	public void tearDown() {
		wd.close();
	}
	
	@Test (priority = 1)
	public void navigationTest() {
		  assertTrue(LocationMethods.PageMethods.navigateTo(wd).equals("https://dev.assignforce.revaturelabs.com/locations"));
	}
	
	@Test (priority = 2)
	public void validLocationTest() {
		assertTrue(AddLocationMethods.addValidLocation(wd));
	}
	
	@Test (priority = 3)
	public void invalidLocationTest() {
		assertFalse(AddLocationMethods.addInvalidLocation(wd));
	}
	
	@Test (priority = 3)
	public void reusedNameTest() {
		assertTrue(AddLocationMethods.addPrevUsedName(wd));
	}
}
