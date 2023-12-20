package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement male;

    @CacheLookup
    @FindBy(name = "Gender")
    WebElement female;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthdayDropdown;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorFNameTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorLNameTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='Email']")
    WebElement errorEmailTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorPasswordTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorConfirmPasswordTextElement;




    public String getRegisterText() {
        String message = getTextFromElement(registerText);
        log.info("Getting text from : " + registerText.toString());
        return message;
    }

    public void selectGender(String gender) {
        log.info("Select gender");
        clickOnElement(male);
        clickOnElement(female);

    }

    public void enterFirstName(String firstname) {
        log.info("Enter FirstName : " + firstName.toString());
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastName) {
        log.info("Enter LastName : " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter EmailField : " + emailField.toString());


    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter PassWordField : " + passwordField.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Enter ConfirmPassWordField : " + confirmPasswordField.toString());
    }

    public String getErrorMessage() {
        return getTextFromAlert(errorMessage);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Click On register : " + registerButton.toString());
    }

    public String getRegistrationMessage(String registeredMessage) {
        log.info("Get registration Message : " + registrationMessage.toString());
        return getTextFromElement(registrationMessage);

    }
    public String getErrorFNameText() {
        log.info("Get first name error text" + errorFNameTextElement.toString());
        return getTextFromElement(errorFNameTextElement);
    }
    public String getErrorLNameText() {
        log.info("Get last name error text" + errorLNameTextElement.toString());
        return getTextFromElement(errorLNameTextElement);
    }

    public String getEmailErrorText() {
        log.info("Get email error text" + errorEmailTextElement.toString());
        return getTextFromElement(errorEmailTextElement);
    }

    public String getErrorPasswordText() {
        log.info("Get password error text" + errorPasswordTextElement.toString());
        return getTextFromElement(errorPasswordTextElement);
    }

    public String getConfirmPasswordText() {
        log.info("Get confirm password error text" + errorConfirmPasswordTextElement.toString());
        return getTextFromElement(errorConfirmPasswordTextElement);
    }
    public void selectDateOfBirth(String date, String month, String year) {
        log.info("Select date" + dateOfBirthdayDropdown.toString());
        log.info("Select month" + monthOfBirthdayDropdown.toString());
        log.info("Select year" + yearOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(dateOfBirthdayDropdown, date);
        selectByVisibleTextFromDropDown(monthOfBirthdayDropdown, month);
        selectByVisibleTextFromDropDown(yearOfBirthdayDropdown, year);
    }
    public void selectDay(String date) {
        log.info("Select date" + dateOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(dateOfBirthdayDropdown, date);
    }

    public void selectMonth(String month) {
        log.info("Select month" + monthOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(monthOfBirthdayDropdown, month);
    }

    public void selectYear(String year) {
        log.info("Select year" + yearOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(yearOfBirthdayDropdown, year);
    }



}
