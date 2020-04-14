package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("This is not Create Lead Page", "Fail");
		}
	}

	public CreateLeadPage enterCompanyName(String data) {
		WebElement eleCompanyName = locateElement("id", prop.getProperty("CreateLead.company.id"));
		clearAndType(eleCompanyName, data);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String data) {
		WebElement eleFirstName = locateElement("id", prop.getProperty("CreateLead.fName.id"));
		clearAndType(eleFirstName, data);
		return this;
	}
	public CreateLeadPage enterLastName(String data) {
		WebElement eleLastName = locateElement("id", prop.getProperty("CreateLead.lName.id"));
		clearAndType(eleLastName, data);
		return this;
	}
	public CreateLeadPage enterEmail(String data) {
		WebElement eleLastName = locateElement("id", prop.getProperty("CreateLead.eMail.id"));
		clearAndType(eleLastName, data);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadSubmit() {
		WebElement eleCreateLead= locateElement("name", prop.getProperty("CreateLead.createLead.name"));
		click(eleCreateLead);
		return new ViewLeadPage(driver, eachNode); 
	}
	
}