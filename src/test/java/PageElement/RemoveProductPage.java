package PageElement;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RemoveProductPage {

	WebDriver driver;
	

	public RemoveProductPage(WebDriver idriver) {
		
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[2]/a[1]")WebElement ClickDel;
	@FindBy(xpath="//header/div[2]/div[1]/a[1]") WebElement clickOnCart;
	
	
}
