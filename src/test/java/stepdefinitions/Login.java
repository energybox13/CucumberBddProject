package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Pageobject.Loginpage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class Login extends BaseClass {
	@Before
	public void setup()
	{
		Log = LogManager.getLogger("Login");
		WebDriverManager.firefoxdriver().setup();
	    FirefoxOptions options = new FirefoxOptions();
	    options.addArguments("--width=1200");
	    options.addArguments("--height=800");
	    driver = new FirefoxDriver(options);
	    driver.manage().window().maximize();
	    Log.info("Setup executed . . . . . .. ");
	    System.out.println("Setup is executed......");
	}
	
	
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		    
		    

		    

		    //driver.driver = driver;  // Share driver 
		    loginpg = new Loginpage(driver);
		}

	
	@When("User open url {string}")
	public void user_open_url(String url) {
	    driver.get(url); // 'driver' is inherited from BaseClass
	}


	@And("User has entered valid email address {string}")
	public void user_has_entered_valid_email_address(String emailaddd) {
		
		loginpg.enterEmail(emailaddd);
		
	}
	   

	@And("User has entered valid password {string}")
	public void user_has_entered_valid_password(String pwds) {
	    loginpg.enterPassword(pwds);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginpg.loginClick();
	   
	}  
	
	@After
	public void teardown()
	{
		System.out.println("Tear down executed.....");
		driver.quit();
		
	}
	@BeforeStep
	public void beforeStepMethodDemo()
	{
		System.out.println("This before step method . . . . . . . .");
		
	}
	
	
	@AfterStep
 public void afterStepMethodDemo()
 {
	 
	 System.out.println("This is after step. . . . . . ");
	  
 }
	

}
