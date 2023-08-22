package com.magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class SalePage extends TestBase {
@FindBy(xpath="//ul[2]//li[3]//a[1]")
WebElement tees;

public SalePage() {
	PageFactory.initElements(driver, this);
}

public String getTees() {
	String t=tees.getText();
	return t;
}
public MenPage clickTees() {
	tees.click();
	return new MenPage();
}

}
