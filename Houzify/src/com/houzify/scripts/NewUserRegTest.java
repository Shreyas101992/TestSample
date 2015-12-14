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

package com.houzify.scripts;

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

import com.houzify.PO.NewUserRegPO;
import com.houzify.baselib.GenericLib;
import com.houzify.baselib.HouzifyBaseLib;
import com.houzify.baselib.HouzifyTestngListener;

import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewUserRegTest extends HouzifyBaseLib
{
	public String sData[]=null;
	public String sTestCaseID=null;
	NewUserRegPO newUserRegPo;
	public Logger qrLog = Logger.getLogger(this.getClass());
	
	
	
	
	@Test(priority=1,enabled=true)
	public void testNewSignup()
	{
		sTestCaseID="NewUserRG_03";
		
		newUserRegPo = new NewUserRegPO(driver);
		
		sData= GenericLib.toReadExcelData(sTestCaseID);
		try
		{
			
			newUserRegPo.Signup(sData[1],sData[3],sData[4],sData[2]);
		} catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_01");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	/*@Test id:NewUserRG_01
	 * @description:Test User register
	 * @author: Raghukiran MR
	 * Parameter:Name:raghukiran,City:bangalore,Email id:raghukiran.mr92@gmail.com,Password:raghukiran92
	 */	
	@Test(priority=2,enabled=true)
	public void testExistingSignup()
	{
		sTestCaseID="NewUserRG_02";
		newUserRegPo = new NewUserRegPO(driver);
		
		sData= GenericLib.toReadExcelData(sTestCaseID);
		try
		{
			
			newUserRegPo.Signup(sData[1],sData[3],sData[4],sData[2]);
		} catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_01");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	@Test(priority=3,enabled=true)
	public void testLogin()
	{
		sTestCaseID="NewUserRG_02";
		newUserRegPo = new NewUserRegPO(driver);
		
		sData= GenericLib.toReadExcelData(sTestCaseID);
		try
		{
			newUserRegPo.Login(sData[4],sData[2]);
			
			qrLog.info("Login is completed");

		} catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_01");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	@Test(priority=4,enabled=true)
	public void FacebookLogin()
	{
		
		try
		{
			newUserRegPo.getelefacebook().click();
			
			qrLog.info("Login is completed");

		} catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_01");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
}
	
	
	