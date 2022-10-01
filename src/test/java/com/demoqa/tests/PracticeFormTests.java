package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.PracticeFormPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PracticeFormTests {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticeFormPage checkTableElement = new PracticeFormPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        Faker faker = new Faker();

        String url = "/automation-practice-form";
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String gender = "Male";
        String phoneNumber = faker.phoneNumber().subscriberNumber(10);
        String day = "16";
        String month = "November";
        String year = "1988";
        String subjects = "English";
        String hobbie = "Reading";
        String picture = "cat.jpg";
        String adress = faker.address().streetAddress();
        String state = "Haryana";
        String city = "Karnal";

        practiceFormPage.openPage(url)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
                .setBirthDate(year, month, day)
                .setSubjects(subjects)
                .setHobbie(hobbie)
                .setPicture(picture)
                .setAdress(state, city, adress)
                .clickSubmitButton()
        ;


        // validation of data
        checkTableElement.checkVisible()
                .checkTableElement("Student Name",firstName + " " + lastName)
                .checkTableElement("Student Email",email)
                .checkTableElement("Gender", gender)
                .checkTableElement("Mobile", phoneNumber)
                .checkTableElement("Date of Birth", day + " " + month + "," + year)
                .checkTableElement("Subjects", subjects)
                .checkTableElement("Hobbies", hobbie)
                .checkTableElement("Picture", picture)
                .checkTableElement("Address", adress)
                .checkTableElement("State and City", state + " " + city);
    }

}
