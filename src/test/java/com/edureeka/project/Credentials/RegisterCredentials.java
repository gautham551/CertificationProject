package com.edureeka.project.Credentials;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.project.ObjectRepo.RegisterPage;
import com.edureka.project.genericLib.BaseClass;
import com.edureka.project.genericLib.WebDriverCommonLib;

public class RegisterCredentials extends BaseClass {
    Logger log = Logger.getLogger(RegisterCredentials.class);
    WebDriverCommonLib comm = new WebDriverCommonLib();

    @Test
    public void registerUser() {

        RegisterPage reg = PageFactory.initElements(driver, RegisterPage.class);
        // Logging Out
        reg.getSignOffLnk().click();
        // Step 1: Click on Register Link
        reg.getRegisterLink().click();
       
        log.info("Step 1: Register user page is displayed.");
        // Step 2: Enter Contact Information
        reg.getFirstNameEdt().sendKeys("Gautham");
        reg.getLastNameEdt().sendKeys("Raju");
        reg.getPhoneEdt().sendKeys("9844710551");
        reg.getEmailEdt().sendKeys("raju_gautham@yahoo.com");
        log.info("Step 2:Contact information is entered successfully");
        // Step 3: Enter Mailing Information
        reg.getAddress1Edt().sendKeys("#72 ");
        reg.getAddress2Edt().sendKeys("Indiranager");
        reg.getCityEdt().sendKeys("Bangalore");
        reg.getStateEdt().sendKeys("Karnataka");
        reg.getPostalCodeEdt().sendKeys("560048");
        log.info("Step 3:Mailing information is entered successfully");
        // Enter User Information
        reg.getUserNameEdt().sendKeys("Gauth" + comm.randomNum());
        reg.getPasswordEdt().sendKeys("Pass" + comm.randomNum());
        reg.getConfirmPasswordEdt().sendKeys("Pass" + comm.randomNum());
        log.info("Step 4: User Inforation is entered successfully");
        reg.getRegisterBtn().click();
        String actTitle = BaseClass.driver.getTitle();
        String expTitle = "Register: Mercury Tours";
        if (expTitle.equals(actTitle)) {
            log.info("Registered Successfully");
        } else {
            log.error("Could not register due to errors");
        }

        String expText = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
        String actText = reg.getConfirmRegisteredUser().getText();
        Assert.assertEquals(expText, actText);
        String Note = reg.getNoteToUsetText().getText();
        log.info(Note);

    }
}
