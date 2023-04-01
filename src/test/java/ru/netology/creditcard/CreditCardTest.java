package ru.netology.creditcard;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest extends PreparingForTests {

    @Test
    void HappyTestCreditCard() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = order-success]")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void HappyTestCreditCardDoubleSurname() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов-Сибиряк Иван Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = order-success]")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void HappyTestCreditCardDoubleName() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван-Кристиан Иванович");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = order-success]")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void HappyTestCreditCardNameLastName() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов Иван");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = order-success]")).getText().trim();
        assertEquals(expected, actual);
    }

    @Test
    void HappyTestCreditCardInitials() {
        driver.findElement(By.cssSelector("[data-test-id = name] input")).sendKeys("Иванов И И");
        driver.findElement(By.cssSelector("[data-test-id = phone] input")).sendKeys("+79998883456");
        driver.findElement(By.cssSelector("[data-test-id = agreement]")).click();
        driver.findElement(By.className("button")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.".trim();
        String actual = driver.findElement(By.cssSelector("[data-test-id = order-success]")).getText().trim();
        assertEquals(expected, actual);
    }
}
