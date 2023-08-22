package com.magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.TestBase;

public class MenPage extends TestBase {
@FindBy(xpath="//li[1]//div[1]//div[1]//div[4]//div[1]//div[1]//form[1]//button[1]//span[1]")
WebElement addToCart;

@FindBy(xpath="//span[@class='price']")
WebElement price;

@FindBy(xpath="//div[@id='option-label-size-143-item-168']")
WebElement mediumSize;

@FindBy(xpath="//div[@id='option-label-color-93-item-50']")
WebElement blueClr;

@FindBy(xpath="//span[normalize-space()='Add to Cart']")
WebElement cart;

@FindBy(xpath="//div[@class='fotorama__stage__frame magnify-wheel-loaded fotorama__active fotorama_vertical_ratio fotorama__loaded fotorama__loaded--img']//img[@class='fotorama__img']")
WebElement productImg;

@FindBy(xpath="//span[@class='counter-number']")
WebElement cartIcon;

@FindBy(id="top-cart-btn-checkout")
WebElement checkout;

public MenPage() {
	PageFactory.initElements(driver, this);
}
public void clickAddToCart() {
	addToCart.click();
}
public String getPrice() {
	String p=price.getText();
	return p;
}
public void selectSize() {
	mediumSize.click();
}
public void selectColour() {
	blueClr.click();
}
public void clickCart() {
	cart.click();
}
public void clickCartIcon() {
	cartIcon.click();
}
public ShippingPage clickCheckout() { 
checkout.click();
return new ShippingPage();
}
}