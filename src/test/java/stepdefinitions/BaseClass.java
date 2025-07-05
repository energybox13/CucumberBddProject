package stepdefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.*;
import Pageobject.Loginpage;

public class BaseClass {
	
	public WebDriver driver;
	public Loginpage loginpg;
	public static Logger Log;
public String generateEmaildId()

{
	
return(RandomStringUtils.randomAlphabetic(5));
	
	
}
	
}
