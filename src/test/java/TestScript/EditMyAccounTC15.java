package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.SignInPage;

public class EditMyAccounTC15 {

	WebDriver driver;
	SignInPage Myacc;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void SignIn() {
		
		Myacc= new SignInPage(driver);
		Myacc.url();
		Myacc.ClickOnSignlink();
		Myacc.SignIn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Myacc.EditMyAccInfo();
		
	}
	
	@AfterTest
	public void CloseBrowser() {
		//driver.quit();
	}
}
