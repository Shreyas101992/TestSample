package com.houzify.PO;


import java.util.List;

import org.apache.bcel.generic.Select;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import com.houzify.baselib.HouzifyTestngListener;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewUserRegPO 
{
	AndroidDriver driver = null;
	public Logger qrLog = Logger.getLogger(this.getClass());
	
	public NewUserRegPO(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id ="com.houzify:id/loginButton")
	private WebElement eleLoginbtn;
	
	public WebElement geteleLoginbtn()
	{
		return eleLoginbtn;
	}
	//com.houzify:id/emailLoginEditText
	@FindBy(id ="com.houzify:id/emailLoginEditText")
	private WebElement eleEmailtext;
	
	public WebElement geteleEmailtext()
	{
		return eleEmailtext;
	}
	//com.houzify:id/passwordLoginEditText
	@FindBy(id ="com.houzify:id/passwordLoginEditText")
	private WebElement elePassword;
	
	public WebElement getelePassword()
	{
		return elePassword;
	}
	//com.houzify:id/loginButton
	@FindBy(id ="com.houzify:id/loginButton")
	private WebElement eleLetMeIn;
	
	public WebElement geteleLetMeIn()
	{
		return eleLetMeIn;
	}
	//com.houzify:id/fnameEditText
	@FindBy(id ="com.houzify:id/fnameEditText")
	private WebElement eleFullname;
	
	public WebElement geteleFullname()
	{
		return eleFullname;
	}
	@FindBy(id ="com.houzify:id/genderImage")
	private WebElement eleGender;
	
	public WebElement geteleGender()
	{
		return eleGender;
	}
	@FindBy(name="Male")
	private WebElement eleGenderlist;
	
	public WebElement geteleGenderlist()
	{
		return eleGenderlist;
	}
	@FindBy(name="SIGNUP")
	private WebElement eleSignup;
	
	public WebElement geteleSignup()
	{
		return eleSignup;
	}
	//City
	@FindBy(name="City")
	private WebElement eleCity;
	
	public WebElement geteleCity()
	{
		return eleCity;
	}
	@FindBy(name="LET'S GO!")
	private WebElement eleLetGo;
	
	public WebElement geteleLetGo()
	{
		return  eleLetGo;
	}
	
	@FindBy(id="com.houzify:id/userImage")
	private WebElement eleuplodimage;
	
	public WebElement geteleuplodimage()
	{
		return  eleuplodimage;
	}
	@FindBy(name="Camera")
	private WebElement elecamera;
	
	public WebElement getelecamera()
	{
		return elecamera;
	}
	@FindBy(id="com.android.camera2:id/shutter_button")
	private WebElement elePressCamerabtn;
	
	public WebElement getelePressCamerabtn()
	{
		return elePressCamerabtn;
	}
	

	@FindBy(id="com.houzify:id/save")
	private WebElement elePressSave;
	
	public WebElement getelePressSave()
	{
		return elePressSave;
	}
	@FindBy(id="com.houzify:id/emailEditText")
	private WebElement eleEmailSignup;
	
	public WebElement geteleEmailSignup()
	{
		return eleEmailSignup;
	}
	
	@FindBy(id="com.houzify:id/passwordEditText")
	private WebElement eleEmailPassword;
	
	public WebElement geteleEmailPassword()
	{
		return eleEmailPassword;
	}
	//com.android.camera2:id/done_button
	
	@FindBy(id="com.android.camera2:id/done_button")
	private WebElement eleTrickPress;
	
	public WebElement geteleTrickPress()
	{
		return eleTrickPress;
	}//CONNECT WITH FACEBOOK
	
	@FindBy(name="CONNECT WITH FACEBOOK")
	private WebElement elefacebook;
	
	public WebElement getelefacebook()
	{
		return elefacebook;
	}
	
	public void Login(String Email,String Password){
		eleLoginbtn.click();
		eleEmailtext.sendKeys(Email);//raghu.mr@crowbetatesters.com
		elePassword.sendKeys(Password);//raghukiran mr
		eleLetMeIn.click();
		
	}
	public void Signup(String Fullname,String City,String Email,String Password) throws InterruptedException{
		//eleFullname.sendKeys(Fullname);
		eleSignup.click();
		eleFullname.sendKeys(Fullname);
		eleGender.click();
		eleGenderlist.click();
		eleCity.sendKeys(City);
		eleEmailSignup.sendKeys(Email);
		eleEmailPassword.sendKeys(Password);
		//eleCity.sendKeys(City);
		eleuplodimage.click();
		elecamera.click();
		elePressCamerabtn.click();
		eleTrickPress.click();
		elePressSave.click();
		Thread.sleep(2000);
		eleLetGo.click();
		
	}


	
}