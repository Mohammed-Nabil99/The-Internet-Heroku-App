package Login;

import Pages.LoginPage;
import Pages.SecureArea;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTests {
   @Test
    public void validLogin(){
     LoginPage loginPage =  homePage.clickFormAuthentication();
     loginPage.setUsername("tomsmith");
     loginPage.setPassword("SuperSecretPassword!");
     var secure=loginPage.clickLoginButton();
     String actual = secure.getAlertText();
     Assert.assertTrue(actual.contains("You logged into a secure area!"),"alert isn't found");
    }
}
