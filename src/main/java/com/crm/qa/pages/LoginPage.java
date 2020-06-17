
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath ="/html/body/div[1]/header/div/nav/div[2]/div/a/span[1]")
	WebElement homelogin;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css= "#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button")
	WebElement loginBtn;
	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	
	public HomePage login(String un, String pwd) throws InterruptedException{
		homelogin.click();
		Thread.sleep(3000);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		    	
		return new HomePage();
	}

}
