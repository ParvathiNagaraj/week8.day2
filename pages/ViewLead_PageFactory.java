package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class ViewLead_PageFactory extends PageFactory_ProjectSpecificMethods {

	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	private WebElement verifyLeadId;
	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement clickDeleteButton;
	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement clickEditButton;
	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement clickDuplicateButton;

	public ViewLead_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}

	public ViewLead_PageFactory verifyLeadId() {

		String LeadId = verifyLeadId.getText().replaceAll("[^0-9]", "");
		System.out.println("The LeadId is " + LeadId);
		return this;
	}

	public LeadsPage clickDeleteButton() {
		clickDeleteButton.click();
		return new LeadsPage(driver);
	}

	public EditLeadPage clickEditButton() {
		clickEditButton.click();
		return new EditLeadPage(driver);

	}

	public DuplicateLeadPage clickDuplicateButton() {
		clickDuplicateButton.click();
		return new DuplicateLeadPage(driver);

	}
}
