package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.FindLeadPage;
import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class TC005_DeleteLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testCaseDescription="Delete a Lead - LeafTaps";
		author="Gopinath Jayakumar";
		category="Sanity";
		dataSheetName="TC005";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String phoneNum,String errorMsg){

		String firstResultingLead =
			new LoginPage(driver, eachNode)
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()
				.clickCRMSFA()
				.clickLeadLink()		
				.clickFindLead()
				.clickPhoneTab()
				.enterPhoneNumberField(phoneNum)
				.clickFindleadsButton()
				.getFirstResultingLead();		
			new FindLeadPage(driver, eachNode)
				.clickFirstResultingLead()
				.clickDeleteLeadLink()
				.clickFindLead()
				.enterLeadId(firstResultingLead)
				.clickFindleadsButton()
				.verifyErrorMsg(errorMsg);
	}
}
