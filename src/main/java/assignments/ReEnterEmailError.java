package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.project.ObjectRepo.Facebook;
import com.edureka.project.genericLib.BaseClass;

public class ReEnterEmailError {
    @Test
public void ReEnterEmailErrorTest(){
    BaseClass.driver = new ChromeDriver();
    BaseClass.driver.get("https://www.facebook.com");
    Facebook fb = PageFactory.initElements(BaseClass.driver, Facebook.class);
    fb.getFirstnameEdt().sendKeys("dchd");
    fb.getLastnameEdit().sendKeys("wehgf");
    fb.getMobileNumberEdt().sendKeys("dsdkds@gmail.com");
    fb.getNewpassEdit().sendKeys("dscsd");
    fb.getWebsubmitEdt().click();
    String InvalidDOBError = fb.getReEnterEmailTxt().getText();
    String expDOBError = "Please re-enter your email address.";
    Assert.assertEquals(InvalidDOBError, expDOBError);
    BaseClass.driver.quit();
}
}
