package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.ProductSortByPage;
import PageElement.HomePage;

public class ProductSortByPositionTC17 {
WebDriver driver;
	
	ProductSortByPage ProSortby;
	HomePage HP;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void SortByName()
	{	
		HomePage HP=new HomePage(driver);
		HP.url();
		HP.ClickWPro();
				
	}
}