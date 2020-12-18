package com.utest.certificacion.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioRegistroComponents {

    public static final Target CAMPO_FIRSTNAME = Target
            .the("Campo Primer Nombre")
            .located(By.id("firstName"));

    public static final Target CAMPO_LASTNAME = Target
            .the("Campo Apellido")
            .located(By.id("lastName"));

    public static final Target CAMPO_EMAIL_ADDRESS = Target
            .the("Campo Email")
            .located(By.id("email"));

    public static final Target MONTH = Target
            .the("Campo Mes")
            .located(By.id("birthMonth"));

    public static final Target DAY = Target
            .the("Campo Dia")
            .located(By.id("birthDay"));

    public static final Target YEAR = Target
            .the("Campo Año")
            .located(By.id("birthYear"));

    public static final Target CAMPO_LANGUAGE = Target
            .the("Campo Lenguaje")
            .locatedBy("//input[@type='search']");

    public static final Target BUTTON_NEXT_LOCATION = Target
            .the("Boton Siguiente Ubicacion")
            .locatedBy("//a[@class='btn btn-blue']");

    public static final Target BUTTON_NEXT_DEVICES = Target
            .the("Boton Siguiente Dispositivos")
            .locatedBy("//a[@class='btn btn-blue pull-right']");

    public static final Target BUTTON_NEXT_LAST_STEP = Target
            .the("Boton Siguiente Ultimo Paso")
            .locatedBy("//a[@aria-label='Next - final step']");

    public static final Target CAMPO_PASSWORD = Target
            .the("Campo Contraseña")
            .located(By.id("password"));

    public static final Target CAMPO_CONFIRM_PASSWORD = Target
            .the("Campo Confirmar Contraseña")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_STAY_INFORMED = Target
            .the("Campo Confirmar Contraseña")
            .located(By.name("newsletterOptIn"));

    public static final Target UTEST_TERMS_OF_USE = Target
            .the("Selecciona Terminos de uso de Utest")
            .located(By.name("termOfUse"));

    public static final Target I_HAVE_READ_AND_ACCEPT = Target
            .the("Selecciona he leido y acepto la politica de Privacidad")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP = Target
            .the("Boton Configuracion Completa")
            .located(By.id("laddaBtn"));

}
