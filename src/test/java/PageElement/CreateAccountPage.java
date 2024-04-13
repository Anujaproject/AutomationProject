package PageElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateAccountPage {
	WebDriver driver;

	public CreateAccountPage(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	// Repository
	@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[3]/a[1]")
	WebElement ClickOnCreateAc;
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement Fname;
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement Lname;
	@FindBy(xpath = "//input[@id='email_address']")
	WebElement Email;
	@FindBy(xpath = "//input[@id='password']")
	WebElement pass;
	@FindBy(xpath = "//input[@id='password-confirmation']")
	WebElement ConFPass;
	@FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement ClickonCreateAccbtn;
	@FindBy(xpath = "//body/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]") WebElement VerifyExistingEmail;

	public void url(){
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	public void ClickOnCreateAclink() {
		ClickOnCreateAc.click();
	}

	public void CreateAccount() {
		Fname.sendKeys("Anuja");
		Lname.sendKeys("Mane");
		Email.sendKeys("anuja@gmail.com");
		pass.sendKeys("anu@12345");
		ConFPass.sendKeys("anu@12345");
		ClickonCreateAccbtn.click();

	}
	
	public void CreateAccountWithExistingEmail()
	{
		Fname.sendKeys("Anuja");
		Lname.sendKeys("Mane");
		Email.sendKeys("anuja@gmail.com");
		pass.sendKeys("anu@12345");
		ConFPass.sendKeys("anu@12345");
		ClickonCreateAccbtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Assert.assertEquals(VerifyExistingEmail.getText(), "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");
		System.out.println("Email Address already exist!");
	}

}
