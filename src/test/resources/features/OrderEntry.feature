Feature: Geempower Order Entry


  Scenario: Check that user from NA region able to place the order
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click account number
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on cart icon in the header
    And Cart page is opened
    When Add product "THQL1120"to the cart
    And Product is added to the cart
    When Click Next buttton
    When Enter PO number "1A"
    When Choose stok address
    When Click Next buttton
    And Minimum Shipment Changes popus is displayed
    When Click Continue button
    When Click place Order button
    Then Order


