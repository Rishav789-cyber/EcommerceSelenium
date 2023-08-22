package com.magento.testcases;

import org.testng.Assert;
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
public void setup() {
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




}
