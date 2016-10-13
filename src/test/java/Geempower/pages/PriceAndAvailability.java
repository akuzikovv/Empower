package Geempower.pages;

import ch.lambdaj.function.convert.Converter;
import Geempower.Path;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.jruby.util.SafePropertyAccessor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class PriceAndAvailability extends PageObject {

    public boolean isStandartSpaPreselected(String arg0) {
        List<WebElementFacade> list = findAll(By.xpath(Path.SPA_TEXTBOX));
        boolean bool = false;
        for (WebElementFacade facade : list){
            if (facade.getText().equalsIgnoreCase(arg0)){
                bool = true;
                break;
            }
        }
        return bool;
    }




    public void clickOnMagnifyingGlass() {
        $(Path.MAGNIFYING_GLASS).click();
    }

    public void chooseSpaInTheSPPopup(String arg0) {
        List<WebElementFacade> webelementFacadeList = findAll(By.xpath(Path.SPA_IN_THE_SP_LOOKUP));
        for (WebElementFacade facade : webelementFacadeList) {
            facade.getText();
            if (facade.getText().equalsIgnoreCase(arg0)) {
                facade.click();
            }
        }
    }

    public void clickButtonAtSPLookap(String arg0) {
        waitABit(1000);
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
        $(Path.ADD_PRODUCT_BUTTON_TO_LIST).click();
    }
}
