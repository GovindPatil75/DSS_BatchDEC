package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_001 extends BaseClass{

	@Test
	public void verify_001() {
		
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
			
		Library.custom_sendKeys(login.getEmailid(),excel.getStringData("Sheet1", 0, 0), "Emailid");
		Library.custom_sendKeys(login.getPassword(),excel.getStringData("Sheet1", 0, 1), "Password");
		Library.custom_click(login.getBtnlogin(), "Login Button");
		
	
	}
}
	