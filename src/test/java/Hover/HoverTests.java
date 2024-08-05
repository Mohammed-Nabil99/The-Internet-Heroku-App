package Hover;

import base.BaseTests;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        var hoverPage=homePage.clickHovers();
        var caption= hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption isn't displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption Title isn't displayed");
        assertEquals(caption.getLinkText(),"View profile","Caption Link isn't displayed");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }
}
