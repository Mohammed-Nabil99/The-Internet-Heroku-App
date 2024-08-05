package JavaScript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDOM().ScrollingToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){

        homePage.clickInfiniteScroll().ScrollingToTextBlock(5);

    }
}
