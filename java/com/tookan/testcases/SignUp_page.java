package com.tookan.testcases;


import org.testng.annotations.Test;

import com.tookan.pageobject.Signup;

public class SignUp_page extends BaseClass
{
	
	@Test(priority=0)
	public void Verifysignup() throws Exception
	{
		
		
		Signup s = new Signup(driver);
        Thread.sleep(2000);
		
        s.clickonsignupbutton();
        Thread.sleep(2000);
        
		s.EnterName("Yogendra");
		logger.debug("Name entered");
		
		s.EnterEmail("abc1562@test.com");
		logger.debug("Email entered");
		
		Thread.sleep(2000);
		s.EnterPassword("Qwerty@123");
		logger.debug("Password entered");
		
		s.Enterphoneno("981837818");
		
		s.clickontc();
		s.clickonsignupbutton1();
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
}
