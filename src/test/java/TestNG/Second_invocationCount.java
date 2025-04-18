/*invocationCount:
==================
> when ever you wanna run a Testcase more than once you can use helper attribute invocationCount.
> it accepts integers, if you provide 5 testcase execute 5 times
> if you give -ve or zero it is not considered for execution
> default value of invocationCount for every testcase is 1
*/

package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Second_invocationCount {
	@Test(invocationCount=5)
	public void executeScript1()
	{
		Reporter.log("TestNG Method1");
	}
	
	
		@Test(invocationCount=10)
		public void executeScript2()
		{
			Reporter.log("TestNG Method2");
		}

		
		@Test(priority=1,invocationCount=3)
		public void executeScript3()
		{
			Reporter.log("TestNG Method2");
		}

}
