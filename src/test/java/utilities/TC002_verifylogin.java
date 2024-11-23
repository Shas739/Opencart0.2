package utilities;


import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.myaccountPage;

public class TC002_verifylogin extends BaseClass{
	
	@Test
	public void verify_login() {
		HomePage hp = new HomePage(driver);
		hp.clickAcount();
		hp.clickLogin();
		
		
		myaccountPage cp =new myaccountPage(driver);
		cp.inputEmail("rahul12223@gmail.com");
		cp.inputPwd("rahul786");
		cp.button();
	}


}
