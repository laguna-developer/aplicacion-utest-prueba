package com.utest.certificacion.utest.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.utest.certificacion.utest.stepdefinitions",
        tags = "")
public class RegistroRunner {
}
