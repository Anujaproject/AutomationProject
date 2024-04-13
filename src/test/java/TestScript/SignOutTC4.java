package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.SignInPage;

public class SignOutTC4 {

	WebDriver driver;
	SignInPage SignOut;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void SignIn() {
		
		SignOut= new SignInPage(driver);
		SignOut.url();
		SignOut.ClickOnSignlink();
		SignOut.SignIn();
		SignOut.ClickonDropdownSignout();
		
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
}
