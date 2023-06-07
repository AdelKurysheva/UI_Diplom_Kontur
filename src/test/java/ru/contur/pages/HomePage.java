package ru.contur.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class HomePage {
    public HomePage openHomePage() {
        step("Открываем главную страницу", () -> {
            open("/about");
        });
        return this;
    }

    public HomePage openCareerPage() {
        step("Открываем страницу поиска вакансий", () -> {
            open("/career");
        });
        return this;
    }
}