package TestScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.ProductSortByPage;

public class ProductSortByNameTC16 {

WebDriver driver;
	
	ProductSortByPage ProSortby;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void SortByName()
	{	
		ProductSortByPage ProSortby=new ProductSortByPage(driver);
		ProSortby.url();
		ProSortby.ClickWPro();
				
	}
	
}
