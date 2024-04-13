package PageElement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class SignInPage {
	WebDriver driver;

	public SignInPage(WebDriver idriver) {
		
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	// Repository
	@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[2]/a[1]")WebElement ClickOnSignInLink;
	@FindBy(xpath= "//input[@id='email']")WebElement email;
	@FindBy(xpath= "//input[@name='login[password]']")WebElement pass;
	@FindBy(xpath="//fieldset[@class='fieldset login']/div[4]/child::div/button") WebElement SignInBtn;
	@FindBy(xpath="//span[contains(text(),'My Account')]") WebElement VerifyMyAcc;
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]")WebElement InvalidUP;
	@FindBy(xpath="//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]") WebElement Dropdbtn;
	@FindBy(xpath="//html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]") WebElement SignOut;
	@FindBy(xpath="//header/div[2]/div[1]/a[1]") WebElement clickOnCart;
	@FindBy(xpath="//span[contains(text(),'View and Edit Cart')]") WebElement ViewCrt;
	@FindBy(xpath="//tbody/tr[2]/td[1]/div[1]/a[2]") WebElement Edit;
	@FindBy(xpath="//input[@id='qty']") WebElement Qty;
	@FindBy(xpath="//button[@id='product-updatecart-button']") WebElement BtnUpdate;
	@FindBy(xpath="//body/div[2]/main[1]/div[3]/div[1]/div[3]/form[1]/div[2]/button[2]") WebElement UpdtCrt;
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]") WebElement size;
	@FindBy(xpath="/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")WebElement Color;
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[2]/a[1]")WebElement ClickDel;
	@FindBy(xpath="//body/div[4]/aside[2]/div[2]/footer[1]/button[2]") WebElement BtnOk;
	@FindBy(xpath="//body/div[2]/main[1]/div[3]/div[1]/div[4]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")WebElement Fproduct;
	@FindBy(xpath="//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/ol[1]/li[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]") WebElement AddtoWish;
	@FindBy(xpath="//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/ol[1]/li[1]") WebElement FirtsP;
	@FindBy(xpath="//span[contains(text(),'My Wish List')]") WebElement VerifyWishL;
	@FindBy(xpath="//header/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]") WebElement ClickMyAcc;
    @FindBy(xpath="//body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[1]/strong[1]") WebElement Myacc;
	@FindBy(xpath="//body[1]/div[2]/main[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/a[1]/span[1]") WebElement EditAccInfo;
    @FindBy(xpath="//input[@id='firstname']") WebElement EditFname;
    @FindBy(xpath="//input[@id='lastname']") WebElement EditLname;
    @FindBy(xpath="//body/div[2]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]") WebElement BtnSave;
	
	//Methods
	public void url(){
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	public void ClickOnSignlink()
	{
		ClickOnSignInLink.click();
	}
	public void SignIn()
	{
		email.sendKeys("anuja@gmail.com");
		pass.sendKeys("anu@12345");
		SignInBtn.click();
		//Assert.assertEquals(VerifyMyAcc.getText(), "My Account");
		//System.out.println("My Account");
	}
	public void SignWihInvalidUP()
	{
		email.sendKeys("anu@gmail.com");
		pass.sendKeys("anu@1345");
		SignInBtn.click();
		Assert.assertEquals(InvalidUP.getText(), "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
		System.out.println("Invalid Login");
	}
	public void ClickonDropdownSignout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Dropdbtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		SignOut.click();	
	}
	public void ClickOnCartBtn()
	{
		clickOnCart.click();
		ViewCrt.click();	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Edit.click();
		size.click();
		Color.click();
		Qty.clear();
		Qty.sendKeys("2");
		BtnUpdate.click();
		UpdtCrt.click();	
	}
	public void RemovePro()
	{		
		clickOnCart.click();
	    ClickDel.click();
	    BtnOk.click();
		Alert al=driver.switchTo().alert();
		al.accept();		
	}
	public void AddToWishList()
	{
		Actions action = new Actions(driver);
		action.moveToElement(FirtsP).perform();
		AddtoWish.click();		
	}
	public void EditMyAccInfo()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Dropdbtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		ClickMyAcc.click();
		Myacc.click();
		EditAccInfo.click();
		EditFname.clear();
		EditFname.sendKeys("Sai");
		EditLname.clear();
		EditLname.sendKeys("Patil");
		BtnSave.click();
		
	}
	
	
}
