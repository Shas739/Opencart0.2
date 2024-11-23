package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.Resigster_Page;



public class TC001_resigster_verification extends BaseClass{
	
	
	@Test
	public void verify() {
	
		HomePage hp = new HomePage(driver);
		hp.clickAcount();
		hp.clickregister();
		
		Resigster_Page rp = new Resigster_Page(driver);
		rp.setName("Rahul");
		rp.setLastname("Yadav");
		rp.setEmail("rahul12223@gmail.com");
		rp.setPhone("987654332");
		rp.setPassword("rahul786");
		rp.setConfirmPassword("rahul786");
		rp.clickOn();
		rp.clickContinue();
		
       String confirm =rp.getConfiration();
		
		Assert.assertEquals(confirm, "Your Account Has Been Created!");

	}
}
