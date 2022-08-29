package com.tookan.testcases;


import java.util.Random;

import org.testng.annotations.Test;

import com.tookan.pageobject.Add_agent_manager;
import com.tookan.pageobject.Login_Page;


public class Add_Agent extends BaseClass
{
	
	
	Random random = new Random();
	int datas = random.nextInt(1000);
	
	
	
	
	
   @Test
   public void verifyaddagent() throws Exception
   {
	   Login_Page li = new Login_Page(driver);
		Thread.sleep(1000);
		li.Enteryouremail("yogendra.kumar@jungleworks.com");
		li.Enteryourpassword("Qwerty@123");
		li.Clickonsubmit();
		Add_agent_manager aa = new Add_agent_manager(driver);
	    aa.clickonsidemenu();
	    Thread.sleep(5000);
	    aa.clickonagent();
	    aa.clickonaddagent();
	    Thread.sleep(3000);
	    aa.enteragentfirstname1("yogkk");
	    aa.enteragentlastname1("test");
	    aa.enteremail("ab4" + datas + "@test.com");
	    aa.enterphoneno("965764411");
	    aa.enterusername("ytt678" + datas);
	    aa.enterpassword("qwerty");
	    Thread.sleep(1000);
	    aa.clickonteam();
	    aa.enterteam("sayam");
	    Thread.sleep(5000);
	    aa.clickaddagent();
	    Thread.sleep(4000);
	    captureScreenShot(driver,"verifyaddagent");
	    logger.info("ss");
    }    
   
	 @Test(enabled=false)
    public void verifyaddmanager() throws Exception
	{
		Login_Page li = new Login_Page(driver);
		li.Enteryouremail("yogendra.kumar@jungleworks.com");
		li.Enteryourpassword("Qwerty@123");
		li.Clickonsubmit();
		Add_agent_manager aa = new Add_agent_manager(driver);
		aa.clickonsidemenu();
		Thread.sleep(5000);
		aa.clickonsetting();
		Thread.sleep(4000);
		
		aa.clickaddmanager();
	    	
    }
	    
	   
	    
   


}
