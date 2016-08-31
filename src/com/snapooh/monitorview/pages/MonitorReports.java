package com.snapooh.monitorview.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitorReports {
	public  MonitorReports(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="reportMenuWrap")
	public WebElement MonitorRepot;
	
	@FindBy(xpath="//a[@href='/monitor-view/inbox/monitors/report']")
	public WebElement ReportsFrame;
	
	@FindBy(xpath="//a[@ng-click='showHideMonitorReportSubMenu()']")
	public WebElement ReportsMO;
	
	public void SelectMReport(String Text){
		MonitorRepot.click();
		
	}
	
	public void ReportsLink(String link){
		ReportsFrame.click();
		ReportsMO.click();
	}
	
	
	
}
