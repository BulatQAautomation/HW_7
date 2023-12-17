package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.CalendarComponents;
import pages.components.StateCityComponents;
import pages.components.TableComponents;

public class DemoQATests extends TestBase {
    TestData testData = new TestData();
    RegistrationPage registrationPage = new RegistrationPage();
    CalendarComponents calendarComponents = new CalendarComponents();
    StateCityComponents stateCityComponents = new StateCityComponents();
    TableComponents tableComponents = new TableComponents();

    @Test
    void fillingPageTest() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserEmail(testData.email)
                .setUserNumber(testData.number)
                .uploadPicture(testData.pictureName)
                .setCurrentAdress(testData.adress)
                .setGender(testData.gender)
                .setHobbies(testData.hobbies)
                .setSubject(testData.subjects);
        calendarComponents.setDate(testData.month, testData.year, testData.day);
        stateCityComponents.setStateCity(testData.state, testData.city);
        registrationPage.clickSubmit();
        tableComponents.checkResult("Student Name", testData.firstName)
                .checkResult("Student Name", testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.number)
                .checkResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResult("Subjects", testData.subjects)
                .checkResult("Hobbies", testData.hobbies)
                .checkResult("Picture", testData.pictureName)
                .checkResult("Address", testData.adress)
                .checkResult("State and City", testData.state + " " + testData.city);
    }
}