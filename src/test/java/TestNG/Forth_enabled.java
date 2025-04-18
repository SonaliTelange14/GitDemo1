/*enabled:
=========
> if we don't wanna execute the testcase, we can have invocationCount=0 or else we can use enabled = false
> it accepts boolean value
> if you provide false, it will not be considered for execution.

*/
package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test(enabled=false)
public class Forth_enabled {
	public void executTest1()
	{
		Reporter.log("TestNG Method1", true);
	}
	
	@Test(enabled=true)
public void executTest2()
		{
			Reporter.log("TestNG Method2", true);
		}
	
	@Test(invocationCount=0)
	public void executTest3()
			{
				Reporter.log("TestNG Method3", true);
			}
	
	@Test
	public void executTest4()
			{
				Reporter.log("TestNG Method4", true);
			}
		


}
