package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("opentaps CRM")) {
			reportStep("This is not Edit Lead", "Fail");
		}
	}

	public EditLeadPage updateCompanyName(String data) {
		WebElement elecompany = locateElement("xpath", prop.getProperty("EditLead.cName.xpath"));
		clearAndType(elecompany, data);
		return this;
	}

	public ViewLeadPage clickUpdateSubmit() {
		WebElement eleupdate = locateElement("name", prop.getProperty("EditLead.Update.name"));
		click(eleupdate);
		return new ViewLeadPage(driver, eachNode);
	}

}
