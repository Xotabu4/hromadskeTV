package hromadske.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Александр on 26.03.2015.
 * <p/>
 * This pageobject describes search page which is page what you can get after launching a search on home page
 * Or also you can access it with direct link http://www.hromadske.tv/search/
 */
public class SearchPage extends Page {
    @FindBy(css = ".all-news-block")
    WebElement searchResultsBlock;

    @FindBy(css = "form.big-search-form div.area input")
    WebElement searchField;

    public SearchPage() {
        super();
    }

    public SearchPage open() {
        //to avoid recursive call, calling Selenide.open directly.
        Selenide.open("/search");

        return this;
    }

    public void searchFor(String text) {
        type(searchField, text);
        $("#button-search").click();
    }

    public SelenideElement getSearchResultsBlock() {
        //wrapper to get selenide element
        return (SelenideElement) searchResultsBlock;
    }

}
