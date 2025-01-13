package com.bellseboss.definitions;

import com.bellseboss.steps.PeryLothSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PeryLothPageDefinition {

    @Steps
    PeryLothSteps peryLothSteps;

    @Given("that the user navigates to the Peryloth page")
    public void openBrowser(){
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        } else if (os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_mac");
        } else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_linux");
        }
        peryLothSteps.openPeryLothPage();
    }

    @When("the user validates the information about the page")
    public void theUserValidatesTheInformationAboutThePage() {
        peryLothSteps.validateTitle();
    }

    @Then("the page title should be {string}")
    public void thePageTitleShouldBe(String title) {
        peryLothSteps.validateTitle(title);
    }

    @And("there should be exactly {int} `h1` element on the page")
    public void thereShouldBeExactlyH1ElementOnThePage(int count) {
        peryLothSteps.validateCountOfH1(count);
    }

    @And("the only `h1` element should contain {string}")
    public void theOnlyHElementShouldContain(String title) {
        peryLothSteps.validateH1Text(title);
    }

    @And("there should be an image inside a `div` with the class `image`")
    public void thereShouldBeAnImageInsideADivWithTheClass() {
        peryLothSteps.validateImage();
    }

    @And("there should be a {int} buttons to navigate to the different outside pages")
    public void thereShouldBeAButtonsToNavigateToTheDifferentOutsidePages(int count) {
        peryLothSteps.validateCountOfButtons(count);
    }

    @And("there should be greater than {int} `article` in `div` with the class `inner`")
    public void thereShouldBeGreaterThanArticleInDivWithTheClassInner(int count) {
        peryLothSteps.validateCountOfArticles(count);
    }

    @And("Say how much `article` there are in `div` with the class `inner`")
    public void sayHowMuchArticleThereAreInDivWithTheClassInner() {
        peryLothSteps.showCountOfArticles();
    }

    @And("there should be each `article` with a `image` src attribute that is not empty")
    public void thereShouldBeEachArticleWithAImageSrcAttributeThatIsNotEmpty() {
        peryLothSteps.validateImagesInArticles();
    }

    @And("there should be exactly {int} h2 element on the page")
    public void thereShouldBeExactlyH2ElementOnThePage(int count) {
        peryLothSteps.validateCountOfH2(count);
    }

    @And("the only the first h2 element should contain {string}")
    public void theOnlyFirstH2ElementShouldContain(String text) {
        peryLothSteps.validateFirstH2Text(text);
    }

    @And("the only the second h2 element should contain {string}")
    public void theOnlySecondH2ElementShouldContain(String text) {
        peryLothSteps.validateSecondH2Text(text);
    }
}
