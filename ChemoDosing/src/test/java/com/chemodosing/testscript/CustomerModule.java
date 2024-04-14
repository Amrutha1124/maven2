package com.chemodosing.testscript;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.chemodosing.generic.BaseClass;
import com.chemodosing.pom.HomePage;
import com.chemodosing.pom.TaskListPage;
@Listeners(com.chemodosing.generic.ListenersImplimentation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void createCustomer() throws InterruptedException {	
	HomePage h= new HomePage(driver);
	TaskListPage t=new TaskListPage(driver);	
	h.clickTaskTab();	
	t.getAddnewBtn().click();
	t.getCreatenewcustomerBtn().click();
	t.getCustomernameTbx().sendKeys("Amrutha H S");
	t.getCustomerdescTbx().sendKeys("Premium customer");
	driver.findElement(By.xpath("//button[contains(text(),'Select an active customer to import information from')]")).click();
	//div[@class='x-layer x-menu at-dropdown-list-btn-menu customerSelectorMenu customerLightbox']
	String option ="Architects Bureau";
	t.getDropdownOptionsParent().findElement(By.xpath("//a[text()='"+option+"']")).click();
	t.getCreatecustomerBtn().click();
	Thread.sleep(2000);	
	String actualres = t.getCustomernameDisplay().getText();
	String expectedres="Amrutha H S";
	Assert.assertEquals(actualres, expectedres, "user is not created");
	}

	@Test
	public void deleteCustomer() throws InterruptedException {
	HomePage h= new HomePage(driver);
	TaskListPage t=new TaskListPage(driver);
	h.clickTaskTab();
	Thread.sleep(2000);
	t.delete();	
	Reporter.log("deleteCustomer",true);	
	}
	
	@Test
	public void updateCustomer() throws InterruptedException {
	Assert.fail();
	Reporter.log("UpdateCustomer",true);	
	
	}
	
	
	
//	@Test(dependsOnMethods = "deleteCustomer")
//	public void modifyCustomer() {
//		Reporter.log("modifyCustomer",true);	
//	}
}

