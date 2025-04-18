package genericClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Before suite", true);
		Reporter.log("configuring report");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("After suite",true);
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
	
	
	@Parameters("bname")
	@BeforeClass
	public void beforeClass(@Optional("chrome") String browserName)
	{
		Reporter.log("Before class", true);
		Reporter.log("Launch browser, maximize and load url");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("After class", true);
		Reporter.log("Close the browser and end the session");
		driver.close();
		driver.quit();
		
		}
	
	@BeforeMethod
	public void beforeMethod()
	{
	Reporter.log("Before method", true);	
	Reporter.log("Login");
	driver.findElement(By.xpath("//a[text()= \"Log in\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("sonali1@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Sonali@1");
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}

	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("After method", true);
		Reporter.log("Logout");
		driver.findElement(By.xpath("//a[@class=\"ico-logout\"]")).click();
	}
}
