package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	
	public WebDriver driver;
	
    @Parameters({"os" , "browser"})
	@BeforeClass
    public void setUp(String os , String br) throws Exception  {
    	
    	
    	
    	switch(br.toLowerCase()) {
    	case "chrome":driver = new ChromeDriver();break;
    	case "edge": driver = new EdgeDriver();break;
    	default:System.out.println("nvalid");return;
    	}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
	}
	
	


}
