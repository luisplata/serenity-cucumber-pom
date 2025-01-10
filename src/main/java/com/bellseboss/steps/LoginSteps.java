package com.bellseboss.steps;

import com.bellseboss.page.interactions.MainPageInteraction;
import com.bellseboss.page.maps.LoginPage;
import com.bellseboss.page.maps.MainPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps {

    @Page
    private LoginPage loginPage;

    @Page
    private MainPage mainPage;

    @Page
    private MainPageInteraction mainPageInteraction;

    @Step("Open the main page")
    public void openMainPage() {
        loginPage.open();
    }
    @Step("clear user and password fields")//clear Fields Login
    public void clearFieldsLogin() {
        loginPage.inputUsername.clear();
        loginPage.inputPassword.clear();
    }

    public void insertCredentials(String user, String password) {
        loginPage.inputUsername.sendKeys(user);
        loginPage.inputPassword.sendKeys(password);
        loginPage.btnLogin.waitUntilClickable().click();
    }

    public void validateMainPage() {
        String title = mainPage.txtTitleMainPage.waitUntilVisible().getText();
        assertThat("The title is not the expected", title.equals(mainPageInteraction.getTitleMainPage()));
    }
}
