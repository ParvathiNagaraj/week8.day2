package com.leaftaps.ui.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.leaftaps.ui.utility.ReadExcelData;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week8_day2_ProjectSpecificMethods {

	public RemoteWebDriver driver;
	
	public String fileName;
	public static String leadID,leadID1;
	public static Properties property;
	
	public Set<String> allWindows,allWindows2;
	public List<String> allhandles,allhandles2;

	@DataProvider
	public String[][] testData() throws IOException {

		String[][] data = ReadExcelData.readData(fileName);
		return data;
		
	}

	@BeforeMethod
	public void startBrowser() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("./config/AppConfig.properties");
		prop.load(file);
		
		//Getting browserName from properties file
		String browserName = prop.getProperty("browserName");
		
		if(browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if(browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		//Getting URL from Properties file
		String url = prop.getProperty("URL");
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Getting Language Config
		property = new Properties();
		FileInputStream file1 = new FileInputStream("./config/"+prop.getProperty("language")+".properties");
		property.load(file1);
	}

	@AfterMethod
	public void endBrowser() {

		driver.close();
	}

}

