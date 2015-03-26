package hromadske.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

/*
 * Sample page
 * 
 * @author Sebastiano Armeli-Battana
 */
public class HomePage extends Page {

    @FindBy(css = "#text-01")
    WebElement smallSearchField;

    public HomePage() {
        super();
    }


    public SearchPage searchFor(String text) {
        type(smallSearchField, text);
        //Clicking search button.
        $("input[value='search']").click();
        //returning search page to make chain calls.
        return new SearchPage();
    }
}
