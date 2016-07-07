package Geempower.pages;

import ch.lambdaj.function.convert.Converter;
import Geempower.Path;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.Thucydides;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;

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


    public void clickAccountNumber() {
        $(Path.NA_ACCOUNT_NUMBER).click();
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
        throw new NoSuchElementException("Necessary category is absent");
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

    public void search_for_account(String na_account) {
        $(Path.SEARCH_FIELD).sendKeys(na_account);
        $(Path.SEARCH_BUTTON).click();
    }

    public void click_cart_icon() {
//        withTimeoutOf(200,TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_1)));
//        withTimeoutOf(200,TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_2)));
        withTimeoutOf(100,TimeUnit.MILLISECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Path.OVERLAY_3)));
        $(Path.CART_ICON).click();

    }

    public boolean isCartPageOpened() {
        return $(Path.MY_CART_LOGO).isDisplayed();
    }

    public void add_product_to_cart(String product) {
        $(Path.ADD_ITEM_BUTTON).click();
        $(Path.PRODUCT_NUMBER_FIELD).sendKeys(product);
        $(Path.ADD_BUTTON).click();
    }

    public boolean is_poructAddedToTheCart() {
        return $(Path.PRODUCT_IN_THE_TABLE).isDisplayed();
    }
}
