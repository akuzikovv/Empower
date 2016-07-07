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
    String NA_ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";
    String LA_ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";
    String EMEA_ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";
    String ASIA_ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";
    String SEARCH_FIELD = ".//input[@id='searchAccount']";
    String SEARCH_BUTTON = ".//button[.='Search'and@class='btn primary-btn account-search-btn']";
    String TITLE_LIST_HEADERS_OF_THE_TABLE = ".//tr[@class ='table-row-visible-lg-block']/th[(contains(@aria-label,'activate to sort column'))and(not (contains(@class,'hide'))) ]  ";
    String LIST_OF_ACCOUNTS = ".//tbody//td/a[contains(@href,'')][1]";
    String LIST_OF_ACCOUNT_NAMES = "//tbody//td[contains(@class,'account-name-col table-visible-lg-block')]";
    String LIST_OF_SITIES = "//tbody//td[contains(@class,'city-col table-visible-lg-block')]";
    String LIST_OF_STATES = "//tbody//td[contains(@class,'table-visible-lg-block')]";
    String LIST_OF_SALES_ORG = "//tbody//td[contains(@class,'sales-org-col table-visible-lg-block')]";
    String LIST_OF_SALES_CHANNELS = "//tbody//td[contains(@class,'sales-channel-col table-visible-lg-block')]";





    //=================================================================

//    Dashboard
    String LIST_BUTTONS_AT_TOOLTIP ="//a[contains(@class,'introjs-button')]" ;
    String ACCOUNT_NUMBER_IN_THE_TOP = ".//span[contains(text(),'1318501')]";
    String ORDER_STATUS_WIDGET = ".//div[contains(@class,'panel graphically-summary-panel')]";
    String TRACK_ORDER_WIDGET = ".//div[contains(@class,'panel track-order-panel')]";
    String RECENT_ORDERS_WIDGET = ".//div[contains(@class,'recent-order-panel')]";
    String PRICE_$_AVAILABILITY_WIDGET = ".//div[contains(@class,'catalog-search-panel')]";
    String FEATURED_TOOLS_WIDGET = ".//div[contains(@class,'product-updates-panel')]";
    String CART_ICON = ".//a[@class='cart-link']";
    String OVERLAY_1 = "//div[@class='introjs-tooltipReferenceLayer']";
    String OVERLAY_2 = "//div[@class='introjs-overlay']";
    String OVERLAY_3 = "//div[@class='introjs-helperLayer ']";


//===============================================================

//    My Cart

    String MY_CART_LOGO = ".//p[.='My Cart']";
    String PRODUCT_NUMBER_FIELD = ".//input[@name='rows[0].productNo']";
    String ADD_BUTTON = "//button[contains(@class,'add-checkout-product')]";
    String ADD_ITEM_BUTTON = ".//button[contains(text(),'Add Item')]";
    String PRODUCT_IN_THE_TABLE = ".//td/a[.='THQL1120'and contains(@class,'catalog-name-input')]";
    String ORDER_NOTE_FIELD_OE1 = ".//*[@id='orderNote']";
    String NEXT_BUTTON = ".//button[@class='btn primary-btn step1-next-btn']";
    String PO_NUMBER_INPUT = ".//*[@id='poNumber']";
    String JOB_NAME_INPUT = ".//*[@id='jobName']";
    String 




//    =======================================================================
}
