package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.AdminUsersPage;
import com.sevenrmartsupermarket.pages.DashBoardPage;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.utilities.CaptureScreenshot;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class AdminUsersTest extends Base {
	AdminUsersPage adminuserpage;
	DashBoardPage dashboardpage;
	LoginPage loginpage;
		
	@Test(groups={"smoke","regression"})
	public void verifyClickAdminMoreInfo() {
		loginpage = new LoginPage(driver);
		dashboardpage=loginpage.login("admin","admin");
		adminuserpage =dashboardpage.clickAdminMoreInfo();
	    adminuserpage.clickOnNewUserBtn();
		String newUserRandomName = GeneralUtility.getRandomFullName();
		System.out.println(newUserRandomName);
		System.out.println(GeneralUtility.getRandomAddress());
		adminuserpage.newLogin(newUserRandomName+"abi","ammu");
		adminuserpage.selectnewUserTypeDropdown().clickSaveButton();
		String actualNewAlert =adminuserpage.getTextOfNewUserAlert();
		System.out.println("Text of alert " + actualNewAlert);
		String expectedNewAlert = "Alert!";
		Assert.assertEquals(actualNewAlert, expectedNewAlert);
				 
		 
		
		 
		
			}
	
	

}
