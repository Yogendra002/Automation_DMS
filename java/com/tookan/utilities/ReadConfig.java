package com.tookan.utilities;

import java.io.FileInputStream;

import java.util.Properties;



public class ReadConfig {

	Properties properties;

	String path = "C:\\Users\\DELL\\eclipse-workspace\\Tookan_Automation\\Configuration\\config.properties";

	//constructor
	public ReadConfig() {
		try {
			properties = new Properties();

			FileInputStream  fis = new FileInputStream(path);//read the file
			properties.load(fis);//load the file

		} catch (Exception e) {
			
			e.printStackTrace();
		}


	}
	
	//read the key of properties file
	public String getBaseUrl()
	{
		String value = properties.getProperty("baseUrl");//read the value 
        
		
		//value of baseurl null to nahi hai n
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}

	public String getBrowser()
	{
		String value = properties.getProperty("browser");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}
	
	
	

}
