package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By result=By.id("finish");
    private By loadingIndicator=By.id("loading");

    public DynamicLoadingExample1Page(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickStartButton()
    {
        driver.findElement(startButton).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf
                (driver.findElement(loadingIndicator)));
       /* FluentWait wait1=new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
            wait1.until(ExpectedConditions.invisibilityOf(
                    driver.findElement(loadingIndicator)));*/
    }

    public String getLoadedText()
    {
        return driver.findElement(result).getText();
    }

}
