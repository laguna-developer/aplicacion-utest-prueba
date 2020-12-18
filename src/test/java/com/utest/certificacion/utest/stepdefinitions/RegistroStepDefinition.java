package com.utest.certificacion.utest.stepdefinitions;

import com.utest.certificacion.utest.models.DatoRegistro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegistroStepDefinition {

    @Before
    public void setUpOnStage(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(elNavegador)));
        OnStage.theActorCalled("Nicolas Alvarino");
    }

    @Managed
    private WebDriver elNavegador;


    @Given("^que Nicolas Alvarino se encuentra en el Home de la pagina$")
    public void queNicolasAlvarinoSeEncuentraEnElHomeDeLaPagina() {

    }


    @When("^el se registra con sus datos$")
    public void elSeRegistraConSusDatos(List<DatoRegistro> datoRegistro) {

    }

    @Then("^el deberia ver el Mensaje: Welcome to the world's largest community of freelance software testers!$")
    public void elDeberiaVerElMensajeWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters() {

    }




}
