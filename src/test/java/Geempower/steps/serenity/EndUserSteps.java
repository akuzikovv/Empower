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
import org.openqa.selenium.Dimension;

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

    ///////////////////////////////////////// ANTON'S CODE //////////////////////////////////////////////////////////////////////

    @Step
    public void openSignInPage() {
//        FirefoxProfile firefoxProfile = new FirefoxProfile();
//        firefoxProfile.setPreference("browser.privatebrowsing.autostart", true);
        getDriver().manage().window().maximize();
        signInpage.open();
    }

    @Step
    public void authorization() {
        signInpage.enterUserId();
        signInpage.enterUserPassword();
        signInpage.clickOnTheSignInButton();
    }

    @Step
    public void selectAccount() {
        accountManagementPage.selectAccount();
    }

    @Step
    public void checkThatdashboardPageContainsAllNecessaryFieldsWidgetsAndButtons() {
        Assert.assertTrue("TRAINIG_LAYER1 is Absent", dashboardPage.checkThatdashboardPageContainTRAINIG_LAYER1());
        Assert.assertTrue("ACCOUNT_INFO_COMBOBOX is Absent ", dashboardPage.checkThatdashboardPageContainACCOUNT_INFO_COMBOBOX());
        Assert.assertTrue("USER_PROFILE_COMBOBOX is Absent  ", dashboardPage.checkThatdashboardPageContainUSER_PROFILE_COMBOBOX());
        Assert.assertTrue("HOME_BUTTON is absent ", dashboardPage.checkThatdashboardPageContainHOME_BUTTON());
        Assert.assertTrue("MY_CART_BUTTON is absent", dashboardPage.checkThatdashboardPageContainMY_CART_BUTTON());
        Assert.assertTrue("ORDER_STATUS_BUTTON is absent", dashboardPage.checkThatdashboardPageContainORDER_STATUS_BUTTON());
        Assert.assertTrue("SAVED_LISTS_BUTTON is absent", dashboardPage.checkThatDashboardPageContainSAVED_LISTS_BUTTON());
        Assert.assertTrue("ORDER_STATUS_WIDGET is absent ", dashboardPage.checkThatdashboardPageContainORDER_STATUS_WIDGET());
        Assert.assertTrue("ORDER_SEARCH_WIDGET is absent", dashboardPage.checkThatdashboardPageContainORDER_SEARCH_WIDGET());
        Assert.assertTrue("RECENT_ORDERS_WIDGET is absent", dashboardPage.checkThatdashboardPageContainRECENT_ORDERS_WIDGET());
        Assert.assertTrue("RECENT_LISTS_WIDGET is absent", dashboardPage.checkThatdashboardPageContainRECENT_LISTS_WIDGET());
        Assert.assertTrue("PRICE_AND_AVAILABILITY_WIDGET is absent", dashboardPage.checkThatdashboardPageContainPRICE_AND_AVAILABILITY_WIDGET());
        Assert.assertTrue("FEATURED_TOOLS_WIDGET is absent", dashboardPage.checkThatdashboardPageContainFEATURED_TOOLS_WIDGET());
        Assert.assertTrue("COOKIES_BANNER is absent", dashboardPage.checkThatdashboardPageContainCOOKIES_BANNER());
    }

    @Step
    public void clickNextButtonOnEveryBalloon() {
        dashboardPage.clickNextButtonOnEveryBalloon();
    }

    @Step
    public void checkThatforEachWidgetAppropriateBalloonIsDisplayed() {
        Assert.assertTrue("False", dashboardPage.checkThatforEachWidgetAppropriateBalloonIsDisplayed());
        Assert.assertTrue("trainig text False", (ILocators.WidgetHasNecessaryText).equals(Serenity.getCurrentSession().get("trainig text")));
        Assert.assertTrue("trainig text2 False", (ILocators.WidgetHasNecessaryText2).equals(Serenity.getCurrentSession().get("trainig text2")));
        Assert.assertTrue("trainig text3 False", (ILocators.WidgetHasNecessaryText3).equals(Serenity.getCurrentSession().get("trainig text3")));
        Assert.assertTrue("trainig text4 False", (ILocators.WidgetHasNecessaryText4).equals(Serenity.getCurrentSession().get("trainig text4")));
        Assert.assertTrue("trainig text5 False", (ILocators.WidgetHasNecessaryText5).equals(Serenity.getCurrentSession().get("trainig text5")));
        Assert.assertTrue("trainig text6 False", (ILocators.WidgetHasNecessaryText6).equals(Serenity.getCurrentSession().get("trainig text6")));
        Assert.assertTrue("trainig text7 False", (ILocators.WidgetHasNecessaryText7).equals(Serenity.getCurrentSession().get("trainig text7")));
        Assert.assertTrue("trainig text0 False", (ILocators.WidgetHasNecessaryText0).equals(Serenity.getCurrentSession().get("trainig text0")));
    }

    @Step
    public void clickPreviousButtonOnEveryBalloon() {
        dashboardPage.clickPreviousButtonOnEveryBalloon();
    }

    @Step
    public void clickSkipButton() {
        dashboardPage.clickSkipButton();
    }

    @Step
    public void checkThattrainingLayerIsClosed() {
        Assert.assertTrue("training Layer Isn't Closed", dashboardPage.checkThattrainingLayerIsClosed());
    }

    @Step
    public void clickOnAccountNumberInTheHeader() {
        dashboardPage.clickOnAccountNumberInTheHeader();
    }

    @Step
    public void checkThatnecessaryFieldsAreShown() {
        Assert.assertTrue("AccountNo Field Isn't Shown", "Account No.".equals(Serenity.getCurrentSession().get("account field1")));
        Assert.assertTrue("AccountName Field Isn't Shown", "Account Name".equals(Serenity.getCurrentSession().get("account field2")));
        Assert.assertTrue("Address Field Isn't Shown", "Address".equals(Serenity.getCurrentSession().get("account field3")));
        Assert.assertTrue("SalesOrg Field Isn't Shown", "Sales Org.".equals(Serenity.getCurrentSession().get("account field4")));
        Assert.assertTrue("SalesChannel Field Isn't Shown", "Sales Channel".equals(Serenity.getCurrentSession().get("account field5")));
        Assert.assertTrue("Currency Field Isn't Shown", "Currency".equals(Serenity.getCurrentSession().get("account field6")));
        Assert.assertTrue("Change Account Button isn't Shown", dashboardPage.checkThatChangeAccountButtonisShown());
    }

    @Step
    public void clickChangeAccountButtonInTheDropdownList() {
        dashboardPage.clickChangeAccountButtonInTheDropdownList();
    }

    @Step
    public void checkThataccountManagementPageIsOpened() {
        Assert.assertTrue("account Management Page Isn't Opened", "Account Management".equals(Serenity.getCurrentSession().get("Account Management page text")));
    }

    @Step
    public void clickOnAccountNumberInTheList() {
        accountManagementPage.selectAccount();
    }

    @Step
    public void dashboardPageIsOpened1() {
        Assert.assertTrue("ACCOUNT_INFO_COMBOBOX is Absent ", dashboardPage.checkThatdashboardPageContainACCOUNT_INFO_COMBOBOX());
        Assert.assertTrue("USER_PROFILE_COMBOBOX is Absent  ", dashboardPage.checkThatdashboardPageContainUSER_PROFILE_COMBOBOX());
        Assert.assertTrue("HOME_BUTTON is absent ", dashboardPage.checkThatdashboardPageContainHOME_BUTTON());
        Assert.assertTrue("MY_CART_BUTTON is absent", dashboardPage.checkThatdashboardPageContainMY_CART_BUTTON());
        Assert.assertTrue("ORDER_STATUS_BUTTON is absent", dashboardPage.checkThatdashboardPageContainORDER_STATUS_BUTTON());
        Assert.assertTrue("SAVED_LISTS_BUTTON is absent", dashboardPage.checkThatDashboardPageContainSAVED_LISTS_BUTTON());
        Assert.assertTrue("ORDER_STATUS_WIDGET is absent ", dashboardPage.checkThatdashboardPageContainORDER_STATUS_WIDGET());
        Assert.assertTrue("ORDER_SEARCH_WIDGET is absent", dashboardPage.checkThatdashboardPageContainORDER_SEARCH_WIDGET());
        Assert.assertTrue("RECENT_ORDERS_WIDGET is absent", dashboardPage.checkThatdashboardPageContainRECENT_ORDERS_WIDGET());
        Assert.assertTrue("RECENT_LISTS_WIDGET is absent", dashboardPage.checkThatdashboardPageContainRECENT_LISTS_WIDGET());
        Assert.assertTrue("PRICE_AND_AVAILABILITY_WIDGET is absent", dashboardPage.checkThatdashboardPageContainPRICE_AND_AVAILABILITY_WIDGET());
        Assert.assertTrue("FEATURED_TOOLS_WIDGET is absent", dashboardPage.checkThatdashboardPageContainFEATURED_TOOLS_WIDGET());
        Assert.assertTrue("COOKIES_BANNER is absent", dashboardPage.checkThatdashboardPageContainCOOKIES_BANNER());
    }

    @Step
    public void checkThatorderStatusWidgetContainsAllNecessaryElements() {

        Assert.assertTrue("\"Total Orders\" circle is absent", dashboardPage.checkThatorderStatusWidgetContainsTotalOrders());
        Assert.assertTrue(" \"Open\" circle is absent", dashboardPage.checkThatorderStatusWidgetContainsOpen());
        Assert.assertTrue("\"Shipped\" circle is absent", dashboardPage.checkThatorderStatusWidgetContainsShipped());
        Assert.assertTrue("\"On Hold\" circle is absent", dashboardPage.checkThatorderStatusWidgetContainsOnHold());
        Assert.assertTrue("\"Cancelled\" circle is absent", dashboardPage.checkThatorderStatusWidgetContainsCancelled());
        Assert.assertTrue("\"Last 150 orders\" text is absent", "Last 150 orders".equals(Serenity.getCurrentSession().get("ORDER STATUS TEXT")));
    }

    @Step
    public void clickTotalPricesCircle() {
        dashboardPage.clickTotalPricesCircle();
    }

    @Step
    public void checkThatallOrdersPageIsOpened() {
        Assert.assertTrue("False", "All Orders".equals(Serenity.getCurrentSession().get("All orders text")));
        Assert.assertTrue("False", "All Status".equals(Serenity.getCurrentSession().get("status combobox")));

    }

    @Step
    public void clickHOMEButton() {
        allOrdersPage.clickHOMEButton();
    }

    @Step
    public void clickOpenCircle() {
        dashboardPage.clickOpenCircle();
    }

    @Step
    public void checkThatopenTextIsDisplayedInTheStatusCombobox() {
        Assert.assertTrue("False", "Open".equals(allOrdersPage.checkThatOpenStatusIsdisplayedInTheStatusCombobox()));
    }

    @Step
    public void clickShippedCircle() {
        dashboardPage.clickShippedCircle();
    }

    @Step
    public void checkThatshippedTextIsDisplayedInTheStatusCombobox() {
        Assert.assertTrue("False", "Shipped".equals(allOrdersPage.checkThatshippedTextIsDisplayedInTheStatusCombobox()));
    }

    @Step
    public void clickOnHoldCircle() {
        dashboardPage.clickOnHoldCircle();
    }

    @Step
    public void checkThatonHoldTextIsDisplayedInTheStatusCombobox() {
        Assert.assertTrue("False", "On Hold".equals(allOrdersPage.checkThatonHoldTextIsDisplayedInTheStatusCombobox()));
    }

    @Step
    public void clickCancelledCircle() {
        dashboardPage.clickCancelledCircle();
    }

    @Step
    public void checkThatcancelledTextIsDisplayedInTheStatusCombobox() {
        Assert.assertTrue("False", "Cancelled".equals(allOrdersPage.cancelledTextIsDisplayedInTheStatusCombobox()));
    }

    @Step
    public void checkThatTrackYouOrderWidgetContainsAllNecessaryElements() {
        Assert.assertTrue("Track Your Order Here Text is absent", "Order Search".equals(dashboardPage.checkThatorderStatusWidgetContainsOrdersearchText()));
        Assert.assertTrue("Enter Order Or PO Number Textbox is absent", dashboardPage.checkThatorderStatusWidgetContainsEnterOrderOrPONumberTextbox());
        Assert.assertTrue("\"Track\" button is absent", dashboardPage.checkThatorderStatusWidgetContainsTrackButton());
    }

    @Step
    public void enterOrderNumberToTheEnterOrderOrPONumberTextbox() {
        dashboardPage.enterOrderNumberToTheEnterOrderOrPONumberTextbox();
    }

    @Step
    public void clickSearchButton() {
        dashboardPage.clickSearchButton();
    }

    @Step
    public void checkThatenteredOrderIsDisplayedInTheTable() {
        Assert.assertTrue("False", allOrdersPage.checkThatenteredOrderIsDisplayedInTheTable().equals(Serenity.getCurrentSession().get("Order Number")));
    }

    @Step
    public void enterPOOrderNumberToTheEnterOrderOrPONumberTextbox() {
        dashboardPage.enterPOOrderNumberToTheEnterOrderOrPONumberTextbox();
    }

    @Step
    public void checkThatenteredPoOrderIsDisplayedInTheTable() {
        Assert.assertTrue("False", allOrdersPage.checkThatenteredPoOrderIsDisplayedInTheTable().equals(Serenity.getCurrentSession().get("POOrder Number")));
    }

    @Step
    public void checkThatRecentOrdersWidgetContainsAllNecessaryElements() {
        Assert.assertTrue("View all button is absent", dashboardPage.checkThatRecentOrdersWidgetContainsViewallbutton());
        Assert.assertTrue("PO No is absent", dashboardPage.checkThatRecentOrdersWidgetContainsPONo());
        Assert.assertTrue("GE Order No. is absent", dashboardPage.checkThatRecentOrdersWidgetContainsGEOrderNo());
        Assert.assertTrue("Status is absent", dashboardPage.checkThatRecentOrdersWidgetContainsStatus());
    }

    @Step
    public void clickViewAllButtonAtTheRecentOrdersWidget() {
        dashboardPage.clickViewAllButtonAtTheRecentOrdersWidget();
    }

    @Step
    public void clickOnAnyOrderNoAtTheRecentOrdersWidget() {
        dashboardPage.clickOnAnyOrderNoAtTheRecentOrdersWidget();
    }

    @Step
    public void checkThatorderDetailsPageIsOpened() {
        Assert.assertTrue("False", "Order Details".equals(allOrdersPage.checkThatorderDetailsPageIsOpened()));
    }

    @Step
    public void clickOnAnyPoOrderNoAtTheRecentOrdersWidget() {
        dashboardPage.clickOnAnyPoOrderNoAtTheRecentOrdersWidget();
    }

    @Step
    public void checkThatpoOrderDetailsPageIsOpened() {
        //TODO add description
        Assert.assertTrue("False", allOrdersPage.checkThatpoOrderDetailsPageIsOpened());
    }

    @Step
    public void clickOnAnyOrderAtTheRecentOrdersWidget() {
        dashboardPage.clickOnAnyOrderAtTheRecentOrdersWidget();
    }

    @Step
    public void checkThatStatusTheSameInTheWidgetAndInTheOrderDetailsPage() {
        Assert.assertTrue("False", Serenity.getCurrentSession().get("order2 status").equals(Serenity.getCurrentSession().get("order status detail")));
    }

    @Step
    public void checkThatRecentListsWidgetContainsAllNecessaryElements() {
        Assert.assertTrue("VIEW link is absent", dashboardPage.checkThatViewAllLinkisPresent());
        Assert.assertTrue("List Name is absent", dashboardPage.checkThatListNameisPresent());
        Assert.assertTrue("Created On is absent", dashboardPage.checkThatCreatedOnisPresent());
        Assert.assertTrue("No. Of Items is absent", dashboardPage.checkThatNoOfItemsIsPresent());
    }

    @Step
    public void clickOnListName() {
        dashboardPage.clickOnListName();
    }

    @Step
    public void checkThatlistOfProductsFromChosenListIsDisplayedAtTheSavedListsPage() {
        Assert.assertTrue("False", Serenity.getCurrentSession().get("List name1").equals(Serenity.getCurrentSession().get("saved list name")));
    }

    @Step
    public void goToTheSavedListsPage() {
        savedListsPage.goToTheSavedListsPage();
    }

    @Step
    public void createNewList() {
        savedListsPage.createNewList();
        Assert.assertTrue("False", savedListsPage.checkThatNewListisCreated());
    }

    @Step
    public void createdDateIsCorrect() {
        Assert.assertTrue("False", dashboardPage.checkThatcreatedDateIsCorrect());

    }

    @Step
    public void clickOnTheViewAllButtonAtTheRecentListsWidget() {
        dashboardPage.clickOnTheViewAllButtonAtTheRecentListsWidget();
    }

    @Step
    public void checkThatNumberOfItemsTheSameInTheListAndInTheWidget() {
        Assert.assertTrue("False", Serenity.getCurrentSession().get("NO_OF_ITEMS_QTY").equals(Serenity.getCurrentSession().get("NO_OF_ITEMS_QTY in saved lists")));
    }

    @Step
    public void clickSortByDateCreate() {
        savedListsPage.clickSortByDateCreate();
    }

    @Step
    public void clickSortByDateCreateDescending() {
        savedListsPage.clickSortByDateCreateDescending();
    }
    @Step
    public void checkThatFeaturedToolsWidgetContainsAllNecessaryElements() {
        dashboardPage.getcarouseltext();
        Assert.assertTrue("VIEW link is absent", dashboardPage.checkThatViewAllLinkisPresentinTheFeaturedTools());
        Assert.assertTrue("Carousel of tools is absent", dashboardPage.checkThatCarouseloftoolsisPresent());
        Assert.assertTrue("TEXT_IN_FEATURED_TOOLS1 is absent", ILocators.TEXT_IN_FEATURED_TOOLS1.equals(Serenity.getCurrentSession().get("text1")));               //(ILocators.TEXT_IN_FEATURED_TOOLS1).equals(Serenity.getCurrentSession().get("text1")));
        Assert.assertTrue("TEXT_IN_FEATURED_TOOLS2 is absent", (ILocators.TEXT_IN_FEATURED_TOOLS2).equals(Serenity.getCurrentSession().get("text2")));
        Assert.assertTrue("TEXT_IN_FEATURED_TOOLS3 is absent", (ILocators.TEXT_IN_FEATURED_TOOLS3).equals(Serenity.getCurrentSession().get("text3")));
        Assert.assertTrue("TEXT_IN_FEATURED_TOOLS4 is absent", (ILocators.TEXT_IN_FEATURED_TOOLS4).equals(Serenity.getCurrentSession().get("text4")));
    }
    @Step
    public void clickViewAllButtonAtTheFeaturedToolsWidget() {
        dashboardPage.clickViewAllButtonAtTheFeaturedToolsWidget();
    }

    @Step
    public void clickOnPUBLICATION_LIBRARYToolInTheWidget() {
        dashboardPage.clickOnPUBLICATION_LIBRARYToolInTheWidget();
    }
    @Step
    public void pageIsOpenedInTheSeparateTab(String arg0) {

        String parentHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);        }
            waitABit(2000);
        Assert.assertTrue("page Isn't Opened In The Separate Tab",arg0.equals(getDriver().getTitle()));
        waitABit(2000);getDriver().close();
        getDriver().switchTo().window(parentHandle);
    }
    @Step
    public void clickOnTheQUOTESButton() {
        dashboardPage.clickOnTheQUOTESButton();
    }
    @Step
    public void chooseASIARegionInTheCombobox() {
        accountManagementPage.chooseASIARegionInTheCombobox();
    }
    @Step
    public void enterAccountNumberToTheAccountTextbox(String accountNumber) {
        accountManagementPage.enterAccountNumberToTheAccountTextbox(accountNumber);
    }
    @Step
    public void clickSearchAccountButton() {
        accountManagementPage.clickSearchAccountButton();
    }
    @Step
    public void accountIsDisplayedInTheTable(String accountNumber) {
        Assert.assertTrue("account is absent", accountManagementPage.accountIsDisplayedInTheTable(accountNumber));
    }
    @Step
    public void clickRESETButton() {
        accountManagementPage.clickRESETButton();
    }
    @Step
    public void enterAccountNameToTheAccountTextbox(String accountName) {
        accountManagementPage.enterAccountNameToTheAccountTextbox(accountName);
    }
    @Step
    public void accountNameIsDisplayedInTheTable(String accountName) {
        Assert.assertTrue("account is absent",accountManagementPage.accountNameIsDisplayedInTheTable(accountName));
    }
    @Step
    public void chooseEMEARegionInTheRegionCombobox() {
        accountManagementPage.chooseEMEARegionInTheRegionCombobox();
    }
    @Step
    public void chooseLatinAmericaRegionInTheRegionCombobox() {
        accountManagementPage.chooseLatinAmericaRegionInTheRegionCombobox();
    }
    @Step
    public void chooseNorthAmericaRegionInTheRegionCombobox() {
        accountManagementPage.chooseNorthAmericaRegionInTheRegionCombobox();
    }
    @Step
    public void allAccountsFromASIARegionAreDisplayedInTheTable() {
        Assert.assertTrue("accounts are absent", accountManagementPage.allAccountsFromASIARegionAreDisplayedInTheTable());
    }
    @Step
    public void allAccountsFromEMEARegionAreDisplayedInTheTable() {
        Assert.assertTrue("accounts are absent", accountManagementPage.allAccountsFromEMEARegionAreDisplayedInTheTable());
    }
    @Step
    public void allAccountsFromLatinAmericaRegionAreDisplayedInTheTable() {
        Assert.assertTrue("accounts are absent", accountManagementPage.allAccountsFromLatinAmericaRegionAreDisplayedInTheTable());
    }
    @Step
    public void allAccountsFromNorthAmericaRegionAreDisplayedInTheTable() {
        Assert.assertTrue("accounts are absent", accountManagementPage.allAccountsFromNorthAmericaRegionAreDisplayedInTheTable());
    }
    @Step
    public void regionAndAccountFieldsAreBlank() {
//        Assert.assertTrue("Region combobox is not reset","Select a region".equals(Serenity.getCurrentSession().get("Region combobox")));
        Assert.assertTrue("account field isn't blank", "".equals(Serenity.getCurrentSession().get("Search accounts field")));
    }
    @Step
    public void _10accountsAreDisplayedAtOnePage() {
        Assert.assertTrue("10 accounts are not displayed at one page", accountManagementPage._10accountsAreDisplayedAtOnePage());
    }
    @Step
    public void clickOnTheNextButton() {
        accountManagementPage.clickOnTheNextButton();

    }
    @Step
    public void nextListOfAccountsIsDisplayed() {
        Assert.assertTrue("next List Of Accounts Isn't Displayed",Serenity.getCurrentSession().get("out1").equals(Serenity.getCurrentSession().get("out2")));
    }
    @Step
    public void clickOnTheLastButton() {
        accountManagementPage.clickOnTheLastButton();
    }
    @Step
    public void lastListOfAccountsIsDisplayed() {
        Assert.assertTrue("LAst List Of Accounts Isn't Displayed",Serenity.getCurrentSession().get("out3").equals(Serenity.getCurrentSession().get("out4")));
    }
    @Step
    public void clickOnThePreviousButton() {
        accountManagementPage.clickOnThePreviousButton();
    }
    @Step
    public void previousListOfAccountsIsDisplayed() {
        Assert.assertTrue("Previous List Of Accounts Isn't Displayed",Serenity.getCurrentSession().get("out5").equals(Serenity.getCurrentSession().get("out6")));
    }
    @Step
    public void clickOnTheFirstButton() {
        accountManagementPage.clickOnTheFirstButton();
    }
    @Step
    public void firstListOfAccountsIsDisplayed() {
        Assert.assertTrue("First List Of Accounts Isn't Displayed","10".equals(Serenity.getCurrentSession().get("out7")));

    }
    @Step
    public void clickFavoritesTab() {
        accountManagementPage.clickFavoritesTab();
    }
    @Step
    public void favoritesTabIsOpened() {
        Assert.assertTrue("Is not opened",accountManagementPage.favoritesTabIsOpened());
    }
    @Step
    public void clickOnTheStarButton() {
        accountManagementPage.clickOnTheStarButton();
    }
    @Step
    public void accountIsnTDisplayedInTheTable(String accountNumber) {
        Assert.assertTrue("account is displayed",accountManagementPage.accountIsntDisplayedInTheTable(accountNumber));
    }
    @Step
    public void clickOnTheStar1Button() { accountManagementPage.clickOnTheStar1Button();   }
    @Step
    public void deleteList() { savedListsPage.deleteList();

    }
    @Step
    public void listIsDeleted() {
        Assert.assertTrue("List isn't deleted",savedListsPage.listIsDeleted());
    }
    @Step
    public void clickCloseCookiesBar() {
        dashboardPage.clickCloseCookiesBar();
    }

    @Step
    public void clickApprovedAccountsTab() { accountManagementPage.clickApprovedAccountsTab();
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
    //test
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

    public void clickOnFirstPOOrderLine() {
        orderStatus.clickOnFirstPOOrderLineNumber();
    }

    public void clickOnTabAtAccountManagementPage(String arg0) {
        accountManagementPage.clickOnAppropriateTabWithAccounts(arg0);
    }

    public void enterValueToTheSearchInpetFieldAtInvoicePage(String arg0) {
        invoice.enterInvoiceNumber(arg0);
    }

    public void ckickSerachButtonInvoicesPage() {
        invoice.clickSearchButton();
    }

    public void checkThatAppropriateInvoiceDisplayedAtThePage(String arg0) {
        Assert.assertTrue(invoice.isAppropriateInvoiceShown(arg0));
    }

    public void enterSpaNumberToSpainputField(String arg0) {
        priceAndAvailability.enterSpaToSpaBox(arg0);
    }
}