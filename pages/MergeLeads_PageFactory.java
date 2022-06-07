package com.leaftaps.ui.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.PageFactory_ProjectSpecificMethods;

public class MergeLeads_PageFactory extends PageFactory_ProjectSpecificMethods {

	@FindBy(how = How.XPATH, using = "//img[@alt='Lookup']")
	private WebElement clickFromLeadWidget;
	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement enterFirstName;
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement clickFindLeadButton;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement clickFirstLeadId;
	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[2]")
	private WebElement clickToLeadWidget;
	@FindBy(how = How.XPATH, using = "//a[text()='Merge']")
	private WebElement clickMerge;

	public MergeLeads_PageFactory(RemoteWebDriver inwardDriver) {

		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}

	public MergeLeads_PageFactory clickFromLeadWidget() {
		clickFromLeadWidget.click();
		return this;
	}

	public MergeLeads_PageFactory enterFromLeadFirstName(String firstName1) {
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		enterFirstName.sendKeys(firstName1);
		return this;
	}

	public MergeLeads_PageFactory clickFromFindLeadButton() throws InterruptedException {
		clickFindLeadButton.click();
		Thread.sleep(1000);
		return this;
	}

	public MergeLeads_PageFactory clickFirstFromLeadId() {
		leadID1 = clickFirstLeadId.getText();
		clickFirstLeadId.click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}

	public MergeLeads_PageFactory clickToLeadWidget() {
		clickToLeadWidget.click();
		return this;
	}

	public MergeLeads_PageFactory enterToLeadFirstName(String firstName2) {
		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		enterFirstName.sendKeys(firstName2);
		return this;
	}

	public MergeLeads_PageFactory clickToFindLeadButton() throws InterruptedException {
		clickFindLeadButton.click();
		Thread.sleep(1000);
		return this;
	}

	public MergeLeads_PageFactory clickFirstToLeadId() {
		clickFirstLeadId.click();
		driver.switchTo().window(allhandles2.get(0));
		return this;
	}

	public MergeLeads_PageFactory clickMergeButton() {
		clickMerge.click();
		return this;
	}

	public LeadsPage acceptMergeAlert() {
		driver.switchTo().alert().accept();
		return new LeadsPage(driver);
	}

}
