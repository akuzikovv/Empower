package Geempower.pages;

import Geempower.Path;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by rostyslav on 2/20/17.
 */
public class OrderStatus extends PageObject {
    public boolean isOrderStatusPageOpened() {
              return   $(Path.ALL_ORDERS_TEXT).isDisplayed();
    }
    //test
    public void searchByAtOrderStatus(String arg0) {
        $(Path.ORDER_STATUS_SEARCH_INPUT_FIELD).clear();
        $(Path.ORDER_STATUS_SEARCH_INPUT_FIELD).sendKeys(arg0);
        $(Path.MAGNIFYING_GLASS_BUTTON).click();
    }

    public boolean isAppropriateOrderDisplayed(String arg0) {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.PROGRESS_INDICATOR)));
        return $(Path.ORDER_IN_THE_TABLE).isDisplayed();
    }

    public boolean isAppropriatePODisplayed(String arg0) {
        List<WebElementFacade> facade = findAll(By.xpath(Path.LIST_OF_PO_NUMBERS_IN_THE_TABLE));
        for (WebElementFacade webElFacade : facade){
            if (webElFacade.getText().equalsIgnoreCase(arg0)){
                return true;
            }
        }
        return false;

    }

    public boolean isAppropriateJobNameDisplayed(String arg0) {
        List<WebElementFacade> facade = findAll(By.xpath(Path.LIST_OF_ALL_JOB_NAMES_IN_THE_TABLES));
        for (WebElementFacade webfacade :facade){
            if(webfacade.getText().equalsIgnoreCase(arg0)){
                return true;
            }
        }
        return false;
    }

    public void clickOnOrder(String arg0) {
        List<WebElementFacade> facade = findAll(By.xpath(Path.ALL_ORDERS_IN_THE_TABLE));
        for (WebElementFacade webfacade :facade){
            if(webfacade.getText().equalsIgnoreCase(arg0)){
                webfacade.click();
                return;
            }
        }

    }

    public void clickOnPONumber(String arg0) {
        List<WebElementFacade> facade = findAll(By.xpath(Path.LIST_OF_PO_NUMBERS_IN_THE_TABLE));
        for (WebElementFacade webfacade :facade){
            if(webfacade.getText().equalsIgnoreCase(arg0)){
                webfacade.click();
                return;
            }
        }
    }

    public void checkCheckboxInHeader() {
//        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.CHECK_BOX_IN_THE_HEADER_AT_PO_PAGE)));
        $(Path.CHECK_BOX_IN_THE_HEADER_AT_PO_PAGE).click();
    }

    public void clickNextButtonPOPage() {
        waitForAbsenceOf(Path.DISABLED_NEXT_BUTTON_PO_PAGE);
        $(Path.NEXT_BUTTON_PO_PAGE).click();
    }


    public boolean isPOOrderDetailPageopened() {
        return $(Path.STATUS_MARKERS_AT_THE_PO_ORDER_DETAILS_PAGE).isDisplayed();
    }

    public void clickOrderLineDetails() {
        $(Path.FIRST_LINE).click();
    }

    public boolean checkThatOrderLineItemDetailsIsOpened() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.LINE_ITEM_DETAILS)));
        return $(Path.LINE_ITEM_DETAILS).isDisplayed();
    }

    public void clickOnFirstPOOrderLineNumber() {
        $(Path.FIRST_LINE_PO_PAGE).click();
    }
}
