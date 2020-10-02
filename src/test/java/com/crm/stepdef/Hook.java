package com.crm.stepdef;

import static org.testng.Assert.fail;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.erp.hrms.utility.BaseUtilityPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseUtilityPage{

	
	@Before
    public void before(Scenario scenario) throws InterruptedException, IOException
    {
		System.out.println("Running Scenario: "+scenario.getName());
        init_chrome_browser();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.get(credentail_prop.getURL());
	   
	    Thread.sleep(5000);
		if(!driver.getTitle().equals("Cogmento CRM"))
		{
			fail("Login Launch Failed");
		}
		
		
	}
 
    @After
    public void after(Scenario scenario) throws Exception
    {
    	
    	if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser");
        driver.close();
    	driver.quit();
    }
}
