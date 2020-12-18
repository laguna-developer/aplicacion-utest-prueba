package com.utest.certificacion.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeComponents {

    public static final Target BUTTON_JOIN_TODAY = Target
            .the("Unete hoy")
            .locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
}
