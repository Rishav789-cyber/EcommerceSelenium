package com.magento.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.MyAccountPage;
import com.magento.pages.RegistrationPage;

public class RegistrationPageTest extends TestBase{
HomePage homepage;
RegistrationPage registrationpage;
MyAccountPage myaccpage;
	@BeforeMethod
	public void setup() throws MalformedURLException {
		initialization();
		homepage=new HomePage();
		registrationpage=homepage.registration();
	}
	
	@Test(priority=1)
	public void registration() throws MalformedURLException {
		registrationpage.setFirstName("abc");
		registrationpage.setLastName("def");
		registrationpage.setEmail("abcd@yopmail.com");
		registrationpage.setPass("abcdef123A");
		registrationpage.setConfPass("abcdef123A");
		myaccpage=registrationpage.createAccount();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
