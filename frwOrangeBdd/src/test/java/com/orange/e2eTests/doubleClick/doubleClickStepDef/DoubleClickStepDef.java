package com.orange.e2eTests.doubleClick.doubleClickStepDef;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.orange.e2eTests.doubleClick.doubleClickPage.DoubleClickPage;
import com.orange.e2eTests.util.Common;
import com.orange.e2eTests.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DoubleClickStepDef {
	public WebDriver driver;
	private DoubleClickPage doubleClick;
	public Common common;
	
	public DoubleClickStepDef() {

		driver=Setup.driver;
		common = new Common();
		doubleClick = new DoubleClickPage(driver);
	}
	@Given("^je suis connecte sur le site$")
	public void jeSuisConnecteSurLeSite() throws Throwable {
	 
		JSONObject object = common.JsonData(2);
		String url = (String) object.get("URL");
		driver.get(url);
	}

	@When("^je fais un double click$")
	public void jeFaisUnDoubleClick() throws Throwable {
		
		PageFactory.initElements(driver, DoubleClickPage.class);
		
		doubleClick.doubleclickButton();
	
	}
	
	@Then("^je vois un msg$")
	public void jeVoisUnMsg() throws Throwable {
		
		SoftAssert softassert = new SoftAssert();
		//String Msg = DoubleClickPage.doubleclickMsg.getText();
		//Assert.assertTrue(Msg.contains("You have done a double click"));
		String ActualTitle = DoubleClickPage.doubleclickMsg.getText();
		System.out.println("message " +ActualTitle);
		String ExpectedTitle = "jdfksgdfj";
		softassert.assertEquals(ActualTitle, ExpectedTitle);
		softassert.assertAll();
		System.out.println("aaaaaaaaaaaaa");
	 
	}


}
