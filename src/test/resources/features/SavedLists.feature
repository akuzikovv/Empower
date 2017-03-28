Feature: Geempower Saved Lists


  Scenario: Check that user able to create new list at the "All Items" page, add product to the list, and delete list
    Given open custom login page
    When login user
    When Click "Approved Accounts" tab
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "SAVED ITEMS" link in the header
    And All Lists page is opened
    When Create new list "1TestAuto"
    And new list is created "1TestAuto"
    When open list "1TestAuto"
    When  add product "THQL1120" to the list
    And product "thql1120" is added to the list
    When go to the All Items page
    When number of items is changes to "1"
    When delete list "1TestAuto"
    Then "1TestAuto" list is deleted

  Scenario: Check that user able to add product to the new list from P&A page, and delete list
    Given open custom login page
    When login user
    When Click "Approved Accounts" tab
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    And "THQL1120" product is displayed at the Price and Availability page
    When Check product in the table
    When Add product to the "2TestAuto" new list
    When Click on "Home" link in the header
    And "2TestAuto" new list displayed at the Recent Lists widget
    When Click on "2TestAuto" list at the Recent Lists widget
    And product "thql1120" is added to the list
    When go to the All Items page
    When delete list "2TestAuto"
    Then "2TestAuto" list is deleted
    When Click on "Home" link in the header
    Then list is deleted from the recent Lists widget

  Scenario: Check that user able to save cart on the first step and returne to the saved cart
    Given open custom login page
    When login user
    When Click "Approved Accounts" tab
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on cart icon in the header
    When Click Checkout button in the dropdoun
    And Cart page is opened
    When Add product "THQL1120"to the cart
    And Product is added to the cart
    When Click "Save items" button at the cart
    When Save "NewCartName" cart to the list of saved carts
    When Go to the Dashboard clicking on the GE logo
    When Click on "SAVED ITEMS" link in the header
    And All Lists page is opened
    And new cart is created "NewCartName"
    When click on "NewCartName" saved cart in the table
    And Cart page is opened
    And Product is added to the cart
    When Go to the Dashboard clicking on the GE logo
    When Click on "SAVED ITEMS" link in the header
    When Delete "NewCartName" from the list
    Then "NewCartName" is deleted

  Scenario: Check that user able to save cart on the second step and returne to the saved cart
    Given open custom login page
    When login user
    When Click "Approved Accounts" tab
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on cart icon in the header
    When Click Checkout button in the dropdoun
    And Cart page is opened
    When Add product "THQL1120"to the cart
    And Product is added to the cart
    When Click Next buttton
    When Enter PO number "1A"
    When Choose stok address
    When Click "Save items" button at the cart
    When Save "NewCartName" cart to the list of saved carts
    When Go to the Dashboard clicking on the GE logo
    When Click on "SAVED ITEMS" link in the header
    And All Lists page is opened
    And new cart is created "NewCartName"
    When click on "NewCartName" saved cart in the table
    And Cart page is opened
    And Product is added to the cart
    When Click Next buttton
    And entered PO number "1A" and stock address "MAYER ELECTRIC SUPPLY COMPANY, INC, 3405 4TH AVE S, BIRMINGHAM, Alabama, 35222, United States" are saved
    When Go to the Dashboard clicking on the GE logo
    When Click on "SAVED ITEMS" link in the header
    When Delete "NewCartName" from the list
    Then "NewCartName" is deleted

  Scenario: Check that user able to save cart on the third step and returne to the saved cart
    Given open custom login page
    When login user
    When Click "Approved Accounts" tab
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on cart icon in the header
    When Click Checkout button in the dropdoun
    And Cart page is opened
    When Add product "THQL1120"to the cart
    And Product is added to the cart
    When Click Next buttton
    When Enter PO number "1A"
    When Choose stok address
    When Click Next buttton second step
    And Minimum Shipment Changes popus is displayed
    When Click Continue button
    When Click "Save items" button at the cart
    When Save "NewCartName" cart to the list of saved carts
    When Go to the Dashboard clicking on the GE logo
    When Click on "SAVED ITEMS" link in the header
    And All Lists page is opened
    And new cart is created "NewCartName"
    When click on "NewCartName" saved cart in the table
    And Cart page is opened
    And Product is added to the cart
    When Click Next buttton
    And entered PO number "1A" and stock address "MAYER ELECTRIC SUPPLY COMPANY, INC, 3405 4TH AVE S, BIRMINGHAM, Alabama, 35222, United States" are saved
    When Go to the Dashboard clicking on the GE logo
    When Click on "SAVED ITEMS" link in the header
    When Delete "NewCartName" from the list
    Then "NewCartName" is deleted



