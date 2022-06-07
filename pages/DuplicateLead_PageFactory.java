package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class DuplicateLead_PageFactory extends PageFactory_ProjectSpecificMethods{
	
	@FindBy(how = How.NAME, using = "submitButton") private WebElement elementCreateLead;

	public DuplicateLead_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		elementCreateLead.click();
		return new ViewLeadPage(driver);
	}
	
	
}
