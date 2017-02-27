package Geempower;

public interface Path {

    //    Login Page

    String USER_ID_FIELD = ".//*[@id='userId']";
    String PASSWORD_FIELD = ".//*[@id='password']";
    String SIGN_IN_BUTTON = "//button[contains(@class,'sign-in-btn')]";
    String LOGIN_1 = "502535068";
    String PASSWORD_1 = "ir0st1slavi";
//    String LOGIN_1 = "testuser2016";
//    String PASSWORD_1 = "test123test";

//    String LOGIN_1 = "tonygeorge";
//    String PASSWORD_1 = "test123test";

//=================================================================

    //    Account Managenment page
    String ACOUNT_MANAGEMENT_LOGO = ".//p[.='Account Management']";
    String NA_ACCOUNT_NUMBER = ".//td/a[contains(@href,'0001318501_USS1_10_10')]";
    String LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT = ".//div[@id='recently-viewed']//tr[@class='odd'or@class='even']/*[2]/a";
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
    String LIST_OF_ORDERS = ".//ul[@id='select2-region-results']/li";




    //=================================================================

//    Dashboard
    String LIST_BUTTONS_AT_TOOLTIP ="//a[contains(@class,'introjs-button')]" ;
    String ACCOUNT_NUMBER_IN_THE_TOP = ".//span[contains(text(),'1318501')]";
    String ORDER_STATUS_WIDGET = ".//div[contains(@class,'panel graphically-summary-panel')]";
    String TRACK_ORDER_WIDGET = ".//div[contains(@class,'panel track-order-panel')]";
    String RECENT_ORDERS_WIDGET = ".//div[contains(@class,'recent-order-panel')]";
    String PRICE_$_AVAILABILITY_WIDGET = ".//div[contains(@class,'catalog-search-panel')]";
    String FEATURED_TOOLS_WIDGET = ".//div[contains(@class,'product-updates-panel')]";
    String CART_ICON = ".//a[@class='cart-link dropdown-toggle']";
    String OVERLAY_1 = "//div[@class='introjs-tooltipReferenceLayer']";
    String OVERLAY_2 = "//div[@class='introjs-overlay']";
    String OVERLAY_3 = "//div[@class='introjs-helperLayer ']";
    String P_AND_A_WIDGET_INPUT_PRODUCT_NUMBER_FIELD = ".//*[@id='rows0.productNo']";
    String P_AND_A_WIDGET_CHECK_PA_BUTTON = ".//*[@id='check-availability-btn']";
    String SELECT_SHIP_ADDRESS_POPUP = "//h4[.='Select Ship Address']";
    String SUBMIT_BUTTON_AT_SELECT_SHIP_ADDRESS_POPUP = ".//button[.='Submit']";
    String UPLOAD_EXCEL_FILE_LINK = ".//span[.='Upload Excel File']";
    String UPLOAD_EXCEL_FILE_INPUT = ".//input[@id='pr-av-file']";
//    String UPLOAD_EXCEL_FILE_INPUT = "//label[@class='upload-file-link']/span[1]";
    String UPLOADED_FILE_PATH = ".//span[contains(text(),'Test_EMEA.xlsx')]";
    String P_AND_A_WIDGET_INPUT_COPY_PAST = ".//*[@id='checkprice_form_copy_and_paste']";
    String LIST_OF_BUTTONS_AT_NAVBAR_HEADER = ".//ul[@class='nav navbar-nav']//a";
    String CHECKOUT_BUTTON = ".//button[.='Checkout']";
    String LIST_OF_LISTS_AT_DASHBOARD = ".//*[@id='recentListsPanel']/li//a";
    String FIRST_LIST_AT_RECENT_LISTS_DASHBOARD = ".//*[@id='recentListsPanel']/li[1]//a[.='2TestAuto']";

//===============================================================

//    My Cart

    String MY_CART_LOGO = ".//p[.='My Cart']";
    String PRODUCT_NUMBER_FIELD = ".//input[@name='rows[0].productNo']";
    String ADD_BUTTON = "//button[contains(@class,'add-checkout-product')]";
    String ADD_ITEM_BUTTON = ".//button[contains(text(),'Add Item')]";
    String PRODUCT_IN_THE_TABLE = ".//td/a[.='THQL1120'and contains(@class,'catalog-name-input')]";
    String ORDER_NOTE_FIELD_OE1 = ".//*[@id='orderNote']";
    String NEXT_BUTTON = ".//button[contains(@class,'btn primary-btn step1-next-btn')] ";
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
    String OVERLAY_MINIMAL_SHIPMENT_CHARGES = ".//*[@class='modal fade minimum-shipment-charges-modal-js'and @aria-hidden=\"true\"]";
    String PROGRESS_INDICATOR = "//img[contains(@src,'loader')]";
    String ADD_MORE_ITEMS = ".//*[@id='minimum-shipment-charges-mexico-modal']//button[.='Add More Items']";
    String QTY_INPUT_OE1 = ".//*[@id='priceTable']/tbody/tr[1]//input[@class='form-control catalog-qty-input-col onchange-warning qty-desk']";
    String UPDATE_PRISE_AND_AVAILABILITY_BUTTON_OE1 = ".//*[@id='updatePricesBtn']";
    String DISABLED_PRICE_AND_AVAILABILITY_BUTTON_OE1 = ".//*[@id='updatePricesBtn' and@disabled=''] ";
    String CHECKBOX_FIRSR_PRODUCT_OE1 =  ".//*[@id='priceTable']/tbody/tr[1]//div[@class='checkbox']/div";
    String LIST_ACCOUNT_NUMBERS_AT_THE_CART = ".//*[contains(@class,'cart-table')]/tbody/tr/td[2]/a";
    String CONTINUE_BUTTON_AT_MIN_SHIP_POPUP_EMEA = ".//*[@id='minimum-shipment-charges-emea-modal']//button";
    String LIST_OF_BUTTONS_AT_CART_NAVBAR_HEADER = ".//ul[@class='navigation-action-panel']//button";
    String SAVE_BUTTON_AT_THE_SAVE_TO_CURT_POPUP = ".//*[@class='btn primary-btn save-list-btn']";
    String GE_LOGO_IN_THE_HEADER = "//img[@alt='Logo']";


//    =======================================================================


//    Order Details

    String ORDER_DETAILS_PAGE = ".//h3[.='Order Details']";
    String ORDER_DETAILS_ORDER_NUMBER = ".//div[@class='panel-body']/ul[1]/li[1]";

//    =======================================================================
//    Price & Availability
    String PRICE_AND_AVAILABILITY_PAGE = ".//h3[.='Price and Availability']";
    String PRODUCT_IN_THE_TABLE_AT_PRICE_AND_AVAILABILITY = ".//td/a[.='$'and contains(@class,'catalog-name-input')]";
    String CHECKBOX_AT_PRODUCT_LINE_P_ANA_A = ".//*[@id='priceTable']/tbody//ins";
    String CHECKBOX_AT_HEADER_P_ANA_A = ".//*[@id='priceTable']/thead//ins";
    String ADD_TO_CART_BUTTON = ".//button[contains(text(),'Add to Cart')]";
    String LIST_ACCOUNT_NUMBERS_AT_THE_PRICE_AND_AVAILABILITY = ".//*[@id='priceTable']/tbody/tr//a[contains(@class,'catalog-name-input modal-toggle')]";
    String SAVE_TO_LIST_BUTTON = ".//button[.='Save to List']";
    String INPUT_TIPE_LIST_NAME_AT_PRICE_AND_AVAILABILITY = "//input[@class='form-control new-list-input']";
    String SAVE_BUTTON_AT_THE_SAVE_TO_LIST_POPUP = ".//button[.='Save']";
    String SPA_TEXTBOX = "//tbody//input[contains(@class,'special-pricing-input')]";
    String SPA_IN_THE_SP_LOOKUP = ".//td[.='$']";
    String MAGNIFYING_GLASS = ".//a[@class='input-group-addon pricing-lookup-link']//i";
    String LIST_BUTTONS_AT_SP_LOOKUP = ".//form[@class='special-pricing-form']//button";
    String UPDATE_PRICE_AND_AVAILABILITY_BUTTON_AT_PA_PAGE = ".//*[@id='upd_pr_and_av_btn']";
    String FINAL_NET_PRICE_PA_PAGE = ".//*[contains(@id, 'price-item-tr')]/td[7]";
    String EXTND_PRICE_PA_PAGE  = ".//*[contains(@id, 'price-item-tr')]/td[8]";
    String QTY_INPUT_PA_PAGE = ".//tr[1][contains(@id, 'price-item-tr')]//input[contains(@class, 'catalog-qty-input')]";
    String LIST_OF_BUTTONS_AT_NAVBAR_HEADER_AT_PRICE_AND_AVAILABILITY = ".//ul[@class='navigation-action-panel']//button";
    String PRODUCT_IN_THE_TABLE_AT_LIST = ".//td/a[.='$'and contains(@class,'catalog-name-input')]";
    String DISABLED_APPLY_TO_ALL_BUTTON = "//button[@disabled='' and @class='btn primary-btn spl-pricing-apply-all']";
    String SPA_POPUP_SEARCH_INPUT = ".//*[@id='searchSpaInp']";
    String SPA_POPUP_MAGNIFYING_GLASS = ".//*[@id='searchSpaBtn']";
    String SPECIAL_PRICING_LOOKUP_MODUL = ".//*[@id='special-pricing-lookup-modal' and @class='modal fade in']";
    String TABS_AT_THE_PRODUCT_DETAILS_POPUP = ".//a[contains(text(),'Specifications') or contains(text(),' Product Details') or @href='#Availability-detail' ]";


//    ===========================================================================
//    Saved Lists

    String ADD_NEW_LIST_BUTTON = "//button[contains(text(),'Add New List')]";
    String INPUT_LIST_NAME = ".//*[@class='form-control new-list-input']";
    String ADD_BUTTON_AT_LISTS_PAGE = ".//button[.='Add']";
    String LIST_LISTS_IN_THE_TABLE = ".//table[@id='savedListTable']//tbody/tr/td[1]/a";
    String ADD_PRODUCT_BUTTON_TO_LIST = ".//*[@id='addProduct']";
    String BACK_TO_ALL_LISTS_BUTTON = "//a[@class='back-link']";
    String ACTION_LIST_BUTTON = "(//td/a[.='$']/../../td[last()-1]//a)[1]";
    String ALL_LISTS_TEXT = ".//*[.='All Items']";
    String DELETE_BUTTON_AT_SAVED_LISTS = "(//td/a[.='$']/../../td[last()-1]//a)[2]";
    String NEW_LIST_MODAL_POPUP = "//*[@class='modal fade in']";
    String LIST_NAME_IN_THE_TABLE = "//table[@id='savedListTable']//tr//a[.='$']";
    String INPUT_PRODUCT_NUMBER = ".//ul[@id='addProductList']//input[@name='rows[0].productNo']";
    String LIST_OF_PRODUCTS_IN_THE_LIST = ".//td/a[contains(@class,'catalog-name-input')]";
    String NUMBER_OF_ITEMS_IN_THE_LIST = "(//td/a[.='1TestAuto']/../../td[4])[1]";
    String DELETE_BUTTON_AT_DELETE_LIST_POPUP = "//div[contains(@style,'display')]//button[.='Delete']";
    String NEW_LIST_AT_RECENT_LISTS = ".//*[@id='recentListsPanel']/li[1]//a[.='$']";
    String CART_NAME_IN_THE_TABLE = "//table[@id='savedCartTable']//tr//a[.='$']";
    String LIST_CARTS_IN_THE_TABLE = ".//table[@id='savedCartTable']//tbody/tr/td[1]/a";
    String CART_SAVE_LIST_MODAL = ".//*[@id='cart-save-list-modal']";
    String MODAL_BACKDROP_FADE = "//div[@class='modal-backdrop fade in']";
    String PRICING_AGREEMENT_IS_INVALID_ERROR = ".//tr//p[.='Pricing agreement is invalid. Standard price is displayed.']";
    String PRICING_AGREEMENT_IS_INVALID_ERROR_PDP = ".//*[@id='product-details']//p[contains(text(),'Pricing agreement is invalid. Standard price is displayed.')]";
    String FINAL_NET_PRICE_IS_GREATER_THAN_STANDART_PRICE = ".//*[@id='product-details']//p[contains(text(),'Final Net Price is greater than Standard Price')]";
    String EMEA_ACCOUNT = ".//td/a[contains(@href,'my-account/select-account/000$')]";


//    =============================================================================

String ALL_ORDERS_TEXT = ".//h3[.='All Orders']";
    String ORDER_STATUS_SEARCH_INPUT_FIELD = ".//*[@id='order-filter-by-value']";
    String MAGNIFYING_GLASS_BUTTON = ".//*[@id='order-search-button']";
    String ORDER_IN_THE_TABLE=".//tbody/tr[1]/td[1]/a";
    String ALL_ORDERS_IN_THE_TABLE=".//tbody/tr/td[1]/a";
    String LIST_OF_PO_NUMBERS_IN_THE_TABLE = "//table[@class='table info-table all-order-list-table dataTable no-footer']//tbody/tr/td[2]/a";
    String LIST_OF_ALL_JOB_NAMES_IN_THE_TABLES = "//table[@class='table info-table all-order-list-table dataTable no-footer']//tbody/tr/td[3]";
    String CHECK_BOX_IN_THE_HEADER_AT_PO_PAGE = ".//input[@class='po-order' and @name='radio']/following-sibling::ins";
    String NEXT_BUTTON_PO_PAGE = "//button[.='Next']";
    String DISABLED_NEXT_BUTTON_PO_PAGE = "//button[.='Next' and @disabled='']";
    String STATUS_MARKERS_AT_THE_PO_ORDER_DETAILS_PAGE = ".//ul[@class='status-legend-list clearfix']";

    //    =============================================================================

    String ALL_INVOICES_TEXT = ".//h3[.='All Invoices']";
    String SELECT_REGION_COMBOBOX = ".//*[@id='select2-region-container']";


    //    =============================================================================


}
