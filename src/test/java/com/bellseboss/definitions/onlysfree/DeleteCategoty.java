package com.bellseboss.definitions.onlysfree;

import com.bellseboss.onlysfree.interactions.AdminCategoriesInteractions;
import com.bellseboss.onlysfree.page.AdminCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;

public class DeleteCategoty {

    @Page
    AdminCategoryPage adminCategory;

    @Page
    AdminCategoriesInteractions adminCategoriesInteractions;

    @And("I click on the Delete button of a category")
    public void iClickOnTheDeleteButtonOfACategory() {
        adminCategory.titleCategoria.forEach(
                title -> {
                    if (title.getText().equals("Teste")) {
                        System.out.println("Title: " + title.getText());
                        WebElementFacade buttonDelete = adminCategoriesInteractions.GetButtonToDeleteCategory(title);
                        buttonDelete.click();
                    }
                }
        );
    }

    @Then("I should not see the deleted category in the Categories page")
    public void iShouldNotSeeTheDeletedCategoryInTheCategoriesPage() {
        adminCategory.open();
        System.out.println("Count of categories: " + adminCategory.titleCategoria.size());
        assertThat("Count of categories is not correct", adminCategory.titleCategoria.size() < 2);
    }
}
