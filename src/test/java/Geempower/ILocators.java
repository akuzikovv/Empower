package Geempower;


public interface ILocators {

    /////////////////////////SIGN IN /////////////////////////////////////
    String USER_ID = "//input[@id='userId']";
    String PASSWORD = "//input[@id='password']";
    String SIGN_IN_BUTTON = "//button[@type='submit']";
    String SSO1 = "502618792";
    String PASS1 = "Seaways4352924S";
    String CONECTION_ERROR_TEXT = "//xhtml:h1[@class='title-text']";
    String LOGIN_1 = "AntEmpRM";
    String PASSWORD_1 = "test123test";

    //////////////////////// ACCOUNT MANAGEMENT ///////////////////////////
    String ACCOUNT_MANAGEMENT_PAGE = "//p[@class='navigation-navbar-heading']";
    String SEARCH_ACCOUNT_FIELD = "//input[@id='searchAccount']";
    String SEARCH_ACCOUNT_BUTTON = "//button[@class='btn primary-btn account-search-btn']";
    String ACCOUNT_1318501 = "(//a[@href='/geempower/my-account/select-account/0001318501_USS1_10_10'])[1]";
    String ANY_ACCOUNT = "(//td[@class]//a[@href])[1]";
    String REGION_COMBOBOX ="//span[@id='select2-region-container']";
    String SEARCH_TEXTBOX = "//input[@id='searchAccount']";
    String REQUEST_ACCOUNT_BUTTON = "//button[@class='btn btn-white request-account-btn']";
    String CANCEL_BUTTON= "//button[@class='btn btn-white']";
    String RESET_BUTTON = "//a[@id='account-reset-btn']";
    String APPROVED_ACCOUNTS_TAB = "//li[@tab-id='0']";
    String PENDING_FOR_APPROVAL_TAB = "//a[@aria-controls='pending-approval']";
    String SHOWING_TO_OF_ENTRIES_TEXT = "//div[@id='favoritesTable_info']";
    String OPTIONAL_TEXT ="//label[@class='control-label']";
    String PREAUTHORIZATION_TEXTFIELD = "//input[@id='preauthorizedCode']";
    String GO_BUTTON = "//button[@class='btn primary-btn pre-authorized-btn-ma-js']";
    String PAGINATION_BUTTONS_APPROVED_TAB = "//div[@id='activeRequestsTable_paginate']";
    String PAGINATION_BUTTONS_FAVORITE_TAB = "//div[@id='favoritesTable_paginate']";
    String ASIA_REGION = "(//li[@class='select2-results__option'])[1]";
    String EMEA_REGION = "(//li[@class='select2-results__option'])[2]";
    String LATIN_AMERICA_REGION = "(//li[@class='select2-results__option'])[3]";
    String NORTH_AMERICA_REGION = "//li[@class='select2-results__option select2-results__option--highlighted']";
    String LIST_OF_ACCOUNTS_STATE = ".//*[@id='activeRequestsTable']/tbody/tr[@class='odd'or@class='even']/td[5]";
    String NEXT_PAGINATION_BUTTON = "//span[@id='activeRequestsTable_next']";
    String LAST_PAGINATION_BUTTON = "//span[@id='activeRequestsTable_last']";
    String PREVIOUS_PAGINATION_BUTTON = "//span[@id='activeRequestsTable_previous']";
    String FIRST_PAGINATION_BUTTON = "//span[@id='activeRequestsTable_first']";
    String _11String = ".//*[@id='activeRequestsTable']/tbody/tr[11]/td[2]";
    String LIST_OF_ACCOUNTS_ACCOUNT_MANAGEMENT = "//div[@id='activeRequestsTable_wrapper']//tr[@class='odd' or @class='even']/*[2]/a";
    String Paginate_input = "(//input[@class='paginate_input'])[1]";
    String Paginate_Of = "(//span[@class='paginate_of'])[1]";
    String number_Of_Page1 = "(//div[@aria-live='polite'])[1]";
    String number_Of_PageN = "(//div[@class='dataTables_info'])[1]";
    String paginate_section = "(//div[@class='dataTables_paginate paging_input'])[1]";
    String paginateNo = "//div[@id='activeRequestsTable_paginate']//input[@type]";
    String Favorites_Tab = "//a[@href='#favorites']";
    String Favotites_active_tab = "//li[@class='active dynamic-tab'][@tab-id='1']//a[@href='#favorites']";
    String STAR_BUTTON= "(//i[@class='fa fa-star-o'])[1]";
    String Star_button_fav_tab = "//div[@id='activeRequestsTable_wrapper']//i[@class='fa fa-star']";
    String STAR1_BUTTON= ".//*[@id='favoritesTable']/tbody/tr[1]/td[8]/ul/li[2]/a/i";



    ////////////////////////DASHBOARD /////////////////////////////////////
    String TRAINIG_LAYER1 = "//div[@class='introjs-tooltip']";
    String TRAINIG_LAYER_TEXT = "//p[@class='introjs-help-text']";
    String TRAINIG_LAYER_TEXT1 = "//ul[@class='introjs-text-list']";
    String HIGHLITH_WIDGET = "//div[@class='introjs-tooltipReferenceLayer']";
    String ACCOUNT_INFO_COMBOBOX = "//span[@class='account-info-text']";
    String USER_PROFILE_COMBOBOX = "(//a[@class='dropdown-toggle'])[2]";
    String HOME_BUTTON = "(//a[@href='/geempower/'])[2]";
    String MY_CART_BUTTON = "//a[@href='/geempower/checkout']";
    String ORDER_STATUS_BUTTON = "(//a[@href='/geempower/user/viewOrderHistory.action'])[1]";
    String SAVED_LISTS_BUTTON = "(//a[@href='/geempower/savedLists'])[1]";
    String ORDER_STATUS_WIDGET = "//div[@class='panel graphically-summary-panel trainingLayerOrderDashboardTooltip']";
    String ORDER_SEARCH_WIDGET = "//div[@class='panel track-order-panel trainingLayerSearchOrderTooltip']";
    String RECENT_ORDERS_WIDGET = "//div[@class='panel recent-order-panel trainingLayerOrderDetailsTooltip']";
    String RECENT_LISTS_WIDGET = "//div[@class='panel recent-lists-panel']";
    String PRICE_AND_AVAILABILITY_WIDGET = "//div[@class='panel catalog-search-panel']";
    String FEATURED_TOOLS_WIDGET = "//div[@class='panel product-updates-panel trainingLayerWhatsNewTooltip']";
    String COOKIES_BANNER = "//div[@id='_evh-ric']";
    String NEXT_LINK = "//a[@class='introjs-button introjs-nextbutton']";
    String PREVIOUS_LINK = "//a[@class='introjs-button introjs-prevbutton']";
    String SKIP_BUTTON = "//a[@class='introjs-button introjs-skipbutton']";
    String ACCOUNT_FIELD1 = "(//td)[1]";
    String ACCOUNT_FIELD2 = "(//td)[4]";
    String ACCOUNT_FIELD3 = "(//td)[7]";
    String ACCOUNT_FIELD4 = "(//td)[10]";
    String ACCOUNT_FIELD5 = "(//td)[13]";
    String ACCOUNT_FIELD6 = "(//td)[16]";
    String ACCOUNT_INFO_FIELDS = "//table[@class='table detail-info-table account-info-table']//tr/td[1]";
    String CHANGE_ACCOUNT_BUTTON = "(//a[@href='/geempower/my-account/manage-accounts'])[2]";
    String ORDER_STATUS_WIGGET_TEXT = "//p[@class='label-text summary-period-text']";
    String TOTAL_ORDERS_CIRCLE = "//div[@class='total-order-summary']";
    String OPEN_ORDERS_CIRCLE = "//a[@class='open-order-link']";
    String SHIPPED_ORDERS_CIRCLE = "//a[@class='shipped-order-link']";
    String ONHOLD_ORDERS_CIRCLE = "//a[@class='onhold-order-link']";
    String CANCELLED_ORDERS_CIRCLE = "//a[@class='cancelled-order-link']";
    String ORDER_SEARCH_WIDGET_TEXT = "(//label[@class='control-label'])[1]";
    String ORDER_SEARCH_WIDGET_TEXTBOX = "//input[@placeholder='Enter Order or PO or Product Number']";
    String ORDER_SEARCH_WIDGET_SEARCH_BUTTON = "//input[@value='Search']";
    String RECENT_ORDERS_VIEW_ALL_BUTTON = "(//a[@href='/geempower/user/viewOrderHistory.action'])[2]";
    String RECENT_ORDERS_PO_NO = "(//span[@class='label-text'])[3]";
    String RECENT_ORDERS_GE_ORDER_NO = "(//span[@class='label-text hidden-xs'])[1]";
    String RECENT_ORDERS_STATUS = "(//span[@class='label-text hidden-xs'])[6]";
    String RECENT_ORDERS_GE_ORDER_NO_NO = "(//li[@class='col-xs-6 col-sm-4']//a[@href])[1]";
    String RECENT_ORDERS_GE_ORDER_NO_NO2 = "(//li[@class='col-xs-6 col-sm-4']//a[@href])[4]";
    String ORDER2_STATUS = "(//li[@class='col-xs-6 col-sm-4'])[8]";
    String RECENT_ORDERS_PO_NO_NO = "(//li[@class='col-xs-4 hidden-xs']//a[@href])[1]";
    String WidgetHasNecessaryText0 = "View account information or request account access\nUpdate your contact information\nChange your language preference";
    String WidgetHasNecessaryText = "Select home to quickly navigate back to the account landing page.";
    String WidgetHasNecessaryText2 = "View a graphical year-to-date order summary for your account.";
    String WidgetHasNecessaryText3 = "Search for specific order by PO No. or GE Order No.";
    String WidgetHasNecessaryText4 = "This area will display a list of the most recent orders for your account. Select the 'view all' link to view complete list of orders.";
    String WidgetHasNecessaryText5 = "Create a list of products you frequently view or purchase. Your most recently accessed lists will display here.";
    String WidgetHasNecessaryText6 = "Check real time price and availability of the product.";
    String WidgetHasNecessaryText7 = "Keep up to date with the latest product updates, news and tool enhancements.";
    String VIEW_ALL_SAVED_LIST_LINK = "(//div//a[@href='/geempower/savedLists'])[2]";
    String LIST_NAME_FIELD = "(//span[@class='label-text hidden-xs'])[13]";
    String CREATED_ON_FIELD = "(//li[@class='col-xs-4 hidden-xs'])[7]//span[@class='label-text']";
    String NO_OF_ITEMS_FIELD = "(//li[@class='col-xs-3 col-sm-4'])[1]//span[@class='label-text hidden-xs']";
    String NO_OF_ITEMS_QTY = "(//li[@class='col-xs-3 col-sm-4'])[1]";
    String SAVED_LIST1 = "(//a[@class='saved-list-details'])[1]";
    String LIST_CREATED_ON = "(//li[@class='col-xs-4 hidden-xs'])[7]";
    String FEATURED_TOOLS_VIEW_ALL = "//a[@href='http://www.geindustrial.com/news']";
    String FEATURED_TOOLS_CAROUSEL = "//div[@class='panel-body product-slider']";
    String FEATURED_TOOLS1 = "(//div[@class='media-body']//p)[2]";
    String TEXT_IN_FEATURED_TOOLS1 = "View the empower overlay to learn about the main sections and features and start using the site quickly.";
    String FEATURED_TOOLS2 = "(//div[@class='media-body']//p)[3]";
    String TEXT_IN_FEATURED_TOOLS2 = "This online repository contains technical documentation, time current curves, CSI Specifications and promotional literature. You can browse by product or use the search boxes to quickly locate specific information.";
    String FEATURED_TOOLS3 = "(//div[@class='media-body']//p)[4]";
    String TEXT_IN_FEATURED_TOOLS3 = "Search for stock items by selecting key product features, or narrow your search by specifying technical requirements.";
    String FEATURED_TOOLS4 = "(//div[@class='media-body']//p)[5]";
    String TEXT_IN_FEATURED_TOOLS4 = "Our product configuration tools provide the information you need to create quotes, proposals, orders and bill-of-materials quickly and accurately, regardless of complexity.";
    String PUBLICATION_LIBRARY = "//div[@class='media-body']//a[@class='publicationLibrary']";
    String QUOTES_BUTTON = "//a[@href='https://quote-qa.geindustrial.com/ux/']//button[@type='submit']";
    String Close = "//img[@alt='close']";


    ////////////////////////////////////// ALL ORDERS PAGE /////////////////////////
    String ALL_ORDERS_TEXT = "//h3";
    String STATUS_COMBOBOX = "//span[@id='select2-order-filter-by-status-container']";
    String ORDER_DATAILS_OR_NO = "(//li[@class='col-xs-12 col-sm-6 col-md-3 col-lg-2'])[1]";
    String ORDER_NO_IN_TABLE = "(//td//a[@href])[1]";
    String ORDER_PO_NO_IN_TABLE = "(//td//a[@href])[2]";
    String PO_ORDER_DETAILS_PO = "//p[@class='table-action-text']";
    String SEARCH_FIELD = "//div[@class='form-group input-group']//input[@id='order-filter-by-value']";
    String ORDER_STATUS_DETAIL = "//p[@class='order-status-success']";


    ///////////////////////////////////////// SAVED LISTS PAGE////////////////////
    String SAVED_LIST_DETAILS_NAME = "(//h4)[1]";
    String BACK_BUTTON_SAVED_LISTS = "//a[@class='back-link']//i[@class='fa fa-angle-left']";
    String ADD_NEW_LISTS_BUTTON = "//button[@data-target='#new-list-modal']";
    String NEW_LIST_NAME_FIELD = "//input[@class='form-control new-list-input']";
    String ADD_BUTTON = "//button[@class='btn primary-btn add-list-btn']";
    String LISTS_FIELD = "//table[@id='savedListTable']";
    String FIRST_LIST = "(//tr[@role='row']//td[@class='sorting_1'])[1]";
    String SORT_BY_CREATED = "(//tr[@role='row']//th[@aria-label='Created On: activate to sort column ascending'])[2]";
    String SORT_BY_CREATED_ASCENDING= "(//tr[@role='row']//th[@aria-sort='ascending'])[2]";
    String SORT_BY_CREATED_DESCENDING = "(//tr[@role='row']//th[@aria-sort='descending'])";
    String No_Of_ITEMS = "(//tr[@role='row'])[9]//td[4]";
    String Next_Pagination_button = "//span[@id='savedListTable_next']";
    String dotsbutton = "(//i[@class='fa fa-ellipsis-v'])[13]";
    String delete_button = ".//*[@id='savedListTable']/tbody/tr[1]/td[5]/ul/li/ul/li/a";
    String Delete = "//div[@class='modal fade delete-list-modal in']//button[@class='btn primary-btn delete-list-btn']";
    String listsTable = "//table[@id='savedListTable']";
    String NextPaginationButton= "(//span[@class='next paginate_button'])[2]";

}


