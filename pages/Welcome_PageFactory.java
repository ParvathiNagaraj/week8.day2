package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class Welcome_PageFactory extends PageFactory_ProjectSpecificMethods{
	
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA") private WebElement elementWelcomeLink;

	public Welcome_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage clickCRMSFALink() {
		elementWelcomeLink.click();
		return new HomePage(driver);
	}

}
