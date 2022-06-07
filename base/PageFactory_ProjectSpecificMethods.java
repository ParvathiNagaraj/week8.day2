package com.leaftaps.ui.base;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leaftaps.ui.utility.ReadExcelData;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactory_ProjectSpecificMethods {

	public RemoteWebDriver driver;
	
	public String fileName;
	public static String leadID,leadID1;
	
	public Set<String> allWindows,allWindows2;
	public List<String> allhandles,allhandles2;

	@DataProvider
	public String[][] testData() throws IOException {

		String[][] data = ReadExcelData.readData(fileName);
		return data;
		
	}

	@Parameters({"URL","browserName"})
	@BeforeMethod
	public void startBrowser(String url , String browserName) {
		
		if(browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if(browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void endBrowser() {

		driver.close();
	}

}

