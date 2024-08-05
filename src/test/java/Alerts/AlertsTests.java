package Alerts;

import Pages.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertsPage=homePage.ClickJavaScriptAlerts();
        alertsPage.clickAlertTrigger();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getAlertResult(),"You successfully clicked an alert","you didn,t click on alert accept");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage=homePage.ClickJavaScriptAlerts();
        alertsPage.clickAlertConfirm();
        var text=alertsPage.getAlertMessage();
        alertsPage.dismissAlert();
        assertEquals(text ,"I am a JS Confirm","text is incorrect");
    }

    @Test
    public void testSetAlertInput(){
        var alertsPage=homePage.ClickJavaScriptAlerts();
        alertsPage.clickAlertPrompt();
        var text="Hello World!";
        alertsPage.setAlertInput(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getAlertResult(),"You entered: "+text,"text is incorrect");

    }

}
