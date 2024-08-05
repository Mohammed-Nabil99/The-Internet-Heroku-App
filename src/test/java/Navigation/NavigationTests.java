package Navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickMultipleWindows().clickToOpenNewWindow();
        var window =getWindowManager();
        window.goBack();
        window.refreshPage();
        window.goForward();
        window.goTO("https://google.com");
    }

    @Test
    public void testSwitcTab() {
        homePage.clickMultipleWindows().clickToOpenNewWindow();
        getWindowManager().switchToTab("New Window");
    }
}
