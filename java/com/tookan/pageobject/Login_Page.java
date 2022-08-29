package com.tookan.pageobject;

import java.lang.System.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	
	//1. create object of webDriver
		WebDriver ldriver;

		//constructor
		public Login_Page(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}

	    //click on sign up
		
		
		@FindBy(xpath="//input[@id='exampleInputEmail1']")
		WebElement emailId;
		
		@FindBy(xpath="//input[@id='exampleInputPassword1']")
		WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;
	

	
		
		
		public void Enteryouremail(String giveemailid)
		{
			emailId.clear();
			emailId.sendKeys(giveemailid);
		}
		public void Enteryourpassword(String yourpassword)
		{
			password.clear();
			password.sendKeys(yourpassword);
		}
		
		public void Clickonsubmit()
		{
			submit.click();
		}
		
		
		
	
		
}
