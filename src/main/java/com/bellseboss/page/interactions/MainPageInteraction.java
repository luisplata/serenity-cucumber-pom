package com.bellseboss.page.interactions;

import com.bellseboss.page.maps.MainPage;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

public class MainPageInteraction extends PageObject {

    @Page
    private MainPage mainPage;

    public String getTitleMainPage() {
        return "Tablero";
    }
}
