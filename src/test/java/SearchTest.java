import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.*;

/**
 * Created with IntelliJ IDEA.
 * User: v-achotemskoy (xotabu4@gmail.com)
 * Date: 3/26/15
 * Time: 5:13 PM
 */
public class SearchTest extends TestBase {

    @Test
    public void SearchShouldBeSuccessfullWithValidData() {

        $("input[value='search']").click();
        $("form.big-search-form div.area input").sendKeys("громадське");
        $("#button-search").click();

    }
}
