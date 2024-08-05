package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage{
    private WebDriver driver;
    private By EditArea = By.id("mce_0_ifr");
    private By TextArea = By.id("tinymce");
    private By DecreaseIndent=By.xpath("//button[@title=(\'Decrease indent\')]");

    public WysiwygEditorPage(WebDriver driver){
        this.driver=driver;
    }

    public void setTextArea(String text){
        switchToEditArea();
        clearTextArea();
        driver.findElement(TextArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextArea(){
        switchToEditArea();
        String text=driver.findElement(TextArea).getText();
        switchToMainArea();
        return text;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(TextArea).clear();
        switchToMainArea();
    }

    public void setDecreaseIndent(){
        switchToEditArea();
        driver.findElement(DecreaseIndent).click();
        switchToMainArea();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(driver.findElement(EditArea));
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
