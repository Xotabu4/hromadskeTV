package hromadske.pages;

import com.codeborne.selenide.SelenideElement;

/*
 * Abstract class representation of a Page in the UI. Page object pattern
 * 
 * @author Sebastiano Armeli-Battana
 */
public abstract class Page {

    protected static boolean containsText(SelenideElement elementToFindText, String textToFind) {
        return elementToFindText.getText().toLowerCase().contains(textToFind.toLowerCase());
    }

    protected void type(SelenideElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

}
