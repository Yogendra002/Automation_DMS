package com.tookan.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_agent_manager {
	
	//1. create object of webDriver
	WebDriver ldriver;

	//constructor
	public Add_agent_manager(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//click on sign up
	@FindBy(xpath="//li[@class='menu-trigger']")
	WebElement sidemenu;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/main-left-sidebar[1]/li[2]/a[1]/span[2]")
	WebElement agent;
	
	@FindBy(xpath="//div[@id='add-driver-btn']//span[1]")
	WebElement clickonaddagent;
	
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/div/div[3]/div/div/div/div/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content/div/div[1]/form/div[1]/input")
	WebElement enteragentfirstname;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/div/div[3]/div/div/div/div/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content/div/div[1]/form/div[2]/input")
	WebElement enteragentlastname;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/div/div[3]/div/div/div/div/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content/div/div[1]/form/div[4]/input")
	WebElement emailid;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/div/div[3]/div/div/div/div/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content/div/div[1]/form/div[5]/div/input")
	WebElement phoneno;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/div/div[3]/div/div/div/div/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content/div/div[1]/form/div[7]/input")
	WebElement username;
	

	@FindBy(xpath="//*[@id=\"addAgentForm\"]/div[8]/input")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div/div[1]/div/div[3]/div/div/div/div/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content/div/div[1]/form/div[11]/div[1]/div[1]/span/span[2]")
	public WebElement clickteam;
	
	
	@FindBy(xpath="//*[@id=\"addAgentForm\"]/div[11]/div[1]/input[1]")
	WebElement team;
	
	@FindBy(xpath="//*[@id=\"tab-content-5\"]/div/div[5]/button[2]")
	WebElement clickaddagent;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[2]")
	WebElement clickonsettings;
	
	@FindBy(xpath="/html/body/app-root/app-settings/div[2]/div[1]/app-sidemenu/div/ul/li[12]")
	WebElement clickaddmanager;
	
	//@FindBy(xpath="//*[@id=\"sidemenu\"]/li[12]")
	//WebElement clickaddmanager;
	
	
	
	public void clickonsidemenu()
	{
		sidemenu.click();
	}
	
	public void clickonagent()
	{
		agent.click();
	}
	
	public void clickonaddagent()
	{
		clickonaddagent.click();
	}
	
	public void enteragentfirstname1(String firstagentname)
	{
		
		
		enteragentfirstname.sendKeys(firstagentname);
		
	}
	
	
	public void enteragentlastname1(String lastagentname)
	{
		
		enteragentlastname.sendKeys(lastagentname);
	}
	
	public void enteremail(String email)
	{
		
		emailid.sendKeys(email);
	}
	
	public void enterphoneno(String phn)
	{
		
		phoneno.sendKeys(phn);
	}
	
	public void enterusername(String usernm)
	{
		
		username.sendKeys(usernm);
	}
	
	public void enterpassword(String pswd)
	{
		
		password.sendKeys(pswd);
		
	}
	
	public void clickonteam()
	{
		
		clickteam.click();
	}
	
	public void enterteam(String team1)
	{
		
		team.sendKeys(team1);
		team.sendKeys(Keys.ENTER);
	}
	
	public void clickaddagent()
	{
		
		clickaddagent.click();
	}
	
	public void clickonsetting()
	{
		clickonsettings.click();
		
	}
	
	public void clickaddmanager()
	{
		clickaddmanager.click();
		
	}
	
}
