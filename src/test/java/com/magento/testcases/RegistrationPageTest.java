package com.magento.testcases;

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
	public void setup() {
		initialization();
		homepage=new HomePage();
		registrationpage=homepage.registration();
	}
	
	@Test(priority=1)
	public void registration() {
		registrationpage.setFirstName("abc");
		registrationpage.setLastName("def");
		registrationpage.setEmail("abcd@yopmail.com");
		registrationpage.setPass("abcdef123A");
		registrationpage.setConfPass("abcdef123A");
		myaccpage=registrationpage.createAccount();
	}
	
	
	
}
