import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver browser;
    private WebDriverWait browserWait;

    private By closeAdButton = By.cssSelector(".header__close-button svg-icon[src='assets/images/icons/x.svg']");
    private By dropdownMenuButton = By.cssSelector(".select__header");
    private By cookieConfirmButton = By.id("cookie-agree");

    public MainPage(WebDriver browser) {
        this.browser = browser;
        this.browserWait = new WebDriverWait(browser, Duration.ofSeconds(10));
    }

    public void confirmCookies() {
        try {
            WebElement cookieButton = browserWait.until(ExpectedConditions.elementToBeClickable(cookieConfirmButton));
            cookieButton.click();
        } catch (Exception ignored) {
            System.out.println("Cookie pop-up not present or already closed.");
        }
    }

    public void showDropdown() {
        browserWait.until(ExpectedConditions.elementToBeClickable(dropdownMenuButton)).click();
    }

    public void chooseServiceOption(String option) {
        By serviceOption = By.xpath("//p[text()='" + option + "']");
        browserWait.until(ExpectedConditions.elementToBeClickable(serviceOption)).click();
    }

    public void dismissWindow() {
        browserWait.until(ExpectedConditions.elementToBeClickable(closeAdButton)).click();
    }
}
