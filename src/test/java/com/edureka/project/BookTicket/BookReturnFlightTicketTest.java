package com.edureka.project.BookTicket;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.edureka.project.genericLib.*;
import com.edureka.project.ObjectRepo.BookAFlight;
import com.edureka.project.ObjectRepo.FindAFlightPage;
import com.edureka.project.ObjectRepo.FlightConfirmationPage;
import com.edureka.project.ObjectRepo.SelectAFlight;
import com.edureka.project.genericLib.BaseClass;

@Listeners(com.edureka.project.genericLib.ListenerImpClass.class)
public class BookReturnFlightTicketTest extends BaseClass {
    Logger log = Logger.getLogger(BookReturnFlightTicketTest.class);

    @Test
    public void BookReturnTicketTest() {

        FindAFlightPage find = PageFactory.initElements(BaseClass.driver, FindAFlightPage.class);
        SelectAFlight select = PageFactory.initElements(BaseClass.driver, SelectAFlight.class);
        BookAFlight book = PageFactory.initElements(BaseClass.driver, BookAFlight.class);
        FlightConfirmationPage confirm = PageFactory.initElements(driver, FlightConfirmationPage.class);
        log.info("Step 1 - Assert if opened pageTitle is correct");

        // Assert if opened page is correct
        String actfindtitle = BaseClass.driver.getTitle();
        String expfindTitle = "Find a Flight: Mercury Tours:";
        Assert.assertEquals(actfindtitle, expfindTitle);
        if (actfindtitle.equals(expfindTitle)) {
            log.info(actfindtitle + " page is dispayed");
        } else {
            log.error("Page is not opened - Check errors in report");
        }

        log.info("Step 2-Check of the RoundTrip Radio button is selected");
        // Check of the RoundTrip Radio button is selected
        Boolean actual = find.getRoundTripRdio().isSelected();
        Assert.assertTrue(actual);

        WebDriverCommonLib comm = new WebDriverCommonLib();
        log.info("Step3-Select the departing place as London");
        // Select the departing place as London
        find.getFromPortDrpDwn().click();
        comm.select(find.getFromPortDrpDwn(), "London");
        log.info("Step 4-Select Business Class");
        // Select Business Class
        find.getBusinessClassRadio().click();
        log.info("Step 5-Select Airline");
        // Select Airline
        comm.select(find.getAirlineDrpDwn(), 2);
        log.info("Step 6-Click on Continue in Find a Flight page");
        // Click on Continue in Find a Flight page
        find.getFindFlightsBtn().click();
        log.info("Step 7-Click on Continue in Select a Flight page");
        // Click on Continue in Select a Flight page
        String actSelectTitle = BaseClass.driver.getTitle();
        String expSelectTitle = "Select a Flight: Mercury Tours";
        Assert.assertEquals(actSelectTitle, expSelectTitle);
        log.info("Step 8-Select the flight");
        // Select the flight
        select.getReserveFlightsBtn().click();
        log.info("Step 9-Assert Book a Flight Title");
        // Assert Book a Flight Title
        String actBookTitle = BaseClass.driver.getTitle();
        String expBookTitle = "Book a Flight: Mercury Tours";
        Assert.assertEquals(actBookTitle, expBookTitle);
        log.info(actBookTitle+"is matching");
        log.info("Step 10-Enter First Name");
        // Enter First Name
        book.getFirstNameEdit().sendKeys("Gautham");
        log.info("Step 11-Enter Last Name");
        // Enter Last Name
        book.getLastNameEdit().sendKeys("Raju");
        log.info("Step 12-Enter Card Number");
        // Enter Card Number
        book.getCreditnumberEdit().sendKeys("52112675218567");
        log.info("Step 13-Click on Secure Purchase");
        // Click on Secure Purchase
        book.getSecurePurchseBtn().click();
        log.info("Step 14Confirm if ticket is booked");
        // Confirm if ticket is booked
        String actConfirmText = confirm.getConfirmBookingtxt().getText();
        String expConfirmText = "Your itinerary has been booked!";
        Assert.assertEquals(actConfirmText, expConfirmText);
        log.info(actConfirmText);

    }
}
