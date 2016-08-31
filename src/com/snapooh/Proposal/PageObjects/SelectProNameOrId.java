package com.snapooh.Proposal.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProNameOrId {
	public   SelectProNameOrId(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//*[@id='activeProposalTable']/tbody/tr[1]/td[1]")
	public WebElement Select_Proposal;
	
public void  SelectProposal_Id(String Id){
	Select_Proposal.click();
}

}
