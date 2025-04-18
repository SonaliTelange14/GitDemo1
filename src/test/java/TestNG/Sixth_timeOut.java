package TestNG;

/*timeOut:
=========
> It accepts timeOut in long, we have to provide seconds in thousands
> checks whether the testcase will be executed within the given time or not if its not executed within the specified time 
  then it will consider test case as failure and throws ThreadTimeOutException
  
  below 1st script-->
> executeScripts1 method have give 1 sec time to execute,but it will not run on that time
> so giving  error as -->org.testng.internal.thread.ThreadTimeoutException: Method TestNG.Sixth_timeOut.executeScripts() 
  didn't finish within the time-out 1000
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sixth_timeOut {
	@Test(timeOut=1000)
	public void executeScripts1()
	{
		Reporter.log("TestNG method1", true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
	

		@Test(timeOut=10000)
		public void executeScripts2()
		{
			Reporter.log("TestNG method2", true);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.quit();
		}


}
