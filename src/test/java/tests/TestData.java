package tests;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();
    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            number = faker.number().digits(10),
            adress = faker.address().fullAddress(),
            state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            city = setCity(state),
            pictureName = "example.jpg",
            gender = faker.options().option("Male", "Female"),
            subjects = faker.options().option("Maths", "Accounting", "Arts", "Social Studies"),
            hobbies = faker.options().option("Sports", "Reading", "Music"),
            day = String.valueOf(faker.number().numberBetween(1, 30)),
            month = faker.options().option("January", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
            year = String.valueOf(faker.number().numberBetween(1977, 2023));

    public static String setCity(String state) {

        if (state.equals("NCR")) {
            return faker.options().option("Delhi", "Gurgaon", "Noida");
        } else if (state.equals("Uttar Pradesh")) {
            return faker.options().option("Agra", "Lucknow", "Merrut");
        } else if (state.equals("Haryana")) {
            return faker.options().option("Karnal", "Panipat");
        } else if (state.equals("Rajasthan")) {
            return faker.options().option("Jaipur", "Jaiselmer");
        } else
            return state;
    }
}
