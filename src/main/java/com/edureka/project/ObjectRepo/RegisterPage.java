package com.edureka.project.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 
 */
public class RegisterPage {

    @FindBy(linkText = "SIGN-OFF")
    @CacheLookup
    private WebElement signOffLnk;
    
    @FindBy(linkText = "REGISTER")
    @CacheLookup
    private WebElement RegisterLink;

    @FindBy(name = "firstName")
    @CacheLookup
    private WebElement firstNameEdt;

    @FindBy(name = "lastName")
    @CacheLookup
    private WebElement lastNameEdt;

    @FindBy(name = "phone")
    @CacheLookup
    private WebElement phoneEdt;

    @FindBy(name = "userName")
    @CacheLookup
    private WebElement emailEdt;

    @FindBy(name = "address1")
    @CacheLookup
    private WebElement address1Edt;

    @FindBy(name = "address2")
    @CacheLookup
    private WebElement address2Edt;

    @FindBy(name = "city")
    @CacheLookup
    private WebElement cityEdt;

    @FindBy(name = "state")
    @CacheLookup
    private WebElement stateEdt;

    @FindBy(name = "postalCode")
    @CacheLookup
    private WebElement postalCodeEdt;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement userNameEdt;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement passwordEdt;

    @FindBy(name = "confirmPassword")
    @CacheLookup
    private WebElement confirmPasswordEdt;

    @FindBy(name = "register")
    @CacheLookup
    private WebElement registerBtn;

    @FindBy(xpath = "//font[contains(text(),'Thank you for registering.')]")
    @CacheLookup
    private WebElement confirmRegisteredUser;
    
    @FindBy(xpath = "//b[contains(text(),'Note: Your user name')]")
    @CacheLookup
    private WebElement NoteToUsetText;
            
    
    public WebElement getRegisterLink() {
        return RegisterLink;
    }

    public WebElement getConfirmRegisteredUser() {
        return confirmRegisteredUser;
    }

    public WebElement getFirstNameEdt() {
        return firstNameEdt;
    }

    public WebElement getLastNameEdt() {
        return lastNameEdt;
    }

    public WebElement getPhoneEdt() {
        return phoneEdt;
    }

    public WebElement getEmailEdt() {
        return emailEdt;
    }

    public WebElement getAddress1Edt() {
        return address1Edt;
    }

    public WebElement getAddress2Edt() {
        return address2Edt;
    }

    public WebElement getCityEdt() {
        return cityEdt;
    }

    public WebElement getStateEdt() {
        return stateEdt;
    }

    public WebElement getPostalCodeEdt() {
        return postalCodeEdt;
    }

    public WebElement getUserNameEdt() {
        return userNameEdt;
    }

    public WebElement getPasswordEdt() {
        return passwordEdt;
    }

    public WebElement getConfirmPasswordEdt() {
        return confirmPasswordEdt;
    }

    public WebElement getRegisterBtn() {
        return registerBtn;
    }

    public WebElement getSignOffLnk() {
        return signOffLnk;
    }

    public WebElement getNoteToUsetText() {
        return NoteToUsetText;
    }

}
