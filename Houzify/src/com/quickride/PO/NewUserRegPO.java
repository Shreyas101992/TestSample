package com.quickride.PO;


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

import com.quickride.baselib.QRTestngListener;

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

	@FindBy(id = "com.disha.quickride:id/signup_text_view")
	private WebElement eleSignUpLaunchBtn;
	
	public WebElement getEleSignUpLaunchBtn()
	{
		return eleSignUpLaunchBtn;
	}
	
	@FindBy(id = "com.disha.quickride:id/reg_phoneno_editText")
	private WebElement  elePhoneNOTxtFld;
	
	public WebElement getElePhoneNOTxtFld()
	{
		return elePhoneNOTxtFld;
	}
	
	
	@FindBy(id = "com.disha.quickride:id/reg_pwd_editText")
	private WebElement elePwdTxtFld;
	
	public WebElement getElePwdTxtFld()
	{
		return elePwdTxtFld;
	}
	
	@FindBy(id = "com.disha.quickride:id/reg_name_editText")
	private WebElement eleNameTxtFld;
	public WebElement getEleNameTxtFld()
	{
		return eleNameTxtFld;
	}
	
	@FindBy(id = "com.disha.quickride:id/gender_female_radio_btn")
	private WebElement eleFemaleRdBtn;
	public WebElement getEleFemaleRdBtn()
	{
		return eleFemaleRdBtn;
	}
	@FindBy(id = "com.disha.quickride:id/gender_male_radio_btn")
	private static WebElement  eleMaleRdBtn;
	public WebElement getEleMaleRdBtn()
	{
		return eleMaleRdBtn;
	}
	
	@FindBy(id = "com.disha.quickride:id/sign_up_button")
	private WebElement  eleSignUpRegBtn;
	public WebElement getEleSignUpRegBtn()
	{
		return eleSignUpRegBtn;
	}
	
	
	@FindBy(id="com.disha.quickride:id/register_st")
	private WebElement eleThankYouTxt;
	public WebElement getEleThankYouTxt()
	{
		return eleThankYouTxt;
	}
	
	
	@FindBy(id="com.disha.quickride:id/activation_code_editText")
	public WebElement eleActivationTxtFld;
	public WebElement getEleActivationTxtFld()
	{
		return eleActivationTxtFld;
	}
	
	@FindBy(id="com.disha.quickride:id/activate_button")
	private WebElement eleActivateBtn;
	public WebElement getEleActivateBtn()
	{
		return eleActivateBtn;
	}
	
	@FindBy(id="com.disha.quickride:id/alert_msg_body")
	private WebElement eleAcntExistsTxt;
	public WebElement getEleAcntExistsTxt()
	{
		return eleAcntExistsTxt;
	}
	
	@FindBy(id="com.disha.quickride:id/login_button")
	private WebElement eleLoginBtn;
	
	public WebElement getEleLoginBtn()
	{
		return eleLoginBtn;
	}
	
	@FindBy(id="android:id/up")
	private WebElement eleMenuLst;
	
	public WebElement getEleMenuLst()
	{
		return eleMenuLst;
	}
	
	@FindBy(xpath="//com.disha.quickride:id/left_drawer_listView/android.widget.RelativeLayout[@TextView='Logout']")
	private static WebElement eleLogoutBtn;
	
	public WebElement getEleLogoutBtn()
	{
		return eleLogoutBtn;
	}
	
	
	@FindBy(id="com.disha.quickride:id/negative_button")
	private WebElement eleYesBtn;
	
	public WebElement getEleYesBtn()
	{
		return eleYesBtn;
	}
	@FindBy(id="com.disha.quickride:id/negative_button")
	private WebElement eleSkipBtn;
	public WebElement getEleSkipBtn()
	{
		return eleSkipBtn;
	}
	
	@FindBy(id="com.disha.quickride:id/positive_button")
	private WebElement elePopupLoginBtn;
	public WebElement getElePopupLoginBtn()
	{
		return elePopupLoginBtn;
	}
	
	
	@FindBy(id="com.disha.quickride:id/forgot_pwd_textView")
	private WebElement eleForgotPwdLnk;
	public WebElement getEleForgotPwdLnk()
	{
		return eleForgotPwdLnk;
	}
	
	@FindBy(id="com.disha.quickride:id/reset_pwd_button")
	private WebElement eleResetPwdBtn;
	public WebElement getEleResetPwdBtn()
	{
		return eleResetPwdBtn;
	}
	
	@FindBy(id="com.disha.quickride:id/login_phone_editText")
	private WebElement eleLoginPhTxtFld;
	
	public WebElement getEleLoginPhTxtFld()
	{
		return eleLoginPhTxtFld;
	}
	 
	
	@FindBy(id="com.disha.quickride:id/login_pwd_editText")
	private WebElement eleLoginPwdTxtFld;
	
	public WebElement getEleLoginPwdTxtFld()
	{
		return eleLoginPwdTxtFld;
	}
	
	
	@FindBy(xpath="android.widget.TextView[@contains(text(),'Do you want to logout?')]")
	private WebElement eleDoYouWnLogoutTxt;

	
	public WebElement getEleDoYouWnLogoutTxt()
	{
		return eleDoYouWnLogoutTxt;
	}
	/*@author: LAKSHMi BS
	 *Description: To Sign up with valid phone, pwd, name for registraion
	 */

	public void signUP(String sPhoneNum, String sPwd, String sName)
	{
		try
		{
			
			if(getEleSignUpLaunchBtn().isDisplayed())
			{
				qrLog.info("SignUp button is displayed");
				getEleSignUpLaunchBtn().click();
				getElePhoneNOTxtFld().sendKeys(sPhoneNum);
				getElePwdTxtFld().sendKeys(sPwd);
				getEleNameTxtFld().sendKeys(sName);
				driver.hideKeyboard();
				getEleFemaleRdBtn().click();
				getEleSignUpRegBtn().click();
				Assert.assertTrue(eleThankYouTxt.isDisplayed(), "SignUp is incomplete");
				qrLog.info("Sign Up is completed");
				
			}
		}catch(Exception e)
		{
			qrLog.error("Exception in  case signUp()");
			e.printStackTrace();
			Assert.fail();
		}
		
	}

	/*@author: LAKSHMi BS
	 *Description: To Sign up with valid phone, pwd
	 */
	public void login(String sPhoneNum, String sPwd)
	{
		
				getEleLoginBtn().click();
				getEleLoginPhTxtFld().sendKeys(sPhoneNum);
				getEleLoginPwdTxtFld().sendKeys(sPwd);
				getEleLoginBtn().click();
				Assert.assertTrue(getEleMenuLst().isDisplayed(), "Login is not Successful");
				qrLog.info("Login is completed");
			
		
	}

	
	/*@author: LAKSHMi BS
	 *Description: To logout from QuickRide
	 */
	public void logout()
	{
		try
		{			
			getEleMenuLst().click();
			/*List<WebElement> lstQuickRide = driver.findElements(By.xpath("//com.disha.quickride:id/left_drawer_listView/android.widget.RelativeLayout/TextView"));
			System.out.println(lstQuickRide.size());
			for(WebElement ele:lstQuickRide)
			{
				System.out.println(ele.getText());
				if(ele.getText().equalsIgnoreCase("Logout"))
				{
					ele.click();
				}
			}*/
			
			driver.findElement(By.xpath("(//com.disha.quickride:id/left_drawer_listView/android.widget.RelativeLayout)[6]")).click();
			getEleYesBtn().click();
			Assert.assertTrue(getEleLoginBtn().isDisplayed(), "Failed to Logout from QuickRide");
			qrLog.info("Logout is successful");
				
			
			
		}catch(Exception e)
		{
			qrLog.error("Exception in  logout()");
			e.printStackTrace();
			Assert.fail();
		}
		
	}

	
}
