package com.crmTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		features ={"src/test/java/com/crmfeature"},
		glue={"com.crm.stepdef"},
		monochrome = true,
		dryRun = false,
		tags = ("@crmscenario"))


public class FirstCRMTestRunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider
    //@DataProvider (parallel = true) -- For parallel execution support (which is not going to work for our code)
    public Object[][] scenarios() {
        return super.scenarios();
    }

	
}
