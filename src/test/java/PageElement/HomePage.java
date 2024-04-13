package PageElement;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;


	public HomePage(WebDriver idriver) {
		
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Privacy and Cookie Policy')]") WebElement PrivacyPolicy;
	@FindBy(xpath="//span[contains(text(),'Privacy Policy')]") WebElement VerifyPrivacypolicy;
	@FindBy(xpath="//body/div[2]/footer[1]/div[1]/ul[1]/li[3]/a[1]") WebElement SearchAdvance;
	@FindBy(xpath="//span[contains(text(),'Advanced Search')]") WebElement VerifySearchAd;
	@FindBy(xpath="//input[@id='name']") WebElement ProductName;
	@FindBy(xpath="//input[@id='sku']")WebElement SKU;
	@FindBy(xpath="//input[@id='description']")WebElement Description;
	@FindBy(xpath="//input[@id='short_description']") WebElement ShortDescription;
	@FindBy(xpath="//input[@id='price']")WebElement price;
	@FindBy(xpath="//input[@id='price_to']") WebElement priceto;
	@FindBy(xpath="//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]") WebElement btnSearch;
	@FindBy(xpath="//span[contains(text(),'Catalog Advanced Search')]") WebElement VerifySearchAdvans;
	@FindBy(xpath="//a[contains(text(),'Orders and Returns')]") WebElement ClickOrderandReturn;
	@FindBy(xpath="//span[contains(text(),'Orders and Returns')]") WebElement VerifyOrderandReturn;
	@FindBy(xpath="//input[@id='oar-order-id']") WebElement OrderId;
	@FindBy(xpath="//input[@id='oar-billing-lastname']")WebElement LastName;
	@FindBy(xpath="//select[@id='quick-search-type-id']")WebElement OrderBy;
	@FindBy(xpath="//input[@id='oar_email']")WebElement Email;
	@FindBy(xpath="//body/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]")WebElement Contiunebtn;
	@FindBy(xpath="//header/div[2]/div[1]/a[1]") WebElement clickOnCart;
	
	@FindBy(xpath="//span[contains(text(),'Women')]") WebElement ClickWomen;
	@FindBy(xpath="//a[contains(text(),'Hoodies & Sweatshirts')]")WebElement Topssub;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]/span[1]") WebElement Whtsnew;
	@FindBy(xpath="//span[contains(text(),'Shop New Yoga')]") WebElement BtnYoga;
	
	//Methods..
	
	public void url(){
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	public void ClickOnPrivacyPolicy()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		PrivacyPolicy.click();
		Assert.assertEquals(VerifyPrivacypolicy.getText(), "Privacy Policy");
		System.out.println("Privacy Policy page displayed");
		
	}
	public void ClickOnSearchAdvance()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SearchAdvance.click();
		Assert.assertEquals(VerifySearchAd.getText(), "Advanced Search");
		System.out.println("Advanced Search page displayed");
		
		ProductName.sendKeys("hooded fleece");
		SKU.sendKeys("WJ06");
		Description.sendKeys("Nice Product..");
		ShortDescription.sendKeys("Good");
		price.sendKeys("250");
		priceto.sendKeys("350");
		btnSearch.click();
		Assert.assertEquals(VerifySearchAdvans.getText(), "Catalog Advanced Search");
		System.out.println("Catalog Advanced Search page displayed");
	}
	
	public void VerifyOrdersandReturns()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ClickOrderandReturn.click();
		Assert.assertEquals(VerifyOrderandReturn.getText(), "Orders and Returns");
		System.out.println("Order and Return page displayed");
		
		OrderId.sendKeys("000051722");
		LastName.sendKeys("mane");
		OrderBy.sendKeys("Email");
		Email.sendKeys("anuja@gmail.com");
		Contiunebtn.click();
		
	}
	
	public void ClickWPro()
	{
		ClickWomen.click();
		Topssub.click();
	}
	public void ClickWhtsnew()
	{
		Whtsnew.click();
		BtnYoga.click();
	}
	
}
