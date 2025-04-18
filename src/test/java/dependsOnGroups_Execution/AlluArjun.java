package dependsOnGroups_Execution;


/*dependsOnGroups: 
=================
> this helper attribute helps you to run a particular testcase after executing all the test cases of a group, or multiple groups*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlluArjun {
	
		@Test(groups = "TFI", dependsOnGroups="KFI")
		public void launchingWikipedia() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
			driver.quit();
		}	
	}


