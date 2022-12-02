package edu.aiite.fb1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import edu.aiite.fb.BaseClass;
import edu.aiite.fb2.PageRepo;

public class LoginPageExe extends BaseClass {
	
	PageRepo repo= new PageRepo();
	@Test
	public void method1() {
	BaseClass.fbPage(repo.getLoginname(),"Lakshman");	
	BaseClass.fbPage(repo.getPassword(),"123459");
		
	}
	
	@Test
	public void method2() {
		System.out.println("This is second test method");
		
	}
			
	
	
	@Before
	public void urlLunch() {
		
		driver.get("https://www.facebook.com/");
	}

}
