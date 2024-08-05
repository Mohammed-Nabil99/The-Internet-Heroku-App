package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String link_format=".//a[contains(text(),'%s')";
    private By Link_Example1 = By.xpath("//*[@id=\"content\"]/div/a[1]");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(Link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }
}
