package configAnnotationsWorking;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Before suite", true);
		Reporter.log("configuring report");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("After suite", true);
		Reporter.log("flush the report");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Before test", true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After test", true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before class", true);
		Reporter.log("Launch browser,maximize an load url");
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("After class", true);
		Reporter.log("Close the browser and end the session");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before method", true);
		Reporter.log("Login");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("After method", true);
		Reporter.log("logout");
		}

}
