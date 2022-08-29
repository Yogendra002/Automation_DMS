package com.tookan.testcases;

import java.io.IOException;
import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.utilities.ReadExcelFile;
import com.tookan.pageobject.Add_agent_manager;
import com.tookan.pageobject.Login_Page;


public class Add_Agent_datadriven extends BaseClass
{
	
	
	Random random = new Random();
	int datas = random.nextInt(1000);
	
	
	
	
   @Test(dataProvider = "addagent")
   public void verifyaddagent(String FirstName , String LastName) throws InterruptedException, Exception
   {
	   Login_Page li = new Login_Page(driver);
		Thread.sleep(2000);
		li.Enteryouremail(FirstName);
		li.Enteryourpassword(LastName);
		li.Clickonsubmit();
		Add_agent_manager aa = new Add_agent_manager(driver);
	    aa.clickonsidemenu();
	    aa.clickonagent();
	    aa.clickonaddagent();
	    Thread.sleep(3000);
	    aa.enteragentfirstname1(FirstName);
	    aa.enteragentlastname1(LastName);
	    aa.enteremail("ab4" + datas + "@test.com");
	    aa.enterphoneno("965764411");
	    aa.enterusername("ytt678" + datas);
	    aa.enterpassword("qwerty");
	    Thread.sleep(1000);
	    aa.clickonteam();
	    aa.enterteam("sayam");
	    Thread.sleep(3000);
	    aa.clickaddagent();
	    Thread.sleep(5000);
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
	 
	 @DataProvider(name = "addagent")
		public String[][] LoginDataProvider()
		{
			//System.out.println(System.getProperty("user.dir"));
			String fileName = System.getProperty("user.dir") + "\\TestData\\Testdata.xlsx";


			int ttlRows = com.tookan.utilities.ReadExcelFile.getRowCount(fileName, "Testdata");
			int ttlColumns = com.tookan.utilities.ReadExcelFile.getColCount(fileName, "Testdata");
		

			String data[][]=new String[ttlRows-1][ttlColumns];

			for(int i=1;i<ttlRows;i++)//rows =1,2
			{
				for(int j=0;j<ttlColumns;j++)//col=0, 1,2
				{

					data[i-1][j]=com.tookan.utilities.ReadExcelFile.getCellValue(fileName,"Testdata", i,j);
				}

			}
			return data;
		}

	    
	   
	    
   


}
