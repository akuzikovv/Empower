package Geempower.pages;
import Geempower.ILocators;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

@DefaultUrl("http://qa.geempower.com/geempower/")
public class DashboardPage extends PageObject {

    public boolean checkThatdashboardPageContainTRAINIG_LAYER1()       {
        $(ILocators.TRAINIG_LAYER1).isPresent();                       return true;  }

    public boolean checkThatdashboardPageContainACCOUNT_INFO_COMBOBOX(){
        $(ILocators.ACCOUNT_INFO_COMBOBOX).isPresent();                return true;  }

    public boolean checkThatdashboardPageContainUSER_PROFILE_COMBOBOX(){
        $(ILocators.USER_PROFILE_COMBOBOX).isPresent();                return true;  }

    public boolean checkThatdashboardPageContainHOME_BUTTON()          {
        $(ILocators.HOME_BUTTON).isPresent();                          return true;  }

    public boolean checkThatdashboardPageContainMY_CART_BUTTON()       {
        $(ILocators.MY_CART_BUTTON).isPresent();                       return true;  }

    public boolean checkThatdashboardPageContainORDER_STATUS_BUTTON()  {
        $(ILocators.ORDER_STATUS_BUTTON).isPresent();                  return true;  }

    public boolean checkThatDashboardPageContainSAVED_LISTS_BUTTON()   {
        $(ILocators.SAVED_LISTS_BUTTON).isPresent();                   return true;  }

    public boolean checkThatdashboardPageContainORDER_STATUS_WIDGET()  {
        $(ILocators.ORDER_STATUS_WIDGET).isPresent();                  return true;  }

    public boolean checkThatdashboardPageContainORDER_SEARCH_WIDGET()  {
        $(ILocators.ORDER_SEARCH_WIDGET).isPresent();                  return true;  }

    public boolean checkThatdashboardPageContainRECENT_ORDERS_WIDGET() {
        $(ILocators.RECENT_ORDERS_WIDGET).isPresent();                 return true;  }

    public boolean checkThatdashboardPageContainRECENT_LISTS_WIDGET()  {
        $(ILocators.RECENT_LISTS_WIDGET).isPresent();                  return true;  }

    public boolean checkThatdashboardPageContainPRICE_AND_AVAILABILITY_WIDGET(){
        $(ILocators.PRICE_AND_AVAILABILITY_WIDGET).isPresent();        return true;  }

    public boolean checkThatdashboardPageContainFEATURED_TOOLS_WIDGET(){
        $(ILocators.FEATURED_TOOLS_WIDGET).isPresent();                return true;  }

    public boolean checkThatdashboardPageContainCOOKIES_BANNER()       {
        $(ILocators.COOKIES_BANNER).isPresent();                       return true;  }

    public void clickNextButtonOnEveryBalloon() {
        waitForRenderedElementsToBePresent(By.xpath(ILocators.TRAINIG_LAYER_TEXT1));
        Serenity.getCurrentSession().put("trainig text0", $(ILocators.TRAINIG_LAYER_TEXT1).getText());
        $(ILocators.NEXT_LINK).click();
        for (int i = 0; i < 7; ++i) {
            waitForRenderedElements(By.xpath(ILocators.TRAINIG_LAYER_TEXT));
            if (i == 0) Serenity.getCurrentSession().put("trainig text", $(ILocators.TRAINIG_LAYER_TEXT).getText());
            else Serenity.getCurrentSession().put("trainig text" + (i + 1), $(ILocators.TRAINIG_LAYER_TEXT).getText());
            if (i < 6) $(ILocators.NEXT_LINK).click();        }}

    public boolean checkThatforEachWidgetAppropriateBalloonIsDisplayed(){
        $(ILocators.HIGHLITH_WIDGET).isPresent();                      return true;  }

    public void clickPreviousButtonOnEveryBalloon() {
        for (int i = 7; i > 0; i--) {
            waitForRenderedElements(By.xpath(ILocators.TRAINIG_LAYER_TEXT));
            if (i == 7) Serenity.getCurrentSession().put("trainig text7", $(ILocators.TRAINIG_LAYER_TEXT).getText());
            else Serenity.getCurrentSession().put("trainig text7" + (i - 1), $(ILocators.TRAINIG_LAYER_TEXT).getText());
            if (i > 0) $(ILocators.PREVIOUS_LINK).click();
        }   waitForRenderedElements(By.xpath(ILocators.TRAINIG_LAYER_TEXT1));
        Serenity.getCurrentSession().put("trainig text0", $(ILocators.TRAINIG_LAYER_TEXT1).getText());    }

    public void clickSkipButton() {
        $(ILocators.SKIP_BUTTON).click();
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(ILocators.SKIP_BUTTON)));
        Serenity.getCurrentSession().put("list created date", $(ILocators.LIST_CREATED_ON).getText().substring(13, 15));
        Serenity.getCurrentSession().put("date", java.util.Calendar.getInstance().getTime().getDate());
        Serenity.getCurrentSession().put("ORDER STATUS TEXT", $(ILocators.ORDER_STATUS_WIGGET_TEXT).getText());
}

    public void getcarouseltext() {
        Serenity.getCurrentSession().put("text1", $(ILocators.FEATURED_TOOLS1).getText());
        Serenity.getCurrentSession().put("text2", $(ILocators.FEATURED_TOOLS2).getText());
        withTimeoutOf(7000, MILLISECONDS).waitFor(ExpectedConditions.textToBePresentInElement(By.xpath(ILocators.FEATURED_TOOLS3), ILocators.TEXT_IN_FEATURED_TOOLS3));
        Serenity.getCurrentSession().put("text3", $(ILocators.FEATURED_TOOLS3).getText());
        withTimeoutOf(10000, MILLISECONDS).waitFor(ExpectedConditions.textToBePresentInElement(By.xpath(ILocators.FEATURED_TOOLS4), ILocators.TEXT_IN_FEATURED_TOOLS4));
        Serenity.getCurrentSession().put("text4", $(ILocators.FEATURED_TOOLS4).getText());    }

    public boolean checkThattrainingLayerIsClosed() {
        return getDriver().findElements(By.xpath(ILocators.SKIP_BUTTON)).isEmpty();  }

    public void clickOnAccountNumberInTheHeader() {
        $(ILocators.ACCOUNT_INFO_COMBOBOX).click();
        waitForRenderedElements(By.xpath(ILocators.ACCOUNT_FIELD1));
        int i = 1;
        for (WebElementFacade element : findAll(By.xpath(ILocators.ACCOUNT_INFO_FIELDS))) {
            Serenity.getCurrentSession().put("account field" + i, element.getText());
            i++;  }}

    public boolean checkThatChangeAccountButtonisShown() {
        $(ILocators.CHANGE_ACCOUNT_BUTTON).isPresent();         return true;  }

    public void clickChangeAccountButtonInTheDropdownList() {
        $(ILocators.CHANGE_ACCOUNT_BUTTON).click();
        waitForRenderedElements(By.xpath(ILocators.ACCOUNT_MANAGEMENT_PAGE));
        Serenity.getCurrentSession().put("Account Management page text", $(ILocators.ACCOUNT_MANAGEMENT_PAGE).getText());    }

    public boolean checkThatorderStatusWidgetContainsTotalOrders() {
        waitForRenderedElements(By.xpath(ILocators.TOTAL_ORDERS_CIRCLE));
        if ($(ILocators.TOTAL_ORDERS_CIRCLE).isPresent())     return true;
        else return false;    }

    public boolean checkThatorderStatusWidgetContainsOpen() {
        waitForRenderedElements(By.xpath(ILocators.OPEN_ORDERS_CIRCLE));
        if ($(ILocators.OPEN_ORDERS_CIRCLE).isPresent())      return true;
        else return false;    }

    public boolean checkThatorderStatusWidgetContainsShipped() {
        waitForRenderedElements(By.xpath(ILocators.SHIPPED_ORDERS_CIRCLE));
        if ($(ILocators.SHIPPED_ORDERS_CIRCLE).isPresent())   return true;
        else return false;    }

    public boolean checkThatorderStatusWidgetContainsOnHold() {
        waitForRenderedElements(By.xpath(ILocators.ONHOLD_ORDERS_CIRCLE));
        if ($(ILocators.ONHOLD_ORDERS_CIRCLE).isPresent())    return true;
        else return false;    }

    public boolean checkThatorderStatusWidgetContainsCancelled() {
        waitForRenderedElements(By.xpath(ILocators.CANCELLED_ORDERS_CIRCLE));
        if ($(ILocators.CANCELLED_ORDERS_CIRCLE).isPresent()) return true;
        else return false;    }

    public void clickTotalPricesCircle() {
        $(ILocators.TOTAL_ORDERS_CIRCLE).click();
        Serenity.getCurrentSession().put("status combobox", $(ILocators.STATUS_COMBOBOX).getText());
        waitForRenderedElements(By.xpath(ILocators.ALL_ORDERS_TEXT));
        Serenity.getCurrentSession().put("All orders text", $(ILocators.ALL_ORDERS_TEXT).getText());    }

    public void clickOpenCircle() {
        waitForRenderedElements(By.xpath(ILocators.OPEN_ORDERS_CIRCLE));
        $(ILocators.OPEN_ORDERS_CIRCLE).click();    }

    public void clickShippedCircle() {
        waitForRenderedElements(By.xpath(ILocators.SHIPPED_ORDERS_CIRCLE));
        $(ILocators.SHIPPED_ORDERS_CIRCLE).click();    }

    public void clickOnHoldCircle() {
        waitForRenderedElements(By.xpath(ILocators.ONHOLD_ORDERS_CIRCLE));
        $(ILocators.ONHOLD_ORDERS_CIRCLE).click();    }

    public void clickCancelledCircle() {
        waitForRenderedElements(By.xpath(ILocators.CANCELLED_ORDERS_CIRCLE));
        $(ILocators.CANCELLED_ORDERS_CIRCLE).click();    }

    public String checkThatorderStatusWidgetContainsOrdersearchText() {
        return $(ILocators.ORDER_SEARCH_WIDGET_TEXT).getText();    }

    public boolean checkThatorderStatusWidgetContainsEnterOrderOrPONumberTextbox() {
        $(ILocators.ORDER_SEARCH_WIDGET_TEXTBOX).isPresent();     return true;    }

    public boolean checkThatorderStatusWidgetContainsTrackButton() {
        $(ILocators.ORDER_SEARCH_WIDGET_SEARCH_BUTTON).isPresent();     return true;    }

    public void enterOrderNumberToTheEnterOrderOrPONumberTextbox() {
        waitABit(5000);
        withTimeoutOf(20000, MILLISECONDS).waitFor(ExpectedConditions.elementToBeClickable(org.openqa.selenium.By.xpath(ILocators.ORDER_SEARCH_WIDGET_SEARCH_BUTTON)));
        String number = $(ILocators.RECENT_ORDERS_GE_ORDER_NO_NO).getText();
        Serenity.getCurrentSession().put("Order Number", number);
        $(ILocators.ORDER_SEARCH_WIDGET_TEXTBOX).sendKeys(number);    }

    public void clickSearchOrderButton() {
        $(ILocators.ORDER_SEARCH_WIDGET_SEARCH_BUTTON).click();
    }

    public void enterPOOrderNumberToTheEnterOrderOrPONumberTextbox() {
        waitABit(3000);
        withTimeoutOf(30000, MILLISECONDS).waitFor(ExpectedConditions.elementToBeClickable(By.xpath(ILocators.ORDER_SEARCH_WIDGET_SEARCH_BUTTON)));
        String number1 = $(ILocators.RECENT_ORDERS_PO_NO_NO).getText();
        Serenity.getCurrentSession().put("POOrder Number", number1);
        $(ILocators.ORDER_SEARCH_WIDGET_TEXTBOX).sendKeys(number1);    }

    public boolean checkThatRecentOrdersWidgetContainsViewallbutton() {
        $(ILocators.RECENT_ORDERS_VIEW_ALL_BUTTON).isPresent(); return true;    }

    public boolean checkThatRecentOrdersWidgetContainsPONo() {
        $(ILocators.RECENT_ORDERS_PO_NO).isPresent();           return true;    }

    public boolean checkThatRecentOrdersWidgetContainsGEOrderNo() {
        $(ILocators.RECENT_ORDERS_GE_ORDER_NO).isPresent();     return true;    }

    public boolean checkThatRecentOrdersWidgetContainsStatus() {
        $(ILocators.RECENT_ORDERS_STATUS).isPresent();          return true;    }

    public void clickViewAllButtonAtTheRecentOrdersWidget() {
        $(ILocators.RECENT_ORDERS_VIEW_ALL_BUTTON).click();
        Serenity.getCurrentSession().put("status combobox", $(ILocators.STATUS_COMBOBOX).getText());
        Serenity.getCurrentSession().put("All orders text", $(ILocators.ALL_ORDERS_TEXT).getText());    }

    public void clickOnAnyOrderNoAtTheRecentOrdersWidget() {
        waitFor(ExpectedConditions.elementToBeClickable(org.openqa.selenium.By.xpath(ILocators.RECENT_ORDERS_GE_ORDER_NO_NO)));
        $(ILocators.RECENT_ORDERS_GE_ORDER_NO_NO).click();    }

    public void clickOnAnyPoOrderNoAtTheRecentOrdersWidget() {
        waitFor(ExpectedConditions.elementToBeClickable(org.openqa.selenium.By.xpath(ILocators.RECENT_ORDERS_PO_NO_NO)));
        $(ILocators.RECENT_ORDERS_PO_NO_NO).click();    }

    public void clickOnAnyOrderAtTheRecentOrdersWidget() {
        waitFor(ExpectedConditions.elementToBeClickable(org.openqa.selenium.By.xpath(ILocators.RECENT_ORDERS_GE_ORDER_NO_NO2)));
        Serenity.getCurrentSession().put("order2 status", $(ILocators.ORDER2_STATUS).getText().substring(9).toUpperCase());
        $(ILocators.RECENT_ORDERS_GE_ORDER_NO_NO2).click();
        waitForRenderedElements(By.xpath(ILocators.ORDER_STATUS_DETAIL));
        Serenity.getCurrentSession().put("order status detail", $(ILocators.ORDER_STATUS_DETAIL).getText().toUpperCase());    }

    public boolean checkThatViewAllLinkisPresent() {
        $(ILocators.VIEW_ALL_SAVED_LIST_LINK).isPresent();  return true;   }

    public boolean checkThatListNameisPresent() {
        $(ILocators.LIST_NAME_FIELD).isPresent();           return true;   }

    public boolean checkThatCreatedOnisPresent() {
        $(ILocators.CREATED_ON_FIELD).isPresent();          return true;   }

    public boolean checkThatNoOfItemsIsPresent() {
        $(ILocators.NO_OF_ITEMS_FIELD).isPresent();         return true;   }

    public void clickOnListName() {
        withTimeoutOf(5000, MILLISECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.SAVED_LIST1)));
        Serenity.getCurrentSession().put("List name1", $(ILocators.SAVED_LIST1).getText());
        $(ILocators.SAVED_LIST1).click();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.SAVED_LIST_DETAILS_NAME)));
        Serenity.getCurrentSession().put("saved list name", $(ILocators.SAVED_LIST_DETAILS_NAME).getText());    }

    public boolean checkThatcreatedDateIsCorrect() {
        String str1 = new String();
        Serenity.getCurrentSession().put(str1, "list created date");
        try {
            Integer i2 = Integer.valueOf(str1);
            Assert.assertEquals(Serenity.getCurrentSession().get("date"), i2);
        } catch (NumberFormatException e) {
        }
        return true;
    }

    public void clickOnTheViewAllButtonAtTheRecentListsWidget() {
        withTimeoutOf(7000, MILLISECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.NO_OF_ITEMS_QTY)));
        waitABit(2000);
        Serenity.getCurrentSession().put("NO_OF_ITEMS_QTY", $(ILocators.NO_OF_ITEMS_QTY).getText().substring(15).toUpperCase());
        $(ILocators.VIEW_ALL_SAVED_LIST_LINK).click();    }

    public boolean checkThatViewAllLinkisPresentinTheFeaturedTools() {
        $(ILocators.FEATURED_TOOLS_VIEW_ALL).isPresent();     return true;    }

    public boolean checkThatCarouseloftoolsisPresent() {
        $(ILocators.FEATURED_TOOLS_CAROUSEL).isPresent();     return true;    }

    public void clickViewAllButtonAtTheFeaturedToolsWidget() {
        $(ILocators.FEATURED_TOOLS_VIEW_ALL).click();    }

    public void clickOnPUBLICATION_LIBRARYToolInTheWidget() {
        withTimeoutOf(15,SECONDS).waitFor(ExpectedConditions.textToBePresentInElement(By.xpath(ILocators.PUBLICATION_LIBRARY),"Publication Library"));
        $(ILocators.PUBLICATION_LIBRARY).click();
    }

    public void clickOnTheQUOTESButton() {
        $(ILocators.QUOTES_BUTTON).click();
    }

    public void clickCloseCookiesBar() {
        $(ILocators.Close).click();
        waitABit(2000);
    }
}



