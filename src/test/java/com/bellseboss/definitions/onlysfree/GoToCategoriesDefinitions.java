package com.bellseboss.definitions.onlysfree;

import com.bellseboss.onlysfree.steps.GoToCategoriesSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoToCategoriesDefinitions {

    @Steps
    GoToCategoriesSteps goToCategoriesSteps;

    @When("I click on the Categories link")
    public void iClickOnTheCategoriesLink() {
        goToCategoriesSteps.clickOnTheCategoriesLink();
    }

    @Then("I should see the Categories page")
    public void iShouldSeeTheCategoriesPage() {
        goToCategoriesSteps.urlContain("categoria");
    }
}
