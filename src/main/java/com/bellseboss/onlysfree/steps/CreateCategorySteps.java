package com.bellseboss.onlysfree.steps;

import com.bellseboss.onlysfree.page.AdminCategoryPage;
import com.bellseboss.onlysfree.page.CreateCategoriaPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CreateCategorySteps {

    @Page
    AdminCategoryPage adminCategoryPage;

    @Page
    CreateCategoriaPage createCategoriaPage;

    @Step("Click on the Create Category button")
    public void clickOnTheCreateCategoryButton() {

    }
}
