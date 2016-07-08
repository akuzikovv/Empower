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
//    String LA_ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";
//    String EMEA_ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";
//    String ASIA_ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";
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
    String TOASTER_SUCCESS_ADD_PRODUCT = ".//div[@class='toast toast-success']";
    String SHIPMENT_ADDRESS_COMBOBOX = ".//*[@id='select2-shipmentAddress-container']";
    String FISRS_STOCK_ADDRESS = ".//ul[@class='select2-results__options select2-results__options--nested']/li[1]";
    String SHIPPING_NOTE_INPUT = ".//*[@id='shippingNote']";
    String SHIP_PAYMENT_METHOD_COMBOBOX = ".//*[@id='select2-paymentmethod-container']";
    String SHIP_METHOD_COMBOBOX = ".//*[@id='select2-selectedShipMethod-container']";
    String CARRIER_COMBOBOX = ".//*[@id='select2-carrier-select-container']";
    String CARRIER_ACCOUNT_NUMBER_INPUT = ".//*[@id='carrier-account']";
    String SHIPPING_BILLING_INFO_WIZARD_ACTIVE = ".//ul/li[@class='shipping-billing-info active']";
    String ORDER_SUMMERY_WIXARD_ECTIVE = ".//ul/li[@class='order-summary active']";
    String PO_NUMBER_SUMMERY = ".//p[@class='poNumberSummary']";
    String JON_NAME_SUMMERY = ".//p[@class='jobNameSummary']";
    String BILL_TO = ".//p[@class='billToSummary']";
    String SHIPPING_NOTE_SUMMERY = ".//p[@class='shippingNoteSummary']";
    String ORDER_NOTE_SUMMERY = "//p[@class='orderNoteSummary']";
    String SHIPMENT_ADDRESS_SUMMERY = "//p[@class='shipmentAddressSummary']";
    String SHIP_PAYMENT_METHOD_SUMMERY = "//p[@class='paymentmethodSummary']";
    String SHIP_OPTIONS_SUMMERY = "//p[@class='shipmentOptionSummary']";
    String SHIP_METHOD_SUMMERY = "//p[@class='shipMethodSummary']";
    String CARRIER_SUMMERY = "//p[@class='carrierSummary']";
    String CARRIER_ACCOUNT_NUMDER_SUMMERY = "//p[@class='carrierAccountSummary']";
    String REQ_DATE_SUMMERY = "//p[@class='reqDateSummary']";
    String PLACE_ORDER_BUTTON = ".//button[Contains(@class,'place-order-btn')]";
    String TERMS_AND_CONDITIONS_CHECKBOX = ".//input[@id='term_condtion']";
    String SUBMIT_ORDER_BUTTON = ".//button[contains(@class,'submit-order-btn')]";








//    =======================================================================
}
