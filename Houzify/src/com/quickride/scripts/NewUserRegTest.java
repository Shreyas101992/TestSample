/***********************************************************************
* @author 			:		LAKSHMI BS
* @description		: 		Test scripts of New User Registration module.
* @module			:		New User Registration
* @method			:		testNewUserRG_01()
* @method			:		testNewUserRG_02()
* @method			:		
* @method 			:		
* @method 
*/

package com.quickride.scripts;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.quickride.PO.NewUserRegPO;
import com.quickride.baselib.GenericLib;
import com.quickride.baselib.QRBaseLib;
import com.quickride.baselib.QRTestngListener;

import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewUserRegTest extends QRBaseLib
{
	public String sData[]=null;
	public String sTestCaseID=null;
	NewUserRegPO newUserRegPo;
	public Logger qrLog = Logger.getLogger(this.getClass());
	
	
	@Test(priority=1,enabled=true)
	public void testNewUserRG_01()
	{
		sTestCaseID="NewUserRG_01";
		newUserRegPo = new NewUserRegPO(driver);
		
		sData= GenericLib.toReadExcelData(sTestCaseID);
		try
		{
			if(newUserRegPo.getEleSignUpLaunchBtn().isDisplayed())
			{
				qrLog.info("SignUp button is displayed");
				newUserRegPo.getEleSignUpLaunchBtn().click();
				newUserRegPo.getElePhoneNOTxtFld().sendKeys(sData[1]);
				newUserRegPo.getElePwdTxtFld().sendKeys(sData[2]);
				
				newUserRegPo.getEleNameTxtFld().sendKeys(sData[3]);
				driver.hideKeyboard();
				newUserRegPo.getEleFemaleRdBtn().click();
				newUserRegPo.getEleSignUpRegBtn().click();
			}
			Assert.assertTrue(newUserRegPo.getEleThankYouTxt().isDisplayed(), "SignUp is incomplete");
			qrLog.info("Sign Up is completed");

		} catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_01");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	
	@Test(priority=2,enabled=false)
	public void testNewUserRG_02()
	{
		sTestCaseID="NewUserRG_02";
		newUserRegPo = new NewUserRegPO(driver);
		
		sData= GenericLib.toReadExcelData(sTestCaseID);
		try
		{
			newUserRegPo.signUP(sData[1], sData[2], sData[3]);
			newUserRegPo.getEleActivateBtn().click();
			

		} catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_02");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	@Test(priority=3,enabled=false)
	public void testNewUserRG_03()
	{
	sTestCaseID="NewUserRG_03";	
	newUserRegPo = new NewUserRegPO(driver);
	
	sData= GenericLib.toReadExcelData(sTestCaseID);
	System.out.println(Arrays.toString(sData));
	String sErrorTxt="xx12";
	try
	{
		newUserRegPo.signUP(sData[1], sData[2], sData[3]);
		newUserRegPo.getEleActivationTxtFld().sendKeys(sErrorTxt);
		newUserRegPo.getEleActivateBtn().click();
		System.out.println(driver.getPageSource().toString());
		Assert.assertTrue(newUserRegPo.getEleAcntExistsTxt().isDisplayed(), "Account already exists alert message is not displayed");

	} catch (Exception e) {
		qrLog.error("Exception in  case testNewUserRG_03");
		
		e.printStackTrace();
		Assert.fail();
	}
	
}
	@Test(priority=4,enabled=false)
	public void testNewUserRG_04()
	{
		sTestCaseID="NewUserRG_04";
		newUserRegPo = new NewUserRegPO(driver);
		sData= GenericLib.toReadExcelData(sTestCaseID);
		
		try
		{
			if(newUserRegPo.getEleSignUpLaunchBtn().isDisplayed())
			{
				qrLog.info("SignUp button is displayed");
				newUserRegPo.getEleSignUpLaunchBtn().click();
				newUserRegPo.getElePhoneNOTxtFld().sendKeys(sData[1]);
				newUserRegPo.getElePwdTxtFld().sendKeys(sData[2]);
				
				newUserRegPo.getEleNameTxtFld().sendKeys(sData[3]);
				driver.hideKeyboard();
				newUserRegPo.getEleFemaleRdBtn().click();
				newUserRegPo.getEleSignUpRegBtn().click();
			}
			Assert.assertTrue(newUserRegPo.getEleAcntExistsTxt().isDisplayed(), "Account already exists alert message is not displayed");
			qrLog.info("Account already exists popup is displayed");
			newUserRegPo.getElePopupLoginBtn().click();
			driver.hideKeyboard();
			newUserRegPo.getEleForgotPwdLnk().click();
			Assert.assertTrue(newUserRegPo.getEleResetPwdBtn().isDisplayed(), "Password reset page is not displayed");
			qrLog.info("Forgot password reset page is successfully displayed");
			
			
			

		} catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_04");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@Test(priority=5,enabled=false)
	public void testNewUserRG_05()
	{
		sTestCaseID="NewUserRG_05";
		newUserRegPo = new NewUserRegPO(driver);
		sData= GenericLib.toReadExcelData(sTestCaseID);
		try
		{	
			newUserRegPo.login(sData[1], sData[2]);
			
			
			newUserRegPo.logout();
			newUserRegPo.login(sData[1], sData[2]);
			
			
		}
		 catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_05");
			
			e.printStackTrace();
			Assert.fail();
		}
	
	}
	

	@Test(priority=6,enabled=true)
	public void testNewUserRG_06()
	{
		sTestCaseID="NewUserRG_06";
		newUserRegPo = new NewUserRegPO(driver);
		sData= GenericLib.toReadExcelData(sTestCaseID);
		String sErrPwd="aaaaaa123";
		try
		{	
			if(newUserRegPo.getEleLoginBtn().isDisplayed())
			{
				qrLog.info("Login button is displayed");
				newUserRegPo.getEleLoginBtn().click();
				newUserRegPo.getEleLoginPhTxtFld().sendKeys(sData[1]);
				newUserRegPo.getEleLoginPwdTxtFld().sendKeys(sErrPwd);
				newUserRegPo.getEleLoginBtn().click();
				Assert.assertFalse(newUserRegPo.getEleMenuLst().isDisplayed(), "Login is not Successful");
				qrLog.info("Login Failed");
				
			
			}
			
		}
		 catch (Exception e) {
			//qrLog.error("Exception in  case testNewUserRG_05");
			
			e.printStackTrace();
			Assert.fail();
		}
	
	}
	

	@Test(priority=7,enabled=false)
	public void testNewUserRG_07()
	{
		sTestCaseID="NewUserRG_07";
		newUserRegPo = new NewUserRegPO(driver);
		sData= GenericLib.toReadExcelData(sTestCaseID);
		try
		{	
			newUserRegPo.login(sData[1], sData[2]);
			driver.closeApp();
			qrLog.info("Quick Ride app is closed");
			
			driver.launchApp();
			newUserRegPo.getEleLoginBtn().click();
			
			Assert.assertTrue(newUserRegPo.getEleLoginBtn().isDisplayed(), "App did not launch again");
			qrLog.info("Quick Ride app is launched successfully again");
			
			
			
		}
		 catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_06");
			
			e.printStackTrace();
			Assert.fail();
		}
	
	}

}