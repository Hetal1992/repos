package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//span[contains(text(),'Hetal Mehta')]")
	WebElement  userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	   //Initializing the Page Objects:
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
	
		
		//Actions:
		public String validateHomePageTitle(){
			return driver.getTitle();
		}
		
		public ContactPage clickOnContactsLink() {
			contactsLink.click();
			return new ContactPage();
		}
		
		public DealPage clickOnDealsLink() {
			dealsLink.click();
			return new DealPage();
		}
		
		public TasksPage clickOnTasksLink() {
			tasksLink.click();
			return new TasksPage();
		}
		
		
		
		
}


  