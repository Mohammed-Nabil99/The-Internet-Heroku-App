package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
    private WebDriver driver;
    private By FileUploadButton= By.id("file-upload");
    private By UploadButton=By.id("file-submit");
    private By UploadedFileName=By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String path) {
        driver.findElement(FileUploadButton).sendKeys(path);
        clickUploadButton();
    }

    private void clickUploadButton() {
        driver.findElement(UploadButton).click();
    }

    public String getFileName() {
        return driver.findElement(UploadedFileName).getText();
    }

}
