/*threadPoolSize:
================
--> providing threads for executing your testcase to run multiple times parallely.
--> threadPoolSize accepts integer, normally we will give it to the similar to inovactionCount to run the testCase multiple times that too parallel.
--> by default threadPoolSize will be 1
--> don't use threadpoolsize without invocation count
*/
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Third_threadPoolSize {
@Test(invocationCount=3,threadPoolSize=3)
	public void executeScript1()
	{
		Reporter.log("TestNG Method1", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.quit();
	}

@Test
public void executeScript2() {
	//System.out.println("TestNg method");
	Reporter.log("TestNg method2",true);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
	driver.quit();
}
}
