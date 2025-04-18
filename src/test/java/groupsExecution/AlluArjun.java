package groupsExecution;

/*Group Execution:
=================
> Execution of Test Cases of Similar group is called as Group Execution
> in order to to this, we have to map each and every testcase for a particular group, you can do this with helper attribute called as groups, you can give any name, you can make a testcase available for multiple groups.
> generate your xml
>  you have to use <groups> tag after <test> and before <classes> as mentioned in below xml file
> inside groups use <run> tag inside that you can use include as well as exclude
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlluArjun {
	
		@Test(groups = {"TFI", "Pan India"})
		public void launchingWikipedia() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
			driver.quit();
		}	
	}


