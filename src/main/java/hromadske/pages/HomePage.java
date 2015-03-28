package hromadske.pages;

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
}
