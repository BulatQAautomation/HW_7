package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.CalendarComponents;
import pages.components.StateCityComponents;

public class DemoQATests extends TestBase {
    TestData testData = new TestData();
    RegistrationPage registrationPage = new RegistrationPage();
    CalendarComponents calendarComponents = new CalendarComponents();
    StateCityComponents stateCityComponents = new StateCityComponents();

    @Test
    void fillingPageTest() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserEmail(testData.email)
                .setUserNumber(testData.number)
                .uploadPicture("example.jpg")
                .setCurrentAdress(testData.adress)
                .setGender()
                .setHobbies()
                .setSubject("Maths");
        calendarComponents.setDate("December", "1992");
        stateCityComponents.setStateCity("Haryana", "Karnal");
        registrationPage.clickSubmit();
        registrationPage.checkResult();
    }
}
