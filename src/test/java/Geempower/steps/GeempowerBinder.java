package Geempower.steps;

import Geempower.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

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

    @When("^Click on \"([^\"]*)\" link in the header$")
    public void clickOnLinkInTheHeader(String arg0)  {
        steps.ClickSavedListsInTheHeader(arg0);
    }



    //////////////////////////////////ANTON'S CODE /////////////////////////////////////////////////

    @When("^Choose ASIA region in the region combobox$")
    public void chooseASIARegionInTheRegionCombobox() throws Throwable {
        steps.chooseASIARegionInTheCombobox();
    }

    @When("^Enter \"([^\"]*)\" account number to the Account textbox$")
    public void enterAccountNumberToTheAccountTextbox(String accountNumber) throws Throwable {
        steps.enterAccountNumberToTheAccountTextbox(accountNumber);
    }

    @When("^Click Search Account button$")
    public void clickSearchAccountButton() throws Throwable {
        steps.clickSearchAccountButton();
    }

    @Then("^\"([^\"]*)\" account is displayed in the table$")
    public void accountIsDisplayedInTheTable(String accountNumber) throws Throwable {
        steps.accountIsDisplayedInTheTable(accountNumber);
    }

    @And("^Click RESET button$")
    public void clickRESETButton() throws Throwable {
        steps.clickRESETButton();
    }

    @When("^Enter \"([^\"]*)\" account name to the Account textbox$")
    public void enterAccountNameToTheAccountTextbox(String accountName) throws Throwable {
        steps.enterAccountNameToTheAccountTextbox(accountName);
    }

    @Then("^\"([^\"]*)\" account name is displayed in the table$")
    public void accountNameIsDisplayedInTheTable(String accountName) throws Throwable {
        steps.accountNameIsDisplayedInTheTable(accountName);
    }

    @When("^Choose EMEA region in the region combobox$")
    public void chooseEMEARegionInTheRegionCombobox() throws Throwable {
        steps.chooseEMEARegionInTheRegionCombobox();
    }

    @When("^Choose Latin America region in the region combobox$")
    public void chooseLatinAmericaRegionInTheRegionCombobox() throws Throwable {
        steps.chooseLatinAmericaRegionInTheRegionCombobox();
    }

    @When("^Choose North America region in the region combobox$")
    public void chooseNorthAmericaRegionInTheRegionCombobox() throws Throwable {
        steps.chooseNorthAmericaRegionInTheRegionCombobox();
    }

    @Then("^All accounts from ASIA region are displayed in the table$")
    public void allAccountsFromASIARegionAreDisplayedInTheTable() throws Throwable {
        steps.allAccountsFromASIARegionAreDisplayedInTheTable();
    }

    @Then("^All accounts from EMEA region are displayed in the table$")
    public void allAccountsFromEMEARegionAreDisplayedInTheTable() throws Throwable {
        steps.allAccountsFromEMEARegionAreDisplayedInTheTable();
    }

    @Then("^All accounts from Latin America region are displayed in the table$")
    public void allAccountsFromLatinAmericaRegionAreDisplayedInTheTable() throws Throwable {
        steps.allAccountsFromLatinAmericaRegionAreDisplayedInTheTable();
    }

    @Then("^All accounts from North America region are displayed in the table$")
    public void allAccountsFromNorthAmericaRegionAreDisplayedInTheTable() throws Throwable {
        steps.allAccountsFromNorthAmericaRegionAreDisplayedInTheTable();
    }

    @Then("^Region and Account fields are blank$")
    public void regionAndAccountFieldsAreBlank() throws Throwable {
        steps.regionAndAccountFieldsAreBlank();
    }

    @Then("^10 accounts are displayed at one page$")
    public void _10accountsAreDisplayedAtOnePage() throws Throwable {
        steps._10accountsAreDisplayedAtOnePage();
    }

    @Then("^All Orders page is opened$")
    public void allOrdersPageIsOpened() throws Throwable {
        steps.checkThatallOrdersPageIsOpened();
    }

    @And("^Click HOME button$")
    public void clickHOMEButton() throws Throwable {
        steps.clickHOMEButton();
    }

    @Then("^Open text is displayed in the Status combobox$")
    public void openTextIsDisplayedInTheStatusCombobox() throws Throwable {
        steps.checkThatopenTextIsDisplayedInTheStatusCombobox();
    }

    @Then("^Shipped text is displayed in the Status combobox$")
    public void shippedTextIsDisplayedInTheStatusCombobox() throws Throwable {
        steps.checkThatshippedTextIsDisplayedInTheStatusCombobox();
    }

    @Then("^On hold text is displayed in the Status combobox$")
    public void onHoldTextIsDisplayedInTheStatusCombobox() throws Throwable {
        steps.checkThatonHoldTextIsDisplayedInTheStatusCombobox();
    }

    @Then("^Cancelled text is displayed in the Status combobox$")
    public void cancelledTextIsDisplayedInTheStatusCombobox() throws Throwable {
        steps.checkThatcancelledTextIsDisplayedInTheStatusCombobox();
    }

    @Then("^Entered order is displayed in the table$")
    public void enteredOrderIsDisplayedInTheTable() throws Throwable {
        steps.checkThatenteredOrderIsDisplayedInTheTable();
    }

    @Then("^Entered  Po order is displayed in the table$")
    public void enteredPoOrderIsDisplayedInTheTable() throws Throwable {
        steps.checkThatenteredPoOrderIsDisplayedInTheTable();
    }

    @Then("^Order Details page is opened$")
    public void orderDetailsPageIsOpened1() throws Throwable {
        steps.checkThatorderDetailsPageIsOpened();
    }

    @Then("^PO Order Details page is opened$")
    public void poOrderDetailsPageIsOpened() throws Throwable {
        steps.checkThatpoOrderDetailsPageIsOpened();
    }

    @Then("^Check that status the same in the widget and in the Order Details page$")
    public void checkThatStatusTheSameInTheWidgetAndInTheOrderDetailsPage() throws Throwable {
        steps.checkThatStatusTheSameInTheWidgetAndInTheOrderDetailsPage();
    }

    @Given("^open Dashboard page$")
    public void openDashboardPage() throws Throwable {
        steps.openSignInPage();
        steps.authorization();
//        steps.selectAccount();
    }

    @Then("^Dashboard page contains all necessary fields, widgets and buttons$")
    public void dashboardPageContainsAllNecessaryFieldsWidgetsAndButtons() throws Throwable {
        steps.checkThatdashboardPageContainsAllNecessaryFieldsWidgetsAndButtons();
    }

    @When("^Click Next button on every balloon$")
    public void clickNextButtonOnEveryBalloon() throws Throwable {
        steps.clickNextButtonOnEveryBalloon();
    }

    @Then("^For each widget appropriate balloon is displayed$")
    public void forEachWidgetAppropriateBalloonIsDisplayed() throws Throwable {
        steps.checkThatforEachWidgetAppropriateBalloonIsDisplayed();
    }

    @When("^Click Previous button on every balloon$")
    public void clickPreviousButtonOnEveryBalloon() throws Throwable {
        steps.clickPreviousButtonOnEveryBalloon();
    }

    @And("^Click Skip button$")
    public void clickSkipButton() throws Throwable {
        steps.clickSkipButton();
    }

    @Then("^Training layer is closed$")
    public void trainingLayerIsClosed() throws Throwable {
        steps.checkThattrainingLayerIsClosed();
    }

    @When("^Click on account number in the header$")
    public void clickOnAccountNumberInTheHeader() throws Throwable {
        steps.clickOnAccountNumberInTheHeader();
    }

    @Then("^Necessary fields are shown$")
    public void necessaryFieldsAreShown() throws Throwable {
        steps.checkThatnecessaryFieldsAreShown();
    }

    @When("^Click Change Account button in the dropdown list$")
    public void clickChangeAccountButtonInTheDropdownList() throws Throwable {
        steps.clickChangeAccountButtonInTheDropdownList();
    }

    @Then("^Account Management page is opened$")
    public void accountManagementPageIsOpened() throws Throwable {
        steps.checkThataccountManagementPageIsOpened();
    }

    @When("^Click on  account number in the list$")
    public void clickOnAccountNumberInTheList() throws Throwable {
        steps.clickOnAccountNumberInTheList();
    }

    @Then("^Dashboard page is opened1$")
    public void dashboardPageIsOpened1() throws Throwable {
        steps.dashboardPageIsOpened1();
    }

    @Then("^Order Status widget contains all necessary elements$")
    public void orderStatusWidgetContainsAllNecessaryElements() throws Throwable {
        steps.checkThatorderStatusWidgetContainsAllNecessaryElements();
    }

    @When("^Click Total Prices circle$")
    public void clickTotalPricesCircle() throws Throwable {
        steps.clickTotalPricesCircle();
    }

    @When("^Click Open circle$")
    public void clickOpenCircle() throws Throwable {
        steps.clickOpenCircle();
    }

    @When("^Click Shipped circle$")
    public void clickShippedCircle() throws Throwable {
        steps.clickShippedCircle();
    }

    @When("^Click OnHold circle$")
    public void clickOnHoldCircle() throws Throwable {
        steps.clickOnHoldCircle();
    }

    @When("^Click Cancelled circle$")
    public void clickCancelledCircle() throws Throwable {
        steps.clickCancelledCircle();
    }

    @Then("^Check that Track you Order widget contains all necessary elements$")
    public void checkThatTrackYouOrderWidgetContainsAllNecessaryElements() throws Throwable {
        steps.checkThatTrackYouOrderWidgetContainsAllNecessaryElements();
    }

    @When("^Enter order number to the  Enter Order or PO Number textbox$")
    public void enterOrderNumberToTheEnterOrderOrPONumberTextbox() throws Throwable {
        steps.enterOrderNumberToTheEnterOrderOrPONumberTextbox();
    }

    @When("^Click Search button$")
    public void clickSearchButton() throws Throwable {
        steps.clickSearchButton();
    }

    @When("^Enter PO order number to the  Enter Order or PO Number textbox$")
    public void enterPOOrderNumberToTheEnterOrderOrPONumberTextbox() throws Throwable {
        steps.enterPOOrderNumberToTheEnterOrderOrPONumberTextbox();
    }

    @Then("^Check that Recent Orders widget contains all necessary elements$")
    public void checkThatRecentOrdersWidgetContainsAllNecessaryElements() throws Throwable {
        steps.checkThatRecentOrdersWidgetContainsAllNecessaryElements();
    }

    @When("^Click View All button at the Recent Orders widget$")
    public void clickViewAllButtonAtTheRecentOrdersWidget() throws Throwable {
        steps.clickViewAllButtonAtTheRecentOrdersWidget();
    }

    @When("^Click on any Order No at the Recent Orders widget$")
    public void clickOnAnyOrderNoAtTheRecentOrdersWidget() throws Throwable {
        steps.clickOnAnyOrderNoAtTheRecentOrdersWidget();
    }

    @When("^Click on any  Po Order No at the Recent Orders widget$")
    public void clickOnAnyPoOrderNoAtTheRecentOrdersWidget() throws Throwable {
        steps.clickOnAnyPoOrderNoAtTheRecentOrdersWidget();
    }

    @When("^Click on Any Order at the Recent Orders widget$")
    public void clickOnAnyOrderAtTheRecentOrdersWidget() throws Throwable {
        steps.clickOnAnyOrderAtTheRecentOrdersWidget();
    }

    @Then("^Check that Recent Lists widget contains all necessary elements$")
    public void checkThatRecentListsWidgetContainsAllNecessaryElements() throws Throwable {
        steps.checkThatRecentListsWidgetContainsAllNecessaryElements();
    }

    @When("^Click on list name$")
    public void clickOnListName() throws Throwable {
        steps.clickOnListName();
    }

    @Then("^Created date is correct$")
    public void createdDateIsCorrect() throws Throwable {
        steps.createdDateIsCorrect();
    }

    @When("^Click on the View All button at the Recent Lists widget$")
    public void clickOnTheViewAllButtonAtTheRecentListsWidget() throws Throwable {
        steps.clickOnTheViewAllButtonAtTheRecentListsWidget();
    }

    @Then("^Check that Featured Tools widget contains all necessary elements$")
    public void checkThatFeaturedToolsWidgetContainsAllNecessaryElements() throws Throwable {
        steps.checkThatFeaturedToolsWidgetContainsAllNecessaryElements();
    }

    @Then("^Then Page \"([^\"]*)\" is opened in the separate tab$")
    public void thenPageIsOpenedInTheSeparateTab(String arg0) throws Throwable {
        steps.pageIsOpenedInTheSeparateTab(arg0);
    }

    @When("^Click View All button at the Featured Tools widget$")
    public void clickViewAllButtonAtTheFeaturedToolsWidget() throws Throwable {
        steps.clickViewAllButtonAtTheFeaturedToolsWidget();
    }

    @When("^Click on Publication Library tool in the widget$")
    public void clickOnPUBLICATION_LIBRARYToolInTheWidget() throws Throwable {
        steps.clickOnPUBLICATION_LIBRARYToolInTheWidget();
    }

    @Then("^\"([^\"]*)\" page is opened in the separate tab$")
    public void pageIsOpenedInTheSeparateTab(String arg0) throws Throwable {
        steps.pageIsOpenedInTheSeparateTab(arg0);
    }

    @When("^Click on the QUOTES button$")
    public void clickOnTheQUOTESButton() throws Throwable {
        steps.clickOnTheQUOTESButton();
    }

    @Then("^List of products from chosen list is displayed at the Saved Lists page$")
    public void listOfProductsFromChosenListIsDisplayedAtTheSavedListsPage() throws Throwable {
        steps.checkThatlistOfProductsFromChosenListIsDisplayedAtTheSavedListsPage();
    }

    @And("^Go to the Saved Lists Page$")
    public void goToTheSavedListsPage() throws Throwable {
        steps.goToTheSavedListsPage();
    }

    @When("^Create new List$")
    public void createNewList() throws Throwable {
        steps.createNewList();
    }

    @Then("^Check that Number of items the same in the list and in the widget$")
    public void checkThatNumberOfItemsTheSameInTheListAndInTheWidget() throws Throwable {
        steps.checkThatNumberOfItemsTheSameInTheListAndInTheWidget();
    }

    @When("^Click sortByDateCreate$")
    public void clickSortByDateCreate() throws Throwable {
        steps.clickSortByDateCreate();
    }

    @When("^Click sortByDateCreateDescending$")
    public void clickSortByDateCreateDescending() throws Throwable {
        steps.clickSortByDateCreateDescending();
    }

    @When("^Click on the Next button$")
    public void clickOnTheNextButton() throws Throwable {
      steps.clickOnTheNextButton();
    }

    @Then("^Next list of accounts is displayed$")
    public void nextListOfAccountsIsDisplayed() throws Throwable {
        steps.nextListOfAccountsIsDisplayed();
    }

    @When("^Click on the Last button$")
    public void clickOnTheLastButton() throws Throwable {
        steps.clickOnTheLastButton();
    }

    @Then("^Last list of accounts is displayed$")
    public void lastListOfAccountsIsDisplayed() throws Throwable {
        steps.lastListOfAccountsIsDisplayed();
    }

    @When("^Click on the Previous button$")
    public void clickOnThePreviousButton() throws Throwable {
      steps.clickOnThePreviousButton();
    }

    @Then("^Previous list of accounts is displayed$")
    public void previousListOfAccountsIsDisplayed() throws Throwable {
        steps.previousListOfAccountsIsDisplayed();

    }

    @When("^Click on the First button$")
    public void clickOnTheFirstButton() throws Throwable {
        steps.clickOnTheFirstButton();
    }

    @Then("^First list of accounts is displayed$")
    public void firstListOfAccountsIsDisplayed() throws Throwable {
        steps.firstListOfAccountsIsDisplayed();
    }

    @When("^Click Favorites Tab$")
    public void clickFavoritesTab() throws Throwable {
        steps.clickFavoritesTab();
    }

    @Then("^Favorites tab is opened$")
    public void favoritesTabIsOpened() throws Throwable {
        steps.favoritesTabIsOpened();
    }

    @When("^Click on the star button$")
    public void clickOnTheStarButton() throws Throwable {
        steps.clickOnTheStarButton();
    }

    @Then("^\"([^\"]*)\" account isn't displayed in the table$")
    public void accountIsnTDisplayedInTheTable(String accountNumber) throws Throwable {
        steps.accountIsnTDisplayedInTheTable(accountNumber);
    }

    @When("^Click on the star(\\d+) button$")
    public void clickOnTheStarButton(int arg0) throws Throwable {
        steps.clickOnTheStar1Button();
    }

    @When("^Delete list$")
    public void deleteList() throws Throwable {
        steps.deleteList();
    }

    @Then("^List is deleted$")
    public void listIsDeleted() throws Throwable {
        steps.listIsDeleted();
    }

    @When("^Click close cookies bar$")
    public void clickCloseCookiesBar() throws Throwable {
        steps.clickCloseCookiesBar();
    }

    @When("^Click on the Approved Tab$")
    public void clickOnTheApprovedTab() throws Throwable {
        steps.clickApprovedAccountsTab();
    }

    @When("^open Dashboard page(\\d+)$")
    public void openDashboardPage(int arg0) throws Throwable {
        steps.selectAccount();
    }
}
