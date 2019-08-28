package curso.treinamento.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	@Dado("que eu deseje logar no sistema")
	public void que_eu_deseje_logar_no_sistema() {
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/mac/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.phptravels.net/admin");
	    System.out.println("teste");
	}

	@Quando("faço login com o usuário {string} e senha {string} ")
	public void faço_login_com_o_usuário_e_senha(String string, String string2) {
	    System.out.println("Segundo Step");
	}

	@Então("sou autenticado com sucesso")
	public void sou_autenticado_com_sucesso() {
		System.out.println("Terceiro Step");
	    
	}

}
