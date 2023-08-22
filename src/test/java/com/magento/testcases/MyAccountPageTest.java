package com.magento.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.MyAccountPage;
import com.magento.pages.RegistrationPage;
import com.magento.pages.SignInPage;

public class MyAccountPageTest extends TestBase {
HomePage homepage;
MyAccountPage myacc;
SignInPage login;
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage=new HomePage();
		login=homepage.signin();
		login.setEmail("abcd@yopmail.com");
		login.setPass("abcdef123A");
		myacc=login.clickSignInbtn();
		
	}
	
	@Test(priority=1)
	public void validateNavUserName() throws InterruptedException {
		Thread.sleep(2000);
		String un=myacc.verifyUserName();
		Assert.assertEquals("Welcome, abc def!", un);
	}
	@Test(priority=2)
	public void validateContactInfo() {
		driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
		driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='My Account']")).click();
		String ci=myacc.verifyContactInformation();
		System.out.println(ci);
		Assert.assertTrue(ci.contains("abcd@yopmail.com"));
	}
	
	
}
