package Execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.DriverFactory;
import Pages.PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
	WebDriver driver = DriverFactory.GetDriver();
	PomClass pom = new PomClass(DriverFactory.GetDriver());
	Assert AS;
//=====================1st Test Case=================================
	@Given("User should be at Home page")
	public void UsershouldbeatHomepage()
	{
		driver.get("https://www.amazon.in");
	}
	@Then("User should be able to see Logo of the Amazon")
	public void UsershouldbeableoseeLogooftheAmazon()
	{
		boolean Logo = pom.VerifyLogo();
		AS.assertTrue(Logo);
	}
//=====================2nd Test Case=================================
	@When("User enters {string} in the search box and click on Search button")
	public void user_enters_in_the_search_box_and_click_on_search_button(String SearchIphone) 
	{
	    pom.EnterSearchBox(SearchIphone);
	}
	@Then("Logo of Iphone should get displayed")
	public void logo_of_iphone_should_get_displayed() 
	{
	    boolean Logo = pom.VerifyIphoneLogo();
	    AS.assertTrue(Logo);
	}
//=====================3rd Test Case=================================
	@When("User clicks on Ambipure image")
	public void UserclicksonAmbipurimage()
	{
//		driver.navigate().back();
//		driver.navigate().refresh();
		pom.ClickingAmbiPure();
	}
	@Then("User should redirects to Car Accessories page")
	public void UsershouldredirectstoCarAccessoriespage()
	{
		boolean CarAccessories = pom.VerifyCarAccessoriesPage();
		AS.assertTrue(CarAccessories);
	}
	//=====================4th Test Case=================================
	@When("User clicks on Headphones Carousel")
	public void UserclicksonHeadphonesCarousel()
	{
//		driver.navigate().back();
//		driver.navigate().refresh();
		pom.clickingHeadphoneCaraousel();
	}
	@Then("User should be able to see multiple Headphones")
	public void UsershouldbeabletoseemultipleHeadphones()
	{
		boolean VMH = pom.VerifyingMultipleHeadphones();
		AS.assertTrue(VMH);
	}
	//=====================5th Test Case=================================
	@When("User enters {string} in the search box")
	public void Userentersinthesearchbox(String Value)
	{
		pom.EnteringValueSearchBox(Value);
	}
	@When("Clicks on Search button")
	public void ClicksonSearchbutton()
	{
		
	}
	@When("Click on Product")
	public void ClickonProduct()
	{
		
	}
	@When("Click on Add to Cart button")
	public void ClickonAddtoCartbutton()
	{
		
	}
	@Then("Product should gets added in the Cart")
	public void ProductshouldgetsaddedintheCart()
	{
		boolean Cart = pom.VerifyCart();
		AS.assertTrue(Cart);
	}

}
