import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentProcessingPage {
    private WebDriver browser;
    private WebDriverWait browserWait;

    private By phoneField = By.id("connection-phone");
    private By sumField = By.id("connection-sum");
    private By emailField = By.id("connection-email");
    private By payButton = By.cssSelector("#pay-connection .button__default");

    private By phonePlaceholder = By.id("connection-phone");
    private By sumPlaceholder = By.id("connection-sum");
    private By emailPlaceholder = By.id("connection-email");

    private By paymentIFrame = By.xpath("//iframe[@class='bepaid-iframe']");

    private By displayedPhone = By.cssSelector(".pay-description__text span");
    private By displayedAmount = By.cssSelector(".pay-description__cost span");
    private By confirmationButton = By.cssSelector(".colored");

    private By googlePayOption = By.id("gpay-button-online-api-id");
    private By yandexPayOption = By.id("yandex-button");

    public PaymentProcessingPage(WebDriver browser) {
        this.browser = browser;
        this.browserWait = new WebDriverWait(browser, Duration.ofSeconds(10));
    }

    public void populatePaymentForm(String phone, String sum, String email) {
        browserWait.until(ExpectedConditions.visibilityOfElementLocated(phoneField)).sendKeys(phone);
        browserWait.until(ExpectedConditions.visibilityOfElementLocated(sumField)).sendKeys(sum);
        browserWait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
    }

    public void clickPayButton() {
        browserWait.until(ExpectedConditions.elementToBeClickable(payButton)).click();
    }

    public String getPhonePlaceholderText() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(phonePlaceholder)).getAttribute("placeholder");
    }

    public String getSumPlaceholderText() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(sumPlaceholder)).getAttribute("placeholder");
    }

    public String getEmailPlaceholderText() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(emailPlaceholder)).getAttribute("placeholder");
    }

    public boolean isConfirmationWindowVisible() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(paymentIFrame)).isDisplayed();
    }

    public void switchToPaymentFrame() {
        browserWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIFrame));
    }

    public void switchToDefaultView() {
        browser.switchTo().defaultContent();
    }

    public String getDisplayedPhone() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(displayedPhone)).getText();
    }

    public String getDisplayedAmount() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(displayedAmount)).getText();
    }

    public String getPaymentButtonText() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(confirmationButton)).getText();
    }

    public boolean isGooglePayOptionVisible() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(googlePayOption)).isDisplayed();
    }

    public boolean isYandexPayOptionVisible() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(yandexPayOption)).isDisplayed();
    }
}