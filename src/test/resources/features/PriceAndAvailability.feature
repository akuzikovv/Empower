Feature: Geempower P&A

  Scenario: Check that STANDART SPA is displayed at the P&A page and user able to choose appropriate spa
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    And "THQL1120" product is displayed at the Price and Availability page
    And "STANDARD" spa is displayed
    When Open Special Pricing Lookup
    When Click on "45001743" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    When "45001743" spa is displayed
    When Update Price and Availability at P&A page
    Then Final Net Price are updated to "3.42"
    Then Extnd Price are updated to "3.42"


  Scenario: Check that user able to upload file with product and spa displayed at the P&A page
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When upload "src/test/resources/files/Test_NA_SPA.xlsx" document with products
    When Click Check Price And Availability button
    And "THQL1120" product is displayed at the Price and Availability page
    When "45001743" spa is displayed
    When Qty "10" is displayed
    Then Extnd price is "34.20"

  Scenario: Check that after uploading file with product user able to add a product at the P&A page
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When upload "src/test/resources/files/Test_NA_SPA.xlsx" document with products
    When Click Check Price And Availability button
    And "THQL1120" product is displayed at the Price and Availability page
    When click "ADD Item" at the P&A page
    When  add product "TCAL18" to the Price and Availability page
    Then Check that both "THQL1120" and "TCAL18" products are displayed

  Scenario: Check that user able to apply one spa for all products
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    When click "ADD Item" at the P&A page
    When  add product "TCAL18" to the Price and Availability page
    Then Check that both "THQL1120" and "TCAL18" products are displayed
    When Open Special Pricing Lookup
    When Click on "45000210" spa
    When Click "Apply to All" button at Special Pricing Lookup
    Then "45000210" spa applied for all products


  Scenario: Check that user able to search SPA by  SPA No. at SPA popup
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    When Open Special Pricing Lookup
    When Search by "45000210" SPA No
    When Click on "45000210" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    Then "45000210" spa is displayed


  Scenario: Check that user able to search SPA by Customer Name at SPA popup
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    When Open Special Pricing Lookup
    When Search by "J&K" Customer Name
    When Click on "45000220" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    Then "45000220" spa is displayed


  Scenario: Check that user able to search SPA by  Customer numebr
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    When Open Special Pricing Lookup
    When Search by "2007600" Customer No
    When Click on "45000214" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    Then "45000214" spa is displayed
    When Open Special Pricing Lookup


  Scenario: Check that "Pricing agreement is invalid. Standard price is displayed." error message is displayed with Invalid SPA
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    And "THQL1120" product is displayed at the Price and Availability page
    When Open Special Pricing Lookup
    When Click on "45000210" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    When "45000210" spa is displayed
    When Update Price and Availability at P&A page
    Then "Pricing agreement is invalid. Standard price is displayed." error message is displayed at the P&A results page
    When click on "THQL1120" product in the table
    Then "Specifications" tab is shown at the product details popup
    When Click on "Product Details" tab
    Then "Pricing agreement is invalid. Standard price is displayed." error message is displayed at the Product details popup

  Scenario: Check that "Pricing agreement is invalid. Standard price is displayed." error messages aren't displayed if standart SPA
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    And "THQL1120" product is displayed at the Price and Availability page
    Then "Pricing agreement is invalid. Standard price is displayed." error message isn't displayed at the P&A results page
    When click on "THQL1120" product in the table
    When Click on "Product Details" tab
    Then "Pricing agreement is invalid. Standard price is displayed." error message isn't displayed at the Product details popup
    Then "Final Net Price is greater than Standard Price" error message isn't displayed at the Product details popup

  Scenario: Check that "Pricing agreement is invalid. Standard price is displayed." error messages aren't displayed if valid SPA
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "THQL1120" and check Price and Availability
    And "THQL1120" product is displayed at the Price and Availability page
    When Open Special Pricing Lookup
    When Click on "45003812" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    When "45003812" spa is displayed
    When Update Price and Availability at P&A page
    Then "Pricing agreement is invalid. Standard price is displayed." error message isn't displayed at the P&A results page
    When click on "THQL1120" product in the table
    When Click on "Product Details" tab
    Then "Pricing agreement is invalid. Standard price is displayed." error message isn't displayed at the Product details popup
    Then "Final Net Price is greater than Standard Price" error message isn't displayed at Product details popup

  Scenario: Check that "Final Net Price is greater than Standard Price" error messages is displayed
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "TH2221J" and check Price and Availability
    And "TH2221J" product is displayed at the Price and Availability page
    When Open Special Pricing Lookup
    When Click on "45001743" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    When Update Price and Availability at P&A page
    When click on "TH2221J" product in the table
    Then "Specifications" tab is shown at the product details popup
    When Click on "Product Details" tab
    Then "Final Net Price is greater than Standard Price" error message is displayed at Product details popup

  Scenario: Check that "Final Net Price is greater than Standard Price" error messages isn't displayed
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When At the Dashboard enter Product "104PBG00B3" and check Price and Availability
    And "104PBG00B3" product is displayed at the Price and Availability page
    When Open Special Pricing Lookup
    When Click on "45001743" spa
    When Click "Apply & Copy" button at Special Pricing Lookup
    When Update Price and Availability at P&A page
    When click on "104PBG00B3" product in the table
    When Click on "Availability Details" tab
    Then "Final Net Price is greater than Standard Price" error message isn't displayed at Product details popup