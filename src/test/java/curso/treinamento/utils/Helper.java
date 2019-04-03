package curso.treinamento.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import curso.treinamento.setup.Hooks;

public class Helper {
	
	public static void preencherCampo(WebElement elemento, String valor) { 
		elemento.sendKeys(valor);
	}
	
	public static void clicarBotao(WebElement elemento) { 
		elemento.click();
	}

	public static void screenshot(Scenario scenario) { 
		File file = ((TakesScreenshot) Hooks.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/"+ scenario.getId() +".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
