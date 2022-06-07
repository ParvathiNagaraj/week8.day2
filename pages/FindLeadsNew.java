package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;

public class FindLeadsNew extends week8_day2_ProjectSpecificMethods{

	public FindLeadsNew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public FindLeadsNew clickPhone() {
		driver.findElement(By.xpath(property.getProperty("findLeadPage.clickPhone.xpath"))).click();
		return this;
	}
	
	public FindLeadsNew enterPhoneNum(String phoneNumber) {
		driver.findElement(By.xpath(property.getProperty("findLeadPage.enterPhoneNum.xpath"))).sendKeys(phoneNumber);
		return this;
	}
	
	public FindLeadsNew clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath(property.getProperty("findLeadPage.findLead.xpath"))).click();
		Thread.sleep(2000);
		return this;
	}
	
	public ViewLeadPage getFirstLeadId() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	} 
	
	public FindLeadsNew enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	public FindLeadsNew verifyDeletedLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		return this;
	}
	
	
	public FindLeadsNew enterLeadId1() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID1);
		return this;
	}
	
	public FindLeadsNew verifyMergeLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		return this;
	}
	
	
	}
