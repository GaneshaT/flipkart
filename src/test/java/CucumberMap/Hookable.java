package CucumberMap;

import java.net.UnknownHostException;

import Utility.HTMLReportGenerator;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{
	@Before
	public void before(Scenario scenario) throws Throwable
	{
		HTMLReportGenerator.TestSuiteStart("D:\\Report\\flipkart.html", "flipkart");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("-----------------------------Scenario Start---------------------");
	}
	
	@After
	public void after(Scenario scenario)
	{
		System.out.println("-----------------------------Scenario End---------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
			
	}
	
	
	
	

}
