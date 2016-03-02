package Geempower.steps;


import Geempower.Path;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Geempower.steps.serenity.EndUserSteps;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxProfile;

import javax.validation.constraints.AssertTrue;

public class GeempowerBinder {

    @Steps
    EndUserSteps steps;




    @Given("open custom login page")
    public void checkThatCustomLoginPageIsOpened(){
        steps.openCustomLoginPage();
    }

    @When("login user")
    public void loginUser() {
        steps.loginUser();
    }

    @Then("account management page is opened")
    public void isAccountManagementPageOpened(){
        steps.isAccountManagementPageOpened();
    }

    @When("^Click account number$")
    public void Click_account_number()  {
        steps.clickAccountNumber();
    }

    @When("^Click \"([^\"]*)\" button$")
    public void Click_button(String nameOfButton) {
        steps.click_on_button_in_tooltip(nameOfButton);
    }

    @Then("^Dashboard page is opened$")
    public void Dashboard_page_is_opened() {
        steps.checkThatAccountNumberIsDisplayedInTheTopOfThePage();
        steps.checkThatOrderStatusWidgetIsDisplayed();
        steps.checkThatTrackOrderWidgetIsDisplayed();
        steps.checkThatRecentOrdersWidgetIsDisplayed();
        steps.checkThatPriceAndAvailabilityWidgetIsDisplayed();
        steps.checkThatFeaturedToolsWidgetIsDisplayed();
    }
}
