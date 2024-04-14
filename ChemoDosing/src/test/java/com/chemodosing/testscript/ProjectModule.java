package com.chemodosing.testscript;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.chemodosing.generic.BaseClass;
import com.chemodosing.pom.HomePage;
import com.chemodosing.pom.TaskListPage;

public class ProjectModule extends BaseClass{
@Test
	public void CreateAndDeleteProject() {
		HomePage h= new HomePage(driver);
		TaskListPage t=new TaskListPage(driver);	
		h.clickTaskTab();	
		t.getAddnewBtn().click();
		t.getAddnewprojectBtn().click();
		String projectname="Oncology";
		String option ="Architects Bureau";
		t.getProjectnameTbx().sendKeys(projectname);
		driver.findElement(By.xpath("//button[contains(text(), 'Please Select Customer to Add Project for')]")).click();
		t.getDropdownOptionsParent().findElement(By.xpath("//a[text()='"+option+"']")).click();
		t.getProjectdscpTbx().sendKeys("Cancer applications");
		t.getCreateprojectBtn().click();
		driver.findElement(By.xpath("//div[@class='customersProjectsTreeContainer'] //div[text()='Oncology ']")).click();
		t.getProjecteditBtn().click();
		t.getProjecteditActionBtn().click();
		t.getProjectdeleteBtn().click();
		t.getProjectconfirmdeleteBtn().click();
			
	}
	
	
	
	
}

