package CucumberMap;

import java.util.Hashtable;

import Utility.HTMLReportGenerator;
import Utility.SeleniumOperation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageAddress 
{
	@When("user click on Manage addresses")
	public void user_click_on_manage_addresses() throws InterruptedException 
	{
		Thread.sleep(3000);
		Object [] input1 = new Object[1];
		input1[0] = "//*[@class='NS64GK']";
		SeleniumOperation.ClickOnElement(input1);
	}

	@When("user click on Add New address")
	public void user_click_on_add_new_address() throws InterruptedException 
	{
		Thread.sleep(3000);
		Object [] input2 = new Object[1];
		input2[0] = "//*[@class='_1QhEVk']";
		SeleniumOperation.ClickOnElement(input2);
	}

	@When("user enetr {string} as Name")
	public void user_enetr_as_name(String string)
	{
		Object [] input3 = new Object[2];
		input3[0] = "//*[@name='name']";
		input3[1] = string;
		Hashtable<String,Object>output3 =SeleniumOperation.SendTextOnUi(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user enter {string} as Name", output3.get("MESSAGE").toString());
	}

	@When("user enter {string} as phone number")
	public void user_enter_as_phone_number(String string) 
	{
		Object [] input4 = new Object[2];
		input4[0] = "//*[@name='phone']";
		input4[1] = string;
		Hashtable<String,Object>output4 =SeleniumOperation.SendTextOnUi(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enter {string} as phone number", output4.get("MESSAGE").toString());
	}

	@When("user enetr {string} as pincode")
	public void user_enetr_as_pincode(String string) 
	{
		Object [] input5 = new Object[2];
		input5[0] ="//*[@name='pincode']";
		input5[1] = string;
		Hashtable<String,Object>output5 =SeleniumOperation.SendTextOnUi(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter {string} as pincode", output5.get("MESSAGE").toString());
	}

	@When("user enter {string} as locality")
	public void user_enter_as_locality(String string) 
	{
		Object [] input6 = new Object[2];
		input6[0] ="//*[@name='addressLine2']";
		input6[1] = string;
		Hashtable<String,Object>output5 =SeleniumOperation.SendTextOnUi(input6);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter {string} as Locality", output5.get("MESSAGE").toString());
	}

	@When("user enetr {string} as address")
	public void user_enetr_as_address(String string) 
	{
		Object [] input7 = new Object[2];
		input7[0] ="//*[@name='addressLine1']";
		input7[1] = string;
		Hashtable<String,Object>output7 =SeleniumOperation.SendTextOnUi(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user enter {string} as Address", output7.get("MESSAGE").toString());

	}
	@When("user enter {string} as city")
	public void user_enter_as_city(String string) 
	{
		Object [] input8 = new Object[2];
		input8[0] ="//*[@name='city']";
		input8[1] = string;
		Hashtable<String,Object>output8 =SeleniumOperation.SendTextOnUi(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user enter {string} as city", output8.get("MESSAGE").toString());
	}

	@When("user click on state dropdown and click on {string}")
	public void user_click_on_state_dropdown_and_click_on(String string) 
	{
		Object [] input9 = new Object[2];
		input9[0] ="//*[@name='state']";
		input9[1] = string;
		Hashtable<String,Object>output9 =SeleniumOperation.SelectText(input9);;
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "user click on state dropdown and click on {string}", output9.get("MESSAGE").toString());
	}

	@When("user enter {string} as landmark")
	public void user_enter_as_landmark(String string) 
	{
		Object [] input10 = new Object[2];
		input10[0] ="//*[@name='landmark']";
		input10[1] = string;
		Hashtable<String,Object>output10 =SeleniumOperation.SendTextOnUi(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "user enter {string} as Landmark", output10.get("MESSAGE").toString());

	}

	@When("user enter {string} as alternate phone number")
	public void user_enter_as_alternate_phone_number(String string) 
	{
		Object [] input11= new Object[2];
		input11[0] ="//*[@name='alternatePhone']";
		input11[1] = string;
		Hashtable<String,Object>output11 =SeleniumOperation.SendTextOnUi(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "user enter {string} as alternate phone number", output11.get("MESSAGE").toString());
	}

	@When("user click {string} as as address type")
	public void user_click_as_as_address_type(String string) 
	{
		Object [] input12 = new Object[1];
		input12[0] = "//*[@class='_2jIO64']";
		Hashtable<String,Object>output12 =SeleniumOperation.ClickOnElement(input12);
		HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "user click {string} as address type", output12.get("MESSAGE").toString());

	}

	@When("user click on save button")
	public void user_click_on_save_button() 
	{
		Object [] input13 = new Object[1];
		input13[0] = "//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL'] | //*[text()='SAVE']";
		Hashtable<String,Object>output13 =SeleniumOperation.ClickOnElement(input13);
		HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(), "user click on Save button", output13.get("MESSAGE").toString());
	}

	@Then("application shows address saved successfully")
	public void application_shows_address_saved_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
