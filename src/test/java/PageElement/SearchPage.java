package PageElement;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;

	public SearchPage(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	// Repository 
	@FindBy(xpath = "//input[@id='search']")
	WebElement SearchPro;
	
	public void url(){
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	public void Searchp()
	{
		SearchPro.sendKeys("Hoodie");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
	}
	
}
