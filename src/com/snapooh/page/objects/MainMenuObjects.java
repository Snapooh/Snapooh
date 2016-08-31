package com.snapooh.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuObjects {
	public   MainMenuObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Select The Menu With the Street medias

		@FindBy(xpath="//a[@id='usrUtils']")
		public WebElement SelMenu;

		@FindBy(linkText="Medias")
		@CacheLookup
		public WebElement SelSMedia;
		
		@FindBy(xpath="//label[contains(.,'Monitor View')]")
		public WebElement MonitoView;
	public void SMediaManager(String Menu){
		SelMenu.click();
		SelSMedia.click();
	}
	
	@FindBy(linkText="Proposals")
	public WebElement Selproposals;
	public void SeleProposal(String Prop){
		Selproposals.click();
	}
	public void SelectMView(String View){
		MonitoView.click();
	}
	 
}
