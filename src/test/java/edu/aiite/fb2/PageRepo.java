package edu.aiite.fb2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import edu.aiite.fb.BaseClass;

public class PageRepo extends BaseClass {
	
	public PageRepo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement loginname;
	
	@FindBy(id="pass")
	private WebElement password;
	
	
	public WebElement getLoginname() {
		return loginname;
	}

	public WebElement getPassword() {
		return password;
	}
	
		
}
