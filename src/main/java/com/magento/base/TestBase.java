package com.magento.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
String browser="chrome";
public static WebDriver driver;
public void initialization() {
	if(browser=="chrome") {
		driver=new ChromeDriver();
	}else if(browser=="edge") {
		driver=new EdgeDriver();
	}
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().window().maximize();
}


}
