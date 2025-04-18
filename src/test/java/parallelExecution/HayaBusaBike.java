package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HayaBusaBike {
	@Test
	public void launchingHayaBusa()
	{
		Reporter.log("Launching Wbsite HayaBusa", true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
