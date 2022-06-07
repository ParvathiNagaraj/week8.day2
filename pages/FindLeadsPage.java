package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{

	public FindLeadsPage(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public FindLeadsPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLeadsPage enterPhoneNum(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public ViewLeadPage getFirstLeadId() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	} 
	
	public FindLeadsPage enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	public FindLeadsPage verifyDeletedLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		return this;
	}
	
	
	public FindLeadsPage enterLeadId1() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID1);
		return this;
	}
	
	public FindLeadsPage verifyMergeLead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		return this;
	}
	
	
	}
