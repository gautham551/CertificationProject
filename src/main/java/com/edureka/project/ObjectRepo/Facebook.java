package com.edureka.project.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Facebook {

    // Login Page
    @FindBy(name="birthday_year")
    @CacheLookup
    private WebElement yearSel;
    
    @FindBy(xpath="//label[text()='Female']")
    @CacheLookup
    private WebElement genderRadio;
  
    public WebElement getYearSel() {
        return yearSel;
    }

    public WebElement getGenderRadio() {
        return genderRadio;
    }

    @FindBy(name = "websubmit")
    @CacheLookup
    private WebElement websubmitEdt;
    
    public WebElement getReEnterEmailEdit() {
        return reEnterEmailEdit;
    }

    @FindBy(name="reg_email_confirmation__")
    @CacheLookup
    private WebElement reEnterEmailEdit;
    
  
    @FindBy(xpath = "//div[@id='reg_error_inner']")
    @CacheLookup
    private WebElement invalidDOBText;
    
    @FindBy(xpath = "//div[contains(text(),'re-enter')]")
    @CacheLookup
    private WebElement reEnterEmailTxt;
  
    public WebElement getInvalidDOBText() {
        return invalidDOBText;
    }

    public WebElement getReEnterEmailTxt() {
        return reEnterEmailTxt;
    }

    @FindBy(name = "firstname")
    @CacheLookup
    private WebElement firstnameEdt;
    
    @FindBy(name = "lastname")
    @CacheLookup
    private WebElement lastnameEdit;
    
    @FindBy(name = "reg_passwd__")
    @CacheLookup
    private WebElement NewpassEdit;
    
    public WebElement getWebsubmitEdt() {
        return websubmitEdt;
    }

    public WebElement getFirstnameEdt() {
        return firstnameEdt;
    }

    public WebElement getLastnameEdit() {
        return lastnameEdit;
    }

    public WebElement getNewpassEdit() {
        return NewpassEdit;
    }

    @FindBy(name = "email")
    @CacheLookup
    private WebElement emailEdit;

    public WebElement getChangePasswordClk() {
        return changePasswordClk;
    }

    public WebElement getSaveChangesBtn() {
        return SaveChangesBtn;
    }

    public WebElement getCurrentPasswordEdt() {
        return currentPasswordEdt;
    }

    public WebElement getNewPasswordEdt() {
        return newPasswordEdt;
    }

    public WebElement getReTypePasswordEdt() {
        return reTypePasswordEdt;
    }

    @FindBy(name = "pass")
    @CacheLookup
    private WebElement passwordEdit;

    @FindBy(id = "loginbutton")
    @CacheLookup
    private WebElement loginBtn;
    // Homepage
    @FindBy(id = "userNavigationLabel")
    @CacheLookup
    private WebElement navigationArw;

    @FindBy(xpath = "//span[text()='Settings']")
    @CacheLookup
    private WebElement settingsBtn;
    // Security and Login Page
    @FindBy(xpath = "//div[contains(text(),'Security and Login')]")
    @CacheLookup
    private WebElement securityAndLoginlnk;
    // Change Password Screen
    @FindBy(xpath = "//span[contains(text(),'Change password')]")
    @CacheLookup
    private WebElement changePasswordClk;

    @FindBy(xpath = "//input[@value='Save Changes']")
    @CacheLookup
    private WebElement SaveChangesBtn;

    @FindBy(name = "password_old")
    @CacheLookup
    private WebElement currentPasswordEdt;

    public WebElement getPasswordMismatchText() {
        return passwordMismatchText;
    }

    @FindBy(xpath = "//span[contains(text(),'Too short')]")
    @CacheLookup
    private WebElement tooShortText;

    @FindBy(xpath = "//span[contains(text(),'Passwords do not match')]")
    @CacheLookup
    private WebElement passwordMismatchText;

    public WebElement getTooShortText() {
        return tooShortText;
    }

    @FindBy(name = "password_new")
    @CacheLookup
    private WebElement newPasswordEdt;

    @FindBy(name = "password_confirm")
    @CacheLookup
    private WebElement reTypePasswordEdt;

    @FindBy(xpath = "//div[contains(text(), 'enter a valid mobile number')]")
    @CacheLookup
    private WebElement invalidMobileNumberText;

    public WebElement getInvalidMobileNumberText() {
        return invalidMobileNumberText;
    }

    public WebElement getMobileNumberEdt() {
        return mobileNumberEdt;
    }

    @FindBy(name = "reg_email__")
    @CacheLookup
    private WebElement mobileNumberEdt;

    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    @CacheLookup
    private WebElement logOutBtn;

    public WebElement getLogOutBtn() {
        return logOutBtn;
    }

    public WebElement getSecurityAndLoginlnk() {
        return securityAndLoginlnk;
    }

    public WebElement getEmailEdit() {
        return emailEdit;
    }

    public WebElement getPasswordEdit() {
        return passwordEdit;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getNavigationArw() {
        return navigationArw;
    }

    public WebElement getSettingsBtn() {
        return settingsBtn;
    }

}
