package ru.contur.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactsPageTests extends TestBase {

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
