package com.quickride.PO;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class NotificationsPO
{
	AndroidDriver driver = null;
	public NotificationsPO(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
}
