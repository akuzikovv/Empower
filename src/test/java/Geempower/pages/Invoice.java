package Geempower.pages;

import Geempower.Path;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;


public class Invoice extends PageObject{
    public boolean isAllInvoicesPageOpened() {
        return $(Path.ALL_INVOICES_TEXT).isDisplayed();
    }

    public void enterInvoiceNumber(String arg0) {
        $(Path.SEARCH_INPUT_INVOICEC).clear();
        $(Path.SEARCH_INPUT_INVOICEC).sendKeys(arg0);
    }

    public void clickSearchButton() {
        $(Path.SEARCH_BUTTON_INVOICES).click();
    }

    public boolean isAppropriateInvoiceShown(String arg0) {
        List<WebElementFacade> webElementFacadeList = findAll(By.xpath(Path.INVOISE_IN_THE_TABLE));
        boolean a = false;
        for (WebElementFacade facade : webElementFacadeList) {
                        if (facade.getText().equalsIgnoreCase(arg0)) {
                a =true;
            }else a = false;
        }return a;
    }
}


