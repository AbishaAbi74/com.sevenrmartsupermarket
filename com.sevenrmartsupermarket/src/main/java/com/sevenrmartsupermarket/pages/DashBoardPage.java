package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	@FindBy(xpath = "//a[@class='d-block']")
	private WebElement profileName;
	@FindBy(xpath="//p[text()='Admin Users']/../../div/following-sibling::a")
	private WebElement adminUserMoreInfo;
	

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getProfileName() {
		return profileName.getText();
	}
	public AdminUsersPage clickAdminMoreInfo() {
		adminUserMoreInfo.click();
		return new AdminUsersPage(driver);
	}

}
