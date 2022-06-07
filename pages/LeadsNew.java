package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;


public class LeadsNew extends week8_day2_ProjectSpecificMethods{

	public LeadsNew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.createLead.linktext"))).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeads() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.findLead.linktext"))).click();
		return new FindLeadsPage(driver);
	}
	
	public MergeLeadsPage clickMergeLead() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.mergeLead.linktext"))).click();
		return new MergeLeadsPage(driver);
	}

}
