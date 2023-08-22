package com.magento.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.HomePage;
import com.magento.pages.MyAccountPage;
import com.magento.pages.SignInPage;

public class SignInPageTest extends TestBase {
	HomePage homepage;
	SignInPage signin;
	MyAccountPage myacc;
@BeforeMethod
public void setup() {
initialization();
homepage=new HomePage();
signin=homepage.signin();

}

@Test(priority=1)
public void validateUserName() throws InterruptedException {
signin.setEmail("abcd@yopmail.com");
signin.setPass("abcdef123A");
myacc=signin.clickSignInbtn();
Thread.sleep(2000);
String un=myacc.verifyUserName();
Assert.assertEquals("Welcome, abc def!", un);

}
}
