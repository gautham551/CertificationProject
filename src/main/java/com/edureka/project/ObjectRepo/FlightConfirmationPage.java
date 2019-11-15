package com.edureka.project.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FlightConfirmationPage {
    
    @FindBy(xpath = "//font[contains(text(),'itinerary has been booked!')]")
    @CacheLookup
    private WebElement confirmBookingtxt;
    
    public WebElement getConfirmBookingtxt() {
        return confirmBookingtxt;
    }
}
