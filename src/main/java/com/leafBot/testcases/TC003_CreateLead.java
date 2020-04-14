package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC003_CreateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testCaseDescription="Create a new Lead on LeafTaps";	
		author="Gopinath Jayakumar";
		category="Smoke";
		dataSheetName="TC003";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String comnyName, String firstName, String lastName, String eMail){
		new LoginPage(driver, eachNode)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickCreateLead()
		.enterCompanyName(comnyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(eMail)
		.clickCreateLeadSubmit()		
		.verifyFirstName(firstName);			
	}
}
