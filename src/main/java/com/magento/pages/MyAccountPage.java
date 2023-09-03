package com.magento.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class MyAccountPage extends TestBase {
	
@FindBy(xpath="//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, abc def!']")
WebElement navName;

@FindBy(css="div[class='box-content'] p")
WebElement contactInfo;



public MyAccountPage() throws MalformedURLException {
	
	PageFactory.initElements(driver, this);
}
public String verifyUserName() {
	String un=navName.getText();
	return un;
} 
public String verifyContactInformation() {
	String cinfo=contactInfo.getText();
	return cinfo;
	}


}
