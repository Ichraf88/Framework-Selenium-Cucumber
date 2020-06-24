package com.orange.e2eTests.doubleClick.doubleClickPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.interactions.Actions;

import com.orange.e2eTests.util.AbstractPage;


public class DoubleClickPage extends AbstractPage {
	
	public DoubleClickPage (WebDriver driver){

		super(driver);				
	} 
	
	/*Locators*/
	
	final static String ELEMENT_ID = "doubleClickBtn" ;
	final static String MSG_ID = "doubleClickMessage" ;
	/*@FindBy*/            

	@FindBy(how=How.ID, using= ELEMENT_ID)
	public static WebElement doubleclick;
	@FindBy(how=How.ID, using= MSG_ID)
	public static WebElement doubleclickMsg;


	

	//Creation des methodes

	public void doubleclickButton () throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleclick).perform();	
	}
	
	
}
