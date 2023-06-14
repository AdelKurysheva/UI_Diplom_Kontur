package ru.contur.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VacancyPageTests extends TestBase {

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Выбор города в поиске вакансий")
    void selectCity() {
        newHomePage.openCareerPage();
        newVacancyPage.openVacancyPage()
                .openListCity()
                .selectCity()
                .checkCityName();
    }

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Проверка наличия почтового адреса на странице 'Вакансии'")
    void checkEmailAddress() {
        newHomePage.openCareerPage();
        newVacancyPage.openVacancyPage()
                .checkEmailForCareer();
    }

}
