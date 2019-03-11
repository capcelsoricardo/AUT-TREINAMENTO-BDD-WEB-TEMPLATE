# language: pt

Funcionalidade: Login

# Background
#	Contexto: 
#		Dado que eu esteja na tela de login
#		Quando faço login com:
#			| usuario | mercury  |
#			| senha   | mercury  | 
#		Então sou direcionado para a tela Sign-On

	@ScenarioComum
	Cenário: Realizar login
		Dado que eu esteja na tela de login
		Quando faço login com o usuário "mercury" e senha "mercury" 
		Então sou autenticado com sucesso 
		
	#Scenario Outline	
	@ScenarioOutline
	Esquema do Cenário: Tentativa de Login
		Dado que eu esteja na tela de login
		Quando faço login com o usuário "<usuario>" e senha "<senha>" 
		Então sou direcionado para a tela Sign-On
		
	Exemplos:
		| usuario | senha  |
		| mercury | mer    |
		| 123434  | 34     |
		|         | 34     |
		
	
	@ScenarioDataTable
	Cenário: Realizar login
		Dado que eu esteja na tela de login
		Quando faço login com:
			| usuario | mercury  |
			| senha   | 12345678 | 
		Então sou direcionado para a tela Sign-On