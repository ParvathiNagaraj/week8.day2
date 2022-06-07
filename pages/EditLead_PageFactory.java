package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class EditLead_PageFactory extends PageFactory_ProjectSpecificMethods{
	
	@FindBy(how = How.ID, using = "updateLeadForm_companyName") private WebElement updateCName;
	@FindBy(how = How.NAME , using = "submitButton") private WebElement clickSubmit;
	
	public EditLead_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	
	public EditLead_PageFactory updateCompanyName(String companyName) {
		updateCName.sendKeys(companyName);
		return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		clickSubmit.click();
		return new ViewLeadPage(driver);
	}
	
	
	
	}
