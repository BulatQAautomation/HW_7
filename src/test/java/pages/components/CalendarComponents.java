package pages.components;

import pages.RegistrationPage;

import static com.codeborne.selenide.Selectors.byText;

public class CalendarComponents extends RegistrationPage {
    public void setDate(String month, String year, String day) {
        dateOfBirth.click();
        monthOfBirth.selectOption(month);
        datePicker.selectOption(year);
        birthChoose.$(byText(day)).click();
    }
}
