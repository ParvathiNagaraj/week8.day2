package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class CreateLead_PageFactory extends PageFactory_ProjectSpecificMethods{

	@FindBy(how = How.ID, using = "createLeadForm_companyName") private WebElement elementComName;
	@FindBy(how = How.ID, using = "createLeadForm_firstName") private WebElement elementFName;
	@FindBy(how = How.ID, using = "createLeadForm_lastName") private WebElement elementLName;
	@FindBy(how = How.NAME , using = "submitButton") private WebElement elementCreateLead;
	
	public CreateLead_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}

	public CreateLead_PageFactory enterCompanyName(String cName) {
		
		elementComName.sendKeys(cName);
		return this;
	}
	
	public CreateLead_PageFactory enterFirstName(String fName) {
		
		elementFName.sendKeys(fName);
		return this;
	}
	
	public CreateLead_PageFactory enterLastName(String lName) {
		
		elementLName.sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		
		elementCreateLead.click();
		return new ViewLeadPage(driver);
	}
}
