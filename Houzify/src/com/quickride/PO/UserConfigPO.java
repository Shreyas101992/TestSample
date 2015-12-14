package com.quickride.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class UserConfigPO {
	AndroidDriver driver = null;
	public UserConfigPO(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "android:id/up")
	private WebElement  eleMenuBar;

	public WebElement getEleMenuBar()
	{
		return eleMenuBar;
	}
	
	
	
	@FindBy(id = "com.disha.quickride:id/profile_arrow")
	private  WebElement eleArrow;
	
	public 	WebElement getEleArrow(){
		return eleArrow;
	}
	
	@FindBy(id="com.disha.quickride:id/user_profile_edit_save_text")
	private  WebElement eleEditLink;
	
	public 	WebElement getEleEditLink(){
		return eleEditLink;
	}
	
	@FindBy(id ="com.disha.quickride:id/edit_profile_image")
	private  WebElement eleUploadicon;
	
	public 	WebElement getEleUploadicon(){
		return eleUploadicon;
	}
	
	@FindBy(id="android:id/text1")
	private WebElement eleTakePhotoOption;
	
	public WebElement getEleTakePhotoOption(){
		return eleTakePhotoOption;
	}
	
	@FindBy(id="com.android.camera2:id/shutter_button")
	private WebElement eleCameraButton;
	
	public WebElement getEleCameraButton(){
		return eleCameraButton;
	}
	@FindBy(id="com.android.camera2:id/done_button")
	private WebElement elePressTrick;
	
	public WebElement getelePressTrick(){
		return elePressTrick;
	}
	
	@FindBy(id ="com.moblynx.galleryics:id/filtershow_done")
	private WebElement eleSave;
	
	public WebElement getSave(){
		return eleSave;
	}
	public void userconfig(){
		
		eleMenuBar.click();
		eleArrow.click();
		eleEditLink.click();
		eleUploadicon.click();
		eleTakePhotoOption.click();
		eleCameraButton.click();
		elePressTrick.click();
		eleSave.click();
		
		
		
	}

}

	