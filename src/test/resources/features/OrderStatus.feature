Feature: Geempower Order Status


  Scenario: check that All Orders page is opened
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Order Status" link in the header
    Then All Orders page is opened

  Scenario: check search by Order Number
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Order Status" link in the header
    When Search by "150593309"
    Then "150593309" order number is displayed at the table

  Scenario: check search by PO Number
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Order Status" link in the header
    When Search by "testdates"
    Then "testdates" PO number is displayed at the table

  Scenario: check search by Job Name Number
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Order Status" link in the header
    When Search by "REQ DATE TESTING"
    Then "REQ DATE TESTING" Job Name is displayed at the table

  Scenario: check that Order Details page opened
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Order Status" link in the header
    When Search by "150593309"
    When Click on "150593309" order number
    Then Order details page is opened

  Scenario: check that PO Order Details page opened
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Order Status" link in the header
    When Search by "1A"
    When Click on "1A" PO order number
    When Check all orders in the table
    When click next button
    Then PO Order details page is opened




