package com.snapooh.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.snapooh.monitorview.pages.MonitorReports;
import com.snapooh.page.objects.LoginPageObjects;
import com.snapooh.page.objects.MainMenuObjects;

public class MonitorView {
	WebDriver driver;
	LoginPageObjects objLogin;
	MainMenuObjects  SelMview;
	MonitorReports SelMreports;
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(" http://snapooh.com/home.html");
	}
	@Test(priority=1) 
	public void login(){
		//Create Login Page object
		objLogin = new LoginPageObjects(driver);
		objLogin.lnBtn.click();
		objLogin.email_add.sendKeys("info@snapooh.com");
		objLogin.pwd.sendKeys("12345678");
		objLogin.lnEnter.click();
		System.out.println("Login Done Successfully");
	}
	@Test(priority=2)
	public void SelMonitor(){
		SelMview=new MainMenuObjects(driver);
		SelMview.SelMenu.click();
		SelMview.MonitoView.click();
	}
	@Test(priority=3)
	public void  MonitorReport(){
		SelMreports=new MonitorReports(driver);
		SelMreports.MonitorRepot.click();
		SelMreports.ReportsFrame.click();
	}
	

}
