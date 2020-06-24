package com.orange.e2eTests.radioCheckboxSelection.radioCheckboxSelectionPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.orange.e2eTests.util.AbstractPage;

public class RadioCheckSelectionPage extends AbstractPage {

	public RadioCheckSelectionPage (WebDriver driver){

		super(driver);				
	} 

	
	/*Locators*/

	final static String RADIO_1_XPATH = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label" ;
	final static String RADIO_2_XPATH = "//*[@id=\"genterWrapper\"]/div[2]/div[3]/label" ;
	final static String CHECKBOX_XPATH = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label" ;
	
	// //input[contains(@class='mr-sm-2 form-control')]
	


	/*@FindBy*/            

	@FindBy(how=How.XPATH, using= RADIO_1_XPATH)
	public static WebElement radio1;

	@FindBy(how=How.XPATH, using= RADIO_2_XPATH)
	public static WebElement radio2;

	@FindBy(how=How.XPATH, using= CHECKBOX_XPATH)
	public static WebElement checkbox;
	

	//Creation des methodes

	public void selectRadio1 () {
		radio1.click();
	}
	public void selectRadio2 () {
		radio2.click();
	}
	public void selectCheckbox () {
		checkbox.click();
	}

}
