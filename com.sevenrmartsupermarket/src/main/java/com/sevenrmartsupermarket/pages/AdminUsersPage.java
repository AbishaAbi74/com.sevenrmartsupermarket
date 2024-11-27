package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.PageUtility;

public class AdminUsersPage {
	WebDriver driver;
	PageUtility pageutility;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newUser;
	@FindBy(xpath = "//input[@id='username']")
	WebElement newUserNameField;
	@FindBy(xpath = "//input[@id='password']")
	WebElement newPasswordField;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement newUserTypeDropdown;
	@FindBy (xpath ="//button[@name='Create']")
	WebElement saveBtn;
	////div[@class='alert alert-danger alert-dismissible']"- username already exists xpath
	@FindBy(xpath="//h5")
	WebElement newUserAlertMsg;
	
	

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;// whatever we are telling from testcase give that driver value to current
								// pageclass object driver
		PageFactory.initElements(driver, this);
		pageutility = new PageUtility(driver);

	}

	public void clickOnNewUserBtn() {
		newUser.click();
	}

	public void enterNewUserName(String newUser) {
		newUserNameField.sendKeys(newUser);

	}

	public void enternewPasswordField(String newPassword) {
		newPasswordField.sendKeys(newPassword);
	}

	public void newLogin(String newUser, String newPassword) {
		enterNewUserName(newUser);
		enternewPasswordField(newPassword);

	}

	public AdminUsersPage selectnewUserTypeDropdown() {

		pageutility.selectDropdownByIndex(newUserTypeDropdown, 2);
		return this;

	}
	public AdminUsersPage clickSaveButton() {
		saveBtn.click();
		return this;
	}
	public String getTextOfNewUserAlert() {
		return newUserAlertMsg.getText();
	}

}
