package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    public SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber.mr-sm-2.form-control"),
            subjectsInput = $("#subjectsInput"),
            uploadPictureButton = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            userGender = $("[for='gender-radio-1']"),
            userHobbiesFirstCheckBox = $("[for='hobbies-checkbox-2']"),
            userHobbiesSecondCheckBox = $("[for='hobbies-checkbox-3']"),
            submitButton = $("#submit"),
            resultsTable = $(".table-responsive"),
            dateOfBirth = $("#dateOfBirthInput"),
            monthOfBirth = $(".react-datepicker__month-select"),
            datePicker = $(".react-datepicker__year-select"),
            birthChoose = $("[aria-label = 'Choose Wednesday, December 9th, 1992']"),
            stateButton = $("#state"),
            stateInput = $("#state input"),
            cityButton = $("#city"),
            cityInput = $("#city input");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setSubject(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        uploadPictureButton.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setCurrentAdress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender() {
        userGender.click();
        return this;
    }

    public RegistrationPage setHobbies() {
        userHobbiesFirstCheckBox.click();
        userHobbiesSecondCheckBox.click();
        return this;
    }

    public RegistrationPage clickSubmit() {
        submitButton.click();
        return this;
    }

    public void checkResult() {
        resultsTable.shouldHave(text("Male"));
        resultsTable.shouldHave(text("09 December,1992"));
        resultsTable.shouldHave(text("Maths"));
        resultsTable.shouldHave(text("Reading, Music"));
        resultsTable.shouldHave(text("example.jpg"));
        resultsTable.shouldHave(text("Haryana Karnal"));
    }


}
