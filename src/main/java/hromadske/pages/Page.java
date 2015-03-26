package hromadske.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/*
 * Abstract class representation of a Page in the UI. Page object pattern
 * 
 * @author Sebastiano Armeli-Battana
 */
public abstract class Page {

    public Page() {
        PageFactory.initElements(getWebDriver(), this);
    }

    public void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

}
