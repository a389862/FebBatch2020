package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class DuplicateLeadPage extends ProjectSpecificMethods {
	
	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("Duplicate Lead | opentaps CRM")) {
			reportStep("This is not Duplicate Lead", "Fail");
		}
	}

	public ViewLeadPage clickCreateLeadDuplicate(){
		WebElement eleCreateLeadDublicate = locateElement("class", prop.getProperty("DuplicateLead.cLead.class"));
		click(eleCreateLeadDublicate);
		return new ViewLeadPage(driver, eachNode);
	}
}
