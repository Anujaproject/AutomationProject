package TestScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.RemoveProductPage;
import PageElement.SignInPage;
//import PageElement.RemoveProductPage *;


public class RemoveProductTC13 {

	WebDriver driver;
	RemoveProductPage ObjRemvPg;
	SignInPage Objsg;


	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void RemoveProd() throws InterruptedException
	{
		
		Objsg = new SignInPage(driver);
		Objsg.url();
		Objsg.ClickOnSignlink();
		Objsg.SignIn();
		Thread.sleep(3000);
		Objsg.RemovePro();
		Thread.sleep(3000);
		
		
	}
}
