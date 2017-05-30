package Geempower.pages;

import ch.lambdaj.function.convert.Converter;
import Geempower.Path;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.jquery.JQueryEnabledPage;
import org.jruby.util.SafePropertyAccessor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class PriceAndAvailability extends PageObject {

    public boolean isStandartSpaPreselected(String arg0) {
        waitABit(1000);
        List<WebElementFacade> list = findAll(By.xpath(Path.SPA_TEXTBOX));
        boolean bool = false;
        for (WebElementFacade facade : list) {
            if (facade.getValue().equalsIgnoreCase(arg0)) {
                bool = true;
                break;
            }
        }
        return bool;
    }


    public void clickOnMagnifyingGlass() {

        $(Path.MAGNIFYING_GLASS).click();
    }


    public void scrollDown(String xpath) {
        WebElement element = $(find(By.xpath(xpath)));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void chooseSpaInTheSPPopup(String arg0) {
        waitABit(1000);
        List<WebElementFacade> webelementFacadeList = findAll(By.xpath(Path.SPA_IN_THE_SP_LOOKUP.replace("$", arg0)));
        waitABit(1000);
        try {
            waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.DISABLED_APPLY_TO_ALL_BUTTON)));
        } catch (NoSuchElementException e) {
        }
        scrollDown(Path.SPA_IN_THE_SP_LOOKUP.replace("$", arg0));

//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",$(Path.SPA_IN_THE_SP_LOOKUP.replace("$", arg0)));

        for (WebElementFacade facade : webelementFacadeList) {
            facade.getText();
            if (facade.getText().equalsIgnoreCase(arg0)) {
                facade.click();
            }
            break;
        }


    }

    public void clickButtonAtSPLookap(String arg0) {

        List<WebElementFacade> webElementFacadelist = findAll(By.xpath(Path.LIST_BUTTONS_AT_SP_LOOKUP));
        for (WebElementFacade facade : webElementFacadelist) {
            facade.getText();
            if (facade.getText().equalsIgnoreCase(arg0)) {
                facade.click();
            }
        }

    }

    public void clickUpdatePrAndAvButton() {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.MODAL_BACKDROP_FADE)));
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.UPDATE_PRICE_AND_AVAILABILITY_BUTTON_AT_PA_PAGE)));
        $(Path.UPDATE_PRICE_AND_AVAILABILITY_BUTTON_AT_PA_PAGE).click();
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.PROGRESS_INDICATOR)));

    }

    public boolean isFinalNetPriceUpdated(String arg0) {
//        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.MODAL_BACKDROP_FADE)));
        if (arg0.equalsIgnoreCase($(Path.FINAL_NET_PRICE_PA_PAGE).getText().toString())) {
            return true;
        }
        return false;
    }

    public boolean isExtndPriceUpdated(String arg0) {
//        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.MODAL_BACKDROP_FADE)));
        if (arg0.equalsIgnoreCase($(Path.EXTND_PRICE_PA_PAGE).getText().toString())) {
            return true;
        }
        return false;
    }


    public boolean isAppropriateQtyDisplayed(String arg0) {
        if (arg0.equalsIgnoreCase($(Path.QTY_INPUT_PA_PAGE).getValue())) {
            return true;
        } else return false;
    }

    public void clickOnButtonAtTheHeaderAtPriceAndAnailability(String arg0) {
        List<WebElementFacade> webelementFacadelist = findAll(By.xpath(Path.LIST_OF_BUTTONS_AT_NAVBAR_HEADER_AT_PRICE_AND_AVAILABILITY));
        for (WebElementFacade facade : webelementFacadelist) {
            facade.getText();
            if (facade.getText().equalsIgnoreCase(arg0))
                facade.click();
        }
    }

    public void addprodToThePage(String arg0) {
        $(Path.INPUT_PRODUCT_NUMBER).sendKeys(arg0);
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath(Path.ADD_PRODUCT_BUTTON_TO_LIST)));
        $(Path.ADD_PRODUCT_BUTTON_TO_LIST).click();
    }

    public void searchAtSpapopup(String arg0) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path.SPA_POPUP_SEARCH_INPUT)));
        $(Path.SPA_POPUP_SEARCH_INPUT).sendKeys(arg0);
        $(Path.SPA_POPUP_MAGNIFYING_GLASS).click();
    }


    public boolean isInvalidSpaErrorDisplayedAtPanaAPage(String arg0) {
        try {
            if (arg0.equalsIgnoreCase($(Path.PRICING_AGREEMENT_IS_INVALID_ERROR).getText().toString())) {
                return true;
            }
            return false;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickOnProductInTheTable(String arg0) {
        List<WebElementFacade> list = findAll(By.xpath(Path.PRODUCT_IN_THE_TABLE_AT_PRICE_AND_AVAILABILITY.replace("$", arg0)));
        for (WebElementFacade facade : list) {
            facade.getText();
            if (facade.getText().equalsIgnoreCase(arg0)) ;
            facade.click();
        }
    }


    public boolean isCorrectTabOpenedAtPDP(String arg0) {
        if (arg0.equalsIgnoreCase($(Path.TABS_AT_THE_PRODUCT_DETAILS_POPUP).getText().trim())) {
            return true;
        } else return false;
    }

    public void clickTabInPDP(String arg0) {
        List<WebElementFacade> list = findAll(By.xpath(Path.TABS_AT_THE_PRODUCT_DETAILS_POPUP));
        for (WebElementFacade facade : list) {
            facade.getText();
            if (facade.getText().trim().equalsIgnoreCase(arg0)) {
                facade.click();
            }

        }
    }


    public boolean isPricingAgreementIsInvalidErrorIsDisplayedAtPDPopup(String arg0) {
        try {
            if (arg0.equalsIgnoreCase($(Path.PRICING_AGREEMENT_IS_INVALID_ERROR_PDP).getText().trim())) {
                return true;
            } else return false;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isFinalNetPriceIsGreaterErrorIsDisplayedAtPDPopup(String arg0) {
        try {
            if (arg0.equalsIgnoreCase($(Path.FINAL_NET_PRICE_IS_GREATER_THAN_STANDART_PRICE).getText().trim())) {
                return true;
            } else return false;
        } catch (Exception e) {
            return false;
        }
    }


    public void clickEMEAAccunt(String arg0) {
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath((Path.EMEA_ACCOUNT.replace("$", arg0)))));
        $(Path.EMEA_ACCOUNT.replace("$", arg0)).click();
    }

    public void chooceAppropriateRegion(String arg0) {
        $(Path.SELECT_REGION_COMBOBOX).click();
        List<WebElementFacade> facade = findAll(By.xpath(Path.LIST_OF_ORDERS));
        for (WebElementFacade webfacade : facade) {
            if (webfacade.getText().equalsIgnoreCase(arg0)) {
                webfacade.click();
                break;
            }
        }
    }
}
