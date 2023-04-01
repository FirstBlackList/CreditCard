package ru.netology.creditcard;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class NegativeCreditCardTest extends PreparingForTests {

    @Test
    void NegativeTestCreditCardNameFieldIsEmpty() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "Поле обязательно для заполнения".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = name].input_invalid .input__sub")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void NegativeTestCreditCardPhoneFieldIsEmpty() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "Поле обязательно для заполнения".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = phone].input_invalid .input__sub")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void NegativeTestCreditCardLatinAlphabetAndSymbolNameField() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = name].input_invalid .input__sub")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void NegativeTestCreditCardLatinAlphabetAndSymbolPhoneField() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = phone].input_invalid .input__sub")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void NegativeTestCreditCardPhoneFieldOneDigit() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = phone].input_invalid .input__sub")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void NegativeTestCreditCardPhoneFieldTwelveDigits() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = phone].input_invalid .input__sub")).getText().trim();
        assertEquals(expected, actual);
    }
}
