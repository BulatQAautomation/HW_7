package tests;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String number = faker.number().digits(10);
    public String adress = faker.address().fullAddress();
}
