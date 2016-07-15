Feature: Geempower Order Entry


  Scenario: Check that user from NA region able to place the order
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on cart icon in the header
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


  Scenario: Check that user from LA region able to place the order
    Given open custom login page
    When login user
    When Search for LA "9000084" account
    When Click "9000084" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    When Select ship addres popup is appeared
    When Click Submit button at the Select ship addres popup
    And product is displayed at the Price and Availability page
    When Check product in the table
    When Add product from P&A page to the cart
    And Product is added to the cart
    When Click on cart icon in the header
    When Click Next buttton
    When Enter PO number "1A"
    When Choose stok address
    When Choose Carrier LA
    When Click Next buttton second step
    And Minimum Shipment Changes popus LA is displayed


