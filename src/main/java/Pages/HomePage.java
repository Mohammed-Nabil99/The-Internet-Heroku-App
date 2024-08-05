package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public  HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public DropdownPage clickDropdown(){
        clickLinkText("Dropdown");
        return new DropdownPage(driver);
    }

    public LoginPage clickFormAuthentication()
    {
        clickLinkText("Form Authentication");
        return new LoginPage(driver);
    }

    public HoversPage clickHovers()
    {
        clickLinkText("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLinkText("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage ClickJavaScriptAlerts() {
        clickLinkText("JavaScript Alerts");

    return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLinkText("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLinkText("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public  DynamicLoadingPage clickDynamicLoading()
    {
        clickLinkText("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public  LargeAndDeepDOMPage clickLargeAndDeepDOM(){
        clickLinkText("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll()
    {
        clickLinkText("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLinkText("Multiple Windows");
        return new MultipleWindowsPage(driver);    }

    private void clickLinkText(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

}
