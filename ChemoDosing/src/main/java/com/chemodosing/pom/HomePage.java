package com.chemodosing.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="logoutLink")
public WebElement logoutBtn;
@FindBy(linkText = "TASKS")
public WebElement tasktab;
@FindBy(linkText = "REPORTS")
public WebElement reportstab;
@FindBy(linkText = "USERS")
public WebElement userstab;

public  HomePage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}

public void clickTaskTab() {
	tasktab.click();
}

public void clickUsersTab() {
	userstab.click();
}

public void clickReportsTab() {
	reportstab.click();
}

public void logout() {
	logoutBtn.click();
}
}
