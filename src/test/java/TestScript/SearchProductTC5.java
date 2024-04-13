package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElement.SearchPage;

public class SearchProductTC5 {

	WebDriver driver;
	SearchPage objSearchPage;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void ClickonSearch() {
		objSearchPage = new SearchPage(driver);
		objSearchPage.url();
		objSearchPage.Searchp();
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
}
