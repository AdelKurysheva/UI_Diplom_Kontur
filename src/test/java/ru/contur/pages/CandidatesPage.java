package ru.contur.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CandidatesPage {
    private final SelenideElement
            candidatesPage = $("a[href*='/career/vacancies/conditions']"),
            headingName = $(".content-head__title.content-head__title_size-medium");

    public CandidatesPage openCandidatesPage() {
        step("Открываем страницу 'Кандидатам'", () -> {
            candidatesPage.click();
        });
        return this;
    }

    public CandidatesPage checkHeadingName() {
        step("Проверяем, что на странице содержится заголовок 'Как попасть на работу в Контур'", () -> {
            headingName.shouldHave(text("Как попасть на работу в Контур"));
        });
        return this;
    }
}
