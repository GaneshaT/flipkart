package CucumberMap;

import java.util.Hashtable;

import Utility.HTMLReportGenerator;
import Utility.SeleniumOperation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCart 
{
	@When("user click on flipkart Logo")
	public void user_click_on_flipkart_logo() throws InterruptedException 
	{
		Thread.sleep(3000);
		Object [] input1 = new Object[1];
		input1[0] = "//*[@class='_2xm1JU']";
		
		  Hashtable<String,Object> ouput1=SeleniumOperation.ClickOnElement(input1);
	      HTMLReportGenerator.StepDetails(ouput1.get("STATUS").toString(), "user click on flipkart Logo", ouput1.get("MESSAGE").toString());
	}

	@When("user click on Mobile")
	public void user_click_on_mobile() throws InterruptedException 
	{
		Thread.sleep(3000);
		Object [] input2 = new Object[1];
		input2[0] ="(//*[@class='xtXmba'])[3]";
		
		 Hashtable<String,Object> ouput2=SeleniumOperation.ClickOnElement(input2);
	     HTMLReportGenerator.StepDetails(ouput2.get("STATUS").toString(), "user click on Mobile", ouput2.get("MESSAGE").toString());
	}

	@When("user click on Narzo Mobile")
	public void user_click_on_narzo_mobile() throws InterruptedException 
	{
		Thread.sleep(3000);
		Object [] input3 = new Object[1];
		input3[0] = "(//*[@class='_1aqDWQ'])[4]";
		
		Hashtable<String,Object> ouput3=SeleniumOperation.ClickOnElement(input3);
	    HTMLReportGenerator.StepDetails(ouput3.get("STATUS").toString(), "user click on Narzo Mobile", ouput3.get("MESSAGE").toString());
	}

	@When("user click on realme Narzo {int} Pro 5G \\(Blade Silver, {int} GB)")
	public void user_click_on_realme_narzo_pro_5g_blade_silver_gb(Integer int1, Integer int2) throws InterruptedException
	{
		Thread.sleep(3000);
		Object [] input4 = new Object[1];
		input4[0] = "(//*[@class='_4rR01T'])[1]";
		
		Hashtable<String,Object> ouput4=SeleniumOperation.ClickOnElement(input4);
	    HTMLReportGenerator.StepDetails(ouput4.get("STATUS").toString(), "user click on realme Narzo {int} Pro 5G \\(Blade Silver, {int} GB)", ouput4.get("MESSAGE").toString());
	}
	
	@When("user switch to tab")
	public void user_switch_to_tab() throws InterruptedException 
	{
		Thread.sleep(3000);
		   
	    Hashtable<String,Object>output5 =SeleniumOperation.SwitchtoTab();
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user navigate back on main page", output5.get("MESSAGE").toString());
	}


	@When("user click on add to cart")
	public void user_click_on_add_to_cart() throws InterruptedException 
	{
		Thread.sleep(3000);		
		Object [] input6 = new Object[1];
		input6[0] = "//*[@class='_1KOMV2']";
		
		Hashtable<String,Object>output6 =SeleniumOperation.ClickOnElement(input6);;
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user click on Add to cart", output6.get("MESSAGE").toString());
	}

		@When("user navigate back on main page")
	public void user_navigate_back_on_main_page() throws InterruptedException 
	{
		Thread.sleep(3000);
		   
	    Hashtable<String,Object>output7 =SeleniumOperation.SwitchtoDefaultTab();
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user navigate back on main page", output7.get("MESSAGE").toString());
	}
	
	@When("user click on cart")
	public void user_click_on_cart() throws InterruptedException
	{
		Thread.sleep(3000);		
		Object [] input8 = new Object[1];
		input8[0] = "//*[@class='KK-o3G']";
		
		Hashtable<String,Object>output8 =SeleniumOperation.ClickOnElement(input8);;
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user click on Cart", output8.get("MESSAGE").toString());
	}
	@Then("application shows item added successfully")
	public void application_shows_item_added_successfully() 
	{
		Object [] input9 = new Object[2];
		input9[0] = "realme Narzo 30 Pro 5G (Blade Silver, 128 GB)";
		input9[1] = "//*[text()='realme Narzo 30 Pro 5G (Blade Silver, 128 GB)']";
		Hashtable<String,Object>output9 =SeleniumOperation.ValidationbyGetText(input9 );
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "application shows item added successfully", output9.get("MESSAGE").toString());
	}



}
