package com.utest.certificacion.utest.tasks;

import com.utest.certificacion.utest.models.DatoRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.utest.certificacion.utest.userinterfaces.FormularioRegistroComponents.*;

public class Registrarse implements Task {

    private String firsName;
    private String lastName;
    private String emailAddress;
    private String month;
    private String day;
    private String year;
    private String languages;
    private String password;

    public Registrarse(String firsName, String lastName, String emailAddress, String month, String day, String year, String languages, String password) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(firsName).into(CAMPO_FIRSTNAME),
                Enter.theValue(lastName).into(CAMPO_LASTNAME),
                Enter.theValue(emailAddress).into(CAMPO_EMAIL_ADDRESS),
                Enter.theValue(languages).into(CAMPO_LANGUAGE),
                SelectFromOptions.byVisibleText(month).from(MONTH),
                SelectFromOptions.byVisibleText(day).from(DAY),
                SelectFromOptions.byVisibleText(year).from(YEAR),
                Click.on(BUTTON_NEXT_LOCATION),
                Click.on(BUTTON_NEXT_DEVICES),
                Click.on(BUTTON_NEXT_LAST_STEP),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Enter.theValue(password).into(CAMPO_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_STAY_INFORMED),
                Click.on(CHECKBOX_UTEST_TERMS_OF_USE),
                Click.on(CHECKBOX_I_HAVE_READ_AND_ACCEPT),
                Click.on(BUTTON_COMPLETE_SETUP));
    }

    public static Registrarse conLos(DatoRegistro datoRegistro){
        return new Registrarse(datoRegistro.getFirsName(), datoRegistro.getLastName(), datoRegistro.getEmailAddress(),
                datoRegistro.getMonth(), datoRegistro.getDay(), datoRegistro.getYear(), datoRegistro.getLanguages(),
                datoRegistro.getPassword());
    }
}
