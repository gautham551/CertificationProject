package com.edureeka.project.Credentials;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edureka.project.genericLib.BaseClass;

@Listeners(com.edureka.project.genericLib.ListenerImpClass.class)
public class ValidateCredentialsTest extends BaseClass {
    Logger log = Logger.getLogger(ValidateCredentialsTest.class);

    @Test
    public void validcredentialTest() {
        log.debug("Home Page is Displayed");
        String expTitle = "Find a Flight: Mercury Tours:";
        log.info("Expected Tile was " + expTitle);
        String actTitle = BaseClass.driver.getTitle();
        Assert.assertEquals(actTitle, expTitle);
        if (expTitle.equals(actTitle)) {
            log.info("Title is matching");
        } else {
            log.error("Title is not matching");
        }
    }
}
