package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class MergeLeadPage extends ProjectSpecificMethods {
	
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("Merge Leads | opentaps CRM")) {
			reportStep("This is not Merge Lead Page", "Fail");
		}
	}

	public FindLeadPopPage clickFromLeadLookup(){
		WebElement eleFromLeadLookup = locateElement("xpath", prop.getProperty("MergeLead.fromLead.xpath"));
		clickWithNoSnap(eleFromLeadLookup);
		switchToWindow(1);
		return new FindLeadPopPage(driver, eachNode);		
	}

	public FindLeadPopPage clickToLeadLookup(){
		WebElement eleToLeadLookup = locateElement("xpath", prop.getProperty("MergeLead.toLead.xpath"));
		clickWithNoSnap(eleToLeadLookup);
		switchToWindow(1);
		return new FindLeadPopPage(driver, eachNode);		
	}

	public ViewLeadPage clickMergeButton(){
		WebElement eleclickMergeButton = locateElement("link", prop.getProperty("MergeLead.merge.link"));
		clickWithNoSnap(eleclickMergeButton);
		acceptAlert();
		return new ViewLeadPage(driver, eachNode);
	}
}