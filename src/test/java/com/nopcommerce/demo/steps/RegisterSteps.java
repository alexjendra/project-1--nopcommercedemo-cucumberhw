package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the register text")
    public void iShouldSeeTheRegisterText() {

    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message {string} in first name field")
    public void iShouldSeeTheErrorMessageInFirstNameField(String firstName) {
        Assert.assertEquals(new RegisterPage().getErrorFNameText(), "First name is required.", "Error message is not displayed");



    }

    @And("I should see the error message {string} in last name field")
    public void iShouldSeeTheErrorMessageInLastNameField(String lastName) {
        Assert.assertEquals(new RegisterPage().getErrorLNameText(), "Last name is required.", "Error message is not displayed");
    }

    @And("I should see the error message {string} in email field")
    public void iShouldSeeTheErrorMessageInEmailField(String arg0) {
        Assert.assertEquals(new RegisterPage().getEmailErrorText(), "Email is required.", "Error message is not displayed");
    }

    @And("I should see the error message {string} in password field")
    public void iShouldSeeTheErrorMessageInPasswordField(String arg0) {
        Assert.assertEquals(new RegisterPage().getErrorPasswordText(), "Password is required.", "Error message is not displayed");
    }

    @And("I should see the error message {string} in confirm password field")
    public void iShouldSeeTheErrorMessageInConfirmPasswordField(String arg0) {
        Assert.assertEquals(new RegisterPage().getConfirmPasswordText(), "Password is required.", "Error message is not displayed");
    }

    @And("I click on female radio button")
    public void iClickOnFemaleRadioButton() {
    }

    @And("I enter {string} in first name field")
    public void iEnterInFirstNameField(String text) {
        new RegisterPage().enterFirstName(text);
    }

    @And("I enter {string} in last name field")
    public void iEnterInLastNameField(String text) {
        new RegisterPage().enterLastName(text);
    }

    @And("I select {string} day")
    public void iSelectDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("I select {string} month")
    public void iSelectMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I select {string} year")
    public void iSelectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @Then("I should see the registered message {string}")
    public void iShouldSeeTheRegisteredMessage(String registeredMessage) {
        new RegisterPage().getRegistrationMessage(registeredMessage);
    }
}
