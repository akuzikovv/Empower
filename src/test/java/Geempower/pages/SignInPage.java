package Geempower.pages;
import Geempower.ILocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa.geempower.com/geempower/")

public class SignInPage extends PageObject {
    public void enterUserId() {
        $(ILocators.USER_ID).sendKeys(ILocators.LOGIN_1);    }

    public void enterUserPassword() {
        $(ILocators.PASSWORD).sendKeys(ILocators.PASSWORD_1);    }

    public void clickOnTheSignInButton() {
        $(ILocators.SIGN_IN_BUTTON).click();
        getDriver().get("http://qa.geempower.com/geempower/");
    }


}


