package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest eachNode) {
		this.driver = driver;
		this.eachNode = eachNode;
		if (!verifyTitle("Leaftaps - TestLeaf Automation Platform")) {
			reportStep("This is not Login Page", "Fail");
		}
	}

	public LoginPage enterUserName(String data) {
		WebElement eleUserName = locateElement("id", prop.getProperty("login.uName.id"));
		clearAndType(eleUserName, data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		WebElement elePassword = locateElement("id", prop.getProperty("login.pwd.id"));
		clearAndType(elePassword, data);
		return this;
	}
	
	public HomePage clickLogin() {
		WebElement eleLogin = locateElement("class", prop.getProperty("login.loginB.className"));
		click(eleLogin);
		return new HomePage(driver, eachNode);
	}
	
	public LoginPage clickLogInForFailer() {
		WebElement eleLogin = locateElement("class", prop.getProperty("login.loginB.className"));
		click(eleLogin);
		return this;
	}
	
		
	public LoginPage verifyErrorMsg(String data) {
		WebElement eleVerifyErrMsg = locateElement("xpath", prop.getProperty("Login.Error.xpath"));
		verifyPartialText(eleVerifyErrMsg, data);
		return this;
	}
	
}









