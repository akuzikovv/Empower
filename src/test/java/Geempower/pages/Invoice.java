package Geempower.pages;

import Geempower.Path;
import net.thucydides.core.pages.PageObject;


public class Invoice extends PageObject{
    public boolean isAllInvoicesPageOpened() {
        return $(Path.ALL_INVOICES_TEXT).isDisplayed();
    }
}
