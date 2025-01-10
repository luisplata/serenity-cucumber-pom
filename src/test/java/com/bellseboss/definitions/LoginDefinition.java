package com.bellseboss.definitions;

import com.bellseboss.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {

    @Steps
    private LoginSteps loginSteps;

    @Given("que el usuario navega a la pagina de inicio de sesion")
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        loginSteps.openMainPage();
        loginSteps.clearFieldsLogin();
    }

    @When("ingresa las credenciales de acceso correctas")
    public void ingresaLasCredencialesDeAccesoCorrectas() {
        loginSteps.insertCredentials("admin", "serenity");
    }

    @Then("deberia ver la pagina principal")
    public void deberiaVerLaPaginaPrincipal() {
        loginSteps.validateMainPage();
    }
}
