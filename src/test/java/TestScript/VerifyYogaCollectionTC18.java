package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.SignInPage;
import PageElement.HomePage;

public class VerifyYogaCollectionTC18 {
	WebDriver driver;
	SignInPage ObjSignin;
	HomePage ObjHp;


	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void YogaCollection()
	{
		HomePage ObjHp=new HomePage(driver);
		ObjHp.url();
		ObjHp.ClickWhtsnew();
		
		String YogaCol = driver.findElement(By.xpath("//span[contains(text(),'New Luma Yoga Collection')]")).getText();
		Assert.assertEquals(YogaCol, "New Luma Yoga Collection");
		System.out.println(YogaCol);
				
	}
}
