package Geempower.steps;


import Geempower.Path;
import Geempower.pages.AccountManagementPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Geempower.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxProfile;

import javax.validation.constraints.AssertTrue;

public class GeempowerBinder {

    @Steps
    EndUserSteps steps;


    @Given("open custom login page")
    public void checkThatCustomLoginPageIsOpened() {
        steps.openCustomLoginPage();
    }

    @When("login user")
    public void loginUser() {
        steps.loginUser();
    }

    @Then("account management page is opened")
    public void isAccountManagementPageOpened() {
        steps.isAccountManagementPageOpened();
    }

//    @When("^Click account number$")
//    public void Click_account_number()  {
//        steps.clickAccountNumber();
//    }

    @When("^Click \"([^\"]*)\" account$")
    public void clickAccount(String account) {
        steps.clickAccountNumber(account);
    }


    @When("^Click \"([^\"]*)\" button$")
    public void Click_button(String nameOfButton) {
        steps.click_on_button_in_tooltip(nameOfButton);
    }

    @Then("^Dashboard page is opened$")
    public void Dashboard_page_is_opened() {
//        steps.checkThatAccountNumberIsDisplayedInTheTopOfThePage();
        steps.checkThatOrderStatusWidgetIsDisplayed();
        steps.checkThatTrackOrderWidgetIsDisplayed();
        steps.checkThatRecentOrdersWidgetIsDisplayed();
        steps.checkThatPriceAndAvailabilityWidgetIsDisplayed();
        steps.checkThatFeaturedToolsWidgetIsDisplayed();
    }

    @When("^Click \"([^\"]*)\" \"([^\"]*)\"$")
    public void Click(String tableName, String sort) throws Throwable {
        steps.click_on_table_name_sort(tableName, sort);
    }


    @When("^Search for NA \"([^\"]*)\" account$")
    public void searchForNAAccount(String account) {
        steps.search_for_account(account);

    }

    @When("^Click on cart icon in the header$")
    public void clickOnCartIconInTheHeader() {
        steps.click_on_cart_icon();
    }


    @And("^Cart page is opened$")
    public void cartPageIsOpened() {
        steps.checkThatCartIsOpened();
    }

    @When("^Add product \"([^\"]*)\"to the cart$")
    public void addProductToTheCart(String product) {
        steps.add_product_to_cart(product);
    }

    @And("^Product is added to the cart$")
    public void productIsAddedToTheCart() {
        steps.checkThatProductIsAddedToTheCart();
    }


    @When("^Click Next buttton$")
    public void clickNextButtton() {
        steps.click_Next_buttob();

    }

    @When("^Enter PO number \"([^\"]*)\"$")
    public void enterPONumber(String poNUmber) {
        steps.enter_po_number(poNUmber);
    }

    @When("^Choose stok address$")
    public void chooseStokAddress() {
        steps.choose_stock_address();

    }

    @And("^Minimum Shipment Changes popus is displayed$")
    public void minimumShipmentChangesPopusIsDisplayed() {
        steps.check_that_popup_is_appeared();

    }

    @When("^Click Continue button$")
    public void clickContinueButton() {
        steps.click_Continue_button();
    }

    @When("^Click place Order button$")
    public void clickPlaceOrderButton() {
        steps.click_place_order_button();

    }

    @When("^Check Terms and conditions combobox$")
    public void checkTermsAndConditionsCombobox() {
        steps.checkTermsAndConditionsCheckbox();
    }

    @When("^Click submit button$")
    public void clickSubmitButton() {
        steps.clickSubmitButton();
    }

    @Then("^Order details page is opened$")
    public void orderDetailsPageIsOpened() {
        steps.checkThatOrderDetailsPageIsOpened();
    }

    @When("^Click Next buttton second step$")
    public void clickNextButttonSecondStep() {
        steps.clickNextButttonSecondStep();
    }

    @When("^Click Close buttton$")
    public void clickCloseButtton() {
        steps.clickCloseButtton();

    }

    @When("^Search for LA \"([^\"]*)\" account$")
    public void searchForLAAccount(String account) {
        steps.search_for_account(account);

    }


    @When("^At the Dashboard enter Product \"([^\"]*)\" and check Price and Availability$")
    public void atTheDashboardEnterProductAndCheckPriceAndAvailability(String product) {
        steps.enterProducctNumberToThePAndAVidget(product);
    }

    @When("^Select ship addres popup is appeared$")
    public void selectShipAddresPopupIsAppeared() {
        steps.checkThatSelectShipAddressPopupIsAppeared();
    }

    @When("^Click Submit button at the Select ship addres popup$")
    public void clickSubmitButtonAtTheSelectShipAddresPopup() {
        steps.clickSubmitButtonAtSelectShipAddresspopup();
    }

    @And("^Price and Availability page is opened$")
    public void priceAndAvailabilityPageIsOpened() {
        steps.checkThatPriceAndAvailabilityPageOpened();
    }

    @And("^product is displayed at the Price and Availability page$")
    public void productIsDisplayedAtThePriceAndAvailabilityPage() {
        steps.checkThatProductIsAddedToThePriceAndAvailabilityPage();
    }

    @When("^Add product from P&A page to the cart$")
    public void addProductFromPAPageToTheCart() {
        steps.clickAddToCartButton();
    }

    @When("^Check product in the table$")
    public void checkProductInTheTable() {
        steps.checkCheckboxForProductAtPAndA();
    }

    @When("^Choose Carrier LA$")
    public void chooseCarrierLA() {
        steps.chooseCarrier_LA();
    }

    @And("^Minimum Shipment Changes popus LA is displayed$")
    public void minimumShipmentChangesPopusLAIsDisplayed() {
        steps.checkThatMinimumChargesPopupLAdisplayed();
    }

    @When("^Click Add More Items Button$")
    public void clickAddMoreItemsButton()  {
       steps.clickAddMoreItemsButton();
    }


    @When("^Change Qty of items to \"([^\"]*)\"$")
    public void changeQtyOfItemsTo(String qty) {
        steps.changeItemsQty(qty);
    }

    @And("^Update Price and Availability$")
    public void updatePriceAndAvailability() {
        steps.clickPriseAndAvailabilityButtonOE1();
    }

    @When("^upload \"([^\"]*)\" document with products$")
    public void uploadDocumentWithProducts(String arg0)  {
       steps.uploaadDocumentWithProducts(arg0);

    }

    @When("^Click Check Price And Availability button$")
    public void clickCheckPriceAndAvailabilityButton()  {
        steps.clickCeckPandAButton();
    }

    @When("^Search for EMEA \"([^\"]*)\" account$")
        public void searchForEMEAAccount(String account) {
            steps.search_for_account(account);
    }

    @When("^Enter products \"([^\"]*)\", \"([^\"]*)\" to the P&A vidget$")
    public void enterProductsToThePAVidget(String arg0, String arg1) {
        steps.enterProductsToPriceAndAvailabilityCopyPast(arg0, arg1);

    }

    @When("^Check All products in the table$")
    public void checkAllProductsInTheTable()  {
        steps.CheckCheckboxInTheHeader();
    }

    @When("^All products added to the cart \"([^\"]*)\", \"([^\"]*)\"$")
    public void allProductsAddedToTheCart(String arg0, String arg1) throws Throwable {
        steps.ChechIfAllProductsAdded(arg0, arg1);
    }

    @And("^products added to the P and A page \"([^\"]*)\", \"([^\"]*)\"$")
    public void productsAddedToThePAndAPage(String arg0, String arg1) throws Throwable {
        steps.checkIfAllProductsAddedToPriceAndAvailability(arg0, arg1);
    }



    @When("^Click on \"([^\"]*)\" link in the header$")
    public void clickOnLinkInTheHeader(String arg0)  {
        steps.ClickSavedListsInTheHeader(arg0);
    }

    @And("All Lists page is opened$")
    public void pageIsOpened()  {
        steps.chechThatAllListsPageIsOpened();
    }

    @When("^Create new list \"([^\"]*)\"$")
    public void createNewList(String arg0)  {
        steps.createNewList(arg0);

    }

    @And("^new list is created \"([^\"]*)\"$")
    public void newListIsCreated(String arg0)  {
        steps.checkThatNewListIsCreated(arg0);
    }


    @When("^Click Continue button at the Minimum Shipment Charges popup$")
    public void clickContinueButtonAtTheMinimumShipmentChargesPopup() throws Throwable {
        steps.clickContinueButtonAtpopup();
    }
}
