package com.bellseboss.steps;

import com.bellseboss.page.maps.PeryLothPage;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;

public class PeryLothSteps {

    @Page
    private PeryLothPage peryLothPage;

    public void openPeryLothPage() {
        peryLothPage.open();
    }

    public void validateTitle() {
        String title = peryLothPage.getTitle();
        assertThat("The title is not the expected", !title.isEmpty());
    }

    public void validateTitle(String title) {
        peryLothPage.h1s.forEach(h1 -> {
            assertThat("The title is not the expected", peryLothPage.getTitle().equals(title));
        });
    }

    public void validateCountOfH1(int count) {
        assertThat("The count of H1 is not the expected", peryLothPage.h1s.size() == count);
    }

    public void validateH1Text(String title) {
        peryLothPage.h1s.forEach(h1 -> {
            assertThat("The title is not the expected", h1.waitUntilVisible().getText().equals(title));
        });
    }

    public void validateImage() {
        assertThat("The image is not the expected", !peryLothPage.images.isEmpty());
    }

    public void validateCountOfH2(int count) {
        System.out.println("The count of H2 is: " + peryLothPage.h2s.size());
        assertThat("The count of H2 is not the expected", peryLothPage.h2s.size() == count);
    }

    public void validateH2Text(String text) {
        peryLothPage.h2s.forEach(h2 -> {
            assertThat("The text is not the expected", h2.waitUntilVisible().getText().equals(text));
        });
    }

    public void validateCountOfButtons(int count) {
        assertThat("The count of buttons is not the expected", peryLothPage.buttons.size() == count);
    }

    public void validateCountOfArticles(int count) {
        assertThat("The count of articles is not the expected", peryLothPage.articles.size() >= count);
    }

    public void showCountOfArticles() {
        System.out.println("The count of articles is: " + peryLothPage.articles.size());
    }

    public void validateImagesInArticles() {
        peryLothPage.imagesInArticles.forEach(image -> {
            assertThat("The image is not the expected", !image.getAttribute("src").isEmpty());
        });
    }

    public void validateFirstH2Text(String text) {
        assertThat("The text is not the expected", peryLothPage.h2s.get(0).waitUntilVisible().getText().equals(text));
    }

    public void validateSecondH2Text(String text) {
        assertThat("The text is not the expected", peryLothPage.h2s.get(1).waitUntilVisible().getText().equals(text));
    }
}
