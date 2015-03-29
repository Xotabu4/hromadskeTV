import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import hromadske.pages.DonatePage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.value;
import static org.testng.Assert.assertTrue;

public class DonateTest extends TestBase {

    private String EDRPOU = "38780085";
    private String accountNumber = "26005053139189";
    private String receiver = "ГО ГРОМАДСЬКЕ ТЕЛЕБАЧЕННЯ";
    private String mfo = "321842";
    private String reason = "Добровільна пожертва на здійснення статутної діяльності ГО";
    String CORRECT_BANK_INFORMATION =
            "ЄДРПОУ: " + EDRPOU + "\n" +
                    "\n" +
                    "Р\\р: " + accountNumber + "\n" +
                    "\n" +
                    "Отримувач: " + receiver + "\n" +
                    "\n" +
                    "МФО банку: " + mfo + " ( Київське ГРУ ПАТ КВ “ПРИВАТБАНК”, м.Київ )\n" +
                    "\n" +
                    "Призначення: " + reason + " \"Громадське телебачення\".";

    @Test
    public void bankInformationShouldBeCorrectTest() {
        DonatePage donatePage = new DonatePage().open();
        assertTrue(donatePage.donateInformationContains(CORRECT_BANK_INFORMATION),
                "Bank account information should be correct");
    }

    @Test
    public void moneyUaDonationMethodShouldHaveCorrectParametersTest() {
        DonatePage donatePage = new DonatePage().open();
        donatePage.openMoneyUABlock();

        ElementsCollection hiddenInputsList = donatePage.getMoneyUAHiddenInputs();
        //Verifying number of hidden parameters that passed to MoneyUA with POST.
        hiddenInputsList.shouldBe(CollectionCondition.size(6));
        //Verifying payment details for this donation method
        hiddenInputsList.get(0).shouldHave(attribute("name", "step"), value("2"));
        hiddenInputsList.get(1).shouldHave(attribute("name", "okpo"), value(EDRPOU));
        hiddenInputsList.get(2).shouldHave(attribute("name", "acc"), value(accountNumber));
        hiddenInputsList.get(3).shouldHave(attribute("name", "name"), value(receiver));
        hiddenInputsList.get(4).shouldHave(attribute("name", "mfo"), value(mfo));
        hiddenInputsList.get(5).shouldHave(attribute("name", "info"), value(reason + " Громадське телебачення."));
    }
}
