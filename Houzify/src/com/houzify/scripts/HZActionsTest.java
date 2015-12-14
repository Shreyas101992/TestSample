package com.houzify.scripts;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.houzify.PO.NewUserRegPO;
import com.houzify.baselib.GenericLib;
import com.houzify.baselib.HouzifyBaseLib;

import io.appium.java_client.TouchAction;




public class HZActionsTest extends HouzifyBaseLib
{
	public String sData[]=null;
	public String sTestCaseID=null;
	NewUserRegPO newUserRegPo;
	public Logger qrLog = Logger.getLogger(this.getClass());
	
	
	
	
	@Test(priority=1,enabled=true)
	public void testSwipe()
	{
		sTestCaseID="Swipe_01";
		
		newUserRegPo = new NewUserRegPO(driver);
		
		sData= GenericLib.toReadExcelData(sTestCaseID);
		try
		{
			
			newUserRegPo.Login(sData[4],sData[2]);
			driver.findElement(By.name("Swipe to Continue")).click();
			TouchAction action=new TouchAction(driver);
			action.longPress(driver.findElement(By.id("com.houzify:id/slidingPanel"))).moveTo(0, 400).release().perform();
			action.waitAction(3000).perform();
			action.longPress(driver.findElement(By.id("com.houzify:id/slidingPanel"))).moveTo(0, 400).release().perform();
			action.waitAction(3000).perform();
			action.longPress(driver.findElement(By.id("com.houzify:id/slidingPanel"))).moveTo(0, 400).release().perform();
			
		} catch (Exception e) {
			qrLog.error("Exception in  case testNewUserRG_01");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	
}