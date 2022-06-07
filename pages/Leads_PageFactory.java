package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class Leads_PageFactory extends PageFactory_ProjectSpecificMethods{

	@FindBy(how = How.LINK_TEXT , using = "Create Lead") private WebElement createLead;
	@FindBy(how = How.LINK_TEXT , using = "Find Leads") private WebElement findLead;
	@FindBy(how = How.LINK_TEXT , using = "Merge Leads") private WebElement mergeLead;
	
	public Leads_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	
	public CreateLeadPage clickCreateLead() {
		createLead.click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeads() {
		findLead.click();
		return new FindLeadsPage(driver);
	}
	
	public MergeLeadsPage clickMergeLead() {
		mergeLead.click();
		return new MergeLeadsPage(driver);
	}

}
