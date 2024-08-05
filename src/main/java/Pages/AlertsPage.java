package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By AlertTriggerButton = By.xpath("//button[text()='Click for JS Alert']");
    private By AlertConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By AlertPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By AlertResult= By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertTrigger() {
        driver.findElement(AlertTriggerButton).click();
    }

    public void clickAlertConfirm() {
        driver.findElement(AlertConfirmButton).click();
    }

    public void clickAlertPrompt() {
        driver.findElement(AlertPromptButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public  String getAlertResult() {
        return driver.findElement(AlertResult).getText();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }

    public void setAlertInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

        }

