package com.quickride.scripts;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.quickride.PO.NewUserRegPO;
import com.quickride.PO.NotificationsPO;
import com.quickride.PO.UserConfigPO;
import com.quickride.baselib.GenericLib;
import com.quickride.baselib.QRBaseLib;
import com.quickride.baselib.QRTestngListener;

public class UserConfigTest extends QRBaseLib
{
	public String sData[]=null;
	public String sTestCaseID=null;
	NotificationsPO notificationsPo;
	NewUserRegPO newUserRegPo;
	UserConfigPO userConfigPo;
	public Logger qrLog = Logger.getLogger(this.getClass());
	@Test
	public void TestUserCongif(){
		sTestCaseID="NewUserRG_01";
		newUserRegPo=new NewUserRegPO(driver);
		notificationsPo=new NotificationsPO(driver);
		userConfigPo=new UserConfigPO(driver);
		sData= GenericLib.toReadExcelData(sTestCaseID);
		
		try
		{
			//if(userConfigPo.getEleMenuBar().isDisplayed())
			//{
				qrLog.info("Menubar button is displayed");
				newUserRegPo.login(sData[1], sData[2]);
				//waitForPageLoad();
				userConfigPo.userconfig();
				
			//}
		
	}
		catch(Exception e){
			qrLog.error("Exception in  case notifications_01");
			
			e.printStackTrace();
			Assert.fail();
		}
		
	}

}
