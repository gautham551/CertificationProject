package assignments;

import java.sql.Time;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.project.ObjectRepo.Facebook;
import com.edureka.project.genericLib.BaseClass;
import com.edureka.project.genericLib.WebDriverCommonLib;

public class InvalidDateOfBirth {
    @Test
    public void InvalidMobileNumberTest() throws Throwable {
        BaseClass.driver = new ChromeDriver();
        BaseClass.driver.get("https://www.facebook.com");
        Facebook fb = PageFactory.initElements(BaseClass.driver, Facebook.class);
        fb.getFirstnameEdt().sendKeys("dchd");
        fb.getLastnameEdit().sendKeys("wehgf");
        fb.getMobileNumberEdt().sendKeys("dsdkds@gmail.com");
        fb.getNewpassEdit().sendKeys("dscsd");
        fb.getReEnterEmailEdit().sendKeys("dsdkds@gmail.com");
        WebDriverCommonLib com = new WebDriverCommonLib();
        com.select(fb.getYearSel(), "2019");
        fb.getGenderRadio().click();
        fb.getWebsubmitEdt().click();
        String InvalidDOBError = fb.getInvalidDOBText().getText();
        String expDOBError = "It looks like you've entered the wrong info. Please make sure that you use your real date of birth.";
        Thread.sleep(2000);
        Assert.assertEquals(InvalidDOBError, expDOBError);

    }
}
