package curso.treinamento.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	 
	features = { "src/test/resources/features/"},
	glue = {"curso.treinamento.steps","curso.treinamento.setup"}, // Path dos Steps
	//plugin = "pretty",  // Relatório em forma de texto no console
	plugin = {"pretty", "html:target/report-html", "json:target/report.json"},  // Relatório em forma de texto no console	
	monochrome = true, // Muda cor da execução 
	snippets = SnippetType.CAMELCASE, // ?? 
	dryRun = false, // Se tiver setado como true, só irá executar os cenários se todos estiverem implementados
	strict = false, // Falha se não tiver implementado um ou mais passos
	tags = { "@ScenarioComum" }  // Declaração das tags "~@ParaNegarUmaTag",  se vc colocar entre chaves ele aceita varias tags
	) 

public class RunnerTest {

}