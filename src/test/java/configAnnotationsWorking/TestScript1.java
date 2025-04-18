package configAnnotationsWorking;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClass {
	@Test
	public void testCase01()
	{
		Reporter.log("testCase01 executed", true);
	}
	@Test
	public void testCase02()
	{
		Reporter.log("testCase02 executed", true);
	}
	

}
