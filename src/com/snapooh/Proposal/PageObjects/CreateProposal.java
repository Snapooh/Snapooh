package com.snapooh.Proposal.PageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProposal {

	 


	public  CreateProposal(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//label[@style='cursor:pointer']")
	public WebElement Click_Create_Pro;

	@FindBy(id="proTitleInput")
	public WebElement P_Title;

	@FindBy(id="proForInput")
	public WebElement P_proForInput;

	@FindBy(id="proDescInput")
	public WebElement P_Desc;

	@FindBy(id="proStartInput")
	public WebElement P_Start_Duration;

	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//td")
	public WebElement Date;

	WebDriver driver;
	public void StartDuration( String Calendar){
	 
		
		WebElement   datepicker = driver.findElement(By.id("ui-datepicker-div"));  
   		List<WebElement> rows=  datepicker.findElements(By.tagName("tr"));  
  		List<WebElement> columns= datepicker.findElements(By.tagName("td"));  
  							
  						for (WebElement cell: columns){  
  							//Select 20th Date   
  							if (cell.getText().equals("22")){  
  								cell.findElement(By.linkText("22")).click();   
  									break;
  							}  
  								}   
  			
  						driver.findElement(By.xpath(".//*[@id='campnEndInput']")).click();
  						WebElement   datepicker1 = driver.findElement(By.id("ui-datepicker-div"));  
  						List<WebElement> rows1=  datepicker1.findElements(By.tagName("tr"));  
  						List<WebElement> columns1= datepicker1.findElements(By.tagName("td"));  
  						for (WebElement cell: columns1){  
	      				//Select 20th Date   
  							if (cell.getText().equals("31")){  
  								cell.findElement(By.linkText("31")).click();   
  									break;
  							}  
  								}   
  				
}
}



