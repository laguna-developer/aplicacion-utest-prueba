package com.utest.certificacion.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.utest.certificacion.utest.userinterfaces.HomeComponents.*;

public class ElMensaje implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        WELCOME.resolveFor(actor).getText();
        return Text.of(WELCOME).viewedBy(actor).asString();
    }

    public static ElMensaje mostrado(){
        return new ElMensaje();
    }
}
