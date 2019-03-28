# language: pt

Funcionalidade: Realizar Compra de Passagem


	Contexto: 
			Dado que eu esteja na tela de login
			Quando faço login com o usuário "mercury" e senha "mercury" 
			Então sou autenticado com sucesso 

	@Sprint3 @DataTable
	Cenário: Realizar Registro
		Dado que eu esteja na tela de Registro
		Quando faço o preenchimento das informações da tela de Register 
			|First Name| Last Name| Phone        | Email           | Address    | Address Complement| City      | State Province| Postal Code| Country | User Name| Password| Confirm Password|
			|Aline     | Ferreira | 5511986591773| teste@teste.com | Rua Cesare | JC Pirituba       | São Paulo |       SP      |  02943000  | BRAZIL  | capaline | 123456  | 123456          | 
		Então sou registrado com sucesso 