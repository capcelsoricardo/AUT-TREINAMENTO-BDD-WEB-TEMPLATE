package curso.treinamento.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.teinamento.pages.LoginPage;
import curso.teinamento.pages.RegisterPage;
import curso.treinamento.setup.Hooks;

public class RegistrarUsuarioSteps {

	private LoginPage loginPage = new LoginPage(Hooks.getDriver());
	private RegisterPage registerPage = new RegisterPage(Hooks.getDriver());
	
	@Dado("^que eu esteja na tela de Registro$")
	public void queEuEstejaNaTelaDeRegistro()  {
	   loginPage.clickLinkRegister();
	}

	@Quando("^faço o preenchimento das informações da tela de Register $")
	public void façoOPreenchimentoDasInformaçõesDaTelaDeRegister(DataTable dataTable)  {
		
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		
		registerPage.preencherContactInformation(list.get(0).get("First Name"), "", "", "");
		registerPage.preencherMailingInformation("", "", "", "", "", list.get(0).get("Country"));
		registerPage.preencherUserInformation(list.get(0).get("User Name"), "", "");
	}

	@Então("^sou registrado com sucesso$")
	public void souRegistradoComSucesso()  {

	}
	
}
