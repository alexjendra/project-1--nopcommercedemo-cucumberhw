package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on computer link")
    public void iClickOnComputerLink() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("I should see the {string} text message computer page")
    public void iShouldSeeTheTextMessageComputerPage(String arg0) {
    }

    @And("I click on desktop link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktops();
    }

    @Then("I should see the {string} text message desktop page")
    public void iShouldSeeTheTextMessageDesktopPage(String arg0) {
        new DesktopsPage().clickOnBuildYourComp();
    }


    @And("I click on build computer link")
    public void iClickOnBuildComputerLink() {
    }

    @And("I select {string} processor")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select {string} hdd button")
    public void iSelectHddButton(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select {string} ram")
    public void iSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I select {string} os")
    public void iSelectOs(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I select {string} software")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I should see the {string} success message")
    public void iShouldSeeTheSuccessMessage(String arg0) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getAddedToCartText(), "The product has been added to your shopping cart", "Product is not added to shopping cart.");
    }
}
