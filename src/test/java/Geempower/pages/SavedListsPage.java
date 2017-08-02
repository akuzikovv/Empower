package Geempower.pages;
import Geempower.ILocators;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SavedListsPage extends PageObject {

    public void goToTheSavedListsPage() {
        $(ILocators.BACK_BUTTON_SAVED_LISTS).click();
    }

    public void createNewList() {
        if ($(ILocators.LISTS_FIELD).containsText("1New LIST")) {
            for (int i = 0; i < 1; ++i) {
                $(ILocators.ADD_NEW_LISTS_BUTTON).click();
                waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.NEW_LIST_NAME_FIELD)));
                $(ILocators.NEW_LIST_NAME_FIELD).sendKeys("1New LIST" + (i + 1));
                waitFor(ExpectedConditions.textToBePresentInElementValue(By.xpath(ILocators.NEW_LIST_NAME_FIELD), "New LIST" + (i + 1)));
                waitABit(1000);
                $(ILocators.ADD_BUTTON).click();
            }
        } else {
            $(ILocators.ADD_NEW_LISTS_BUTTON).click();
            waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.NEW_LIST_NAME_FIELD)));
            $(ILocators.NEW_LIST_NAME_FIELD).sendKeys("1New LIST");
            waitFor(ExpectedConditions.textToBePresentInElementValue(By.xpath(ILocators.NEW_LIST_NAME_FIELD), "New LIST"));
            waitABit(1000);
            $(ILocators.ADD_BUTTON).click();
        }
    }

    public boolean checkThatNewListisCreated() {

//        $(ILocators.SORT_BY_CREATED).click();
//        $(ILocators.SORT_BY_CREATED_ASCENDING).click();
        if ($(ILocators.listsTable).containsText("1New LIST")) return true;
        else $(ILocators.NextPaginationButton).click();
        if ($(ILocators.listsTable).containsText("1New LIST1")) return true;
        else return false;    }

    public void clickSortByDateCreate() {
        $(ILocators.SORT_BY_CREATED).click();
    }

    public void clickSortByDateCreateDescending() {
        $(ILocators.SORT_BY_CREATED_ASCENDING).click();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.No_Of_ITEMS)));
        Serenity.getCurrentSession().put("NO_OF_ITEMS_QTY in saved lists", $(ILocators.No_Of_ITEMS).getText());    }

    public void deleteList() {
        $(ILocators.dotsbutton).click();
        $(ILocators.delete_button).click();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.Delete)));
        waitABit(3000);
        $(ILocators.Delete).click();
        waitABit(3000);
    }

    public boolean listIsDeleted() {
        if ($(ILocators.LISTS_FIELD).containsText("1New LIST")) return false;
        else if ($(ILocators.LISTS_FIELD).containsText("1New LIST1")) return false;
        else return true;
    }
}


