package com.chemodosing.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.chemodosing.pom.HomePage;
import com.chemodosing.pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	FileLib f= new FileLib();
	
	@BeforeClass
	public void openApplication() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		String url = f.readDataFromProperty("url");
		driver.get(url);
		Reporter.log("openApplication",true);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String un = f.readDataFromProperty("un");
		String pwd = f.readDataFromProperty("pwd");
		LoginPage l= new LoginPage(driver);
		l.login(un, pwd);
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		HomePage h = new HomePage(driver);
		h.logout();
		Reporter.log("logout",true);
	}
	
	@AfterClass
	public void closeAppication() {
		driver.quit();
		Reporter.log("closeAppication", true);
		
	}

}
