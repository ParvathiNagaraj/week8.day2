package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class FindLeads_PageFactory extends PageFactory_ProjectSpecificMethods{
	
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']") private WebElement clickPhone;
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber']") private WebElement enterPhoneNum;
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']") private WebElement clickFindLead;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") private WebElement clickFirstLead;
	@FindBy(how = How.XPATH, using = "//input[@name='id']") private WebElement enterLeadId;
	@FindBy(how = How.CLASS_NAME, using = "x-paging-info") private WebElement verifyDeleteLead;
	@FindBy(how = How.XPATH, using = "//input[@name='id']") private WebElement enterLeadId1;
	@FindBy(how = How.CLASS_NAME, using = "x-paging-info") private WebElement verifyMergeLead;
	
	

	public FindLeads_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	
	public FindLeads_PageFactory clickPhone() {
		clickPhone.click();
		return this;
	}
	
	public FindLeads_PageFactory enterPhoneNum(String phoneNumber) {
		enterPhoneNum.sendKeys(phoneNumber);
		return this;
	}
	
	public FindLeads_PageFactory clickFindLeadsButton() throws InterruptedException {
		clickFindLead.click();
		Thread.sleep(2000);
		return this;
	}
	
	public ViewLeadPage getFirstLeadId() {
		leadID = clickFirstLead.getText();
		clickFirstLead.click();
		return new ViewLeadPage(driver);
	} 
	
	public FindLeads_PageFactory enterLeadId() {
		enterLeadId.sendKeys(leadID);
		return this;
	}
	
	public FindLeads_PageFactory verifyDeletedLead() {
		String text = verifyDeleteLead.getText();
		System.out.println(text);
		return this;
	}
	
	
	public FindLeads_PageFactory enterLeadId1() {
		enterLeadId1.sendKeys(leadID1);
		return this;
	}
	
	public FindLeads_PageFactory verifyMergeLead() {
		String text = verifyMergeLead.getText();
		System.out.println(text);
		return this;
	}
	
	
	}
