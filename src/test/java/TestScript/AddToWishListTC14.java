package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.SignInPage;

public class AddToWishListTC14 {
	WebDriver driver;
	SignInPage WishLst;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void AddToWish()
	{
		WishLst = new SignInPage(driver);
		WishLst.url();
		WishLst.ClickOnSignlink();
		WishLst.SignIn();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		WishLst.AddToWishList();
		
		String WishL = driver.findElement(By.xpath("//span[contains(text(),'My Wish List')]")).getText();
		Assert.assertEquals(WishL, "My Wish List");
		System.out.println(WishL);
		
		
	}
}
