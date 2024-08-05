package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figureBox= By.className("figure");
    private By boxCaption= By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public figureCaption hoverOverFigure(int index) {
        WebElement figure =driver.findElements(figureBox).get(index-1);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
        return new figureCaption(figure.findElement(boxCaption));
    }
    public class figureCaption{
        private WebElement caption;
        private By title=By.tagName("h5");
        private By Link=By.tagName("a");


        public figureCaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean isCaptionDisplayed()
        {
            return caption.isDisplayed();
        }

        public String getTitle()
        {
            return caption.findElement(title).getText();
        }

        public String getLink()
        {
            return caption.findElement(Link).getAttribute("href");
        }

        public String getLinkText()
        {
            return caption.findElement(Link).getText();
        }


    }

}
