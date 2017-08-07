Feature: Geempower Order Entry

#test
  Scenario: Check that user from NA region able to place the order
    Given open custom login page
    When login user
#    When Click "Approved Accounts" tab
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
    When Click place Order button
    When Check Terms and conditions combobox
    When Click submit button
    When Click Close buttton
    Then Order details page is opened

 #test
  Scenario: Check that user from LA region able to place the order
    Given open custom login page
    When login user
#    When Click "Approved Accounts" tab
    When Choose "Latin America" region
    When Search for LA "9000084" account
    When Click "9000084" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    When Select ship addres popup is appeared
    When Click Submit button at the Select ship addres popup
    And "THQL1120" product is displayed at the Price and Availability page
    When Check product in the table
    When Add product from P&A page to the cart
    When Click on cart icon in the header
    When Click Checkout button in the dropdoun
    And Product is added to the cart
    When Choose stok address
    When Click Next buttton
    When Enter PO number "1A"
    When Choose Carrier LA
    When Click Next buttton second step
    And Minimum Shipment Changes popus LA is displayed
    When Click Add More Items Button
    When Change Qty of items to "20"
    And Update Price and Availability
    When Click Next buttton
    When Click Next buttton second step
    When Click place Order button
    When Check Terms and conditions combobox
    When Click submit button
    When Click Close buttton
    Then Order details page is opened

  Scenario: Check that user from EMEA region able to place the order
    Given open custom login page
    When login user
#    When Click "Approved Accounts" tab
    When Choose "EMEA" region
    When Search for EMEA "9006003" account
    When Click "9006003" account
    When Click "Skip" button
    And  Dashboard page is opened
    When upload "src/test/resources/files/Test_EMEA.xlsx" document with products
    When Click Check Price And Availability button
    And products added to the P and A page "666341", "666606"
    When Check All products in the table
    When Add product from P&A page to the cart
    When Click on cart icon in the header
    When Click Checkout button in the dropdoun
    When All products added to the cart "666341", "666606"
    When Click Next buttton
    When Enter PO number "1A"
    When Choose stok address
    When Click Next buttton second step
    When Click Continue button at the Minimum Shipment Charges popup
    When Click place Order button
    When Check Terms and conditions combobox
    When Click submit button
    When Click Close buttton
    Then Order details page is opened

  Scenario: Check that user from ASIA region able to place the order
    Given open custom login page
    When login user
#    When Click "Approved Accounts" tab
    When Choose "ASIA" region
    When Search for NA "1000481" account
    When Click "1000481_CNS2_10_10" EMEA account
    When Click "Skip" button
    And  Dashboard page is opened
    When Enter products "113701", "113707 20" to the P&A vidget
    When Click Check Price And Availability button
    When Check All products in the table
    When Add product from P&A page to the cart
    When Click on cart icon in the header
    When Click Checkout button in the dropdoun
    When All products added to the cart "113701", "113707"
    When Click Next buttton
    When Enter PO number "1A"
    When Choose stok address
    When Click Next buttton second step
    When Click place Order button
    When Check Terms and conditions combobox
    When Click submit button
    When Click Close buttton
    Then Order details page is opened
