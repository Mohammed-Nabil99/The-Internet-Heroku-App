package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LargeAndDeepDOMPage {
    private WebDriver driver;
    private By table= By.id("large-table");


    public LargeAndDeepDOMPage (WebDriver driver) {
        this.driver = driver;
    }

    public void ScrollingToTable(){
        var tableElement=driver.findElement(table);
        String script="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,tableElement);
    }
}
