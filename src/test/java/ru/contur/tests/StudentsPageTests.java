package ru.contur.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentsPageTests extends TestBase {

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Выбор города для обучения")
    void selectCityInStudents() {
        newHomePage.openCareerPage();
        newStudentsPage.openStudentsPage()
                .openListCity()
                .selectCityNameForEducation()
                .checkCityName();
    }

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Проверка наличия почтового адреса на странице 'Студентам'")
    void testEmail() {
        newHomePage.openCareerPage();
        newStudentsPage.openStudentsPage()
                .checkEmailForStudents();
    }

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Проверка перехода на страницу Википедии")
    void testSchoolEmail() {
        newHomePage.openCareerPage();
        newStudentsPage.openStudentsPage()
                .selectSchoolPage()
                .goToWikipediaPage()
                .checkWikipediaPage();
    }
}
