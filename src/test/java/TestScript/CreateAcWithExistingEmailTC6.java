package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.CreateAccountPage;

public class CreateAcWithExistingEmailTC6 {
	WebDriver driver;
	CreateAccountPage objExistingEmail;
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void CreateAccount() {
		objExistingEmail= new CreateAccountPage(driver);	
		objExistingEmail.url();
		objExistingEmail.ClickOnCreateAclink();
		objExistingEmail.CreateAccount();
		objExistingEmail.CreateAccountWithExistingEmail();
	}
	
	@AfterTest
	// Close the WebDriver instance
	public void CloseBrowser() {
		driver.quit();
	}
}
