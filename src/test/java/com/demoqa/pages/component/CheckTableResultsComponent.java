package com.demoqa.pages.component;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckTableResultsComponent {
    public void checkVisible(){
        $(".table-responsive").shouldBe(visible);
    }

    public void checkTableElement(String element, String value){
        $(".table-responsive").$(byText(element)).parent().shouldHave(text(value));
    }
}
