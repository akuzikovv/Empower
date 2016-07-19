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
    String LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT = ".//div[@class='my-pending-accounts-wrapper']//tr[@class='odd'or@class='even']/*[2]/a";
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
    String P_AND_A_WIDGET_INPUT_PRODUCT_NUMBER_FIELD = ".//*[@id='rows0.productNo']";
    String P_AND_A_WIDGET_CHECK_PA_BUTTON = ".//*[@id='check-availability-btn']";
    String SELECT_SHIP_ADDRESS_POPUP = "//h4[.='Select Ship Address']";
    String SUBMIT_BUTTON_AT_SELECT_SHIP_ADDRESS_POPUP = ".//button[.='Submit']";
    String UPLOAD_EXCEL_FILE_LINK = ".//span[.='Upload Excel File']";
    String UPLOAD_EXCEL_FILE_INPUT = ".//input[@id='pr-av-file']";
    String UPLOADED_FILE_PATH = ".//span[contains(text(),'Test_EMEA.xlsx')]";

//===============================================================

//    My Cart

    String MY_CART_LOGO = ".//p[.='My Cart']";
    String PRODUCT_NUMBER_FIELD = ".//input[@name='rows[0].productNo']";
    String ADD_BUTTON = "//button[contains(@class,'add-checkout-product')]";
    String ADD_ITEM_BUTTON = ".//button[contains(text(),'Add Item')]";
    String PRODUCT_IN_THE_TABLE = ".//td/a[.='THQL1120'and contains(@class,'catalog-name-input')]";
    String ORDER_NOTE_FIELD_OE1 = ".//*[@id='orderNote']";
    String NEXT_BUTTON = ".//button[@class='btn primary-btn step1-next-btn']";
    String NEXT_BUTTON_SECOND_STEP = ".//button[@class='btn primary-btn vaidateCheckoutBtn']";
    String PO_NUMBER_INPUT = ".//*[@id='poNumber']";
    String JOB_NAME_INPUT = ".//*[@id='jobName']";
    String TOASTER_SUCCESS_ADD_PRODUCT = ".//div[@class='toast toast-success']";
    String SHIPMENT_ADDRESS_COMBOBOX = ".//*[@id='select2-shipmentAddress-container']";
    String FISRS_STOCK_ADDRESS = ".//ul[@class='select2-results__options select2-results__options--nested']/li[1]";
    String SHIPPING_NOTE_INPUT = ".//*[@id='shippingNote']";
    String SHIP_PAYMENT_METHOD_COMBOBOX = ".//*[@id='select2-paymentmethod-container']";
    String SHIP_METHOD_COMBOBOX = ".//*[@id='select2-selectedShipMethod-container']";
    String CARRIER_COMBOBOX = ".//*[@id='select2-carrier-select-container']/following-sibling::span";
    String TRANSPORTES_PELAES_ITEM_CARRIER_LA = ".//li[.='Transportes Pelaez']";
    String CARRIER_ACCOUNT_NUMBER_INPUT = ".//*[@id='carrier-account']";
    String SHIPPING_BILLING_INFO_WIZARD_ACTIVE = ".//ul/li[@class='shipping-billing-info active']";
    String ORDER_SUMMERY_WIZARD_ACTIVE = ".//ul/li[@class='order-summary active']";
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
    String PLACE_ORDER_BUTTON = "//button[.='Place Order']";
    String TERMS_AND_CONDITIONS_CHECKBOX =  "//div[@id='terms-condition-modal']//div[@class='checkbox']/div";
    String SUBMIT_ORDER_BUTTON = ".//button[contains(@class,'submit-order-btn')]";
    String ORDER_SUCCESSFUL_POPUP = ".//*[@id='order-confirmation-modal']//h4[.='Order Successful']";
    String ORDER_SUCCESSFUL_POPUP_ORDER_NUMBER = "//span[@class='orderNumber']";
    String ORDER_SUCCESSFUL_POPUP_CLOSE_BUTTON = ".//*[@id='order-confirmation-modal']//button[.='Close']";
    String MINIMUM_SHIPMENT_CHARGES_POPUP = ".//*[@id='minimum-shipment-charges-modal']/div//h4";
    String MINIMUM_SHIPMENT_CHARGES_LA_POPUP = "//*[@id='minimum-shipment-charges-mexico-modal']/div//h4";
    String CONTINUE_BUTTON_MIN_SHOPMENT_POPUP = "//*[@id='minimum-shipment-charges-modal']//button[contains(text(),'Continue')]";
    String OVERLAY_MINIMAL_SHIPMENT_CHARGES = ".//*[@id='minimum-shipment-charges-modal']";
    String PROGRESS_INDICATOR = "//img[contains(@src,'loader')]";
    String ADD_MORE_ITEMS = ".//*[@id='minimum-shipment-charges-mexico-modal']//button[.='Add More Items']";
    String QTY_INPUT_OE1 = ".//*[@id='priceTable']/tbody/tr[1]//input[@class='form-control catalog-qty-input-col onchange-warning']";
    String UPDATE_PRISE_AND_AVAILABILITY_BUTTON_OE1 = ".//*[@id='updatePricesBtn']";
    String DISABLED_PRICE_AND_AVAILABILITY_BUTTON_OE1 = ".//*[@id='updatePricesBtn' and@disabled=''] ";
    String CHECKBOX_FIRSR_PRODUCT_OE1 =  ".//*[@id='priceTable']/tbody/tr[1]//div[@class='checkbox']/div";





//    =======================================================================


//    Order Details

    String ORDER_DETAILS_PAGE = ".//h3[.='Order Details']";
    String ORDER_DETAILS_ORDER_NUMBER = ".//div[@class='panel-body']/ul[1]/li[1]";

//    =======================================================================
//    Price & Availability
    String PRICE_AND_AVAILABILITY_PAGE = ".//h3[.='Price and Availability']";
    String PRODUCT_IN_THE_TABLE_AT_PRICE_AND_AVAILABILITY = ".//td/a[.='THQL1120'and contains(@class,'catalog-name-input')]";
    String CHECKBOX_AT_PRODUCT_LINE_P_ANA_A = ".//*[@id='priceTable']/tbody//ins";
    String ADD_TO_CART_BUTTON = ".//button[contains(text(),'Add to Cart')]";


//    ===========================================================================

}
