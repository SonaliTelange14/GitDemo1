package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JawaBike {
	@Test
	public void launchBobber42()
	{
		Reporter.log("Bobber42 website launching", true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jawamotorcycles.com/motorcycles/42-bobber");
		driver.manage().window().maximize();
		driver.quit();
	}
	@Test
	public void  launchJawa350() 
	{
		Reporter.log("Jawa350 website launching", true);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jawamotorcycles.com/motorcycles/jawa-350");
		driver.manage().window().maximize();
		driver.quit();
	}

}
