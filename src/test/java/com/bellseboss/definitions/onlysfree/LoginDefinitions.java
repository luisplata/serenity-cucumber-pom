package com.bellseboss.definitions.onlysfree;

import com.bellseboss.onlysfree.steps.LoginOnlysfreeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {

    @Steps
    LoginOnlysfreeSteps loginOnlysfreeSteps;

    @Given("I am on the login Onlys Free page")
    public void iAmOnTheLoginOnlysFreePage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        loginOnlysfreeSteps.openLoginPage();
    }

    @When("I fill in the login form with valid data")
    public void iFillInTheLoginFormWithValidData() {
        loginOnlysfreeSteps.login("www.luisplata@gmail.com","Nirvana@1");
    }

    @Then("I should be admin user in the Admin Onlys Free page")
    public void iShouldBeAdminUserInTheAdminOnlysFreePage() {
        loginOnlysfreeSteps.openAdminPage();
    }
}
