package ru.contur.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CandidatesPageTests extends TestBase {

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Проверка страницы 'Кандидатам'")
    void testTextForConditions() {
        newHomePage.openCareerPage();
        newCandidatesPage.openCandidatesPage()
                .checkHeadingName();
    }
}
