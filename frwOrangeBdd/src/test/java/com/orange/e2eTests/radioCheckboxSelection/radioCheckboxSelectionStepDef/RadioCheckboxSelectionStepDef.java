package com.orange.e2eTests.radioCheckboxSelection.radioCheckboxSelectionStepDef;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.radioCheckboxSelection.radioCheckboxSelectionPage.RadioCheckSelectionPage;
import com.orange.e2eTests.util.Common;
import com.orange.e2eTests.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RadioCheckboxSelectionStepDef extends Common  {
	public WebDriver driver;
	private RadioCheckSelectionPage pageRadio;
	public Common common;
	
	public RadioCheckboxSelectionStepDef() {

		driver=Setup.driver;
		common = new Common();
		pageRadio = new RadioCheckSelectionPage(driver);
	}
	
	@Given("^Authentification$")
	public void authentification() throws Throwable {
		
		
		JSONObject object = common.JsonData(0);
		String url = (String) object.get("URL");
		driver.get(url);
	   
	}

	@When("^je click sur le radio button(\\d+)$")
	public void jeClickSurLeRadioButton(int arg1) throws Throwable {
		PageFactory.initElements(driver, RadioCheckSelectionPage.class);
		pageRadio.selectRadio1();
		
	}

	@Then("^je vois le radio button(\\d+) selectionne$")
	public void jeVoisLeRadioButtonSelectionne(int arg1) throws Throwable {
		
	}

	@When("^je click sr le radio button(\\d+)$")
	public void jeClickSrLeRadioButton(int arg1) throws Throwable {
	 
		pageRadio.selectRadio2();
	}

	@When("^je clique sur le checkbox$")
	public void jeCliqueSurLeCheckbox() throws Throwable {
		pageRadio.selectCheckbox();
	   
	}

	@Then("^je vois le checkbox selectionne$")
	public void jeVoisLeCheckboxSelectionne() throws Throwable {

	}


}
