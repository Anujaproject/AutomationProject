package PageElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenProductPage {
	WebDriver driver;
	Actions act=new Actions(driver);
	public WomenProductPage(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Women')]") WebElement ClickWomen;
	@FindBy(xpath="//a[contains(text(),'Hoodies & Sweatshirts')]")WebElement Topssub;
	@FindBy(xpath="//body/div[2]/main[1]/div[3]/div[1]/div[4]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")WebElement Fproduct;
	
	@FindBy(xpath="//body[1]/div[2]/main[1]/div[3]/div[1]/div[4]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")WebElement CAddp;
	//@FindBy(xpath="//div[@id='option-label-size-143-item-166']") WebElement size;
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")WebElement size;
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")WebElement Color;
	//@FindBy(xpath="//div[@id='option-label-color-93-item-52']") WebElement Color;
	@FindBy(xpath="//input[@id='qty']") WebElement qty;
	@FindBy(xpath="//button[@id='product-addtocart-button']") WebElement addtocbtn;
	@FindBy(xpath="//header/div[2]/div[1]/a[1]") WebElement ClickOncart;
	@FindBy(xpath="//a[@id='tab-label-reviews-title']") WebElement clickReviewtab;
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[4]/div[1]/div[6]/div[2]/div[2]/form[1]/fieldset[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/label[5]") WebElement rating;
	@FindBy(xpath="//input[@id='nickname_field']") WebElement nickname;
	@FindBy(xpath="//input[@id='summary_field']")WebElement summry;
	@FindBy(xpath="//textarea[@id='review_field']")WebElement review;
	@FindBy(xpath="//span[contains(text(),'Submit Review')]")WebElement SubmitBtn;
	
	public void url()
	{
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	public void ClickOnWomen()
	{
		ClickWomen.click();
		Topssub.click();
		Actions action = new Actions(driver);
		action.moveToElement(Fproduct).perform();
		CAddp.click();
		size.click();
		Color.click();
		qty.clear();
		qty.sendKeys("2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		addtocbtn.click();
		//driver.manage().timeouts().implicitlyWait(:30, TimeUnit.SECONDS);
	
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		//driver.findElement(By.linkText("Create new account")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(3000,0)");
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		//WebElement ClickOncart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[2]/div[1]/a[1]")));
	    
	    //ClickOncart.click();
		
	}
    public void SubmitReview()
    {
    	ClickWomen.click();
		Topssub.click();
		Actions action = new Actions(driver);
		action.moveToElement(Fproduct).perform();
		CAddp.click();
		clickReviewtab.click();
		//rating.click();
		nickname.sendKeys("Anu");	
		act.sendKeys(Keys.ENTER);
		summry.sendKeys("Product is very good..!");
		act.sendKeys(Keys.ENTER);
		review.sendKeys("Nice Produtc");
		act.sendKeys(Keys.ENTER);
		SubmitBtn.click();
		
		
    }

}
