package curso.teinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import curso.treinamento.utils.Helper;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='/images/masts/mast_register.gif']")
	private WebElement tituloPaginaRegister;
	
	@FindBy(name = "firstName")
	private WebElement campoFirstName;
	
	@FindBy(name = "country")
	private WebElement comboCountry;
	
	@FindBy(id = "email")
	private WebElement campoEmail;
	
	public boolean checkPage() { 
		return tituloPaginaRegister.isDisplayed();
	}
	
	public void preencherContactInformation(String firstName, String lastName, String phone, String email) {
		Helper.preencherCampo(campoFirstName, firstName);
	}
	
	public void preencherMailingInformation(String address, String addressComplement, String city, String stateProvince, String postalCode, String country) {
		new Select(comboCountry).selectByVisibleText(country);
	}
	
	public void preencherUserInformation(String userName, String password, String confirmPassword) {
		Helper.preencherCampo(campoEmail, userName);
	}
	
}
