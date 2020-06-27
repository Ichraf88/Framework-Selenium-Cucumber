package com.orange.e2eTests.login.loginStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.login.loginPage.LoginExcelPage;
import com.orange.e2eTests.login.loginPage.LoginPage;
import com.orange.e2eTests.util.Constant;
import com.orange.e2eTests.util.ExcelUtils;
import com.orange.e2eTests.util.Setup;

import cucumber.api.java.en.When;

public class LoginExcelStepDefinition {

	public WebDriver driver;

	public LoginExcelStepDefinition() {

		driver=Setup.driver;
	}
	
	@When("^se connecter sur l'application Orange$")
	public void seConnecterSurLApplicationOrange() throws Throwable {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		PageFactory.initElements(driver, LoginExcelPage.class);
		PageFactory.initElements(driver, LoginPage.class);
		LoginExcelPage.singInXlsx();
		ExcelUtils.setCellData("Pass", 1, 3);//pour ajouter un message dans le fichier excel apres l'execution
		
	}

}
