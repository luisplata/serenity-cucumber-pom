package com.bellseboss.onlysfree.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://www.test.onlysfree.com/admin")
public class AdminTestOnlysfreePage extends PageObject {
    @FindBy(xpath = "//a[@href='https://www.test.onlysfree.com/admin' and @class='site_title']")
    public WebElementFacade titleAdmin;

    @FindBy(xpath = "//a[text()='Categorias']")
    public WebElementFacade menuCategorias;

    @FindBy(xpath = "//div[@class='profile_info']/h2")
    public WebElementFacade titleProfile;

    public Boolean urlContain(String categoria) {
        return getDriver().getCurrentUrl().contains(categoria);
    }
}
