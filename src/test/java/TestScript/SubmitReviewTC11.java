package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.WomenProductPage;

public class SubmitReviewTC11 {
	WebDriver driver;
	WomenProductPage ObjSubR;
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void SubmiReview()
	{
		ObjSubR=new WomenProductPage(driver);
		ObjSubR.url();
		ObjSubR.SubmitReview();
	}
}
