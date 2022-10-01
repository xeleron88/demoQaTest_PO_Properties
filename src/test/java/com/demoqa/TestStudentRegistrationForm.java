//package com.demoqa;
//
//import com.codeborne.selenide.Configuration;
//import com.demoqa.pages.PracticeFormPage;
//import com.github.javafaker.Faker;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.*;
//
//public class TestStudentRegistrationForm {
//
//    @BeforeAll
//    PracticeFormPage practiceFormPage = new PracticeFormPage();
//    static void setUp() {
//        Configuration.baseUrl = "https://demoqa.com";
//        Configuration.browserSize = "1920x1080";
//        Configuration.holdBrowserOpen = true;
//    }
//
//    @Test
//    void fillFormTest() {
//        Faker faker = new Faker();
//
//        String url = "/automation-practice-form";
//        String firstName = faker.name().firstName();
//        String lastName = faker.name().lastName();
//        String email = faker.internet().emailAddress();
//        String gender = "Male";
//        String phoneNumber = faker.phoneNumber().subscriberNumber(10);
//        String date = "16";
//        String month = "November";
//        String year = "1988";
//        String subjects = "English";
//        String hobbie = "Reading";
//        String picture = "cat.jpg";
//        String adress = faker.address().streetAddress();
//        String state = "Haryana";
//        String city = "Karnal";
//
//        practiceFormPage.openPage(url);
//        $("#firstName").setValue(firstName);
//        $("#lastName").setValue(lastName);
//        $("#userEmail").setValue(email);
//        $$(".custom-radio").findBy(text(gender)).click();
//        $("#userNumber").setValue(phoneNumber);
//        $("#dateOfBirthInput").click();
//        $(".react-datepicker__month-select").selectOption(month);
//        $(".react-datepicker__year-select").selectOption(year);
//        $(".react-datepicker__day--0"+date).click();
//        $("#subjectsInput").setValue(subjects).pressEnter();
//        $$(".custom-control-label").findBy(text(hobbie)).click();
//        $("#uploadPicture").uploadFromClasspath(picture);
//        $("#currentAddress").setValue(adress);
//        $("#state").click();
//        $(byText(state)).click();
//        $("#city").click();
//        $(byText(city)).click();
//        $("#submit").click();
//
//        // validation of data
//        $(".modal-header").shouldHave(text("Thanks for submitting the form"));
//
//        $(".table-responsive").shouldHave(text(firstName + " " + lastName),
//                text(email),
//                text(gender),
//                text(phoneNumber),
//                text(date + " " + month + "," + year),
//                text(subjects),
//                text(hobbie),
//                text(picture),
//                text(adress),
//                text(state + " " + city));
//    }
//
//}
