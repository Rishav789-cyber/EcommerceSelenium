package com.magento.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.RegistrationPage;

public class HomePageTest extends TestBase {
	
HomePage homepage;
RegistrationPage registrationpage;
	@BeforeMethod
	public void setup() throws MalformedURLException {
		initialization();
		homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void validateTitle() {
		Assert.assertEquals("Home Page",homepage.verifyTitle());
	}
	@Test(priority=2)
	public void navigateToRegistrationPage() throws MalformedURLException {
		registrationpage=homepage.registration();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
