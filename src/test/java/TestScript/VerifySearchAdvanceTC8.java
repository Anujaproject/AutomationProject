package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.HomePage;

public class VerifySearchAdvanceTC8 {
	WebDriver driver;
	HomePage ObjSearchAdvance;
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void ClickOnSearchAdvance()
	{
		ObjSearchAdvance =new HomePage(driver);
		ObjSearchAdvance.url();
		ObjSearchAdvance.ClickOnSearchAdvance();
			
	}
}
