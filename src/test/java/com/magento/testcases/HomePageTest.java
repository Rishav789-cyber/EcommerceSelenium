package com.magento.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.RegistrationPage;

public class HomePageTest extends TestBase {
HomePage homepage;
RegistrationPage registrationpage;
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void validateTitle() {
		Assert.assertEquals("Home Page",homepage.verifyTitle());
	}
	@Test(priority=2)
	public void navigateToRegistrationPage() {
		registrationpage=homepage.registration();
	}
	
}
