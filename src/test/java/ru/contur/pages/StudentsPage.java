package ru.contur.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class StudentsPage {
    private final SelenideElement
            studentsPage = $("a[href*='/education/programs']"),
            listCity2 = $(".selectRegion-select.link-icon"),
            cityForEducation = $("[data-item-id='/education/programs/city-6240']"),
            cityName = $(".selectRegion"),
            emailForStudents = $(".card.card_size-medium.card_fill-gray"),
            schoolPage = $("a[href*='/education/programs/school']"),
            wikipediaPage = $("a[href*='https://en.wikipedia.org/wiki/List_of_unsolved_problems_in_computer_science']"),
            wikiInfo = $("#siteSub"),
            problemsList = $("#firstHeading");

    public StudentsPage openStudentsPage() {
        step("Открываем страницу 'Студентам'", () -> {
            studentsPage.click();
            studentsPage.pressEscape();
        });
        return this;
    }

    public StudentsPage openListCity() {
        step("Открываем список городов для обучения", () -> {
            listCity2.click();
        });
        return this;
    }

    public StudentsPage selectCityNameForEducation() {
        step("Выбираем город", () -> {
            cityForEducation.click();
        });
        return this;
    }

    public StudentsPage checkCityName() {
        step("Проверяем, что открыта страница с выбранным городом", () -> {
            cityName.shouldHave(text("Санкт-Петербург"));
        });
        return this;
    }

    public StudentsPage checkEmailForStudents() {
        step("Проверяем наличие сообщения с почтовым адресом для студентов", () -> {
            emailForStudents.shouldHave(text("Пиши на kontur-student@kontur.ru"));
        });
        return this;
    }

    public StudentsPage selectSchoolPage() {
        step("Переходим на страницу 'Школьникам'", () -> {
            schoolPage.click();
        });
        return this;
    }

    public StudentsPage goToWikipediaPage() {
        step("Переходим на страницу Википедии", () -> {
            wikipediaPage.click();
        });
        return this;
    }

    public StudentsPage checkWikipediaPage() {
        step("Проверяем информацию на открытой странице", () -> {
            wikiInfo.shouldHave(text("From Wikipedia, the free encyclopedia"));
            problemsList.shouldHave(text("List of unsolved problems in computer science"));
        });
        return this;
    }
}
