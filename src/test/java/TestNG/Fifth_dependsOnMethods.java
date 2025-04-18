package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fifth_dependsOnMethods {
	//@Test(dependsOnMethods= "executeScript2")
	@Test(dependsOnMethods = {"executeScript2" , "executeScript3"} )
	public void executeScript1() {
		// System.out.println("TestNg method");
		Reporter.log("TestNg method1", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		driver.quit();
	}

	@Test
	public void executeScript2() {
		// System.out.println("TestNg method");
		Reporter.log("TestNg method2", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
		driver.quit();
	}
	
	@Test
	public void executeScript3() {
		Reporter.log("TestNg method3", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.triumphmotorcycles.in/motorcycles/adventure/tiger-900");
		driver.quit();
	}

}
