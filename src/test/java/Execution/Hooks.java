package Execution;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Report;

import Pages.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks 
{
	
	static WebDriver driver;
	
	
	
	@BeforeAll
	public static void OpenBrowser()
	{
		 DriverFactory DF = new DriverFactory();
		 driver = DF.InitializeBrowser("Chrome");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@After
	public void CaptureScreenshot(Scenario scenario)
	{
	//	if(scenario.isFailed())
	//	{
			String ScenarioName = scenario.getName();
			String ScenarioNameAfter = ScenarioName.replaceAll(" ", "_");
			byte[] Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(Screenshot, "image/png", ScenarioNameAfter);
	//	}
	}
	
	
	@AfterAll
	public static void CloseBrowser() throws IOException, InterruptedException
	{
			driver.quit();
			Desktop.getDesktop().browse(new File("test-output\\SparkReport\\Index.html").toURI());
	}

	
	
}
