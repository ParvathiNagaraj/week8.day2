package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.week8_day2_ProjectSpecificMethods;
import com.leaftaps.ui.pages.Loginnew;

public class runCreateLeadNew extends week8_day2_ProjectSpecificMethods {

	@BeforeTest
	public void setFileName() {
		fileName = "tc001";
	}

	@Test(dataProvider = "testData")
	public void CreateLead_result(String username, String password, String cName, String fName, String lName) {

		new Loginnew(driver).enterUserName(username).enterPassword(password).clickLoginButton().clickCRMSFALink()
				.clickLeads().clickCreateLead().enterCompanyName(cName).enterFirstName(fName).enterLastName(lName)
				.clickCreateLeadButton().verifyLeadId();
	}

}
