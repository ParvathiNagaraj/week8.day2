package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class runEditLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
		fileName = "tc003";
	}

	@Test(dataProvider = "testData")
	public void EditLead(String username, String password, String phoneNumber, String companyName) throws InterruptedException {

		new LoginPage(driver).enterUserName(username).enterPassword(password).clickLoginButton().clickCRMSFALink()
				.clickLeads().clickFindLeads().clickPhone().enterPhoneNum(phoneNumber).clickFindLeadsButton()
				.getFirstLeadId().clickEditButton().updateCompanyName(companyName).clickSubmitButton().verifyLeadId();

	}
}
