package ru.contur.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ContactsPage {
    private final SelenideElement
            contactsPage = $("a[href*='/contacts']"),
            companyDetails = $(".button_secondary.m-r-0.m-r-sm-3"),
            companyAddress = $(".section-block__content");

    public ContactsPage selectContactsPage() {
        step("Открываем страницу 'Контакты'", () -> {
            contactsPage.click();
        });
        return this;
    }

    public ContactsPage openCompanyDetails() {
        step("Открываем 'Реквизиты компании'", () -> {
            companyDetails.click();
        });
        return this;
    }

    public ContactsPage checkCompanyAddress() {
        step("Проверяем, что на странице содержится юридический адрес компании", () -> {
            companyAddress.shouldHave(text("620144, Екатеринбург, ул. Народной Воли, 19а."));
        });
        return this;
    }
}
