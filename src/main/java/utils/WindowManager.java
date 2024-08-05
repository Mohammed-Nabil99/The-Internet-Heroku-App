package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class WindowManager {
    private  WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager(WebDriver driver){
        this.driver = driver;
       navigate=driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTO(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        Set <String> Windows = driver.getWindowHandles();
        for(String window : Windows)
        {
            System.out.println("Switching to window: "+window);
            driver.switchTo().window(window);
            System.out.println("The current tab title is "+driver.getTitle());
            if(driver.getTitle().equals(tabTitle))
            {
                break;
            }
        }




    }
}
