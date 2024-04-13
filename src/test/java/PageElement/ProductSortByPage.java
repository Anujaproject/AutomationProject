package PageElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductSortByPage {

	WebDriver driver;

	public ProductSortByPage(WebDriver idriver) {
		
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Women')]") WebElement ClickWomen;
	@FindBy(xpath="//a[contains(text(),'Hoodies & Sweatshirts')]")WebElement Topssub;
	@FindBy(xpath="//select[@id='sorter']")WebElement SortDropD;
	
	
	
	public void url(){
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	public void ClickWPro()
	{
		ClickWomen.click();
		Topssub.click();
		WebElement Dropdown = driver.findElement(By.id("sorter"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Select selectCountry = new Select(Dropdown);
		
		// Select "KUWAIT" from the dropdown by visible text
		selectCountry.selectByVisibleText("Product Name ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

}
