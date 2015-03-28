package hromadske.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;

/*
 * Abstract class representation of a Page in the UI. Page object pattern
 * 
 * @author Sebastiano Armeli-Battana
 */
public abstract class Page {

    protected static boolean containsText(SelenideElement elementToFindText, String textToFind) {
        return elementToFindText.has(text(textToFind));
    }

    protected void type(SelenideElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

}
