package ru.contur.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.contur.pages.HomePage;
import ru.contur.pages.NewsPage;

public class ValidationEmailAddressTests extends TestBase {
    HomePage newHomePage = new HomePage();
    NewsPage newNewsPage = new NewsPage();

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Сообщение о неверно заполненном поле адреса почты в разделе 'Новости'")
    void TestEmail() {
        newHomePage.openHomePage();
        newNewsPage.selectNewsPage()
                .writeInvalidEmailAddress()
                .clickSubscribeButton()
                .checkMessageValidationError();
    }

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Сообщение о незаполненном поле адреса почты в разделе 'Новости'")
    void TestValidationErrorMessage() {
        newHomePage.openHomePage();
        newNewsPage.selectNewsPage()
                .clickSubscribeButton()
                .checkMessageError();
    }
}
