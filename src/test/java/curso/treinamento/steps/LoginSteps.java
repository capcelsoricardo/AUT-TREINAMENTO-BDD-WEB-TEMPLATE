package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.teinamento.pages.HomePage;
import curso.teinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;

public class LoginSteps {

	private LoginPage loginPage = new LoginPage(Hooks.getDriver());
	private HomePage homePage = new HomePage(Hooks.getDriver());

	@Dado("^que eu esteja na tela de login$")
	public void queEuDesejeRealizarLogin() {
		Assert.assertTrue("Aplicação NewTours não foi apresentada.", loginPage.checkPage());
	}

	@Então("^sou autenticado com sucesso$")
	public void souAutenticadoComSucesso() {
		Assert.assertTrue("Login não foi realizado com sucesso.", homePage.checkPage());
	}
	
	@Então("^não sou direcionado para a tela Sign-On$")
	public void nãoSouDirecionadoParaATelaSignOn()  {
		Assert.assertTrue("Login realizado com sucesso.", (homePage.checkPage() == false));
	}
		
	@Quando("^faço login com o usuário \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void façoLoginCom(String usuario, String senha)  {
		
		loginPage.realizarLogin(usuario, senha);
	}
}
