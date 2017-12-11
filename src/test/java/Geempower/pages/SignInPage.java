package Geempower.pages;
import Geempower.ILocators;
import Geempower.Path;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa.geempower.com/geempower/")

public class SignInPage extends PageObject {
//    public void enterUserId() {
//        $(ILocators.USER_ID).sendKeys(ILocators.LOGIN_1);    }
//
//    public void enterUserPassword() {
//        $(ILocators.PASSWORD).sendKeys(ILocators.PASSWORD_1);    }
//
//    public void clickOnTheSignInButton() {
//        $(ILocators.SIGN_IN_BUTTON).click();
//        getDriver().get("http://qa.geempower.com/geempower/");
//    }


    public void enterLoginAndPassOfUser(int arg0) {
        try {
            if (arg0 ==1){
                $(ILocators.USER_ID).sendKeys(Path.LOGIN_1);
                $(ILocators.PASSWORD).sendKeys(Path.PASSWORD_1);
            }
        } catch (Exception e) {   System.out.println("User 1 can't login");        }
        try {
            if (arg0 ==2){
                $(ILocators.USER_ID).sendKeys(ILocators.LOGIN_1);
                $(ILocators.PASSWORD).sendKeys(ILocators.PASSWORD_1);
            }
        } catch (Exception e) {   System.out.println("User 1 can't login");        }
        $(ILocators.SIGN_IN_BUTTON).click();
//        getDriver().get("http://qa.geempower.com/geempower/");
    }
}


