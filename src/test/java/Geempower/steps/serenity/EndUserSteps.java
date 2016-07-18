package Geempower.steps.serenity;

import Geempower.Path;
import Geempower.pages.AccountManagementPage;
import Geempower.pages.DashboardPage;
import cucumber.api.java.cs.A;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;


public class EndUserSteps extends ScenarioSteps {

    AccountManagementPage accountManagementPage;
    DashboardPage dashboardPage;


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

    public void checkThatProductIsAddedToThePriceAndAvailabilityPage() {
        Assert.assertTrue(accountManagementPage.isProductAddedToThePAndA());
    }

    public void clickAddToCartButton() {
        accountManagementPage.clicAddToCartButton();
    }

    public void checkCheckboxForProductAtPAndA() {
        accountManagementPage.checkCheckboxForProductAtPAndA();
    }

    public void chooseCarrier_LA() {
        accountManagementPage.chooseCarrierLA();
    }

    public void checkThatMinimumChargesPopupLAdisplayed() {
        Assert.assertTrue(accountManagementPage.isMinimumPopupLAdisplayed());
    }

    public void clickAddMoreItemsButton() {
        accountManagementPage.clickAddMoreItemsButton();
    }

    public void changeItemsQty(String qty) {
        accountManagementPage.changeQtyOfProducts(qty);
    }

    public void clickPriseAndAvailabilityButtonOE1() {
        accountManagementPage.clickPriceAndAvailabilityButtonOE1();
    }

    public void uploaadDocumentWithProducts(String arg0) {
        accountManagementPage.uploadaDocWithProducts(arg0);
    }
}