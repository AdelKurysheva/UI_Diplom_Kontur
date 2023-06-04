package ru.contur.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.contur.pages.*;

public class ContactsPageTests extends TestBase {
    HomePage newHomePage = new HomePage();
    ContactsPage newContactsPage = new ContactsPage();

    @Test
    @Owner("Курышева Адэль")
    @DisplayName("Наличие юридического адреса компании")
    void TestAddress() {
        newHomePage.openHomePage();
        newContactsPage.selectContactsPage()
                .openCompanyDetails()
                .checkCompanyAddress();
    }
}
