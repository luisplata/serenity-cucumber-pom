package com.bellseboss.page.maps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://peryloth.com/")
public class PeryLothPage extends PageObject {

    @FindBy(xpath = "//h1")
    public List<WebElementFacade> h1s;

    @FindBy(xpath = "//h2")
    public List<WebElementFacade> h2s;

    @FindBy(xpath = "//div[@class='image']/img")
    public List<WebElementFacade> images;

    @FindBy(xpath = "//div[@class='content']//li/a")
    public List<WebElementFacade> buttons;

    @FindBy(xpath = "//div[@class='inner']/article")
    public List<WebElementFacade> articles;

    @FindBy(xpath = "//div[@class='inner']/article//img")
    public List<WebElementFacade> imagesInArticles;
}
