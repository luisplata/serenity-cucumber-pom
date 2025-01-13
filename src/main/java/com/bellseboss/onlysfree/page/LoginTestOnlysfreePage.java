package com.bellseboss.onlysfree.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.test.onlysfree.com/login")
public class LoginTestOnlysfreePage extends PageObject {

    @FindBy(xpath = "//input[@name='email']")
    public WebElementFacade inputEmail;

    @FindBy(xpath = "//input[@name='pass']")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElementFacade btnLogin;
}
