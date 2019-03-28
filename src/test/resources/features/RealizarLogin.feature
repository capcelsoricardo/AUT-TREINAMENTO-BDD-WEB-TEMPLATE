# language: pt

Funcionalidade: Login

# Background
#	Contexto: 
#		Dado que eu esteja na tela de login
#		Quando faço login com:
#			| usuario | mercury  |
#			| senha   | mercury  | 
#		Então sou direcionado para a tela Sign-On

	@Sprint1 @RealizarLogin
	Cenário: Realizar login
		Dado que eu esteja na tela de login
		Quando faço login com o usuário "mercury" e senha "mercury" 
		Então sou autenticado com sucesso 
		
	@Sprint1 @ScenarioOutline
	Esquema do Cenário: Tentativa de Login
		Dado que eu esteja na tela de login
		Quando faço login com o usuário "<usuario>" e senha "<senha>" 
		Então não sou direcionado para a tela Sign-On
		
	Exemplos:
		| usuario | senha  |
		| mercury | mer    |
		| 123434  | 34     |
		|         | 34     |