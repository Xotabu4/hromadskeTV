package hromadske.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/*
 * Sample page
 * 
 * @author Sebastiano Armeli-Battana
 */
public class HomePage extends Page {

    public SearchPage searchFor(String text) {
        //When screen is too small - search field is hided - need to click on opener first.
        if ($("span.btn-opener1").isDisplayed()) {
            $("span.btn-opener1").click();
            $("#text-01").waitUntil(visible, 1000);
        }
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
