package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class FindLeadPopPage extends ProjectSpecificMethods {
	
	public FindLeadPopPage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("Find Leads")) {
			reportStep("This is not Find Leads", "Fail");
		}
	}


	public FindLeadPopPage enterFirstName(String findfistname){
		WebElement elefindFirstName = locateElement("name", prop.getProperty("FindLeadP.FirstName.Name"));
		clearAndType(elefindFirstName, findfistname);
		return this;
	}

	public FindLeadPopPage clickFindleadsButton(){
		WebElement eleFindleadsButton = locateElement("xpath", prop.getProperty("FindLeadP.Findleads.Xpath"));
		click(eleFindleadsButton);
		return this;
	}
	
	public String getFirstResultingLead(){	
		WebElement eleGetResultingLeads = locateElement("xpath", prop.getProperty("FindLeadP.FirstResultLead.Xpath"));
		return getElementText(eleGetResultingLeads);
	}

	public MergeLeadPage clickResultingLeads(){
		WebElement eleResultingLeads = locateElement("xpath", prop.getProperty("FindLeadP.FirstResultLead.Xpath"));
		clickWithNoSnap(eleResultingLeads);
		switchToWindow(0);
		return new MergeLeadPage(driver, eachNode);
	}
}