package com.leaftaps.ui.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;

public class MergeLeadsNew extends week8_day2_ProjectSpecificMethods{

	public MergeLeadsNew(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public MergeLeadsNew clickFromLeadWidget() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return this;
	}
	
	public MergeLeadsNew enterFromLeadFirstName(String firstName1) {
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName1);
		return this;
	}
	
	public MergeLeadsNew clickFromFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath(property.getProperty("mergeLeadPage.findLead.xpath"))).click();
		Thread.sleep(1000);
		return this;
	}
	
	public MergeLeadsNew clickFirstFromLeadId() {
		leadID1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	
	public MergeLeadsNew clickToLeadWidget() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return this;
	}
	
	public MergeLeadsNew enterToLeadFirstName(String firstName2) {
		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName2);
		return this;
	}
	
	public MergeLeadsNew clickToFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath(property.getProperty("mergeLeadPage.findLead.xpath"))).click();
		Thread.sleep(1000);
		return this;
	}
	
	public MergeLeadsNew clickFirstToLeadId() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		return this;
	}
	
	public MergeLeadsNew clickMergeButton() {
		driver.findElement(By.xpath(property.getProperty("mergeLeadPage.mergeLead.xpath"))).click();
		return this;
	}
	
	public LeadsPage acceptMergeAlert() {
		driver.switchTo().alert().accept();
		return new LeadsPage(driver);
	}
	
	
	

	
	
}
