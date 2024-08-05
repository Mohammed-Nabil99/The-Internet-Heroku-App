package base;

import Pages.HomePage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WindowManager;
import java.io.File;
import java.io.IOException;
import java.net.http.WebSocket;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver  = new ChromeDriver(getChromeOptions());
        goHome();
        setCookie();
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus())
        {var camera=(TakesScreenshot)driver;
        File screenshot=camera.getScreenshotAs(OutputType.FILE);
    try {
        Files.move(screenshot,
               new File("D:\\program files\\JetBrains\\IntelliJ IDEA 2024.1.1\\IdeaProjects\\TAU\\src\\main\\resources\\screenshots\\"+result.getName()+".png"));
    }
    catch(IOException e){
        e.printStackTrace();
    }


        }
    }


    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau","123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
