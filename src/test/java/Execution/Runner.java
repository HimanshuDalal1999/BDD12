package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\AmazonFeatureFiles\\Amazon.feature"},
		
		glue = {"Execution"},
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"},
		
		tags = "@Normal",
		
		publish = true
)

public class Runner extends AbstractTestNGCucumberTests
{
	

}
