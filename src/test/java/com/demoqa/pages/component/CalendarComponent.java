package com.demoqa.pages.component;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String year, String month, String day) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0"+day).click();

    }
}
