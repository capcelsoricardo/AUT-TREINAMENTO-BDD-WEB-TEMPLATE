package curso.teinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	public HomePage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='SIGN-OFF']")
	private WebElement linkSignOff;
	
	@FindBy(xpath = "//input[@type='radio'][@value='oneway']")
	private WebElement radioButtonOneWay;	
	
	@FindBy(xpath = "//input[@type='radio'][contains(@value,'roundtrip')]")
	private WebElement radioButtonRoundTrip;
	
	@FindBy(name = "passCount")
	private WebElement comboPassengers;
	
	@FindBy(name = "fromPort")
	private WebElement comboDepartingFrom;
	
	@FindBy(name = "fromMonth")
	private WebElement comboOnMonth;
	
	@FindBy(name = "fromDay")
	private WebElement comboOnDay;
	
	@FindBy(name = "toPort")
	private WebElement comboArrivingIn;
	
	@FindBy(name = "toMonth")
	private WebElement comboReturningMonth;
	
	@FindBy(name = "toDay")
	private WebElement comboReturningDay;
	
	public boolean checkPage() { 
		
		try {
			return linkSignOff.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void preencherFlightDetails(String type, String passengers, String departingFrom, 
			String onMonth, String onDay, String arrivingIn, String returningMonth, String returningDay) {
		
		if(type.toLowerCase().contains("one"))
			radioButtonOneWay.click();
		else
			radioButtonRoundTrip.click();
		
		new Select(comboPassengers).selectByValue(passengers);
		new Select(comboDepartingFrom).selectByValue(departingFrom);
		new Select(comboOnMonth).selectByValue(onMonth);
		new Select(comboOnDay).selectByValue(onDay);
		new Select(comboArrivingIn).selectByValue(arrivingIn);
		new Select(comboReturningMonth).selectByValue(returningMonth);
		new Select(comboReturningDay).selectByValue(returningDay);		
	}
}
