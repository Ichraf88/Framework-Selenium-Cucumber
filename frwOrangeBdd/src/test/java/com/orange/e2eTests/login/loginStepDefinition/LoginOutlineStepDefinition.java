package com.orange.e2eTests.login.loginStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.orange.e2eTests.login.loginPage.LoginOutlinePage;
import com.orange.e2eTests.util.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginOutlineStepDefinition {

	public WebDriver driver;

	public LoginOutlineStepDefinition() {

		driver=Setup.driver;
	}

	@Given("^Lancer l'application Orange$")
	public void lancerLApplicationOrange() throws Throwable {

		String url = "https://opensource-demo.orangehrmlive.com";
		driver.get(url);
	}

	@When("^je saisie mon identifiant \"([^\"]*)\"$")
	public void jeSaisieMonIdentifiant(String identifiants) throws Throwable {

		PageFactory.initElements(driver, LoginOutlinePage.class);
		LoginOutlinePage.setUserName(identifiants);

	}

	@When("^je saisie mon Mot de passe \"([^\"]*)\"$")
	public void jeSaisieMonMotDePasse(String password) throws Throwable {

		LoginOutlinePage.setUserPw(password);
	}

	@When("^je clique sur login$")
	public void jeCliqueSurLogin() throws Throwable {

		LoginOutlinePage.cliclgn();
	}


}
