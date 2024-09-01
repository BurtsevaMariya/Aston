import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class TelecomTest {

    private WebDriver browser;
    private WebDriverWait browserWait;
    private MainPage mainPage;
    private PaymentProcessingPage paymentProcessingPage;

    @BeforeEach
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
        browserWait = new WebDriverWait(browser, Duration.ofSeconds(10));
        browser.manage().window().maximize();
        browser.get("https://mts.by");

        mainPage = new MainPage(browser);
        paymentProcessingPage = new PaymentProcessingPage(browser);
    }

    @Test
    public void verifyTitle() {
        mainPage.confirmCookies();

        String expectedTitle = "МТС – мобильный оператор в Беларуси";
        String actualTitle = browser.getTitle();
        assertEquals(expectedTitle, actualTitle, "Page title does not match.");
    }

    @Test
    public void checkBlockTitle() {
        mainPage.confirmCookies();

        mainPage.showDropdown();
        mainPage.chooseServiceOption("Услуги связи");

        String phoneField = paymentProcessingPage.getPhonePlaceholderText();
        String sumField = paymentProcessingPage.getSumPlaceholderText();
        String emailField = paymentProcessingPage.getEmailPlaceholderText();

        assertEquals("Номер телефона", phoneField, "Phone placeholder text does not match.");
        assertEquals("Сумма", sumField, "Sum placeholder text does not match.");
        assertEquals("E-mail для отправки чека", emailField, "Email placeholder text does not match.");
    }

    @Test
    public void validatePaymentForm() {
        mainPage.confirmCookies();
        mainPage.showDropdown();
        mainPage.chooseServiceOption("Услуги связи");

        String phone = "297777777";
        String amount = "30";

        paymentProcessingPage.populatePaymentForm(phone, amount, "test@mail.ru");
        paymentProcessingPage.clickPayButton();

        assertTrue(paymentProcessingPage.isConfirmationWindowVisible(), "Payment confirmation window not visible.");

        paymentProcessingPage.switchToPaymentFrame();

        assertEquals(formatPhone(phone), paymentProcessingPage.getDisplayedPhone(), "Displayed phone number is incorrect.");
        assertEquals(formatAmount(amount), paymentProcessingPage.getDisplayedAmount(), "Displayed amount is incorrect.");
        assertTrue(paymentProcessingPage.getPaymentButtonText().contains(amount), "Payment button text is incorrect.");
        assertTrue(paymentProcessingPage.isGooglePayOptionVisible(), "Google Pay button is not visible.");
        assertTrue(paymentProcessingPage.isYandexPayOptionVisible(), "Yandex Pay button is not visible.");

        paymentProcessingPage.switchToDefaultView();
    }

    @AfterEach
    public void cleanUp() {
        if (browser != null) {
            browser.quit();
        }
    }

    private String formatPhone(String phone) {
        return "Оплата: Услуги связи Номер:375" + phone;
    }

    private String formatAmount(String amount) {
        if (!amount.contains(".")) {
            amount += ".00";
        }
        return amount + " BYN";
    }
}