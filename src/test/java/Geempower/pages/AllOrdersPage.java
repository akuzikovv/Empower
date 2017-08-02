package Geempower.pages;
import Geempower.ILocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa.geempower.com/geempower/")
public class AllOrdersPage extends PageObject {

    public void clickHOMEButton() {
        $(ILocators.HOME_BUTTON).click();    }

    public String checkThatOpenStatusIsdisplayedInTheStatusCombobox() {
        return $(ILocators.STATUS_COMBOBOX).getText();    }

    public String checkThatshippedTextIsDisplayedInTheStatusCombobox() {
        return $(ILocators.STATUS_COMBOBOX).getText();    }

    public String checkThatonHoldTextIsDisplayedInTheStatusCombobox() {
        return $(ILocators.STATUS_COMBOBOX).getText();    }

    public String cancelledTextIsDisplayedInTheStatusCombobox() {
        return $(ILocators.STATUS_COMBOBOX).getText();    }

    public String checkThatenteredOrderIsDisplayedInTheTable() {
        return $(ILocators.ORDER_NO_IN_TABLE).getText();    }

    public String checkThatenteredPoOrderIsDisplayedInTheTable() {
        return $(ILocators.ORDER_PO_NO_IN_TABLE).getText();    }

    public String checkThatorderDetailsPageIsOpened() {
        return $(ILocators.ALL_ORDERS_TEXT).getText();    }

    public boolean checkThatpoOrderDetailsPageIsOpened() {
        try {
            if ($(ILocators.ALL_ORDERS_TEXT).isPresent()) return true;
        } catch (Exception e) {   System.out.println("Not 1 version page");        }
        try {
            if ($(ILocators.PO_ORDER_DETAILS_PO).isPresent()) return true;
        } catch (Exception e) {   System.out.println("Not 2 version page");        }
        return false;    }
}

