package ru.contur.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.contur.pages.CandidatesPage;
import ru.contur.pages.HomePage;

public class CandidatesPageTests extends TestBase {
    HomePage newHomePage = new HomePage();
    CandidatesPage newCandidatesPage = new CandidatesPage();

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Проверка страницы 'Кандидатам'")
    void testTextForConditions() {
        newHomePage.openCareerPage();
        newCandidatesPage.openCandidatesPage()
                .checkHeadingName();
    }
}
