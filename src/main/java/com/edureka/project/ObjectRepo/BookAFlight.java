package com.edureka.project.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BookAFlight {
    @FindBy(name = "passFirst0")
    @CacheLookup
    private WebElement FirstNameEdit;

    @FindBy(name = "passLast0")
    @CacheLookup
    private WebElement LastNameEdit;

    @FindBy(name = "pass.0.meal")
    @CacheLookup
    private WebElement SelectMeal;

    @FindBy(name = "creditnumber")
    @CacheLookup
    private WebElement creditnumberEdit;

    @FindBy(name = "buyFlights")
    @CacheLookup
    private WebElement SecurePurchseBtn;

   

    public WebElement getFirstNameEdit() {
        return FirstNameEdit;
    }

    public WebElement getLastNameEdit() {
        return LastNameEdit;
    }

    public WebElement getSelectMeal() {
        return SelectMeal;
    }

    public WebElement getCreditnumberEdit() {
        return creditnumberEdit;
    }

    public WebElement getSecurePurchseBtn() {
        return SecurePurchseBtn;
    }


}
