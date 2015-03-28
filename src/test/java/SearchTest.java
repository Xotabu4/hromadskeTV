import hromadske.pages.HomePage;
import hromadske.pages.SearchPage;
import org.testng.annotations.Test;

import static hromadske.pages.SearchPage.searchResultsContains;
import static org.testng.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: v-achotemskoy (xotabu4@gmail.com)
 * Date: 3/26/15
 * Time: 5:13 PM
 */
public class SearchTest extends TestBase {
    final String CORRECT_SEARCH_REQUEST = "громадське";

    @Test
    public void searchFromHomePageShouldBeSuccessfulTest() {
        new HomePage().searchFor(CORRECT_SEARCH_REQUEST);

        assertTrue(searchResultsContains(CORRECT_SEARCH_REQUEST));
    }

    @Test
    public void searchFromSearchPageShouldBeSuccessfulTest() {
        SearchPage searchPage = new SearchPage().open();
        searchPage.searchFor(CORRECT_SEARCH_REQUEST);

        assertTrue(searchResultsContains(CORRECT_SEARCH_REQUEST));
    }
}
