package hromadske.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Александр on 26.03.2015.
 * <p/>
 * This pageobject describes search page which is page what you can get after launching a search on home page
 * Or also you can access it with direct link http://www.hromadske.tv/search/
 */
public class SearchPage extends Page {

    public static boolean searchResultsContains(String textToFind) {
        //wrapper to get selenide element
        return containsText($(".all-news-block"), textToFind);
    }

    public SearchPage open() {
        //to avoid recursive call, calling Selenide.open directly.
        Selenide.open("/search");

        return this;
    }

    public void searchFor(String text) {
        type($("form.big-search-form div.area input"), text);
        $("#button-search").click();
        //Waiting for ajax call to finish loading news.
        $(".all-news-list").waitUntil(visible, 5000);
    }

}
