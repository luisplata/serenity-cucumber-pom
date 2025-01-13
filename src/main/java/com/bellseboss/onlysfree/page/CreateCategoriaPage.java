package com.bellseboss.onlysfree.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.test.onlysfree.com/admin/categoria/create")
public class CreateCategoriaPage extends AdminCategoryPage{

    @FindBy(xpath = "//input[@type='text' and @name='nombre']")
    public WebElementFacade inputNombre;

    @FindBy(xpath = "//textarea[@name='descripcion']")
    public WebElementFacade inputDescripcion;

    @FindBy(xpath = "//select[@name='padre']")
    public WebElementFacade selectPadre;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade btnCreateCategoria;

}
