package com.magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']")
	WebElement createAccount;
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement signin;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle() {
		String title=driver.getTitle();
		return title;
	}
	public RegistrationPage registration() {
		createAccount.click();
		return new RegistrationPage();
	}
	public SignInPage signin() {
		signin.click();
		return new SignInPage();
	}
	
	
}
