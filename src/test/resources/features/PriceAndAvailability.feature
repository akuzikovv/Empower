Feature: Geempower P&A

  Scenario: Check that STANDART SPA is displayed at the P&A page and user able to choose appropriate spa
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    And product is displayed at the Price and Availability page
    And "STANDARD" spa is displayed
    When Open Special Pricing Lookup
    When Click on "45000210" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    When "45000210" spa is displayed
    When Update Price and Availability at P&A page
    Then Final Net Price and Extnd Price are updated to "2.40"

  Scenario: Check that user able to upload file with product and spa displayed at the P&A page
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When upload "src/test/resources/files/Test_NA_SPA.xlsx" document with products
    When Click Check Price And Availability button
    And product is displayed at the Price and Availability page
    When "45000210" spa is displayed
    When Qty "10" is displayed
    Then Extnd price is "24.00"

  Scenario: Check that after uploading file with product user able to add a product at the P&A page
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When upload "src/test/resources/files/Test_NA_SPA.xlsx" document with products
    When Click Check Price And Availability button
    And product is displayed at the Price and Availability page
    When click "ADD Item" at the P&A page
    When  add product "TCAL18" to the Price and Availability page
    Then Check that both "Thql1120" and "TCAL18" products are displayed