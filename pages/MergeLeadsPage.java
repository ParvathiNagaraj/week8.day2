package com.leaftaps.ui.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MergeLeadsPage extends ProjectSpecificMethods{

	public MergeLeadsPage(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
	}
	
	public MergeLeadsPage clickFromLeadWidget() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return this;
	}
	
	public MergeLeadsPage enterFromLeadFirstName(String firstName1) {
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName1);
		return this;
	}
	
	public MergeLeadsPage clickFromFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		return this;
	}
	
	public MergeLeadsPage clickFirstFromLeadId() {
		leadID1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}
	
	public MergeLeadsPage clickToLeadWidget() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return this;
	}
	
	public MergeLeadsPage enterToLeadFirstName(String firstName2) {
		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName2);
		return this;
	}
	
	public MergeLeadsPage clickToFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		return this;
	}
	
	public MergeLeadsPage clickFirstToLeadId() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		return this;
	}
	
	public MergeLeadsPage clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}
	
	public LeadsPage acceptMergeAlert() {
		driver.switchTo().alert().accept();
		return new LeadsPage(driver);
	}
	
	
	

	
	
}
