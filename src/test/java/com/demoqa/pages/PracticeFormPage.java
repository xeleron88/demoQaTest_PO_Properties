package com.demoqa.pages;

import com.demoqa.pages.component.CheckTableResultsComponent;
import com.demoqa.pages.component.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {
    private final CheckTableResultsComponent CheckTableResults = new CheckTableResultsComponent();
    private final CalendarComponent calendarComponent = new CalendarComponent();
    public PracticeFormPage openPage(String url) {
        open(url);
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }
        public PracticeFormPage setFirstName(String firstName) {
        $("#firstName").setValue(firstName);

        return this;
    }
        public PracticeFormPage setLastName(String lastName) {
        $("#lastName").setValue(lastName);

        return this;
    }
        public PracticeFormPage setEmail(String email) {
        $("#userEmail").setValue(email);

        return this;
    }
        public PracticeFormPage setGender(String gender) {
        $$(".custom-radio").findBy(text(gender)).click();

        return this;
    }
        public PracticeFormPage setPhoneNumber(String phoneNumber) {
        $("#userNumber").setValue(phoneNumber);

        return this;
    }
    public PracticeFormPage setBirthDate(String year, String month, String day) {
        calendarComponent.setDate(year, month, day);
        return this;
    }
        public PracticeFormPage setSubjects(String subjects) {
        $("#subjectsInput").setValue(subjects).pressEnter();

        return this;
    }
        public PracticeFormPage setHobbie(String hobbie) {
        $$(".custom-control-label").findBy(text(hobbie)).click();

        return this;
    }
        public PracticeFormPage setPicture(String picture) {
        $("#uploadPicture").uploadFromClasspath(picture);

        return this;
    }
        public PracticeFormPage setAdress(String state, String city, String adress) {
            $("#currentAddress").setValue(adress);
            $("#state").click();
            $(byText(state)).click();
            $("#city").click();
            $(byText(city)).click();


        return this;
    }
        public void clickSubmitButton() {
            $("#submit").click();

        }
        public PracticeFormPage checkVisible() {
        CheckTableResults.checkVisible();

        return this;
    }
        public PracticeFormPage checkTableElement(String element, String value) {
        CheckTableResults.checkTableElement(element, value);

        return this;
    }

}
