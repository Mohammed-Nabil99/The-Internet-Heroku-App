package DyanmicLoading;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
     var example1Page=  homePage.clickDynamicLoading().clickExample1();
     example1Page.clickStartButton();
     assertEquals(example1Page.getLoadedText(),"Hello World!","invisible Text!");
    }
}
