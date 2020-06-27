package com.orange.e2eTests.login.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.orange.e2eTests.util.AbstractPage;
import com.orange.e2eTests.util.ExcelUtils;

public class LoginExcelPage extends AbstractPage {

	public LoginExcelPage (WebDriver driver){

		super(driver);				
	}

	/*Locators*/

	final static String USER_NAME_ID = "txtUsername" ;
	final static String USER_PWD_ID = "txtPassword" ;
	final static String BTN_LOGIN_ID = "btnLogin" ;


	/*@FindBy*/            

	@FindBy(how=How.ID, using= USER_NAME_ID)
	public static WebElement userName;

	@FindBy(how=How.ID, using= USER_PWD_ID)
	public static WebElement userPwd;

	@FindBy(how=How.ID, using= BTN_LOGIN_ID)
	public static WebElement btnLogin;


	//Creation des methodes

	public static void singInXlsx() throws Exception {

		String sUserName = ExcelUtils.getCellData(1, 1);
		String sPasword = ExcelUtils.getCellData(1, 2);
		
		userName.sendKeys(sUserName);
		userPwd.sendKeys(sPasword);
		btnLogin.click();
	}
}
