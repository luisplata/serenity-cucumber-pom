package com.bellseboss.onlysfree.interactions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;

public class AdminCategoriesInteractions extends PageObject {

    // //div[@class='x_content']//div[contains(@class,'profile_details')]/div/div[1]/div[1]/h2

    // //div[@class='x_content']//div[contains(@class,'profile_details')]/div/div[2]//form/button

    public WebElementFacade GetButtonToDeleteCategory(WebElementFacade category) {
        WebElementFacade divParent = category.findBy(By.xpath("ancestor::div[contains(@class, 'profile_details')]"));
        return divParent.findBy(By.xpath("/div/div[2]//form/button"));
    }
}
