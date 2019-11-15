package assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.project.ObjectRepo.Facebook;
import com.edureka.project.genericLib.BaseClass;
import com.edureka.project.genericLib.WebDriverCommonLib;

public class FacebookNegativeTests extends BaseClass {

    @Test
    public void ChangePasswordTooShortTest() throws Throwable {
        Facebook fb = PageFactory.initElements(driver, Facebook.class);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ESCAPE).build().perform();
        WebDriverCommonLib com = new WebDriverCommonLib();
        com.waitAndClickElement(fb.getNavigationArw());
       
        fb.getSettingsBtn().click();
        Assert.assertEquals(driver.getTitle(), "Facebook");;
        fb.getSecurityAndLoginlnk().click();
        Assert.assertEquals(driver.getTitle(), "General Account Settings");;
        fb.getChangePasswordClk().click();
        fb.getCurrentPasswordEdt().sendKeys("password123*");
        fb.getNewPasswordEdt().sendKeys("123");
        String actErrorMessage = fb.getTooShortText().getText();
        String ExpErrorMessage = "Too short";
        Assert.assertEquals(actErrorMessage, ExpErrorMessage);
        

    }

    @Test
    public void CurrentpasswordMismatchChangePasswordTest() throws Throwable {
        Facebook fb = PageFactory.initElements(driver, Facebook.class);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ESCAPE).build().perform();
        WebDriverCommonLib com = new WebDriverCommonLib();
        com.waitAndClickElement(fb.getNavigationArw());
       
        fb.getSettingsBtn().click();
        Assert.assertEquals(driver.getTitle(), "Facebook");;
        fb.getSecurityAndLoginlnk().click();
        Assert.assertEquals(driver.getTitle(), "General Account Settings");;
        fb.getChangePasswordClk().click();
        fb.getCurrentPasswordEdt().sendKeys("password123*");
        fb.getNewPasswordEdt().sendKeys("pasword1233");
        fb.getReTypePasswordEdt().sendKeys("password123");
        String actError = fb.getPasswordMismatchText().getText();
        String expError = "Passwords do not match";
        Assert.assertEquals(actError, expError);
        

    }
}
