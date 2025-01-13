package com.bellseboss.onlysfree.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("https://www.test.onlysfree.com/admin/categoria")
public class AdminCategoryPage  extends AdminTestOnlysfreePage {

    @FindBy(xpath = "//div[3 and @class='right_col']/div/div/div/div/div[1]/ul/li/a")
    public WebElementFacade btnNewCategoria;

    @FindBy(xpath = "//div[@role='dialog']/div[2]")
    public WebElementFacade modalNewCategoria;

    @FindBy(xpath = "//div[@role='dialog']/div[3]/div/button")
    public WebElementFacade btnCloseModalNewCategoria;

    @FindBy(xpath = "//div[@class='x_content']//div[contains(@class,'profile_details')]/div/div[1]/div[1]/h2")
    public List<WebElementFacade> titleCategoria;

}
