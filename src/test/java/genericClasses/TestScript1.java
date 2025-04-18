package genericClasses;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClass {
	@Test
	public void clickOnElectronicsLink()
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		Reporter.log("electronics link clicked", true);
	}

}
