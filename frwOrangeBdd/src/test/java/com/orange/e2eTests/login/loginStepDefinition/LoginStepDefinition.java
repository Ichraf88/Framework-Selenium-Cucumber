package com.orange.e2eTests.login.loginStepDefinition;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.login.loginPage.LoginPage;
import com.orange.e2eTests.util.Common;
import com.orange.e2eTests.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends Common {

	public WebDriver driver;
	public Common common = new Common();
	private LoginPage loginPage = new LoginPage(driver);

	public LoginStepDefinition() {

		driver=Setup.driver;
	}

	@Given("^ouvrir l application Orange$")
	public void ouvrirLApplicationOrange() throws Throwable {

		logger.info("Ouvrir l'application Orange");
		JSONObject object = common.JsonData(0);
		String url = (String) object.get("URL"); //Via un fichier JSON
		driver.get(url);
		/*String url = "https://opensource-demo.orangehrmlive.com"; //Comportenment normal
		driver.get(url);*/ 
	}

	@When("^saisir non utilisateur$")
	public void saisirNonUtilisateur() throws Throwable {

		logger.info("Saisie du Login");
		PageFactory.initElements(driver, LoginPage.class);
		loginPage.saisirUserName();
	}

	@When("^saisir mot de passe$")
	public void saisirMotDePasse() throws Throwable {

		logger.info("Sasie du Mot de passe");
		loginPage.saisirPwd();

	}

	@When("^cliquer sur bouton login$")
	public void cliquerSurBoutonLogin() throws Throwable {

		logger.info("Click sur le bouton Login");
		loginPage.clickBtnLogin();
	}

	@Then("^redirection vers la page home$")
	public void redirectionVersLaPageHome() throws Throwable {

		logger.info("Redirection reussie");
		String assertPage = LoginPage.welcome.getText();
		Assert.assertTrue(assertPage.contains("Welcome Admin") );

	}



}
