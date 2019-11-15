package assignments;

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
public class BookTicketTest extends BaseClass {

    @Test
    public void BookReturnTicketTest() {
        FindAFlightPage find = PageFactory.initElements(BaseClass.driver, FindAFlightPage.class);
        SelectAFlight select = PageFactory.initElements(BaseClass.driver, SelectAFlight.class);
        BookAFlight book = PageFactory.initElements(BaseClass.driver, BookAFlight.class);
        FlightConfirmationPage confirm = PageFactory.initElements(driver, FlightConfirmationPage.class);

        // Assert if opened page is correct
        String actfindtitle = BaseClass.driver.getTitle();
        String expfindTitle = "Find a Flight: Mercury Tours:";
        Assert.assertEquals(actfindtitle, expfindTitle);

        // Check of the RoundTrip Radio button is selected
        Boolean actual = find.getRoundTripRdio().isSelected();
        Assert.assertTrue(actual);

        WebDriverCommonLib comm = new WebDriverCommonLib();
        // Select the departing place as London
        find.getFromPortDrpDwn().click();
        comm.select(find.getFromPortDrpDwn(), "London");

        // Select Business Class
        find.getBusinessClassRadio().click();

        // Select Airline
        comm.select(find.getAirlineDrpDwn(), 2);
        GenericMethods.captureScreenShot("FindFlight", driver);
        // Click on Continue in Find a Flight page


        find.getFindFlightsBtn().click();

        // Click on Continue in Select a Flight page
        String actSelectTitle = BaseClass.driver.getTitle();
        String expSelectTitle = "Select a Flight: Mercury Tours";
        Assert.assertEquals(actSelectTitle, expSelectTitle);
        GenericMethods.captureScreenShot("SelectAirline",driver);
        // Select the flight
        select.getReserveFlightsBtn().click();

        // Asset Book a Flight Title
        String actBookTitle = BaseClass.driver.getTitle();
        String expBookTitle = "Book a Flight: Mercury Tours";
        Assert.assertEquals(actBookTitle, expBookTitle);

        // Enter First Name
        book.getFirstNameEdit().sendKeys("Gautham");
        // Enter Last Name
        book.getLastNameEdit().sendKeys("Raju");
        // Enter Card Number
        book.getCreditnumberEdit().sendKeys("52112675218567");
        GenericMethods.captureScreenShot("BookFlight",driver);
        // Click on Secure Purchase
        book.getSecurePurchseBtn().click();

        // Confirm if ticket is booked
        String actConfirmText = confirm.getConfirmBookingtxt().getText();
        String expConfirmText = "Your itinerary has been booked!";
        Assert.assertEquals(actConfirmText, expConfirmText);
        GenericMethods.captureScreenShot("ConfirmBooking",driver);

    }
}
