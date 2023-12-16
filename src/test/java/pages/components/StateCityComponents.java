package pages.components;

import pages.RegistrationPage;

public class StateCityComponents extends RegistrationPage {
    public void setStateCity(String state, String city) {
        stateButton.click();
        stateInput.setValue(state).pressEnter();
        cityButton.click();
        cityInput.setValue(city).pressEnter();
    }
}
