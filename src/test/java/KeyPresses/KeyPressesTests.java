package KeyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTests {

    @Test
    public void testBackSpace() {
        var keyPress=homePage.clickKeyPresses();
        keyPress.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPress.getResult() , "You entered: BACK_SPACE" ,"BackSpace isn't entered");
    }

    @Test
    public void testPI() {

        var keyPress=homePage.clickKeyPresses();
        keyPress.enterPi();
    }
}
