package com.demoqa.tests;

import com.demoqa.pages.PracticeFormPage;
import org.junit.jupiter.api.Test;

import static com.demoqa.utils.UserDataGenerateUtils.*;
import static io.qameta.allure.Allure.step;

public class PracticeFormTests extends TestBase {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticeFormPage checkTableElement = new PracticeFormPage();


    @Test
    void fillFormTest() {

        step("Open registrations form", () -> {
            practiceFormPage.openPage(url);
        });

        step("Fill form", () -> {
            practiceFormPage.setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setGender(gender)
                    .setPhoneNumber(phoneNumber)
                    .setBirthDate(year, month, day)
                    .setSubjects(subjects)
                    .setHobbie(hobbie)
                    .setPicture(picture)
                    .setAdress(state, city, adress)
                    .clickSubmitButton();
        });

        step("Check form results", () -> {
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
        });
    }

}
