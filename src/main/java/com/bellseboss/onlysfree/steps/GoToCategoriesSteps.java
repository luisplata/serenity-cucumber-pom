package com.bellseboss.onlysfree.steps;

import com.bellseboss.onlysfree.page.AdminCategoryPage;
import com.bellseboss.onlysfree.page.AdminTestOnlysfreePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;

public class GoToCategoriesSteps {

    @Page
    AdminCategoryPage adminCategoryPage;

    @Page
    AdminTestOnlysfreePage adminTestOnlysfreePage;

    @Step("Click on the Categories link")
    public void clickOnTheCategoriesLink() {
        adminTestOnlysfreePage.menuCategorias.waitUntilVisible().click();
    }

    public void urlContain(String categoria) {
        assertThat("The URL don't contain the category", adminTestOnlysfreePage.urlContain(categoria));
    }
}
