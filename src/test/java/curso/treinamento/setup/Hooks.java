package curso.treinamento.setup;


import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import curso.treinamento.utils.Helper;

public class Hooks {
	
	public static ResourceBundle bundle =  ResourceBundle.getBundle("application");
	
	public static WebDriver driver;

	@Before
	public void startTest(Scenario scenario) {
		
		switch (bundle.getString("env.navegador").toUpperCase()) {
			
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", bundle.getString("env.path.driver") + "chromedriver");
				driver = new ChromeDriver();
			break;
			
			case "SAFARI": 
				driver = new SafariDriver();
		default:
			break;
		}
		
		driver.get(bundle.getString("env.url.application"));
		
		if(bundle.getString("env.window.maximize").trim().equalsIgnoreCase("true") )
			driver.manage().window().fullscreen();
	}

	@After
	public void tearDown(Scenario scenario) {
		
		Helper.screenshot(scenario);
		
		driver.close();
	}
	
	public static WebDriver getDriver() { 
		return driver;
	}
}
