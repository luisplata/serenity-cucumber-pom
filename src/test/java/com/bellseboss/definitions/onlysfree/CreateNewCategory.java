package com.bellseboss.definitions.onlysfree;

import com.bellseboss.onlysfree.page.AdminCategoryPage;
import com.bellseboss.onlysfree.page.AdminTestOnlysfreePage;
import com.bellseboss.onlysfree.page.CreateCategoriaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;

public class CreateNewCategory {

    @Page
    AdminTestOnlysfreePage adminTestOnlysfreePage;

    @Page
    AdminCategoryPage adminCategory;

    @Page
    CreateCategoriaPage createCategoriaPage;

    @And("I click on the New Category button")
    public void iClickOnTheNewCategoryButton() {
        adminTestOnlysfreePage.menuCategorias.waitUntilVisible().click();
        adminTestOnlysfreePage.urlContain("categoria");
        adminCategory.btnNewCategoria.waitUntilVisible().click();
    }

    @And("I fill in the form with valid data")
    public void iFillInTheFormWithValidData() {
        createCategoriaPage.inputNombre.waitUntilVisible().type("Teste");
        createCategoriaPage.inputDescripcion.waitUntilVisible().type("Teste descriptions");
        createCategoriaPage.selectPadre.waitUntilVisible().selectByIndex(0);
        createCategoriaPage.btnCreateCategoria.waitUntilVisible().click();
    }

    @Then("I should see the new category in the Categories page")
    public void iShouldSeeTheNewCategoryInTheCategoriesPage() {
        adminCategory.open();
        assertThat("Count of categories is not correct", adminCategory.titleCategoria.size() >= 2);
    }
}
