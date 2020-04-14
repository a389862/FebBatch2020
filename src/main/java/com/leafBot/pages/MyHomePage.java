package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("My Home | opentaps CRM")) {
			reportStep("This is not My Home Page", "Fail");
		}
	}
	
	public MyLeadsPage clickLeadLink() {
		WebElement eleLeads = locateElement("link", prop.getProperty("MyHome.Leads.Link"));
		click(eleLeads);
		return new MyLeadsPage(driver, eachNode);
	}
	
}









