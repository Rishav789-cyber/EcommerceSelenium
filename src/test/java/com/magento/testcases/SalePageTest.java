package com.magento.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.SalePage;
import com.magento.pages.SignInPage;

public class SalePageTest extends TestBase {
	HomePage homepage;
	SignInPage sign;
	SalePage sales;
	
@BeforeMethod
public void setup() throws MalformedURLException {
	initialization();
	homepage=new HomePage();
	sign=homepage.signin();
	sign.setEmail("abcd@yopmail.com");
	sign.setPass("abcdef123A");
	sign.clickSignInbtn();
	sales=sign.clickSale();
}

@Test(priority=1)
public void verifyTees() {
	String t=sales.getTees();
	Assert.assertEquals("Tees",t);
	
}
@AfterMethod
public void teardown() {
	driver.quit();
}



}
