import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.selenium.wrapper.LoggingWrapper;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: v-achotemskoy (xotabu4@gmail.com)
 * Date: 3/26/15
 * Time: 5:19 PM
 */
public class TestBase {

    @BeforeSuite
    public void settingUpForTests() {
        //Wrapping webdriver with special LoggingWrapper that will log all actions that webdriver does.
        setWebDriver(new LoggingWrapper(getWebDriver()));

        Configuration.baseUrl="http://www.hromadske.tv";
        Configuration.dismissModalDialogs=true;
        Configuration.holdBrowserOpen = true;

        open("/");
    }

    //Setting alwaysRun to kill browser regardless of test result.
    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        getWebDriver().close();
    }
}
