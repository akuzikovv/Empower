package Geempower.steps.serenity;

import Geempower.Path;
import Geempower.pages.*;
import cucumber.api.java.cs.A;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;


public class EndUserSteps extends ScenarioSteps {

    AccountManagementPage accountManagementPage;
    DashboardPage dashboardPage;
    PriceAndAvailability priceAndAvailability;
    OrderStatus orderStatus;
    Invoice invoice;
    ManageUsers manageusers;




    @Step
    public void openCustomLoginPage() {
        getDriver().manage().window().maximize();
        accountManagementPage.open();

    }
    @Step
    public void loginUser() {
        accountManagementPage.loginUser();
    }

    @Step
    public void isAccountManagementPageOpened() {
        Assert.assertTrue(accountManagementPage.isAccountManagementLogoVisible());
    }

    @Step
    public void clickAccountNumber(String account) {
        accountManagementPage.clickAccountNumber(account);
    }

    @Step
    public void click_on_button_in_tooltip(String nameOfButton) {
        accountManagementPage.clickNameOfButton(nameOfButton);
    }
    @Step
    public void checkThatAccountNumberIsDisplayedInTheTopOfThePage() {
        Assert.assertTrue(accountManagementPage.isAccountNumberDisplayedInTheTopOfThePage());
    }
    @Step
    public void checkThatOrderStatusWidgetIsDisplayed() {
        Assert.assertTrue(accountManagementPage.isOrderStatusWidgetDisplayedInTheTopOfThePage());
    }
    @Step
    public void checkThatTrackOrderWidgetIsDisplayed() {
        Assert.assertTrue(accountManagementPage.isTrackOrderWidgetDisplayedInTheTopOfThePage());
    }
    @Step
    public void checkThatRecentOrdersWidgetIsDisplayed() {
        Assert.assertTrue(accountManagementPage.isRecentOrdersWidgetDisplayedInTheTopOfThePage());
    }
    @Step
    public void checkThatPriceAndAvailabilityWidgetIsDisplayed() {
        Assert.assertTrue(accountManagementPage.isPriceAndAvailabilityDisplayedInTheTopOfThePage());
    }
    @Step
    public void checkThatFeaturedToolsWidgetIsDisplayed() {
        Assert.assertTrue(accountManagementPage.isFeaturedToolsWidgetDisplayedInTheTopOfThePage());
    }
    @Step
    public void click_on_table_name_sort(String tableName, String sort) {
        accountManagementPage.clck_on_table_name_sort(tableName,sort);
    }

    @Step
    public void search_for_account(String account) {
        accountManagementPage.search_for_account(account);
    }

    @Step
    public void click_on_cart_icon() {
        accountManagementPage.click_cart_icon();
    }

    @Step
    public void checkThatCartIsOpened() {
        Assert.assertTrue(accountManagementPage.isCartPageOpened());
    }
    @Step
    public void add_product_to_cart(String product) {
        accountManagementPage.add_product_to_cart(product);

    }
    @Step
    public void checkThatProductIsAddedToTheCart() {
        Assert.assertTrue(accountManagementPage.is_poructAddedToTheCart());
    }

    @Step
    public void click_Next_buttob() {
        accountManagementPage.click_Next_Button();
    }

    @Step
    public void enter_po_number( String poNUmber) {
        accountManagementPage.enter_po_number(poNUmber);
    }
    @Step
    public void choose_stock_address() {
        accountManagementPage.choose_stock_address();
    }

    @Step
    public void check_that_popup_is_appeared() {
        Assert.assertTrue(accountManagementPage.is_minimum_popup_displayed());
    }
    @Step
    public void click_Continue_button() {
        accountManagementPage.clickContinueButton();
    }
    @Step
    public void click_place_order_button() {
        accountManagementPage.clickPlaceOrderButton();
    }
    @Step
    public void checkTermsAndConditionsCheckbox() {
        accountManagementPage.checkTAndCCheckbox();
    }

    @Step
    public void clickSubmitButton() {
        accountManagementPage.clickSubmitButton();
    }
    @Step
    public void checkThatOrderDetailsPageIsOpened() {
        Assert.assertTrue(accountManagementPage.isOrderDetailsPageOpened());
    }
    @Step
    public void clickNextButttonSecondStep() {
        accountManagementPage.clickNextButttonSecondStep();
    }
    @Step
    public void clickCloseButtton() {
        accountManagementPage.clickCloseButtton();
    }
    @Step
    public void enterProducctNumberToThePAndAVidget(String product) {
        accountManagementPage.enterProductNumberPaAVidget(product);
    }
    @Step
    public void checkThatSelectShipAddressPopupIsAppeared() {
        Assert.assertTrue(accountManagementPage.isSelectShipAddresspopupAppeared());
    }
    @Step
    public void clickSubmitButtonAtSelectShipAddresspopup() {
        accountManagementPage.clickSubmitButtonAtSelectShipAddresspopup();
    }
    @Step
    public void checkThatPriceAndAvailabilityPageOpened() {
        Assert.assertTrue(accountManagementPage.isPriceAndAvailabilityPageOpened());
    }
    @Step
    public void checkThatProductIsAddedToThePriceAndAvailabilityPage(String arg0) {
        Assert.assertTrue(accountManagementPage.isProductAddedToThePAndA(arg0));
    }
    @Step
    public void clickAddToCartButton() {
        accountManagementPage.clicAddToCartButton();
    }
    @Step
    public void checkCheckboxForProductAtPAndA() {
        accountManagementPage.checkCheckboxForProductAtPAndA();
    }
    @Step
    public void chooseCarrier_LA() {
        accountManagementPage.chooseCarrierLA();
    }
    @Step
    public void checkThatMinimumChargesPopupLAdisplayed() {
        Assert.assertTrue(accountManagementPage.isMinimumPopupLAdisplayed());
    }
    @Step
    public void clickAddMoreItemsButton() {
        accountManagementPage.clickAddMoreItemsButton();
    }
    @Step
    public void changeItemsQty(String qty) {
        accountManagementPage.changeQtyOfProducts(qty);
    }
    @Step
    public void clickPriseAndAvailabilityButtonOE1() {
        accountManagementPage.clickPriceAndAvailabilityButtonOE1();
    }
    @Step
    public void uploaadDocumentWithProducts(String arg0) {
        accountManagementPage.uploadaDocWithProducts(arg0);
    }
    @Step
    public void clickCeckPandAButton() {
        accountManagementPage.ClickPandAButton();
    }
    @Step
    public void enterProductsToPriceAndAvailabilityCopyPast(String arg0, String arg1) {
        accountManagementPage.enterProductsToPriceAndAvailabilityCP(arg0, arg1);
    }
    @Step
    public void CheckCheckboxInTheHeader() {
        accountManagementPage.CheckCheckboxAtHeader();
    }
    @Step
    public void ChechIfAllProductsAdded(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(accountManagementPage.isProductsAddedToTheCart(arg0));
        Assert.assertTrue(accountManagementPage.isProductsAddedToTheCart(arg0.replace(arg0,arg1)));
    }
    @Step
    public void checkIfAllProductsAddedToPriceAndAvailability(String arg0, String arg1) {
        Assert.assertTrue(accountManagementPage.isProductsDisplayedAtThePriceAndAvailability(arg0));
        Assert.assertTrue(accountManagementPage.isProductsDisplayedAtThePriceAndAvailability(arg0.replace(arg0,arg1)));

    }
    @Step
    public void ClickSavedListsInTheHeader(String arg0) {
        accountManagementPage.clickButtonAtTheNavbar(arg0);
    }
    @Step
    public void chechThatAllListsPageIsOpened() {
        Assert.assertTrue(accountManagementPage.isAllListsPageOpened());
    }
    @Step
    public void createNewList(String arg0) {
        accountManagementPage.createNewList(arg0);
    }
    @Step
    public void checkThatNewListIsCreated(String arg0) {
        Assert.assertTrue(accountManagementPage.isListAddedToTheTable(arg0));
    }

    @Step
    public void clickContinueButtonAtpopup() {
        accountManagementPage.clickContinueButtonMinimalChargesPopup();
    }
    @Step
    public void clickCheckoutButton() {
        accountManagementPage.clickCheckoutButton();
    }
    @Step
    public void clickOnLIst(String arg0) {
        accountManagementPage.clickOnSavedList(arg0);
    }
    @Step
    public void addProductToList(String arg0) {
        accountManagementPage.addProdactToTheList(arg0);
    }
    @Step
    public void checkThaTProductIsAddedToList(String arg0) {
        Assert.assertTrue(accountManagementPage.isProductAddedToTheList(arg0));
    }
    @Step
    public void goToTheAllItemsPage() {
        accountManagementPage.clickBackButton();
    }
    @Step
    public void checkThatNumberIsItemsIsChanged(long arg0) {
        Assert.assertEquals(accountManagementPage.getNumberOfProductsInTheList(), arg0);
    }
    @Step
    public void deleteCreatedList(String arg0) {
        accountManagementPage.deleteList(arg0);
    }
    @Step
    public void checkThatListIsRemoved(String arg0) {
        Assert.assertFalse(accountManagementPage.isListRemoved(arg0));
    }
    @Step
    public void addProductToTHeNewList(String arg0) {
        accountManagementPage.addProdToTheNewListFromPriceAndAvailabilityPage(arg0);
    }
    @Step
    public void chceckThatNewListIsDisplayed(String arg0) {
        Assert.assertTrue(accountManagementPage.isProductsDisplayedAtTheRecentListWidget(arg0));
    }
    @Step
    public void clickOnListAtDashdoard(String arg0) {
        accountManagementPage.clickOnAppropriateListAtDashboard(arg0);
    }
    @Step
    public void checkThatListIsDeletedFromDashboardWidget() {
        Assert.assertFalse(accountManagementPage.isListRemovedFromDashboard());
    }
    @Step
    public void clickButtonInTheCartHeader(String arg0) {
        accountManagementPage.clickButtonAtCartHeader(arg0);
    }
    @Step
    public void saveNewCart(String arg0) {
        accountManagementPage.saveNewCartToTheList(arg0);
    }
    @Step
    public void clickGELogo() {
        accountManagementPage.clickGELogoInTheHeader();
    }
    @Step
    public void isNewCartCreated(String arg0) {
        Assert.assertTrue(accountManagementPage.isCartSAved(arg0));
    }
    @Step
    public void clickOnSavedCartInTheTable(String arg0) {
        accountManagementPage.clickOnSavedCart(arg0);
    }
    @Step
    public void deletesavedCart(String arg0) {
        accountManagementPage.deleteNewSavedcart(arg0);
    }
    @Step
    public void isCartDeletedFromTheList(String arg0) {
        Assert.assertFalse(accountManagementPage.isCartRemoved(arg0));
    }

    @Step
    public void isPONumberAndStockAddresSaved(String arg0, String arg1) {
        Assert.assertTrue(accountManagementPage.isEnteredPONumberSaved(arg0));
        Assert.assertTrue(accountManagementPage.isEnteredStockAddressSaved(arg1));
    }
    @Step
    public void isStandartSpaDisplayed(String arg0) {
        Assert.assertTrue(priceAndAvailability.isStandartSpaPreselected(arg0));
    }
    @Step
    public void openSpecialPricingLookup() {
        priceAndAvailability.clickOnMagnifyingGlass();
    }
    @Step
    public void clickOnSpainpopup(String arg0) {
        priceAndAvailability.chooseSpaInTheSPPopup(arg0);
    }
    @Step
    public void clickOnButtonAtSpecialPricingLookup(String arg0) {
        priceAndAvailability.clickButtonAtSPLookap(arg0);
    }
    @Step
    public void UpdatePriceAndAvailabilityAtPAPage() {
        priceAndAvailability.clickUpdatePrAndAvButton();
    }
    @Step
    public void isFinalNetPricesChanged(String arg0) {
        Assert.assertTrue(priceAndAvailability.isFinalNetPriceUpdated(arg0));
    }
    @Step
    public void isExtndPricesChanged(String arg0) {
        Assert.assertTrue(priceAndAvailability.isExtndPriceUpdated(arg0));
    }


    @Step
    public void checkThatQtyisDisplayed(String arg0) {
        Assert.assertTrue(priceAndAvailability.isAppropriateQtyDisplayed(arg0));
    }

    @Step
    public void checkThatExtndPriceCorrect(String arg0) {
        Assert.assertTrue(priceAndAvailability.isExtndPriceUpdated(arg0));

    }
    @Step
    public void clickAddItemButton(String arg0) {
        priceAndAvailability.clickOnButtonAtTheHeaderAtPriceAndAnailability(arg0);
    }
    @Step
    public void addProductToPAndA(String arg0) {
        priceAndAvailability.addprodToThePage(arg0);
    }
    @Step
    public void checkThatSpaAppliedForAllProdInTable(String arg0) {
        Assert.assertTrue(priceAndAvailability.isStandartSpaPreselected(arg0));
    }
    @Step
    public void searchBySpaNoSpaPopup(String arg0) {
        priceAndAvailability.searchAtSpapopup(arg0);
    }
    @Step
    public void searchByCustomerNumber(String arg0) {
        priceAndAvailability.searchAtSpapopup(arg0);
    }
    @Step
    public void searchByCustomerName(String arg0) {
        priceAndAvailability.searchAtSpapopup(arg0);
    }
    @Step
    public void InvalidSpaErrorIsDisplayedAtPandAPage(String arg0) {
        Assert.assertTrue(priceAndAvailability.isInvalidSpaErrorDisplayedAtPanaAPage(arg0));
    }
    @Step
    public void clickOnProductInThePandAList(String arg0) {
        priceAndAvailability.clickOnProductInTheTable(arg0);
    }
    @Step
    public void checkthatSpecificationsTabIsOpened(String arg0) {
        Assert.assertTrue(priceAndAvailability.isCorrectTabOpenedAtPDP(arg0));
    }
    @Step
    public void clickOntabInPDP(String arg0) {
        priceAndAvailability.clickTabInPDP(arg0);
    }
    @Step
    public void checkThatPricingAgreementIsInvalidErrorIsDisplayedAtPDP(String arg0) {
        Assert.assertTrue(priceAndAvailability.isPricingAgreementIsInvalidErrorIsDisplayedAtPDPopup(arg0));
    }
    @Step
    public void checkThatPricingAgreementIsntInvalidErrorIsDisplayedAtPandApage(String arg0) {
        Assert.assertFalse(priceAndAvailability.isInvalidSpaErrorDisplayedAtPanaAPage(arg0));
    }
    @Step
    public void checkThatPricingAgreementIsInvalidErrorIsntDisplayedAtPDP(String arg0) {
        Assert.assertFalse(priceAndAvailability.isPricingAgreementIsInvalidErrorIsDisplayedAtPDPopup(arg0));
    }
    @Step
    public void checkThanFinalNetpriceIsGreaterErrorMessageIsDisplayedAtPDP(String arg0) {
        Assert.assertFalse(priceAndAvailability.isFinalNetPriceIsGreaterErrorIsDisplayedAtPDPopup(arg0));
    }

    @Step
    public void CheckThatWarningPriceMessageisDisplayed(String arg0) {
        Assert.assertTrue(priceAndAvailability.isFinalNetPriceIsGreaterErrorIsDisplayedAtPDPopup(arg0));
    }
@Step
    public void clickEMEAAccount(String arg0) {
    priceAndAvailability.clickEMEAAccunt(arg0);
    }

    public void chechThatAllOrdersPageIsOpened() {
        Assert.assertTrue(orderStatus.isOrderStatusPageOpened());
    }

    public void searchByAtOrderStatus(String arg0) {
        orderStatus.searchByAtOrderStatus(arg0);
    }

    public void appropriateOrderNumberIsDisplayedAtTheTable(String arg0) {
        Assert.assertTrue(orderStatus.isAppropriateOrderDisplayed(arg0));
    }

    public void checkThatAppropriatePONumberIsDisplayedAtTheTable(String arg0) {
        Assert.assertTrue(orderStatus.isAppropriatePODisplayed(arg0));
    }

    public void chceckThatJobNameIsDisplayedAtTheTable(String arg0) {
        Assert.assertTrue(orderStatus.isAppropriateJobNameDisplayed(arg0));
    }

    public void clickOnAppropriateOrder(String arg0) {
        orderStatus.clickOnOrder(arg0);
    }

    public void clcikOnAppropriatePO(String arg0) {
        orderStatus.clickOnPONumber(arg0);
    }

    public void checkCheckboxInTheHeader() {
        orderStatus.checkCheckboxInHeader();
    }

    public void clickNextButtonAtThePOPage() {
        orderStatus.clickNextButtonPOPage();
    }

    public void checkThatPOOrderDetailsPageOpened() {
        Assert.assertTrue(orderStatus.isPOOrderDetailPageopened());
    }

    public void checkThatAllInvoicedPageOpened() {
        Assert.assertTrue(invoice.isAllInvoicesPageOpened());
    }

    public void chooseRegion(String arg0) {
        priceAndAvailability.chooceAppropriateRegion(arg0);
    }

    public void clickOnOrderLineDetails() {
        orderStatus.clickOrderLineDetails();
    }

    public void checkThatOrderLineItemDetailsIsDisplayed() {
        Assert.assertTrue(orderStatus.checkThatOrderLineItemDetailsIsOpened());
    }
}