package com.edureka.project.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FindAFlightPage {

    @FindBy(xpath = "//input[@value='roundtrip']")
    @CacheLookup
    private WebElement roundTripRdio;

    @FindBy(name="passCount")
    @CacheLookup
    private WebElement passCountDrpDwn;
    
    @FindBy(name="fromPort")
    @CacheLookup
    private WebElement fromPortDrpDwn;
    
    @FindBy(name="fromMonth")
    @CacheLookup
    private WebElement fromMonthDwn;
    
    @FindBy(name="toMonth")
    @CacheLookup
    private WebElement toMonthDrpDwn;
    
    @FindBy(name="toDay")
    @CacheLookup
    private WebElement toDayDrpDwn;
    
    @FindBy(name="fromDay")
    @CacheLookup
    private WebElement fromDayDrpDwn;
    
    @FindBy(xpath = "//input[@value='Business']")
    @CacheLookup
    private WebElement BusinessClassRadio;
    
    @FindBy(name="airline")
    @CacheLookup
    private WebElement AirlineDrpDwn;
    
    @FindBy(name="findFlights")
    @CacheLookup
    private WebElement findFlightsBtn;

    public WebElement getRoundTripRdio() {
        return roundTripRdio;
    }

    public WebElement getPassCountDrpDwn() {
        return passCountDrpDwn;
    }

    public WebElement getFromPortDrpDwn() {
        return fromPortDrpDwn;
    }

    public WebElement getFromMonthDwn() {
        return fromMonthDwn;
    }

    public WebElement getToMonthDrpDwn() {
        return toMonthDrpDwn;
    }

    public WebElement getToDayDrpDwn() {
        return toDayDrpDwn;
    }

    public WebElement getFromDayDrpDwn() {
        return fromDayDrpDwn;
    }

    public WebElement getBusinessClassRadio() {
        return BusinessClassRadio;
    }

    public WebElement getAirlineDrpDwn() {
        return AirlineDrpDwn;
    }

    public WebElement getFindFlightsBtn() {
        return findFlightsBtn;
    }
    

}
