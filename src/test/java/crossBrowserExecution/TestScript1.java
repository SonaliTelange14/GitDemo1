/*CrossBrowserExecution:
==========================
> Executing TestCases in different browser by passing browsername.

> if you are not passing parameter, still i want to launch in a particular browser as optional we can use @Optional(browserName) in method header.

> to pass paramaters we have to Write @Parameters("bname") above the method

*/


package crossBrowserExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestScript1 {
	@Parameters("bname")
	@Test
	public void launchGoIndigo(@Optional("chrome") String browserName) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(null);
		driver.get("https://www.goindigo.in/");
		driver.quit();
	}

}
