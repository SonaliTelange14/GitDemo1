package parallelExecution;
/*Parallel Execution:
====================
> Execution of multiple scripts in one single click parallely
> Select multiple testNg classes > right click > TestNg > Convert to TestNG
> An xml file gets created, if you run that xml file, it will execute all the testcases, in parallel
> parallel attribute in test level or suite level and you can have attribue values --> tests, classes, methods, true
> note: number of testcases or testng classes getting invoked depends on Thread-count attribute at test level
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class R15Bike {
	@Test
	public void launchingR15Site()
	{
	Reporter.log("R15 Website Launching", true);	
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
    driver.quit();
	}

}
