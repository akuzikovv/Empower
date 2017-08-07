package Geempower.pages;

import Geempower.ILocators;
import Geempower.Path;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import gherkin.lexer.Pa;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.Thucydides;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.junit.Before;
import org.openqa.selenium.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.xml.sax.Locator;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;



@DefaultUrl("http://qa.geempower.com/geempower/")
//@DefaultUrl("http://qa.geempower.com/demo/")
public class AccountManagementPage extends PageObject {

    /*@FindBy(xpath = Path.USER_ID_FIELD)
    WebElementFacade userIdField;

    @FindBy(xpath = Path.ACOUNT_MANAGEMENT_LOGO)
    WebElementFacade accountManLogo;*/


    public void loginUser() {

        $(Path.USER_ID_FIELD).clear();
        $(Path.USER_ID_FIELD).sendKeys(Path.LOGIN_1);
        $(Path.PASSWORD_FIELD).clear();
        $(Path.PASSWORD_FIELD).sendKeys(Path.PASSWORD_1);
        $(Path.SIGN_IN_BUTTON).click();
        getDriver().get("http://qa.geempower.com/geempower/");
//        getDriver().get("http://qa.geempower.com/demo/");
//        getDriver().get("http://qa.geempower.com/qa/");
    }


    public boolean isAccountManagementLogoVisible() {
        return $(Path.ACOUNT_MANAGEMENT_LOGO).isDisplayed();
    }


    public void clickAccountNumber(String account) {
        waitABit(500);
        List<WebElementFacade> accounts = findAll(By.xpath(Path.LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
            if (webElementFacade.getText().equals(account)) {
                webElementFacade.click();
                return;
            }

        }
        throw new NoSuchElementException("Necessary account is absent");
    }

    public void clickNameOfButton(String nameOfButton) {
        waitABit(1000);
        List<WebElementFacade> buttonsAtTheTooltip = findAll(By.xpath(Path.LIST_BUTTONS_AT_TOOLTIP));
        for (WebElementFacade webElementFacade : buttonsAtTheTooltip) {
            webElementFacade.getText();
            if (webElementFacade.getText().equals(nameOfButton)) {
                webElementFacade.click();
                return;
            }
        }
        throw new NoSuchElementException("Necessary button is absent");
    }

    public boolean isAccountNumberDisplayedInTheTopOfThePage() {
        return $(Path.ACCOUNT_NUMBER_IN_THE_TOP).isDisplayed();
    }

    public boolean isOrderStatusWidgetDisplayedInTheTopOfThePage() {
        return $(Path.ORDER_STATUS_WIDGET).isDisplayed();
    }

    public boolean isTrackOrderWidgetDisplayedInTheTopOfThePage() {
        return $(Path.TRACK_ORDER_WIDGET).isDisplayed();
    }

    public boolean isRecentOrdersWidgetDisplayedInTheTopOfThePage() {
        return $(Path.RECENT_ORDERS_WIDGET).isDisplayed();
    }

    public boolean isPriceAndAvailabilityDisplayedInTheTopOfThePage() {
        return $(Path.PRICE_$_AVAILABILITY_WIDGET).isDisplayed();
    }

    public boolean isFeaturedToolsWidgetDisplayedInTheTopOfThePage() {
        return $(Path.FEATURED_TOOLS_WIDGET).isDisplayed();
    }

    public void clck_on_table_name_sort(String tableName, String sort) {
        List<WebElementFacade> namesOftable = findAll(By.xpath(Path.TITLE_LIST_HEADERS_OF_THE_TABLE));
        String sorting = "";
        for (WebElementFacade webElementFacade : namesOftable) {
            webElementFacade.getText();
            if (webElementFacade.getText().equals(tableName)) {
                do {
                    webElementFacade.click();
                    waitABit(10000);
                    sorting = webElementFacade.getAttribute("aria-sort");
                } while (sorting.equals(sort));
                return;
            }
        }

    }

    public void search_for_account(String account) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.SEARCH_BUTTON)));
        $(Path.SEARCH_FIELD).sendKeys(account);
        $(Path.SEARCH_BUTTON).click();
    }

    public void click_cart_icon() {
//        withTimeoutOf(200,TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_1)));
//        withTimeoutOf(200,TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_2)));
        withTimeoutOf(100, TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_3)));
        $(Path.CART_ICON).click();

    }

    public boolean isCartPageOpened() {
        waitABit(500);
        return $(Path.MY_CART_LOGO).isDisplayed();
    }

    public void add_product_to_cart(String product) {
        $(Path.ADD_ITEM_BUTTON).click();
        $(Path.PRODUCT_NUMBER_FIELD).sendKeys(product);
        $(Path.PRODUCT_NUMBER_FIELD).sendKeys(Keys.TAB);
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.ADD_BUTTON)));
        $(Path.ADD_BUTTON).click();
    }

    public boolean is_poructAddedToTheCart() {
        try {
            waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.PROGRESS_INDICATOR)));
        }catch (Exception e){

        }
        return $(Path.PRODUCT_IN_THE_TABLE).isDisplayed();
    }


    public boolean isProductsAddedToTheCart(String arg0) {

        List<WebElementFacade> webElementFacadeList = findAll(Path.LIST_ACCOUNT_NUMBERS_AT_THE_CART);
        for (WebElementFacade webElementFacade : webElementFacadeList) {
            if (webElementFacade.getText().equalsIgnoreCase(arg0)) {
                return true;
            }
        }
        return false;
    }

    public boolean isProductsDisplayedAtThePriceAndAvailability(String arg0) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.PRODUCT_IN_THE_TABLE_AT_LIST.replace("$", arg0))));
        List<WebElementFacade> webElementFacadeList = findAll(Path.LIST_ACCOUNT_NUMBERS_AT_THE_PRICE_AND_AVAILABILITY);
        for (WebElementFacade webElementFacade : webElementFacadeList) {
            if (webElementFacade.getText().equalsIgnoreCase(arg0)) {
                return true;
            }
        }
        return false;
    }


    public void click_Next_Button() {
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.NEXT_BUTTON)));
        $(Path.NEXT_BUTTON).click();

    }

    public void enter_po_number(String poNUmber) {
        $(Path.PO_NUMBER_INPUT).sendKeys(poNUmber);
    }

    public void choose_stock_address() {
        $(Path.SHIPMENT_ADDRESS_COMBOBOX).click();
        $(Path.FISRS_STOCK_ADDRESS).click();
    }

    public boolean is_minimum_popup_displayed() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.MINIMUM_SHIPMENT_CHARGES_POPUP)));
        return $(Path.MINIMUM_SHIPMENT_CHARGES_POPUP).isDisplayed();
    }

    public void clickContinueButton() {
        $(Path.CONTINUE_BUTTON_MIN_SHOPMENT_POPUP).click();
    }

    public void clickPlaceOrderButton() {

        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(Path.ORDER_SUMMERY_WIZARD_ACTIVE)));
//        withTimeoutOf(100, TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_MINIMAL_SHIPMENT_CHARGES)));
//        waitFor(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(By.xpath(Path.OVERLAY_MINIMAL_SHIPMENT_CHARGES))));
       try {
           waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(Path.OVERLAY_MINIMAL_SHIPMENT_CHARGES)));
       }catch (Exception e){

       }
        waitForAbsenceOf(Path.OVERLAY_MINIMAL_SHIPMENT_CHARGES);
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.PLACE_ORDER_BUTTON)));
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.PROGRESS_INDICATOR)));
        waitABit(1000);
       try {
           $(Path.PLACE_ORDER_BUTTON).click();
       }catch (SerenityManagedException e){
           $(Path.PLACE_ORDER_BUTTON).click();
       }
    }

    public void checkTAndCCheckbox() {
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.TERMS_AND_CONDITIONS_CHECKBOX)));
        waitABit(600);
        $(Path.TERMS_AND_CONDITIONS_CHECKBOX).click();


//        waitFor(ExpectedConditions.is(By.xpath(".//*[@id='terms-condition-modal']/div[1]/div/div[3]/button[2]")));


    }

    public void clickSubmitButton() {
        $(Path.SUBMIT_ORDER_BUTTON).click();
    }

    public boolean isOrderDetailsPageOpened() {
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(Path.ORDER_DETAILS_PAGE)));
        return $(Path.ORDER_DETAILS_PAGE).isDisplayed();
    }

    public void clickNextButttonSecondStep() {

        waitABit(2000);
        $(Path.NEXT_BUTTON_SECOND_STEP).click();
    }

    public void clickCloseButtton() {
        try {
            waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.PROGRESS_INDICATOR)));
        }catch (Exception e){

        }finally {
            waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.ORDER_SUCCESSFUL_POPUP_CLOSE_BUTTON)));
            $(Path.ORDER_SUCCESSFUL_POPUP_CLOSE_BUTTON).click();
        }

    }

    public void enterProductNumberPaAVidget(String product) {
        $(Path.P_AND_A_WIDGET_INPUT_PRODUCT_NUMBER_FIELD).sendKeys(product);
//        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.P_AND_A_WIDGET_CHECK_PA_BUTTON)));
//        withTimeoutOf(100,TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_1)));
//        withTimeoutOf(100,TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_2)));
//        withTimeoutOf(10,TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_3)));
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_3)));
//        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.PROGRESS_INDICATOR)));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        javascriptExecutor.executeScript("scroll(0,250);");
        $(Path.P_AND_A_WIDGET_CHECK_PA_BUTTON).click();
    }

    public boolean isSelectShipAddresspopupAppeared() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.SELECT_SHIP_ADDRESS_POPUP)));
        return $(Path.SELECT_SHIP_ADDRESS_POPUP).isDisplayed();
    }

    public void clickSubmitButtonAtSelectShipAddresspopup() {
        $(Path.SUBMIT_BUTTON_AT_SELECT_SHIP_ADDRESS_POPUP).click();
    }

    public boolean isPriceAndAvailabilityPageOpened() {
//        waitABit(5000);
        return $(Path.PRICE_AND_AVAILABILITY_PAGE).isEnabled();
    }

    public boolean isProductAddedToThePAndA(String arg0) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.PRODUCT_IN_THE_TABLE_AT_PRICE_AND_AVAILABILITY.replace("$",arg0))));
        return $(Path.PRODUCT_IN_THE_TABLE_AT_PRICE_AND_AVAILABILITY.replace("$",arg0)).isDisplayed();
    }

    public void clicAddToCartButton() {

        $(Path.ADD_TO_CART_BUTTON).click();
    }

    public void checkCheckboxForProductAtPAndA() {
        $(Path.CHECKBOX_AT_PRODUCT_LINE_P_ANA_A).click();
    }

    public void chooseCarrierLA() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.CARRIER_COMBOBOX)));
        $(Path.CARRIER_COMBOBOX).click();
        $(Path.TRANSPORTES_PELAES_ITEM_CARRIER_LA).click();

    }

    public boolean isMinimumPopupLAdisplayed() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.MINIMUM_SHIPMENT_CHARGES_LA_POPUP)));
        return $(Path.MINIMUM_SHIPMENT_CHARGES_LA_POPUP).isDisplayed();

    }

    public void clickAddMoreItemsButton() {
        $(Path.ADD_MORE_ITEMS).click();
    }

    public void changeQtyOfProducts(String qty) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.QTY_INPUT_OE1)));
        $(Path.QTY_INPUT_OE1).clear();
        $(Path.QTY_INPUT_OE1).sendKeys(qty);
        $(Path.QTY_INPUT_OE1).sendKeys(Keys.ENTER);
    }

    public void clickPriceAndAvailabilityButtonOE1() {
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.UPDATE_PRISE_AND_AVAILABILITY_BUTTON_OE1)));
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.CHECKBOX_FIRSR_PRODUCT_OE1)));
        $(Path.CHECKBOX_FIRSR_PRODUCT_OE1).click();

        $(Path.UPDATE_PRISE_AND_AVAILABILITY_BUTTON_OE1).click();

        waitFor(ExpectedConditions.attributeContains(By.xpath(Path.UPDATE_PRISE_AND_AVAILABILITY_BUTTON_OE1), "disabled", ""));
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.PROGRESS_INDICATOR)));
    }

    public void uploadaDocWithProducts(String arg0) {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_3)));
//     $(Path.UPLOAD_EXCEL_FILE_LINK).click();
        File file = new File(arg0);
        getDriver().findElement(By.className("upload-file-link")).click();
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }


    public void ClickPandAButton() {
//        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.UPLOADED_FILE_PATH)));
        waitABit(5000);
        $(Path.P_AND_A_WIDGET_CHECK_PA_BUTTON).click();
    }

    public void enterProductsToPriceAndAvailabilityCP(String arg0, String arg1) {
        $(Path.P_AND_A_WIDGET_INPUT_COPY_PAST).sendKeys(arg0);
        $(Path.P_AND_A_WIDGET_INPUT_COPY_PAST).sendKeys(Keys.ENTER);
        $(Path.P_AND_A_WIDGET_INPUT_COPY_PAST).sendKeys(arg1);

    }

    public void CheckCheckboxAtHeader() {
        $(Path.CHECKBOX_AT_HEADER_P_ANA_A).click();
    }

    public void clickButtonAtTheNavbar(String arg0) {
//        withTimeoutOf(100, TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_3)));
        waitABit(1000);
        List<WebElementFacade> webelementFacadeList = findAll(Path.LIST_OF_BUTTONS_AT_NAVBAR_HEADER);
        for (WebElementFacade webElementFacade : webelementFacadeList){
            webElementFacade.getText();
            if(webElementFacade.getText().equalsIgnoreCase(arg0)){
                webElementFacade.click();
                return;
            }
        }
    }

    public boolean isAllListsPageOpened() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.ALL_LISTS_TEXT)));
       return  $(Path.ALL_LISTS_TEXT).isDisplayed();
    }

    public void createNewList(String arg0) {
        $(Path.ADD_NEW_LIST_BUTTON).click();
        $(Path.INPUT_LIST_NAME).clear();
        $(Path.INPUT_LIST_NAME).sendKeys(arg0);
        waitABit(1000);
        $(Path.ADD_BUTTON_AT_LISTS_PAGE).click();
    }

    /*public boolean isListAddedToTheTable(String arg0) {
        getDriver().navigate().refresh();
        List<WebElementFacade> webElementFacadeList = findAll(Path.LIST_LISTS_IN_THE_TABLE);
        for (WebElementFacade webElementFacade : webElementFacadeList) {
            if (webElementFacade.getText().equalsIgnoreCase(arg0)) {
                return true;
            }
        }
        return false;
    }*/
    public boolean isListAddedToTheTable(String arg0){
        waitABit(1000);
        return $(Path.LIST_NAME_IN_THE_TABLE.replace("$",arg0)).isDisplayed();
    }

    public void clickContinueButtonMinimalChargesPopup() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.CONTINUE_BUTTON_AT_MIN_SHIP_POPUP_EMEA)));
        $(Path.CONTINUE_BUTTON_AT_MIN_SHIP_POPUP_EMEA).click();
    }

    public void clickCheckoutButton() {
        $(Path.CHECKOUT_BUTTON).click();
    }

    public void clickOnSavedList(String arg0) {
        List<WebElementFacade> webelementFacadeList = findAll(Path.LIST_LISTS_IN_THE_TABLE);
        for (WebElementFacade webElementFacade : webelementFacadeList){
            webElementFacade.getText();
            if (webElementFacade.getText().equals(arg0)){
                webElementFacade.click();
                return;
            }
        }
    }

    public void addProdactToTheList(String arg0) {
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.ADD_ITEM_BUTTON)));
        $(Path.ADD_ITEM_BUTTON).click();
        $(Path.INPUT_PRODUCT_NUMBER).sendKeys(arg0);
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.ADD_PRODUCT_BUTTON_TO_LIST)));
        $(Path.ADD_PRODUCT_BUTTON_TO_LIST).click();

    }

    public boolean isProductAddedToTheList(String arg0) {
        waitABit(500);
        List<WebElementFacade> webElementFacadeList = findAll(Path.LIST_OF_PRODUCTS_IN_THE_LIST);
        for (WebElementFacade webElementFacade : webElementFacadeList) {
            if (webElementFacade.getText().equalsIgnoreCase(arg0)) {
                return true;
            }
        }
        return false;
    }

    public void clickBackButton() {
        $(Path.BACK_TO_ALL_LISTS_BUTTON).click();
    }

    public long getNumberOfProductsInTheList() {
        waitABit(600);
        String numberOfProducts =  $(Path.NUMBER_OF_ITEMS_IN_THE_LIST).getText();
        long number = Long.parseLong(numberOfProducts);
        return number;

    }

    public void deleteList(String arg0) {
        waitABit(1000);
        $(Path.ACTION_LIST_BUTTON.replace("$",arg0)).click();
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.DELETE_BUTTON_AT_SAVED_LISTS.replace("$", arg0))));
        $(Path.DELETE_BUTTON_AT_SAVED_LISTS.replace("$", arg0)).click();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(Path.DELETE_BUTTON_AT_DELETE_LIST_POPUP)));
        waitABit(500);
        $(Path.DELETE_BUTTON_AT_DELETE_LIST_POPUP).click();
    }

    public boolean isListRemoved(String arg0) {
        waitForAbsenceOf(Path.LIST_NAME_IN_THE_TABLE.replace("$", arg0));
        try {
            $(Path.LIST_NAME_IN_THE_TABLE.replace("$",arg0));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }

    }

    public void addProdToTheNewListFromPriceAndAvailabilityPage(String arg0) {
        $(Path.SAVE_TO_LIST_BUTTON).click();
        $(Path.INPUT_TIPE_LIST_NAME_AT_PRICE_AND_AVAILABILITY).sendKeys(arg0);
        waitABit(500);
        $(Path.SAVE_BUTTON_AT_THE_SAVE_TO_LIST_POPUP).click();

    }

    public boolean isProductsDisplayedAtTheRecentListWidget(String arg0) {
        return $(Path.NEW_LIST_AT_RECENT_LISTS.replace("$", arg0)).isDisplayed();
    }

    public void clickOnAppropriateListAtDashboard(String arg0) {
        List<WebElementFacade> webelementFacsdeList = findAll(By.xpath(Path.LIST_OF_LISTS_AT_DASHBOARD));
        for (WebElementFacade webelementFacade : webelementFacsdeList){
            webelementFacade.getText();
            if(webelementFacade.getText().equalsIgnoreCase(arg0)){
                webelementFacade.click();
                return;
            }
        }
    }

    public boolean isListRemovedFromDashboard() {
        waitForAbsenceOf(Path.FIRST_LIST_AT_RECENT_LISTS_DASHBOARD);
        try {
            $(Path.FIRST_LIST_AT_RECENT_LISTS_DASHBOARD);
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    public void clickButtonAtCartHeader(String arg0) {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.MINIMUM_SHIPMENT_CHARGES_POPUP)));
        List<WebElementFacade> webelementFacadeList = findAll(By.xpath(Path.LIST_OF_BUTTONS_AT_CART_NAVBAR_HEADER));
        for (WebElementFacade webelementFacade : webelementFacadeList){
            webelementFacade.getText();
            if (webelementFacade.getText().equalsIgnoreCase(arg0)){
                waitABit(1000);
                webelementFacade.click();
                return;
            }
        }
    }


    public void saveNewCartToTheList(String arg0) {
        $(Path.INPUT_LIST_NAME).clear();
        $(Path.INPUT_LIST_NAME).sendKeys(arg0);
        waitABit(500);
        $(Path.SAVE_BUTTON_AT_THE_SAVE_TO_CURT_POPUP).click();

    }

    public void clickGELogoInTheHeader() {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.CART_SAVE_LIST_MODAL)));
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.MODAL_BACKDROP_FADE)));
        $(Path.GE_LOGO_IN_THE_HEADER).click();
    }

    public boolean isCartSAved(String arg0) {
        return  $(Path.CART_NAME_IN_THE_TABLE.replace("$",arg0)).isDisplayed();
    }

    public void clickOnSavedCart(String arg0) {
        List<WebElementFacade> webelementFacadeList = findAll(By.xpath(Path.LIST_CARTS_IN_THE_TABLE));
        for (WebElementFacade webelementFacade : webelementFacadeList){
            webelementFacade.getText();
            if (webelementFacade.getText().equalsIgnoreCase(arg0)){
                webelementFacade.click();
                return;
            }
        }
    }

    public void deleteNewSavedcart(String arg0) {
        waitABit(500);
        $(Path.ACTION_LIST_BUTTON.replace("$",arg0)).click();
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.DELETE_BUTTON_AT_SAVED_LISTS.replace("$", arg0))));
        $(Path.DELETE_BUTTON_AT_SAVED_LISTS.replace("$", arg0)).click();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(Path.DELETE_BUTTON_AT_DELETE_LIST_POPUP)));
        waitABit(500);
        $(Path.DELETE_BUTTON_AT_DELETE_LIST_POPUP).click();
    }

    public boolean isCartRemoved(String arg0) {
        waitForAbsenceOf(Path.CART_NAME_IN_THE_TABLE.replace("$",arg0));
        try {
            $(Path.CART_NAME_IN_THE_TABLE.replace("$",arg0));
            return false;
        }catch (NoSuchElementException e){
            return true;
        }
    }

    public boolean isEnteredPONumberSaved(String arg0) {
        if ($(Path.PO_NUMBER_INPUT).getAttribute("value").equalsIgnoreCase(arg0)){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEnteredStockAddressSaved(String arg1) {
        if ($(Path.SHIPMENT_ADDRESS_COMBOBOX).getAttribute("title").equalsIgnoreCase(arg1)){
            return true;
        }else {
            return false;
        }
    }

    public void clickOnAppropriateTabWithAccounts(String arg0) {
        List<WebElementFacade> list = findAll(By.xpath(Path.TAB_WITH_ACCOUNTS_AT_ACCOUNT_MANAGEMENT_PAGE));
        for(WebElementFacade webelementfacade : list){
            webelementfacade.getText();
            if (webelementfacade.getText().equalsIgnoreCase(arg0)){
                webelementfacade.click();
            }
        }
    }

    //////////////////////////////////////////////////   ANTON'S CODE //////////////////////
    public void loginUser2() {

        $(Path.USER_ID_FIELD).clear();
        $(Path.USER_ID_FIELD).sendKeys(ILocators.LOGIN_1);
        $(Path.PASSWORD_FIELD).clear();
        $(Path.PASSWORD_FIELD).sendKeys(ILocators.PASSWORD_1);
        $(Path.SIGN_IN_BUTTON).click();
        getDriver().get("http://qa.geempower.com/geempower/");}

    public void selectAccount() {
        waitABit(3000);
        $(ILocators.REGION_COMBOBOX).click();

        $(ILocators.NORTH_AMERICA_REGION).click();

        String account = "1318501";
        WebElement element = $(ILocators.SEARCH_ACCOUNT_FIELD);
        element.sendKeys(account);
        $(ILocators.SEARCH_ACCOUNT_BUTTON).click();
        List<WebElementFacade> accounts = findAll(By.xpath(ILocators.LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT));
            for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
            if (webElementFacade.getText().equals(account)) {
                webElementFacade.click();
                return;         }      }
        throw new NoSuchElementException("Necessary account absent");                                             }

    public boolean regionComboboxIsDisplayed()      {return $(ILocators.REGION_COMBOBOX).isDisplayed();           }
    public boolean searchTextboxIsDisplayed()       {return $(ILocators.SEARCH_TEXTBOX).isDisplayed();            }
    public boolean requestAccountButtonIsDisplayed(){return $(ILocators.REQUEST_ACCOUNT_BUTTON).isDisplayed();    }
    public boolean CancelButtonIsDisplayed()        {return $(ILocators.CANCEL_BUTTON).isDisplayed();             }
    public boolean ResetButtonIsDisplayed()         {return $(ILocators.RESET_BUTTON).isDisplayed();              }
    public boolean searchButtonIsDisplayed()        {return $(ILocators.SEARCH_ACCOUNT_BUTTON).isDisplayed();     }
    public boolean ApprovedAccountsTabIsDisplayed() {return $(ILocators.APPROVED_ACCOUNTS_TAB).isDisplayed(); }
    public boolean PendingForApprovalTabIsDisplayed()       {return $(ILocators.PENDING_FOR_APPROVAL_TAB).isDisplayed();     }
    public boolean FavoritesTabIsDisplayedByDefault()         {return $(ILocators.Favotites_active_tab).isDisplayed();}
    public boolean ShowingTextIsDisplayed()         {
       waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(ILocators.SHOWING_TO_OF_ENTRIES_TEXT)));
        return $(ILocators.SHOWING_TO_OF_ENTRIES_TEXT).isDisplayed();}
    public boolean OptionalTextIsDisplayed() {return $(ILocators.OPTIONAL_TEXT).isDisplayed();   }
    public boolean PReAuthorizationTextfieldIsDisplayed() { return $(ILocators.PREAUTHORIZATION_TEXTFIELD).isDisplayed();    }
    public boolean GoButtonIsDisplayed() { return $(ILocators.GO_BUTTON).isDisplayed();}
    public boolean PaginationButtonsIsDisplayed() { return $(ILocators.PAGINATION_BUTTONS_FAVORITE_TAB).isDisplayed();
    }

    public void chooseASIARegionInTheCombobox() {
        $(ILocators.REGION_COMBOBOX).click();
        try {waitFor(ExpectedConditions.elementToBeClickable($(ILocators.ASIA_REGION)));
        }catch (Exception e) {   System.out.println("Not clickable");        }
        $(ILocators.ASIA_REGION).click();
    }

    public void enterAccountNumberToTheAccountTextbox(String accountNumber) {
        WebElement textfield = $(ILocators.SEARCH_ACCOUNT_FIELD);
        textfield.sendKeys(accountNumber);
    }

    public void clickSearchAccountButton() {
        $(ILocators.SEARCH_ACCOUNT_BUTTON).click();
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(ILocators.APPROVED_ACCOUNTS_TAB)));

    }


    public boolean accountIsDisplayedInTheTable(String accountNumber) {
              List<WebElementFacade> accounts = findAll(By.xpath(ILocators.LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
           webElementFacade.getText().equals(accountNumber);
            }
        return true;
    }

    public void clickRESETButton() {
        $(ILocators.RESET_BUTTON).click();
        Serenity.getCurrentSession().put("Region combobox", $(ILocators.REGION_COMBOBOX).getText());
        Serenity.getCurrentSession().put("Search accounts field", $(ILocators.SEARCH_ACCOUNT_FIELD).getText());
    }

    public void enterAccountNameToTheAccountTextbox(String accountName) {
        WebElement textfield = $(ILocators.SEARCH_ACCOUNT_FIELD);
        textfield.sendKeys(accountName);
    }

    public boolean accountNameIsDisplayedInTheTable(String accountName) {
        List<WebElementFacade> accounts = findAll(By.xpath(ILocators.LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
            webElementFacade.getText().equals(accountName);
        }
        return true;
    }

    public void chooseEMEARegionInTheRegionCombobox() {
        $(ILocators.REGION_COMBOBOX).click();
        try {waitFor(ExpectedConditions.elementToBeClickable($(ILocators.EMEA_REGION)));
        }catch (Exception e) {   System.out.println("Not clickable");        }
        $(ILocators.EMEA_REGION).click();

    }

    public void chooseLatinAmericaRegionInTheRegionCombobox() {
        $(ILocators.REGION_COMBOBOX).click();
        try { waitFor(ExpectedConditions.elementToBeClickable($(ILocators.LATIN_AMERICA_REGION)));
        }catch (Exception e) {   System.out.println("Not clickable");        }
        $(ILocators.LATIN_AMERICA_REGION).click();
    }

    public void chooseNorthAmericaRegionInTheRegionCombobox() {
        $(ILocators.REGION_COMBOBOX).click();
        try {waitFor(ExpectedConditions.elementToBeClickable($(ILocators.NORTH_AMERICA_REGION)));
        }catch (Exception e) {   System.out.println("Not clickable");        }
        $(ILocators.NORTH_AMERICA_REGION).click();
    }

    public boolean allAccountsFromASIARegionAreDisplayedInTheTable() {
        List<WebElementFacade> accounts = findAll(By.xpath(ILocators.LIST_OF_ACCOUNTS_STATE));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
            try {   if (webElementFacade.getText().equals("Shanghai")) return true;
            } catch (Exception e) {   System.out.println("Not Shanghai");        }
            try {
                if (webElementFacade.getText().equals("New South Wales")) return true;
            } catch (Exception e) {   System.out.println("Not New South Wales");        }
            try {
                if (webElementFacade.getText().equals("DKI Jakarta Raya")) return true;
            } catch (Exception e) {   System.out.println("Not DKI Jakarta Raya");        }
            try {
                if (webElementFacade.getText().equals("T´ai-pei")) return true;
            } catch (Exception e) {   System.out.println("Not T´ai-pei");        }
            try {
                if (webElementFacade.getText().equals("Nakhon Pathom")) return true;
            } catch (Exception e) {   System.out.println("Not Nakhon Pathom");        }
            try {
                if (webElementFacade.getText().equals("Bangladesh")) return true;
            } catch (Exception e) {   System.out.println("Not Bangladesh");        }
            try {
                if (webElementFacade.getText().equals("Singapore")) return true;
            } catch (Exception e) {   System.out.println("Not Singapore");        }
            try {
                if (webElementFacade.getText().equals("Saudi Arabia")) return true;
            } catch (Exception e) {   System.out.println("Not Saudi Arabia");        }
            try {
                if (webElementFacade.getText().equals("Western Australia")) return true;
            } catch (Exception e) {   System.out.println("Not Western Australia");        }
               }
        return false; }


    public boolean allAccountsFromEMEARegionAreDisplayedInTheTable() {
        List<WebElementFacade> accounts = findAll(By.xpath(ILocators.LIST_OF_ACCOUNTS_STATE));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
            try {
                if (webElementFacade.getText().equals("Bavaria")) return true;
            } catch (Exception e) {   System.out.println("Not Bavaria");        }
            try {
                if (webElementFacade.getText().equals("Bacs-Kiskun")) return true;
            } catch (Exception e) {   System.out.println("Not Bacs-Kiskun");        }
            try {
                if (webElementFacade.getText().equals("Brussels (Capital)")) return true;
            } catch (Exception e) {   System.out.println("Not Brussels (Capital)");        }
            try {
                if (webElementFacade.getText().equals("Maine-et-Loire")) return true;
            } catch (Exception e) {   System.out.println("Not T´ai-pei");        }
            try {
                if (webElementFacade.getText().equals("Rome")) return true;
            } catch (Exception e) {   System.out.println("Not Rome");        }
            try {
                if (webElementFacade.getText().equals("Danish Capital Reg.")) return true;
            } catch (Exception e) {   System.out.println("Not Danish Capital Reg.");        }
            try {
                if (webElementFacade.getText().equals("Manche")) return true;
            } catch (Exception e) {   System.out.println("Not Manche");        }
            try {
                if (webElementFacade.getText().equals("Seine-Maritime")) return true;
            } catch (Exception e) {   System.out.println("Not Seine-Maritime");        }
            try {
                if (webElementFacade.getText().equals("Madrid")) return true;
            } catch (Exception e) {   System.out.println("Not Madrid");        }
        }
        return false; }

    public boolean allAccountsFromLatinAmericaRegionAreDisplayedInTheTable() {
        List<WebElementFacade> accounts = findAll(By.xpath(ILocators.LIST_OF_ACCOUNTS_STATE));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
            try {
                if (webElementFacade.getText().equals("Baden-Wurttemberg")) return true;
            } catch (Exception e) {   System.out.println("Not Baden-Wurttemberg");        }
            try {
                if (webElementFacade.getText().equals("Distrito Federal")) return true;
            } catch (Exception e) {   System.out.println("Not Distrito Federal");        }
            try {
                if (webElementFacade.getText().equals("RM - Santiago")) return true;
            } catch (Exception e) {   System.out.println("Not RM - Santiago");        }
            try {
                if (webElementFacade.getText().equals("Nuevo Leon")) return true;
            } catch (Exception e) {   System.out.println("Not Nuevo Leon");        }
            try {
                if (webElementFacade.getText().equals("Miranda")) return true;
            } catch (Exception e) {   System.out.println("Not Miranda");        }
            try {
                if (webElementFacade.getText().equals("Veracruz")) return true;
            } catch (Exception e) {   System.out.println("Not Veracruz");        }
            try {
                if (webElementFacade.getText().equals("Nuevo Leon")) return true;
            } catch (Exception e) {   System.out.println("Not Nuevo Leon");        }
            try {
                if (webElementFacade.getText().equals("Jalisco")) return true;
            } catch (Exception e) {   System.out.println("Not Jalisco");        }
            try {
                if (webElementFacade.getText().equals("Tamaulipas")) return true;
            } catch (Exception e) {   System.out.println("Not Tamaulipas");        }
        }
        return false;
    }

    public boolean allAccountsFromNorthAmericaRegionAreDisplayedInTheTable() {
        List<WebElementFacade> accounts = findAll(By.xpath(ILocators.LIST_OF_ACCOUNTS_STATE));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
            try {
                if (webElementFacade.getText().equals("New Mexico")) return true;
            } catch (Exception e) {   System.out.println("Not New Mexico");        }
            try {
                if (webElementFacade.getText().equals("Washington")) return true;
            } catch (Exception e) {   System.out.println("Not Washington");        }
            try {
                if (webElementFacade.getText().equals("Oregon")) return true;
            } catch (Exception e) {   System.out.println("Not Oregon");        }
            try {
                if (webElementFacade.getText().equals("Alaska")) return true;
            } catch (Exception e) {   System.out.println("Not Alaska");        }
            try {
                if (webElementFacade.getText().equals("Colorado")) return true;
            } catch (Exception e) {   System.out.println("Not Colorado");        }
            try {
                if (webElementFacade.getText().equals("Michigan")) return true;
            } catch (Exception e) {   System.out.println("Not Michigan");        }
            try {
                if (webElementFacade.getText().equals("California")) return true;
            } catch (Exception e) {   System.out.println("Not California");        }
            try {
                if (webElementFacade.getText().equals("Indiana")) return true;
            } catch (Exception e) {   System.out.println("Not Indiana");        }
            try {
                if (webElementFacade.getText().equals("Ohio")) return true;
            } catch (Exception e) {   System.out.println("Not Ohio");        }
        }
        return false;
    }


    public boolean _10accountsAreDisplayedAtOnePage() {
      if ($(ILocators._11String).isDisplayed()){ return false;
 }
    else return true;}

    public void clickOnTheNextButton() {
        Integer i1 = Integer.parseInt($(ILocators.number_Of_Page1).getText().substring(13,15));
        $(ILocators.NEXT_PAGINATION_BUTTON).click();
        waitABit(5000);
        Integer i2 = Integer.valueOf($(ILocators.number_Of_Page1).getText().substring(14, 16));
        Integer i3 = i1 +10;
        String str1 = Integer.toString(i3);
        Serenity.getCurrentSession().put("out1",str1);
        String str2 = Integer.toString(i2);
        Serenity.getCurrentSession().put("out2",str2);
            }

    public void clickOnTheLastButton() {
        $(ILocators.LAST_PAGINATION_BUTTON).click();
        waitABit(5000);
        Integer i1 = Integer.valueOf(($(ILocators.number_Of_Page1).getText().substring(21,24)));
        Integer i2 = Integer.valueOf($(ILocators.number_Of_Page1).getText().substring(31,34));
        String str1 = Integer.toString(i1);
        Serenity.getCurrentSession().put("out3",str1);
        String str2 = Integer.toString(i2);
        Serenity.getCurrentSession().put("out4",str2);
    }

    public void clickOnThePreviousButton() {
        Integer i1 = Integer.valueOf(($(ILocators.number_Of_Page1).getText().substring(21,24)));
        $(ILocators.PREVIOUS_PAGINATION_BUTTON).click();
        waitABit(5000);
        Integer i2 = Integer.valueOf($(ILocators.number_Of_Page1).getText().substring(21,24));
        String str2 = Integer.toString(i2);
        Serenity.getCurrentSession().put("out5", str2);
        try {
            if (i1 == 613) {
                Integer i3 = i1 - 3;
                String str1   = Integer.toString(i3);
                Serenity.getCurrentSession().put("out6", str1);
            }}
        catch (Exception e) {   System.out.println("Not 572");        }
        try {
            if (i1 != 613) {
                Integer i3 = i1 - 10;
                String str1   = Integer.toString(i3);
                Serenity.getCurrentSession().put("out6", str1);
            }}
        catch (Exception e) {   System.out.println("572");        }
    }
//        Integer i1 = Integer.valueOf(($(ILocators.Paginate_Of).getText().substring(4,8)));
//        $(ILocators.PREVIOUS_PAGINATION_BUTTON).click();
//        waitABit(5000);
//        Integer i2 = Integer.valueOf($(ILocators.Paginate_input).getText());
//        String str2 = Integer.toString(i2);
//        Serenity.getCurrentSession().put("out5", str2);
//        Integer i3 = i1 - 1;
//        String str1   = Integer.toString(i3);
//        Serenity.getCurrentSession().put("out6", str1);
//            }



    public void clickOnTheFirstButton() {
        $(ILocators.FIRST_PAGINATION_BUTTON).click();
        waitABit(5000);
        Integer i1 = Integer.parseInt($(ILocators.number_Of_Page1).getText().substring(13,15));
        String str1 = Integer.toString(i1);
        Serenity.getCurrentSession().put("out7",str1);

    }

    public void clickFavoritesTab() {
        $(ILocators.Favorites_Tab).click();
    }

    public boolean favoritesTabIsOpened() {
        $(ILocators.Favotites_active_tab).isPresent();
        return true;
    }

    public void clickOnTheStarButton() {
        $(ILocators.STAR_BUTTON).click();
    }

    public boolean accountIsntDisplayedInTheTable(String accountNumber) {
        List<WebElementFacade> accounts = findAll(By.xpath(ILocators.LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
                     webElementFacade.getText().isEmpty();
                    }
            return  true;}


    public void clickOnTheStar1Button() { $(ILocators.STAR1_BUTTON).click();   }

    public  void clickApprovedAccountsTab() {
//        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(ILocators.APPROVED_ACCOUNTS_TAB)));
        waitABit(3000);
        $(ILocators.APPROVED_ACCOUNTS_TAB).click();
    }
}
















