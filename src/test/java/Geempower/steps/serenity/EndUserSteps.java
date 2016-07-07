package Geempower.steps.serenity;

import Geempower.Path;
import Geempower.pages.AccountManagementPage;
import Geempower.pages.DashboardPage;
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
    public void clickAccountNumber() {
        accountManagementPage.clickAccountNumber();
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
    public void search_for_account(String na_account) {
        accountManagementPage.search_for_account(na_account);
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
}