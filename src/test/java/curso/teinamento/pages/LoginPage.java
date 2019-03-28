package curso.teinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "userName")
	private WebElement campoUsuario;
	
	@FindBy(name = "password")
	private WebElement campoSenha;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement botaoSignIn;

	@FindBy(linkText = "REGISTER")
	private WebElement linkRegister;
	
	public boolean checkPage() { 
		return botaoSignIn.isDisplayed();		
	}
	
	public void realizarLogin (String usuario, String senha){
		campoUsuario.sendKeys(usuario);
		campoSenha.sendKeys(senha);
		botaoSignIn.click();
	}
	
	public void clickLinkRegister() { 
		linkRegister.click();
	}
}