package ru.contur.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class VacancyPage {
    private final SelenideElement
            vacancyPage = $("[data-event-name='button-visual-click']"),
            listCity = $(".selectRegion-select.link-icon"),
            choiceCity = $("[data-item-id='/career/vacancies/city-6240']"),
            cityName = $(".selectRegion"),
    emailForCareer=$(".card_size-large.card_fill-gray");
    public VacancyPage openVacancyPage() {
        step("Нажимаем кнопку 'Смотреть вакансии'", () -> {
            vacancyPage.click();
        });
        return this;
    }
    public VacancyPage openListCity() {
        step("Открываем список городов", () -> {
            listCity.click();
        });
        return this;
    }
    public VacancyPage selectCity() {
        step("Выбираем город", () -> {
            choiceCity.click();
        });
        return this;
    }
    public VacancyPage checkCityName() {
        step("Проверяем, что открыта страница с выбранным городом", () -> {
            cityName.shouldHave(text("Санкт-Петербург"));
        });
        return this;
    }
    public VacancyPage checkEmailForCareer() {
        step("Проверяем наличие почтового адреса на странице", () -> {
            emailForCareer.shouldHave(text("rabota@kontur.ru"));
        });
        return this;
    }
}
