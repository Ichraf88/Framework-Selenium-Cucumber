package com.orange.e2eTests.checkBxRadioLoop.checkBxRadioLoopStepDef;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.checkBxRadioLoop.checkBxRadioLoopPage.CheckBxRadioLoopPage;
import com.orange.e2eTests.util.Common;
import com.orange.e2eTests.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CheckBxRadioLoopStepDef {
	
	
	public WebDriver driver;
	public Common common;
	private CheckBxRadioLoopPage checkBxRadioLoop;
	
	
	public CheckBxRadioLoopStepDef() {

		driver=Setup.driver;
		common = new Common();
		checkBxRadioLoop = new CheckBxRadioLoopPage(driver);
	}
	
	@Given("^Authentification sur la page$")
	public void authentificationSurLaPage() throws Throwable {
	    
		JSONObject object = common.JsonData(3);
		String url = (String) object.get("URL");
		driver.get(url);
		
	}

	@When("^je click sur le radio button$")
	public void jeClickSurLeRadioButton() throws Throwable {

		PageFactory.initElements(driver, CheckBxRadioLoopPage.class);
		checkBxRadioLoop.checkRadioButton1 ();
		
	}

	@When("^je click sur le deuxieme radio button$")
	public void jeClickSurLeDeuxiemeRadioButton() throws Throwable {
	   
		checkBxRadioLoop.checkRadioButton2();
		
		
	}

	@When("^je click sur le checkBox$")
	public void jeClickSurLeCheckBox() throws Throwable {
	    
		checkBxRadioLoop.checkBox();
		
		
	}

}
