package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("Leaftaps - TestLeaf Automation Platform")) {
			reportStep("This is not Home Page", "Fail");
		}
	}
	
	public MyHomePage clickCRMSFA() {
		WebElement eleCRMSFA = locateElement("link", prop.getProperty("Home.CRMSFA.link"));
		click(eleCRMSFA);
		return new MyHomePage(driver, eachNode);
	}
	
	public LoginPage clickLogout() {
		WebElement eleLogout = locateElement("class", prop.getProperty("home.logoutB.className"));
		click(eleLogout);
		return new LoginPage(driver, eachNode);
	}
	
}









