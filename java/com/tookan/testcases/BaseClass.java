package com.tookan.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.tookan.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
     
	//read the url ,browser from readconf class
	ReadConfig readConfig = new ReadConfig();
	
     //call methods
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();

	
	
	
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	//launch the browser
	public void setup()
	{

		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			//disable web notifications
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}

		//implicit wait of 10 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//for logging and mandatory to write "logger.file.name= Tookan_Automation " in log4j file 
		//bcz we give here logger = LogManager.getLogger("Tookan_Automation");
		
		logger = LogManager.getLogger("TokanAutomation"); 
		
		//open url
		driver.get(url);
		logger.info("url opened");

	}



	/*@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}*/

	
	//user method to capture screen shot
	public void captureScreenShot(WebDriver driver , String testName) throws IOException
	{
		//step1: convert webDriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
	

}
