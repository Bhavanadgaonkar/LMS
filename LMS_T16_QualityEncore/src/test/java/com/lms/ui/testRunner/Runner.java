package com.lms.ui.testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\Features"},
		glue = {"com.lms.ui.stepDefinitions", "com.lms.ui.appHooks"},
		plugin = {"pretty","html:target/lms_team16.html","json:target/lms_team16.json",
				"junit:target/cucumber-reports/cucumber.xml",
			"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false
		
		
		)

public class Runner {

}
