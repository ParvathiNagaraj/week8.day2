package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class Login_PageFactory extends PageFactory_ProjectSpecificMethods {
	
	@CacheLookup
	@FindBy(how = How.ID, using = "username") private WebElement elementUserName;
	@FindBy(how = How.ID, using = "password") private WebElement elementPassword;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit") private WebElement elementLoginButton;

	public Login_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	
	public Login_PageFactory enterUserName(String username) {
		
		elementUserName.sendKeys(username);
		return this;
	}
	
	public Login_PageFactory enterPassword(String password) {
		
		elementPassword.sendKeys(password);
		return this;
	}

	public WelcomePage clickLoginButton() {
		
		elementLoginButton.click();
		return new WelcomePage(driver);
	}
}
