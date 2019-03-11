$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 5074842052,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "# Background"
    },
    {
      "line": 6,
      "value": "#\tContexto:"
    },
    {
      "line": 7,
      "value": "#\t\tDado que eu esteja na tela de login"
    },
    {
      "line": 8,
      "value": "#\t\tQuando faço login com:"
    },
    {
      "line": 9,
      "value": "#\t\t\t| usuario | mercury  |"
    },
    {
      "line": 10,
      "value": "#\t\t\t| senha   | mercury  |"
    },
    {
      "line": 11,
      "value": "#\t\tEntão sou direcionado para a tela Sign-On"
    }
  ],
  "line": 14,
  "name": "Realizar login",
  "description": "",
  "id": "login;realizar-login",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 13,
      "name": "@ScenarioComum"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "que eu esteja na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "faço login com o usuário \"mercury\" e senha \"mercury\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 17,
  "name": "sou autenticado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.queEuEstejaNaTelaDeLogin()"
});
formatter.result({
  "duration": 726075680,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 26
    },
    {
      "val": "mercury",
      "offset": 44
    }
  ],
  "location": "LoginSteps.façoLoginComOUsuárioESenha(String,String)"
});
formatter.result({
  "duration": 40106166374,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.souAutenticadoComSucesso()"
});
formatter.result({
  "duration": 18487,
  "status": "passed"
});
formatter.after({
  "duration": 707166702,
  "status": "passed"
});
});