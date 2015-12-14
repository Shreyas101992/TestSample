package com.houzify.PO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HZControlPO {
	AndroidDriver driver = null;
	public Logger qrLog = Logger.getLogger(this.getClass());
	
	public HZControlPO(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id ="com.houzify:id/slidingPanel")
	private WebElement eleSlidePanel;
	
	public WebElement getEleSlidePanel()
	{
		return eleSlidePanel;
	}
	

}
