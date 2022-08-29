package com.tookan.pageobject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Signup {

	//1. create object of webDriver
	WebDriver ldriver;

	//constructor
	public Signup(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	

    //click on sign up
	@FindBy(xpath="//a[@ng-click='sendCreateEvent();goToRegister()']")
	WebElement signup;
	
    //name
	@FindBy(id="siFname")
	WebElement name;

	//email
	@FindBy(xpath="//input[@id='siEmail1']")
	WebElement email;
	
	//password
	@FindBy(xpath="//input[@id='siPassword']")
	WebElement password;
	
	//phonno
	@FindBy(xpath="//input[@id='companyPhone']")
	WebElement phoneno;
	
	@FindBy(xpath="//input[@name='agree_with_terms_and_conditions']")
	WebElement clickontc;
	
	
	@FindBy(xpath="//button[@id='btnLoader']")
	WebElement clicksignup;
	
	


	public void clickonsignupbutton()
	{
		signup.click();
	}
	
    public void EnterName(String entername1)
	{
		name.sendKeys(entername1);
	}

	public void EnterEmail(String enteremail1)
	{
		email.sendKeys(enteremail1);
	}

	public void EnterPassword(String enterpassword1)
	{
		password.sendKeys(enterpassword1);
	}
	
	public void Enterphoneno(String phoneno1)
	{
		phoneno.sendKeys(phoneno1);
	}
	
	public void clickontc()
	{
		clickontc.click();
	}
	
	public void clickonsignupbutton1()
	{
		clicksignup.click();
	}





}