package com.edureka.project.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectAFlight {
    @FindBy(name="reserveFlights")
    @CacheLookup
    private WebElement reserveFlightsBtn;

    public WebElement getReserveFlightsBtn() {
        return reserveFlightsBtn;
    }
}
