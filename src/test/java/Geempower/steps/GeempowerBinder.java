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

    @And("^\"([^\"]*)\" product is displayed at the Price and Availability page$")
    public void productIsDisplayedAtThePriceAndAvailabilityPage(String arg0) {
        steps.checkThatProductIsAddedToThePriceAndAvailabilityPage(arg0);
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
    public void clickAddMoreItemsButton() {
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
    public void uploadDocumentWithProducts(String arg0) {
        steps.uploaadDocumentWithProducts(arg0);

    }

    @When("^Click Check Price And Availability button$")
    public void clickCheckPriceAndAvailabilityButton() {
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
    public void checkAllProductsInTheTable() {
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
    public void clickOnLinkInTheHeader(String arg0) {
        steps.ClickSavedListsInTheHeader(arg0);
    }

    @And("All Lists page is opened$")
    public void pageIsOpened() {
        steps.chechThatAllListsPageIsOpened();
    }

    @When("^Create new list \"([^\"]*)\"$")
    public void createNewList(String arg0) {
        steps.createNewList(arg0);

    }

    @And("^new list is created \"([^\"]*)\"$")
    public void newListIsCreated(String arg0) {
        steps.checkThatNewListIsCreated(arg0);
    }


    @When("^Click Continue button at the Minimum Shipment Charges popup$")
    public void clickContinueButtonAtTheMinimumShipmentChargesPopup() throws Throwable {
        steps.clickContinueButtonAtpopup();
    }

    @When("^Click Checkout button in the dropdoun$")
    public void clickCheckoutButtonInTheDropdoun() {
        steps.clickCheckoutButton();
    }

    @When("^open list \"([^\"]*)\"$")
    public void openList(String arg0) {
        steps.clickOnLIst(arg0);
    }

    @When("^add product \"([^\"]*)\" to the list$")
    public void addProductToTheList(String arg0) {
        steps.addProductToList(arg0);
    }

    @And("^product \"([^\"]*)\" is added to the list$")
    public void productIsAddedToTheList(String arg0) {
        steps.checkThaTProductIsAddedToList(arg0);
    }


    @When("^go to the All Items page$")
    public void goToTheAllItemsPage() {
        steps.goToTheAllItemsPage();
    }

    @When("^number of items is changes to \"([^\"]*)\"$")
    public void numberOfItemsIsChangesTo(long arg0) {
        steps.checkThatNumberIsItemsIsChanged(arg0);
    }

    @When("^delete list \"([^\"]*)\"$")
    public void deleteList(String arg0) {
        steps.deleteCreatedList(arg0);
    }

    @Then("^\"([^\"]*)\" list is deleted$")
    public void listIsDeleted(String arg0) {
        steps.checkThatListIsRemoved(arg0);
    }


    @When("^Add product to the \"([^\"]*)\" new list$")
    public void addProductToTheNewList(String arg0) {
        steps.addProductToTHeNewList(arg0);
    }

    @And("^\"([^\"]*)\" new list displayed at the Recent Lists widget$")
    public void newListDisplayedAtTheRecentListsWidget(String arg0) {
        steps.chceckThatNewListIsDisplayed(arg0);
    }

    @When("^Click on \"([^\"]*)\" list at the Recent Lists widget$")
    public void clickOnListAtTheRecentListsWidget(String arg0) {
        steps.clickOnListAtDashdoard(arg0);
    }


    @Then("^list is deleted from the recent Lists widget$")
    public void listIsDeletedFromTheRecentListsWidget() {
        steps.checkThatListIsDeletedFromDashboardWidget();

    }

    @When("^Click \"([^\"]*)\" button at the cart$")
    public void clickButtonAtTheAcrt(String arg0) {
        steps.clickButtonInTheCartHeader(arg0);
    }

    @When("^Save \"([^\"]*)\" cart to the list of saved carts$")
    public void saveCartToTheListOfSavedCarts(String arg0) {
        steps.saveNewCart(arg0);
    }

    @When("^Go to the Dashboard clicking on the GE logo$")
    public void goToTheDashboardClickingOnTheGELogo() {
        steps.clickGELogo();
    }

    @And("^new cart is created \"([^\"]*)\"$")
    public void newCartIsCreated(String arg0) {
        steps.isNewCartCreated(arg0);

    }

    @When("^click on \"([^\"]*)\" saved cart in the table$")
    public void clickOnSavedCartInTheTable(String arg0) {
        steps.clickOnSavedCartInTheTable(arg0);
    }

    @When("^Delete \"([^\"]*)\" from the list$")
    public void deleteFromTheList(String arg0) {
        steps.deletesavedCart(arg0);
    }

    @Then("^\"([^\"]*)\" is deleted$")
    public void isDeleted(String arg0) {
        steps.isCartDeletedFromTheList(arg0);
    }

    @And("^entered PO number \"([^\"]*)\" and stock address \"([^\"]*)\" are saved$")
    public void enteredPONumberAndStockAddressAreSaved(String arg0, String arg1) {
        steps.isPONumberAndStockAddresSaved(arg0, arg1);
    }

    @And("^\"([^\"]*)\" spa is displayed$")
    public void spaIsDisplayed(String arg0) {
        steps.isStandartSpaDisplayed(arg0);
    }

    @When("^Open Special Pricing Lookup$")
    public void openSpecialPricingLookup() throws Throwable {
        steps.openSpecialPricingLookup();
    }

    @When("^Click on \"([^\"]*)\" spa$")
    public void clickOnSpa(String arg0) throws Throwable {
        steps.clickOnSpainpopup(arg0);
    }

    @When("^Click \"([^\"]*)\" button at Special Pricing Lookup$")
    public void clickButtonAtSpecialPricingLookup(String arg0) throws Throwable {
        steps.clickOnButtonAtSpecialPricingLookup(arg0);
    }

    @When("^Update Price and Availability at P&A page$")
    public void updatePriceAndAvailabilityAtPAPage() throws Throwable {
        steps.UpdatePriceAndAvailabilityAtPAPage();
    }


    @Then("^Final Net Price are updated to \"([^\"]*)\"$")
    public void finalNetPriceAreUpdatedTo(String arg0) throws Throwable {
        steps.isFinalNetPricesChanged(arg0);
    }

    @Then("^Extnd Price are updated to \"([^\"]*)\"$")
    public void extndPriceAreUpdatedTo(String arg0) throws Throwable {
        steps.isExtndPricesChanged(arg0);
    }


    @When("^Qty \"([^\"]*)\" is displayed$")
    public void qtyIsDisplayed(String arg0) throws Throwable {
        steps.checkThatQtyisDisplayed(arg0);
    }

    @Then("^Extnd price is \"([^\"]*)\"$")
    public void extndPriceIs(String arg0) throws Throwable {
        steps.checkThatExtndPriceCorrect(arg0);
    }

    @When("^click \"([^\"]*)\" at the P&A page$")
    public void clickAtThePAPage(String arg0) throws Throwable {
        steps.clickAddItemButton(arg0);
    }

    @When("^add product \"([^\"]*)\" to the Price and Availability page$")
    public void addProductToThePriceAndAvailabilityPage(String arg0) throws Throwable {
        steps.addProductToPAndA(arg0);
    }

    @Then("^Check that both \"([^\"]*)\" and \"([^\"]*)\" products are displayed$")
    public void checkThatBothAndProductsAreDisplayed(String arg0, String arg1) throws Throwable {
        steps.checkIfAllProductsAddedToPriceAndAvailability(arg0, arg1);
    }

    @Then("^\"([^\"]*)\" spa applied for all products$")
    public void spaAppliedForAllProducts(String arg0) throws Throwable {
        steps.checkThatSpaAppliedForAllProdInTable(arg0);
    }

    @When("^Search by \"([^\"]*)\" SPA No$")
    public void searchBySPANo(String arg0) throws Throwable {
        steps.searchBySpaNoSpaPopup(arg0);
    }

    @When("^Search by \"([^\"]*)\" Customer Name$")
    public void searchByCustomerName(String arg0) throws Throwable {
        steps.searchByCustomerName(arg0);
    }

    @When("^Search by \"([^\"]*)\" Customer No$")
    public void searchByCustomerNo(String arg0) throws Throwable {
        steps.searchByCustomerNumber(arg0);
    }

    @Then("^\"([^\"]*)\" error message is displayed at the P&A results page$")
    public void errorMessageIsDisplayedAtThePAResultsPage(String arg0) throws Throwable {
        steps.InvalidSpaErrorIsDisplayedAtPandAPage(arg0);

    }

    @When("^click on \"([^\"]*)\" product in the table$")
    public void clickOnProductInTheTable(String arg0) throws Throwable {
        steps.clickOnProductInThePandAList(arg0);
    }

    @Then("^\"([^\"]*)\" tab is shown at the product details popup$")
    public void tabIsShownAtTheProductDetailsPopup(String arg0) throws Throwable {
        steps.checkthatSpecificationsTabIsOpened(arg0);
    }

    @When("^Click on \"([^\"]*)\" tab$")
    public void clickOnTab(String arg0) throws Throwable {
        steps.clickOntabInPDP(arg0);
    }

    @Then("^\"([^\"]*)\" error message is displayed at the Product details popup$")
    public void errorMessageIsDisplayedAtTheProductDetailsPopup(String arg0) throws Throwable {
        steps.checkThatPricingAgreementIsInvalidErrorIsDisplayedAtPDP(arg0);
    }

    @Then("^\"([^\"]*)\" error message isn't displayed at the P&A results page$")
    public void errorMessageIsnTDisplayedAtThePAResultsPage(String arg0) throws Throwable {
        steps.checkThatPricingAgreementIsntInvalidErrorIsDisplayedAtPandApage(arg0);
    }

    @Then("^\"([^\"]*)\" error message isn't displayed at the Product details popup$")
    public void errorMessageIsnTDisplayedAtTheProductDetailsPopup(String arg0) throws Throwable {
        steps.checkThatPricingAgreementIsInvalidErrorIsntDisplayedAtPDP(arg0);
    }


    @Then("^\"([^\"]*)\" error message isn't displayed at Product details popup$")
    public void errorMessageIsnTDisplayedAtProductDetailsPopup(String arg0) throws Throwable {
        steps.checkThanFinalNetpriceIsGreaterErrorMessageIsDisplayedAtPDP(arg0);
    }


    @Then("^\"([^\"]*)\" error message is displayed at Product details popup$")
    public void errorMessageIsDisplayedAtProductDetailsPopup(String arg0) throws Throwable {
        steps.CheckThatWarningPriceMessageisDisplayed(arg0);
    }

    @When("^Click \"([^\"]*)\" EMEA account$")
    public void clickEMEAAccount(String arg0) throws Throwable {
        steps.clickEMEAAccount(arg0);
    }
}
