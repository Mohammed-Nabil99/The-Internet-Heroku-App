package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Script;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By textBlock=By.className("jscroll-added");


    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ScrollingToTextBlock(int index){
        String script="window.scrollTo(0,document.body.scrollHeight);";
        var jsExecuter=(JavascriptExecutor)driver;
        while(numOfParagraphs()<index)
            jsExecuter.executeScript(script);
    }

    private int numOfParagraphs() {
        return driver.findElements(textBlock).size();
    }
}
