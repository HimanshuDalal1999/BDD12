package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PomClass 
{
	WebDriver driver;
	WebDriverWait wait;


	@FindBy ( id = "nav-logo-sprites") private WebElement verifyLogo;
	@FindBy (id = "twotabsearchtextbox") private WebElement enteringSearchBox;
	@FindBy (id = "nav-search-submit-button") private WebElement clickingSearchBox;
	@FindBy (xpath = "//span[text()='iPhone 15 Pro Max. Titanium']/parent::span") private WebElement Iphone;
	@FindBy (id = "CardInstanceD329mCEy_HUmQ5AMJHHcIQ") private WebElement clickingAmbipure;
	@FindBy (xpath = "//img[@alt='Car Accessories']") private WebElement verifyingCarAccessories;
	@FindBy (id = "gw-ftGr-desktop-hero-5") private WebElement clickingHeadphone;
	@FindBy (xpath = "//span[text()='Results']") private WebElement verifyingMultipleHeadphones;
	@FindBy (id = "nav-logo-sprites") private WebElement AmazonLogo;
	@FindBy (xpath = "//span[text()='Joyride Run Fk Fc Mens TECH']") private WebElement Product02;
	@FindBy (id = "add-to-cart-button") private WebElement clickingAddtoCart;
	@FindBy (id = "nav-cart-count-container") private WebElement clickingCart;
	@FindBy (xpath = "//span[text()='Nike Joyride Run FK FC-Black/Speed YELL-CT1521-001-6UK']/ancestor::li") private WebElement verifyingProductDisplayinCart;

	
//=========================================================	
	public PomClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//========================================================
//------------------------------------------1st Test Case-----------------------------------------------------------------
	public boolean VerifyLogo()
	{
		boolean Logo = verifyLogo.isDisplayed();
		return Logo;
	}
	public void EnterSearchBox(String Text)
	{
		enteringSearchBox.sendKeys(Text);
		clickingSearchBox.click();
//--------------------------------------------2nd Test Case------------------------------------------------------------------		
	}
	public boolean VerifyIphoneLogo()
	{
		boolean iphone = Iphone.isDisplayed();
		return iphone;
	}
//---------------------------------------------3rd Test Case-------------------------------------------------------------------	
	public void ClickingAmbiPure()
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(clickingAmbipure));
		clickingAmbipure.click();
	}
	public boolean VerifyCarAccessoriesPage()
	{
		boolean CarAccessories = verifyingCarAccessories.isDisplayed();
		return CarAccessories;
	}
//-----------------------------------------------4th Test Case-------------------------------------------------------------------	
	public void clickingHeadphoneCaraousel()
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(clickingHeadphone));
		clickingHeadphone.click();
	}
	public boolean VerifyingMultipleHeadphones()
	{
		boolean VMH = verifyingMultipleHeadphones.isDisplayed();
		return VMH;
	}
//-----------------------------------------------5th Test Case-------------------------------------------------------------------	
	public void EnteringValueSearchBox(String TextProduct01)
	{
		enteringSearchBox.sendKeys(TextProduct01);
		clickingSearchBox.click();
		Product02.click();
		 Set<String> AllIDs = driver.getWindowHandles();
		 ArrayList<String> AL = new ArrayList<String>(AllIDs);
		 driver.switchTo().window(AL.get(1));
	//	 Product02.click();
		 clickingAddtoCart.click();
		 clickingCart.click();
	}
	public boolean VerifyCart()
	{
		boolean ProductDisplay = verifyingProductDisplayinCart.isDisplayed();
		return ProductDisplay;
	}
	
	
	
	
	
	
	
}
