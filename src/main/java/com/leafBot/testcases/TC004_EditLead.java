package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class TC004_EditLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testCaseDescription="Edit excisting Lead on LeafTaps";
		author="Gopinath Jayakumar";
		category="Sanity";
		dataSheetName="TC004";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password , String f_Name, String updcompanyName){

		new LoginPage(driver, eachNode)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickFindLead()
		.enterFirstName(f_Name)
		.clickFindleadsButton()
		.clickFirstResultingLead()
		.clickEditLeadLink()
		.updateCompanyName(updcompanyName)
		.clickUpdateSubmit()
		.verifyCompanyName(updcompanyName);
		
	}

}
