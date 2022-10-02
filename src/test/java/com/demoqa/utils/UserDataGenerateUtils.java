package com.demoqa.utils;

import com.github.javafaker.Faker;

public class UserDataGenerateUtils {
    private static final Faker faker = new Faker();

    public static String
    url = "/automation-practice-form",
    firstName = faker.name().firstName(),
    lastName = faker.name().lastName(),
    email = faker.internet().emailAddress(),
    gender = faker.demographic().sex(),
    phoneNumber = faker.phoneNumber().subscriberNumber(10),
    day = String.valueOf(faker.number().numberBetween(10, 31)),
    month = RandomMonthUtils.randomMonth(),
    year = String.valueOf(faker.number().numberBetween(1970, 2000)),
    subjects = "English",
    hobbie = "Reading",
    picture = "cat.jpg",
    adress = faker.address().streetAddress(),
    state = "Haryana",
    city = "Karnal";
}
