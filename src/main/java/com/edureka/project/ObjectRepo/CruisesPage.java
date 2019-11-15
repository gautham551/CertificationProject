package com.edureka.project.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CruisesPage {

    @FindBy(linkText = "Cruises")
    @CacheLookup
    private WebElement cruisesLink;

    @FindBy(xpath = "//img[@alt ='Reservations Open']")
    @CacheLookup
    private WebElement ReservationsImglink;

    public WebElement getCruisesLink() {
        return cruisesLink;
    }

    public WebElement getReservationsImglink() {
        return ReservationsImglink;
    }
}
