package pages.components;

import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

public class TableComponents extends RegistrationPage {

    public TableComponents checkResult(String key, String value) {
        table.$(byText(key)).parent()
                .shouldHave(text(value));
        return this;
    }
}