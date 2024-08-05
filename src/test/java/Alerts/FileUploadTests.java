package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
      var fileUploadPage= homePage.clickFileUpload();
      fileUploadPage.uploadFile("C:/Users/Mido/Downloads/sql_intermediate certificate.pdf");
      String fileName = "sql_intermediate certificate.pdf";
      assertEquals(fileUploadPage.getFileName(),fileName ,"File isn't uploaded");
    }
}
