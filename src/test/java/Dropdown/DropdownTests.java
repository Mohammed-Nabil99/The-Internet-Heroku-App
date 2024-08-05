package Dropdown;

import Pages.DropdownPage;
import Pages.HomePage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void selectedOptions(){
        var dropdownPage =homePage.clickDropdown();
        String option="Option 1";
        dropdownPage.selectFromDropdown(option);
        var Options =dropdownPage.getSelectedOptions();
        Assert.assertEquals(Options.size(),1,"size is not correct");
        Assert.assertTrue(Options.contains(option),"Option 1 is not correct");


}
}
