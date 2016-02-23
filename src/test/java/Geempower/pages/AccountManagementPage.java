package Geempower.pages;

import ch.lambdaj.function.convert.Converter;
import Geempower.Path;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

//@DefaultUrl("http://qa.geempower.com/geempower/")
@DefaultUrl("http://awsdev-geempower.industrial.energy.ge.com/geempower/")

public class AccountManagementPage extends PageObject{

    /*@FindBy(xpath = Path.USER_ID_FIELD)
    WebElementFacade userIdField;

    @FindBy(xpath = Path.ACOUNT_MANAGEMENT_LOGO)
    WebElementFacade accountManLogo;*/



    public void loginUser() {

        getDriver().findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/input")).clear();
        getDriver().findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/input")).sendKeys(Path.LOGIN_1);
        getDriver().findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/input")).clear();
        getDriver().findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/input")).sendKeys(Path.PASSWORD_1);
        getDriver().findElement(By.xpath("/html/body/section/div/div/div[2]/form/button")).click();


        /*$(Path.USER_ID_FIELD).clear();
        $(Path.USER_ID_FIELD).sendKeys(Path.LOGIN_1);
        $(Path.PASSWORD_FIELD).clear();
        $(Path.PASSWORD_FIELD).sendKeys(Path.PASSWORD_1);
        $(Path.SIGN_IN_BUTTON).click();*/
    }




    public boolean isAccountManagementLogoVisible() {
        return $(Path.ACOUNT_MANAGEMENT_LOGO).isDisplayed();
    }

}
