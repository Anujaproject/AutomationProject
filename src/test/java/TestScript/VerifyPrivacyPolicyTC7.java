package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.HomePage;

public class VerifyPrivacyPolicyTC7 {

	WebDriver driver;
	HomePage ObjPrivacyPolicypage;
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void ClickOnPrivacyPolicy()
	{
		ObjPrivacyPolicypage =new HomePage(driver);
		ObjPrivacyPolicypage.url();
		ObjPrivacyPolicypage.ClickOnPrivacyPolicy();
			
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
}
