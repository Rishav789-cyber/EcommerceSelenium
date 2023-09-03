package com.magento.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class SignInPage extends TestBase {
@FindBy(id="email")
WebElement email;

@FindBy(id="pass")
WebElement pass;

@FindBy(css="body > div:nth-child(5) > main:nth-child(3) > div:nth-child(4) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(2) > div:nth-child(4) > div:nth-child(1) > button:nth-child(1)")
WebElement signinBtn;

@FindBy(xpath="//span[normalize-space()='Sale']")
WebElement sale;

public SignInPage() throws MalformedURLException {
	
	PageFactory.initElements(driver, this);
}
public void setEmail(String un) {
	email.sendKeys(un);
}
public void setPass(String passw) {
	pass.sendKeys(passw);
}
public MyAccountPage clickSignInbtn() throws MalformedURLException {
	signinBtn.click();
	return new MyAccountPage();
}
public SalePage clickSale() {
sale.click();
return new SalePage();
}

}
