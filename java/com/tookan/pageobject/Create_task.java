package com.tookan.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_task {
	
	//1. create object of webDriver
			WebDriver ldriver;

			//constructor
			public Create_task(WebDriver rdriver)
			{
				ldriver = rdriver;
				PageFactory.initElements(rdriver, this);
			}

		    //click on sign up
			@FindBy(xpath="//body/div[@class='content-wrapper ng-scope']/div[@class='ele-ht-wd ng-scope']/div[@class='fullwidth main-inner']/header[@class='topnavbar-wrapper ng-scope']/div[@id='topbarControllerNew']/div[@class='main-outer fullwidth new-dashboard']/div[@class='fullwidth main-inner']/div[@class='top-nav fullwidth new-top-menu navbar-nav navbar-fixed-top']/ul[@id='dsRight']/li[@class='noMargin ng-scope']/div[@class='create-btn create-task-btn tk-blue-btn btn ng-scope']/div[@class='clearfix ng-scope']/span[1]")
			WebElement createtask;
			
			@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/create-task-slider[1]/section[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[2]")
			WebElement pickup;
			
			@FindBy(xpath="//input[@placeholder='Name']")
			WebElement entername1;
			
			@FindBy(xpath="//input[@id='newtask-pickup-phone0']")
			WebElement phoneno;
			
			@FindBy(xpath="//input[@placeholder='Email']")
			WebElement email;
			
			@FindBy(xpath="//input[@id='pickup_address0']")
			WebElement address;
			
			@FindBy(xpath="//span[contains(text(),', Dhanbad-Cum-Kenduadih-Cum-Jagata, Dhanbad, Jhark')]")
			WebElement address1;
			
			@FindBy(xpath="//img[@role='button']")
			WebElement coordinate;
			

			@FindBy(xpath="//input[@placeholder='Latitude']")
			WebElement Latitude;
			

			@FindBy(xpath="//input[@placeholder='Longitude']")
			WebElement Longitude;
			
			@FindBy(xpath="//input[@id='pickup_datetimepicker0']")
			WebElement calender;
			
			
			
			
			@FindBy(xpath="//div[normalize-space()='30']")
			WebElement date;
			
			@FindBy(xpath="//div[@class='date-backdrop']")
			WebElement time;
			
			@FindBy(xpath="//textarea[@id='notes-textarea']")
			WebElement description;
			

			@FindBy(xpath="//a[@id='create_task_assign_btn']//i[@class='tf down-select-arrow easy-3s']")
			WebElement assign;
			
			@FindBy(xpath="//div[normalize-space()='vikash dubey']")
			WebElement selectagent;
			
			@FindBy(xpath="//div[normalize-space()='test agent']")
			WebElement selectagent1;
			
			@FindBy(xpath="//span[@class='ng-binding ng-scope'][normalize-space()='Create Task']")
			WebElement createpictask;
			
			@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[2]/div[1]/ul[2]/li[2]/div[1]/span[1]/button[1]/div[1]/span[2]/span[1]")
			WebElement checkthetask;
			
			@FindBy(xpath="//span[normalize-space()='30']")
			WebElement selectdate;
			
			
			
			
			public void clickoncreatetask()
			{
				createtask.click();
			}
			
			public void clickonpickup()
			{
				pickup.click();
			}
			
			public void entername(String name)
			{
				entername1.clear();
				entername1.sendKeys(name);
			}
			
			public void enterphone(String givephoneno)
			{
				phoneno.clear();
				phoneno.sendKeys(givephoneno);
			}
			
			public void enteremail(String email1)
			{
				email.clear();
				email.sendKeys(email1);
			}
			
			
			
			public void entertheaddress()
			{
				address.clear();
				address.click();
						
			}
			
			public void entertheaddresswrite(String entersddress)
			{
				address.clear();
				address.sendKeys(entersddress);
						
			}
			
			
			public void entertheaddress1()
			{
				address1.click();
				
						
			}
			
			public void clickoncoordinate()
			{
				coordinate.click();
			}
			
			public void entertheLatitude(String Latitude1)
			{
				Latitude.sendKeys(Latitude1);
			}
			
			public void entertheLongitude(String Longitude1)
			{
				Longitude.sendKeys(Longitude1);
			}
			
			public void clickoncalender()
			{
				calender.click();
			}
			
			
			public void enterthedate()
			{
				date.click();
			}
			
			public void enterthename()
			{
				time.click();
			}
			
			public void enterthedescription(String desc)
			{
				description.sendKeys(desc);
			}
			
			public void clickonassign()
			{
				assign.click();
			}
			
			public void clickonagent1()
			{
				selectagent.click();
			}
			
			public void clickonagent2()
			{
				selectagent1.click();
			}
			
			public void clickcreatetask()
			{
				createpictask.click();
			}
			
			public void checktask()
			{
				checkthetask.click();
			}
			
			public void selectthedate()
			{
				selectdate.click();
			}


}
