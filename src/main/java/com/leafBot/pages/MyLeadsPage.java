package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("My Leads | opentaps CRM")) {
			reportStep("This is not My Leads Page", "Fail");
		}
	}
	
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("link", prop.getProperty("MyLead.CreateLead.Link"));
		click(eleCreateLead);
		return new CreateLeadPage(driver, eachNode);
	}
	
	public FindLeadPage clickFindLead() {
		WebElement eleFindLeads = locateElement("link", prop.getProperty("MyLead.FindLeads.Link"));
		click(eleFindLeads);
		return new FindLeadPage(driver, eachNode);
	}
	
		
	public MergeLeadPage clickMergeLead(){
		WebElement elemergeLead = locateElement("link", prop.getProperty("MyLead.MergeLead.Link"));
		click(elemergeLead);		
		return new MergeLeadPage(driver, eachNode);
	}
	
	
	
}









