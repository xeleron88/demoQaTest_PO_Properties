package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.PracticeFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.UserDataGenerateUtils.*;

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
