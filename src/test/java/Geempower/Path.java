package Geempower;

public interface Path {

    //    Login Page

    String USER_ID_FIELD = ".//*[@id='userId']";
    String PASSWORD_FIELD = ".//*[@id='password']";
    String SIGN_IN_BUTTON = "//button[contains(@class,'sign-in-btn')]";
    String LOGIN_1 = "502535068";
    String PASSWORD_1 = "r0st1slavi";
//    String LOGIN_1 = "tonygeorge";
//    String PASSWORD_1 = "test123test";

//=================================================================

    //    Account Managenment page
    String ACOUNT_MANAGEMENT_LOGO = ".//p[.='Account Management']";
    String ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";

 //=================================================================

//    Dashboard
    String LIST_BUTTONS_AT_TOOLTIP ="//a[contains(@class,'introjs-button')]" ;
    String ACCOUNT_NUMBER_IN_THE_TOP = ".//span[contains(text(),'1318501')]";
    String ORDER_STATUS_WIDGET = ".//div[contains(@class,'panel graphically-summary-panel')]";
    String TRACK_ORDER_WIDGET = ".//div[contains(@class,'panel track-order-panel')]";
    String RECENT_ORDERS_WIDGET = ".//div[contains(@class,'recent-order-panel')]";
    String PRICE_$_AVAILABILITY_WIDGET = ".//div[contains(@class,'catalog-search-panel')]";
    String FEATURED_TOOLS_WIDGET = ".//div[contains(@class,'product-updates-panel')]";


//===============================================================

}
