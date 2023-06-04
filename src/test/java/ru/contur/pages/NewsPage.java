package ru.contur.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NewsPage {
    Faker faker = new Faker();

    private final SelenideElement
            newsPage=$("a[href*='/press/news']"),
            subscribeButton=$(".hiddenSubmit"),
            messageError=$(".field-validation-error"),
    emailAddress=$(".subscription__input.subscription__input_border-black"),
    validationError=$(".field-validation-error");
    public NewsPage selectNewsPage() {
        step("Выбираем 'Новости'", () -> {
            newsPage.click();
        });
        return this;
    }
    public NewsPage clickSubscribeButton() {
        step("Нажимаем кнопку 'Подписаться'", () -> {
            subscribeButton.click();
        });
        return this;
    }
    public NewsPage checkMessageError() {
        step("Проверяем, что на странице появилась подсказка о незаполненном поле", () -> {
            messageError.shouldHave(text("Заполните поле"));
        });
        return this;
    }
    public NewsPage writeInvalidEmailAddress() {
    step("Вводим слово вместо почтового адреса", () -> {
        emailAddress.setValue(faker.name().firstName());
    });
        return this;
    }
        public NewsPage checkMessageValidationError() {
    step("Проверяем, что на странице появилась подсказка о неверно заполненном поле", () -> {
        validationError.shouldHave(text("Некорректный адрес электронной почты"));
    });
            return this;
        }
}
