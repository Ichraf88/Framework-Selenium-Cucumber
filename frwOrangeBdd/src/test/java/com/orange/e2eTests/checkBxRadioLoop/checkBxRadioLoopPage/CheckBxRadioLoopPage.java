package com.orange.e2eTests.checkBxRadioLoop.checkBxRadioLoopPage;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.orange.e2eTests.util.AbstractPage;

public class CheckBxRadioLoopPage extends AbstractPage {
	
	public CheckBxRadioLoopPage (WebDriver driver){

		super(driver);				
	} 
	
/*Locators*/
	
	final static String RADIO_NAME = "sex" ;
	final static String RD_BTN_ID = "exp-2" ;
	final static String CHECK_BTN_NAME = "profession" ;
	/*@FindBy*/            

	@FindBy(how=How.NAME, using= RADIO_NAME)
	public static List<WebElement> radioClick;
	@FindBy(how=How.ID, using= RD_BTN_ID)
	public static WebElement radioBtn;
	@FindBy(how=How.NAME, using= CHECK_BTN_NAME)
	public static List<WebElement> checkBtn;


	//Creation des methodes

		public void checkRadioButton1 () throws InterruptedException {

			List<WebElement> rdBtn_Sex = radioClick;

			boolean bValue = false;	
			bValue = rdBtn_Sex.get(0).isSelected();		
			if(bValue == true){

				rdBtn_Sex.get(1).click();

			}else{

				rdBtn_Sex.get(0).click();
			}

		}
		
		
		public void checkRadioButton2 () throws InterruptedException {
		
		
			WebElement rdBtn_Exp = radioBtn ;
		    rdBtn_Exp.click();
		}
		
		public void checkBox () throws InterruptedException {
			
			// STep 5: Check the Check Box 'Automation Tester' for category 'Profession'( Use Value attribute to match the seection)
			// Find the Check Box or radio button element by Name
			List<WebElement> chkBx_Profession = checkBtn;

			//This will tell you the number of Check Boxes are present
			int iSize = chkBx_Profession.size();

			//	Start the loop from first Check Box to last Check Boxe
			for(int i=0; i < iSize ; i++ ){

				// Store the Check Box name to the string variable, using 'Value' attribute
				String sValue = chkBx_Profession.get(i).getAttribute("value");

				// Select the Check Box it the value of the Check Box is same what you are looking for
				if (sValue.equalsIgnoreCase("Automation Tester")){
					chkBx_Profession.get(i).click();

					// This will take the execution out of for loop
					break;
				}
			
		}

		}
	
	
	}
	
	
	

	

	