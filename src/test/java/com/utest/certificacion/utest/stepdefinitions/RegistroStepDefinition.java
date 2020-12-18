package com.utest.certificacion.utest.stepdefinitions;

import com.utest.certificacion.utest.models.DatoRegistro;
import com.utest.certificacion.utest.tasks.Registrarse;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.utest.certificacion.utest.userinterfaces.HomeComponents.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
        theActorInTheSpotlight().wasAbleTo(Click.on(BUTTON_JOIN_TODAY));
    }

    @When("^el se registra con sus datos$")
    public void elSeRegistraConSusDatos(List<DatoRegistro> datoRegistro) {
        theActorInTheSpotlight().attemptsTo(Registrarse.conLos(datoRegistro.get(0)));

    }

    @Then("^el deberia ver el Mensaje: (.*)$")
    public void elDeberiaVerElMensajeWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(String mensaje) {

    }




}
