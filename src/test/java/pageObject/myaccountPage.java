package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myaccountPage  extends BasePage{
	
	
	public  myaccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//*[@id=\"input-email\"]") WebElement inputEmail;
	@FindBy(xpath="//*[@id=\"input-password\"]") WebElement inputpwd;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input") WebElement inputButton;
	
	
	public void inputEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void inputPwd(String pwd) {
		inputpwd.sendKeys(pwd);
	}
	
	public void button() {
		inputButton.click();
	}

}
