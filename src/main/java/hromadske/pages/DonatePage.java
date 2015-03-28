package hromadske.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DonatePage extends Page {

    public DonatePage open() {
        Selenide.open("/donate");
        return this;
    }

    public boolean donateInformationContains(String textToFind) {
        return $(".a-box").has(text(textToFind));
    }

    public void openMoneyUABlock() {
        $(".pay-list1 li:nth-child(2) a").click();
        $("#form-moneyua").waitUntil(visible, 1000);
    }

    public ElementsCollection getMoneyUAHiddenInputs() {
        return $$("#form-moneyua>input");
    }
}
