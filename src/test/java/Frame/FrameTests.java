package Frame;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void WysiwygTest() {
      var WysiwygPage=homePage.clickWysiwygEditor();
      WysiwygPage.clearTextArea();
      WysiwygPage.setTextArea("Hello");
      WysiwygPage.setDecreaseIndent();
      WysiwygPage.setTextArea("World");
     String Actual= WysiwygPage.getTextArea();
     assertEquals(Actual,"HelloWorld","Text incorrect");

    }
}
