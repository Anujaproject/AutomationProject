package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.CreateAccountPage;


public class CreateAccountTC1 {
	WebDriver driver;
	CreateAccountPage objCreatePage;
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void CreateAccount() {
		objCreatePage= new CreateAccountPage(driver);	
		objCreatePage.url();
		objCreatePage.ClickOnCreateAclink();
		objCreatePage.CreateAccount();
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
}
