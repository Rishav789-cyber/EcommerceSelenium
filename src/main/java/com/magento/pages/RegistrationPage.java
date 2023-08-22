package com.magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class RegistrationPage extends TestBase {

	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="email_address")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="password-confirmation")
	WebElement confirmPass;
	
	@FindBy(xpath="//button[@title='Create an Account']")
	WebElement createBtn;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	public void setFirstName(String fn) {
		firstName.sendKeys(fn);
	}
	public void setLastName(String ln) {
		lastName.sendKeys(ln);
	}
	public void setEmail(String em) {
		email.sendKeys(em);
	}
	public void setPass(String pass) {
		password.sendKeys(pass);
	}
	public void setConfPass(String cp) {
		confirmPass.sendKeys(cp);
	}
	public MyAccountPage createAccount() {
	createBtn.click();
	return new MyAccountPage();
	}
}
