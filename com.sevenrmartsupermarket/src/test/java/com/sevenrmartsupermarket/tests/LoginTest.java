package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.DashBoardPage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.ExcelReader;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class LoginTest extends Base {
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	ExcelReader excelreader = new ExcelReader();

	@Test(groups = "smoke",retryAnalyzer = com.sevenrmartsupermarket.listeners.RetryAnalyzer.class)
	public void verifyAdminUserLogin() {
		excelreader.setExcelFile("LoginDetails","LoginCredentials");
		String readusername = excelreader.getCellData(0, 1) ;
		String readpassowrd =excelreader.getCellData(1, 1);
		System.out.println(readusername);
		System.out.println(readpassowrd);
		loginpage = new LoginPage(driver);
		dashboardpage = new DashBoardPage(driver);
		loginpage.login("admin", "admin");
		String actualProfileName = dashboardpage.getProfileName();
		String expectedProfileName ="Admin";
		Assert.assertEquals(actualProfileName, expectedProfileName);
		
		
		

	}
	

}
