package com.magento.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.ClientConfig;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
String browser="chrome";
public static RemoteWebDriver driver;
//public static WebDriver driver;
public static DesiredCapabilities dc;
public static ChromeOptions chrome;
public static URL url;
//public static ClientConfig config;

public void initialization()throws MalformedURLException{
	/*config = ClientConfig.defaultConfig().connectionTimeout(Duration.ofMinutes(20))
			.readTimeout(Duration.ofMinutes(20));*/
	dc=new DesiredCapabilities();
	chrome=new ChromeOptions();
	url = new URL("http://localhost:4444/wd/hub");
	//dc.setPlatform(Platform.WIN10); 
	dc.setBrowserName(Browser.CHROME.browserName());
	
	
	
	if(browser=="chrome") {
		driver= new RemoteWebDriver(url,dc); 
	}else if(browser=="edge") {
		driver=new RemoteWebDriver(url,dc);
	}
	driver.get("https://magento.softwaretestingboard.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().window().maximize();
}


}
