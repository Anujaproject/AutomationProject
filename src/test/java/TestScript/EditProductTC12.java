package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.SignInPage;

public class EditProductTC12 {

	WebDriver driver;
	SignInPage ObjSignin;


	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void SignIn() {

		ObjSignin = new SignInPage(driver);
		ObjSignin.url();
		ObjSignin.ClickOnSignlink();
		ObjSignin.SignIn();
		ObjSignin.ClickOnCartBtn();
		
	}
}
