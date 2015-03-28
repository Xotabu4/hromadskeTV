package hromadske.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

/*
 * Sample page
 * 
 * @author Sebastiano Armeli-Battana
 */
public class HomePage extends Page {

    public SearchPage searchFor(String text) {
        type($("#text-01"), text);
        //Clicking search button.
        $("input[value='search']").click();
        //returning search page to make chain calls.
        return new SearchPage();
    }

    public HomePage open() {
        Selenide.open("/");
        return this;
    }
}
