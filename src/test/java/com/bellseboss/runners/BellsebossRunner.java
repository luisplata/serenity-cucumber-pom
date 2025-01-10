package com.bellseboss.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.bellseboss.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"
)
public class BellsebossRunner {
}
