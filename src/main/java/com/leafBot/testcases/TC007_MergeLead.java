package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.FindLeadPopPage;
import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class TC007_MergeLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues(){
		testCaseName = "TC007_MergeLead";
		testCaseDescription = "Merge two Lead on LeafTaps";		
		author = "Gopinath Jayakumar";
		category = "Regression";
		dataSheetName = "TC007";
	}

	@Test(dataProvider = "fetchData")
	public void mergeLead(String uName, String pwd,String fLeadName,String lLeadName, String errorMsg){
		String fromLeadId = 
			new LoginPage(driver, eachNode)
				.enterUserName(uName)
				.enterPassword(pwd)
				.clickLogin()
				.clickCRMSFA()
				.clickLeadLink()
				.clickMergeLead()
				.clickFromLeadLookup()
				.enterFirstName(fLeadName)
				.clickFindleadsButton()
				.getFirstResultingLead();
			new FindLeadPopPage(driver, eachNode)
				.clickResultingLeads()
				.clickToLeadLookup()
				.enterFirstName( lLeadName)
				.clickFindleadsButton()
				.clickResultingLeads()
				.clickMergeButton()
				.clickFindLead()
				.enterLeadId(fromLeadId)
				.clickFindleadsButton()
				.verifyErrorMsg(errorMsg);

	}


}










