package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.project.ObjectRepo.Facebook;
import com.edureka.project.genericLib.BaseClass;

public class InvalidMobileNumber {

    @Test
    public void InvalidMobileNumberTest() {
        BaseClass.driver = new ChromeDriver();
        BaseClass.driver.get("https://www.facebook.com");
        Facebook fb = PageFactory.initElements(BaseClass.driver, Facebook.class) ;
        fb.getFirstnameEdt().sendKeys("dchd");
        fb.getLastnameEdit().sendKeys("wehgf");
        fb.getMobileNumberEdt().sendKeys("dsdkds");
        fb.getNewpassEdit().sendKeys("dscsd");
        fb.getWebsubmitEdt().click();
        String InvalidmobileError = fb.getInvalidMobileNumberText().getText();
        String expError = "Please enter a valid mobile number or email address.";
        Assert.assertEquals(InvalidmobileError, expError);

    }
}
