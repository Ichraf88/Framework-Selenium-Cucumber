package com.orange.e2eTests.login.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.orange.e2eTests.util.AbstractPage;

public class LoginPage extends AbstractPage {

	public LoginPage (WebDriver driver){

		super(driver);				
	}


	/*Locators*/

	final static String USER_NAME_ID = "txtUsername" ;
	final static String USER_PWD_ID = "txtPassword" ;
	final static String BTN_LOGIN_ID = "btnLogin" ;
	final static String WELCOME_ID = "welcome" ;


	/*@FindBy*/            

	@FindBy(how=How.ID, using= USER_NAME_ID)
	public static WebElement userName;

	@FindBy(how=How.ID, using= USER_PWD_ID)
	public static WebElement userPwd;

	@FindBy(how=How.ID, using= BTN_LOGIN_ID)
	public static WebElement btnLogin;
	
	@FindBy(how=How.ID, using= WELCOME_ID)
	public static WebElement welcome;
	
	
	//Creation des methodes

	public void saisirUserName () {
		userName.sendKeys("Admin");
	}
	public void saisirPwd () {
		userPwd.sendKeys("admin123");
	}
	public void clickBtnLogin () {
		btnLogin.click();
	}

}
