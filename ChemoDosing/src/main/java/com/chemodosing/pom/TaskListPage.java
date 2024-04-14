package com.chemodosing.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//create customer elements
public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addnewBtn;
@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
private WebElement createnewcustomerBtn;
@FindBy(id="customerLightBox_nameField")
private WebElement customernameTbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement customerdescTbx;
@FindBy(xpath="//span[text()='Create Customer']")
private WebElement createcustomerBtn;
@FindBy(xpath="//div[@class='tasksTable hasSelectedCustomer allTasksLoaded'] //div[text()='Amrutha H S']")
private WebElement customernameDisplay;
@FindBy(xpath="//div[@class='node customerNode selected']")
private WebElement customernameinlistSelected;
@FindBy(xpath="//div[@class='node customerNode notSelected']")
private WebElement customernameinlistNotSelected;
@FindBy(xpath="//ul[@Class='x-menu-list']")
private WebElement dropdownOptionsParent;
@FindBy(xpath="//div[@class='node customerNode selected']//div[@class='editButton available']")
private WebElement customereditBtn;

//edit page elements
@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']")
private WebElement actionsBtn;
@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']")
private WebElement deleteBtn;
@FindBy(id="customerPanel_deleteConfirm_submitTitle")
private WebElement confirmdeleteBtn;

public  TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void delete() {
	customernameinlistNotSelected.click();
	customereditBtn.click();
	actionsBtn.click();
	deleteBtn.click();
	confirmdeleteBtn.click();
}

public WebElement getAddnewBtn() {
	return addnewBtn;
}

public WebElement getCreatenewcustomerBtn() {
	return createnewcustomerBtn;
}

public WebElement getCustomernameTbx() {
	return customernameTbx;
}

public WebElement getCustomerdescTbx() {
	return customerdescTbx;
}

public WebElement getCreatecustomerBtn() {
	return createcustomerBtn;
}

public WebElement getCustomernameDisplay() {
	return customernameDisplay;
}


public WebElement getCustomereditBtn() {
	return customereditBtn;
}

public WebElement getActionsBtn() {
	return actionsBtn;
}

public WebElement getDeleteBtn() {
	return deleteBtn;
}

public WebElement getConfirmdeleteBtn() {
	return confirmdeleteBtn;
}

public WebElement getDropdownOptionsParent() {
	return dropdownOptionsParent;
}

public WebElement getCustomernameinlistSelected() {
	return customernameinlistSelected;
}

public WebElement getCustomernameinlistNotSelected() {
	return customernameinlistNotSelected;
}


//create project elements
@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
private WebElement addnewprojectBtn;
@FindBy(id="projectPopup_projectNameField")
private WebElement projectnameTbx;
@FindBy(xpath="//button[contains(text(), 'Please Select Customer to Add Project for')]")
private WebElement projectdropdown;

@FindBy(id="projectPopup_projectDescriptionField")
private WebElement projectdscpTbx;
@FindBy(xpath="//span[text()='Create Project']")
private WebElement createprojectBtn;
@FindBy(xpath="//div[@class='customersProjectsTreeContainer'] //div[text()='Oncology ']")
private WebElement project ;

@FindBy(xpath="//div[@class='node projectNode selected'] //div[@class='editButton available']")
private WebElement projecteditBtn;
@FindBy(xpath="//div[@class='edit_project_sliding_panel sliding_panel']//div[text()='ACTIONS']")
private WebElement projecteditActionBtn;
@FindBy(xpath="//div[@class='edit_project_sliding_panel sliding_panel']//div[text()='Delete']")
private WebElement projectdeleteBtn;
@FindBy(id="projectPanel_deleteConfirm_submitTitle")
private WebElement projectconfirmdeleteBtn;


public WebElement getProjecteditBtn() {
	return projecteditBtn;
}

public WebElement getProjecteditActionBtn() {
	return projecteditActionBtn;
}

public WebElement getProjectdeleteBtn() {
	return projectdeleteBtn;
}

public WebElement getProjectconfirmdeleteBtn() {
	return projectconfirmdeleteBtn;
}

public WebElement getAddnewprojectBtn() {
	return addnewprojectBtn;
}

public WebElement getProjectnameTbx() {
	return projectnameTbx;
}

public WebElement getProjectdscpTbx() {
	return projectdscpTbx;
}

public WebElement getCreateprojectBtn() {
	return createprojectBtn;
}







}
