package Geempower.pages;

import ch.lambdaj.function.convert.Converter;
import Geempower.Path;

import gherkin.lexer.Pa;
//import javafx.collections.ListChangeListener;
import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.Thucydides;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static ch.lambdaj.Lambda.convert;
import static ch.lambdaj.Lambda.forEach;

@DefaultUrl("http://qa.geempower.com/geempower/")


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
    }


    public boolean isAccountManagementLogoVisible() {
        return $(Path.ACOUNT_MANAGEMENT_LOGO).isDisplayed();
    }


    public void clickAccountNumber(String account) {
        List<WebElementFacade> accounts = findAll(By.xpath(Path.LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT));
        for (WebElementFacade webElementFacade : accounts) {
            webElementFacade.getText();
            if (webElementFacade.getText().equals(account)) {
                webElementFacade.click();
                return;
            }

        }
        throw new NoSuchElementException("Necessary account absent");
    }

    public void clickNameOfButton(String nameOfButton) {
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
        return $(Path.MY_CART_LOGO).isDisplayed();
    }

    public void add_product_to_cart(String product) {
        $(Path.ADD_ITEM_BUTTON).click();
        $(Path.PRODUCT_NUMBER_FIELD).sendKeys(product);
        $(Path.PRODUCT_NUMBER_FIELD).sendKeys(Keys.TAB);
        $(Path.ADD_BUTTON).click();
    }

    public boolean is_poructAddedToTheCart() {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.PROGRESS_INDICATOR)));
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
//        waitABit(1000);
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

    public boolean isProductAddedToThePAndA() {
        return $(Path.PRODUCT_IN_THE_TABLE_AT_PRICE_AND_AVAILABILITY).isDisplayed();
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
        waitABit(500);
        List<WebElementFacade> webelementFacadeList = findAll(Path.LIST_OF_BUTTONS_AT_NAVBAR_HEADER);
        for (WebElementFacade webElementFacade : webelementFacadeList){
            webElementFacade.getText();
            if(webElementFacade.getText().equals(arg0)){
                webElementFacade.click();
            }
        }
    }

    public boolean isAllListsPageOpened() {
//        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.ALL_LISTS_TEXT)));
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
//        waitABit(2000);
        return $(Path.LIST_NAME_IN_THE_TABLE.replace("$",arg0)).isDisplayed();
    }

    public void clickContinueButtonMinimalChargesPopup() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.CONTINUE_BUTTON_AT_MIN_SHIP_POPUP_EMEA)));
        $(Path.CONTINUE_BUTTON_AT_MIN_SHIP_POPUP_EMEA).click();
    }
}
