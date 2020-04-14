package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_LoginForFailure extends ProjectSpecificMethods{

	@BeforeTest
	public void setValues() {
		testCaseName = "Login(Negative)";
		testCaseDescription = "Login for Failure(Negative testCase)";
		author = "Gopinath Jayakumar";
		category = "Smoke";
		dataSheetName = "TC002";
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd, String errMsg) {
		new LoginPage(driver, eachNode)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogInForFailer()
		.verifyErrorMsg(errMsg);
	}
}





