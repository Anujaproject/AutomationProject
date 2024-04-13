package TestScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageElement.WomenProductPage;

public class WomenProductTC10 {
	WebDriver driver;
	WomenProductPage ObjWomenP;
	
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void ClickOnSearchAdvance()
	{
		
		
		ObjWomenP =new WomenProductPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		ObjWomenP.url();
		ObjWomenP.ClickOnWomen();
			
	}
}
