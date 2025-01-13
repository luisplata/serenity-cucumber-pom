package com.bellseboss.onlysfree.steps;

import com.bellseboss.onlysfree.page.AdminTestOnlysfreePage;
import com.bellseboss.onlysfree.page.LoginTestOnlysfreePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginOnlysfreeSteps {

    @Page
    LoginTestOnlysfreePage loginTestOnlysfreePage;

    @Page
    AdminTestOnlysfreePage adminTestOnlysfreePage;

    @Step("Open the login page")
    public void openLoginPage() {
        loginTestOnlysfreePage.open();
    }

    @Step("Login with email: {0} and password: {1}")
    public void login(String email, String password) {
        loginTestOnlysfreePage.inputEmail.waitUntilVisible().type(email);
        loginTestOnlysfreePage.inputPassword.waitUntilVisible().type(password);
        loginTestOnlysfreePage.btnLogin.waitUntilClickable().click();
    }

    @Step("Open the admin page")
    public void openAdminPage() {
        adminTestOnlysfreePage.open();
        assertThat("Admin Page don't loaded",adminTestOnlysfreePage.titleAdmin.isDisplayed());
    }
}
