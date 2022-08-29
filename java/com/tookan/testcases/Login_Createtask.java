package com.tookan.testcases;

import java.util.Random;

import org.testng.annotations.Test;

import com.tookan.pageobject.Create_task;
import com.tookan.pageobject.Login_Page;


public class Login_Createtask extends BaseClass
{
	
	Random random = new Random();
	int datas = random.nextInt(1000);
	
	@Test(priority=1)
	public void VerifyLogin() throws InterruptedException
	{
	
	Login_Page li = new Login_Page(driver);
	
	
	li.Enteryouremail("yogendra.kumar@jungleworks.com");
	li.Enteryourpassword("Qwerty@123");
	li.Clickonsubmit();
	
	
	}
	
	@Test(priority=2)
	public void verifycreatetask() throws InterruptedException
	{
		
	Create_task ct = new Create_task(driver);
	ct.clickoncreatetask();
	ct.clickonpickup();
	ct.entername("yogendra kumar" + datas);
	ct.enterphone("98765412");
	ct.enteremail("yogi@test.com");
	ct.entertheaddress();
	ct.entertheaddresswrite("dhanbad,jharkhand");
	Thread.sleep(2000);
	ct.entertheaddress1();
	ct.clickoncalender();
	Thread.sleep(2000);
	ct.enterthedate();
	ct.enterthename();
	ct.enterthedescription("hey tset");
	ct.clickonassign();
	Thread.sleep(2000);
	ct.clickonagent1();
	ct.clickonagent2();
	ct.clickcreatetask();
	Thread.sleep(5000);
	ct.checktask();
	Thread.sleep(4000);
	ct.selectthedate();
	Thread.sleep(4000);
	
	}

}
