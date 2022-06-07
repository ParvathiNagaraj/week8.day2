package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}

	public ViewLeadPage verifyLeadId() {
		
		String LeadId = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		System.out.println("The LeadId is " + LeadId);
		return this;
	}
	
	public LeadsPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage(driver);
	}
	
	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
		
	}
	
	public DuplicateLeadPage clickDuplicateButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
		
	}
}
