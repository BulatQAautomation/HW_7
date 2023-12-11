package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class StateCityComponents {
    public void setStateCity(String state, String city) {
        $("#state").click();
        $("#state input").setValue(state).pressEnter();
        $("#city").click();
        $("#city input").setValue(city).pressEnter();
    }
}
