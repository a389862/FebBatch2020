package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("This is not View Page", "Fail");
		}
	}

	public ViewLeadPage verifyFirstName(String fname) {
		WebElement eleLeadLink = locateElement(prop.getProperty("ViewLead.fName.id"));
		verifyPartialText(eleLeadLink, fname);
		return this;
	}

	public EditLeadPage clickEditLeadLink() {		
		WebElement eleedit = locateElement("link", prop.getProperty("ViewLead.eLead.link"));
		click(eleedit);
		return new EditLeadPage(driver, eachNode);
	}

	public ViewLeadPage verifyCompanyName(String cName) {
		WebElement eleLeadLink = locateElement("id", prop.getProperty("ViewLead.cName.id"));
		verifyPartialText(eleLeadLink, cName);		
		return this;
	}


	public MyLeadsPage clickDeleteLeadLink(){
		WebElement eleDeleteLeadLink = locateElement("link", prop.getProperty("ViewLead.dLead.link"));
		click(eleDeleteLeadLink);
		return new MyLeadsPage(driver, eachNode);
	}
	
	
	public DuplicateLeadPage clickDuplicateLeadLink(){
		WebElement eleDuplicateLeadLink = locateElement("link", prop.getProperty("ViewLead.Dupl_Lead.link"));
		click(eleDuplicateLeadLink);
		return new DuplicateLeadPage(driver, eachNode);
	}
	
	public FindLeadPage clickFindLead(){
		WebElement elefindLead = locateElement("link", prop.getProperty("ViewLead.fLead.link"));
		click(elefindLead);
		return new FindLeadPage(driver, eachNode);
	}
}
