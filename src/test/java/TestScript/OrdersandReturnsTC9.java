package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.HomePage;

public class OrdersandReturnsTC9 {
	WebDriver driver;
	HomePage ObjOrderandReturns;
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void ClickOnSearchAdvance()
	{
		ObjOrderandReturns =new HomePage(driver);
		ObjOrderandReturns.url();
		ObjOrderandReturns.VerifyOrdersandReturns();
			
	}
}
