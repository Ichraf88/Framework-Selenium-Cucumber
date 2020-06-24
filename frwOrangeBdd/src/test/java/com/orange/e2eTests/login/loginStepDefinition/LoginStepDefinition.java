package com.orange.e2eTests.login.loginStepDefinition;

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
	private LoginPage loginPage = new LoginPage(driver);

	public LoginStepDefinition() {

		driver=Setup.driver;
	}

	@Given("^ouvrir l application Orange$")
	public void ouvrirLApplicationOrange() throws Throwable {

		logger.info("Ouverture de l'application Orange");
		String url = "https://opensource-demo.orangehrmlive.com";
		driver.get(url);
	}

	@When("^saisir non utilisateur$")
	public void saisirNonUtilisateur() throws Throwable {

		PageFactory.initElements(driver, LoginPage.class);
		logger.info("Saisir User Name");
		loginPage.saisirUserName();
	}

	@When("^saisir mot de passe$")
	public void saisirMotDePasse() throws Throwable {

		logger.info("Saisir Password");
		loginPage.saisirPwd();

	}

	@When("^cliquer sur bouton login$")
	public void cliquerSurBoutonLogin() throws Throwable {

		logger.info("Cliquer sur le bouton login");
		loginPage.clickBtnLogin();
	}

	@Then("^redirection vers la page home$")
	public void redirectionVersLaPageHome() throws Throwable {

		logger.info("Assert redirection vers le compte Admin");
		String assertPage = LoginPage.welcome.getText();
		Assert.assertTrue(assertPage.contains("Welcome Admin") );
		
	}



}
