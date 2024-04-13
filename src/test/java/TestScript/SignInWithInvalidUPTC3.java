package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.SignInPage;

public class SignInWithInvalidUPTC3 {
	WebDriver driver;
	SignInPage SignOutInvalidUP;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void SignIn() {
	
		SignOutInvalidUP= new SignInPage(driver);
		SignOutInvalidUP.url();
		SignOutInvalidUP.ClickOnSignlink();
		SignOutInvalidUP.SignWihInvalidUP();
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.quit();
	}
}
