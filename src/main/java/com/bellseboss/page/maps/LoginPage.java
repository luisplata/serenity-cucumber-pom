package com.bellseboss.page.maps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demo.serenity.is/Account/Login")
public class LoginPage extends PageObject {
    @FindBy(how = How.NAME, using = "Username")
    public WebElementFacade inputUsername; //WebElement

    //    @FindBy(id = "LoginPanel0_Password")
    @FindBy(how = How.ID, using = "LoginPanel0_Password")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public WebElementFacade btnLogin;
}
