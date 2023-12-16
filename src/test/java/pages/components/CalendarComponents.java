package pages.components;

import pages.RegistrationPage;

public class CalendarComponents extends RegistrationPage {
    public void setDate(String month, String year) {
        dateOfBirth.click();
        monthOfBirth.selectOption(month);
        datePicker.selectOption(year);
        birthChoose.click();
    }
}
