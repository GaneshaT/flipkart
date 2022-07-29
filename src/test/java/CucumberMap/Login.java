package CucumberMap;

import java.util.Hashtable;

import Utility.HTMLReportGenerator;
import Utility.SeleniumOperation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login 
{

	@Given("user open browser with {string} and {string}")
	public void user_open_browser_with_and(String string, String string2) 
	{ Object [] input1=new Object[2];
    input1[0]=string;
    input1[1]=string2;
    SeleniumOperation.browserlaunch(input1);
	}
	@Given("user enter url as {string}")
	public void user_enter_url_as(String string) 
	{
		Object [] input2= new Object[2];
        input2[0]=string;
    SeleniumOperation.OpenApplication(input2);
	}

	@When("user click on initial login page")
	public void user_click_on_initial_login_page() 
	{  Object [] input3= new Object[2];
    input3[0]="//*[@class='_2KpZ6l _2doB4z']";
   SeleniumOperation.ClickOnElement(input3);

	}

	@When("user navigate on login button")
	public void user_navigate_on_login_button() 
	{
		 Object [] input4= new Object[2];
         input4[0]="//*[@class='_1_3w1N']";
   Hashtable<String,Object> ouput4=SeleniumOperation.MoveToElement(input4);
   HTMLReportGenerator.StepDetails(ouput4.get("STATUS").toString(), "user navigate on login button", ouput4.get("MESSAGE").toString());
	}

	@When("user click on my profile")
	public void user_click_on_my_profile() 
	{
		 Object [] input5= new Object[2];
         input5[0]="//*[text()='My Profile']";
         Hashtable<String,Object> ouput5=SeleniumOperation.ClickOnElement(input5);
         HTMLReportGenerator.StepDetails(ouput5.get("STATUS").toString(), "user click on my profile", ouput5.get("MESSAGE").toString());
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String string) 
	{
		Object [] input6= new Object[2];
        input6[0]="//*[@class='_2IX_2- VJZDxU']";
        input6[1]=string;
        Hashtable<String,Object> ouput6=SeleniumOperation.SendTextOnUi(input6);
        HTMLReportGenerator.StepDetails(ouput6.get("STATUS").toString(), "user enter {string} as username", ouput6.get("MESSAGE").toString());

	}
	@When("user enter {string} as password")
	public void user_enter_as_password(String string) 
	{
		  Object [] input7= new Object[2];
	         input7[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
	         input7[1]=string;
	         Hashtable<String,Object> ouput7=SeleniumOperation.SendTextOnUi(input7);
	         HTMLReportGenerator.StepDetails(ouput7.get("STATUS").toString(), "user enter {string} as password", ouput7.get("MESSAGE").toString());
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
		 Object [] input8= new Object[2];
         input8[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
         Hashtable<String,Object> ouput8=SeleniumOperation.ClickOnElement(input8);
         HTMLReportGenerator.StepDetails(ouput8.get("STATUS").toString(), "user click on login button", ouput8.get("MESSAGE").toString());
	}
	@Then("Application shows login successfully")
	public void application_shows_login_successfully() 
	{
		Object [] input9 = new Object[2];
		input9[0] = "Personal Information";
		input9[1] = "//*[text()=\"Personal Information\"]";
		Hashtable<String,Object> ouput9=SeleniumOperation.ValidationbyGetText(input9 );
		 HTMLReportGenerator.StepDetails(ouput9.get("STATUS").toString(), "Application shows login successfully", ouput9.get("MESSAGE").toString());
	}
	
}
