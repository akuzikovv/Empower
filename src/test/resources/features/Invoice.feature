Feature: Geempower Invoice

  Background:
    Given open custom login page
    When login user
#    When Click "Approved Accounts" tab
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Invoice" link in the header
    Then All Invoices page is opened

  Scenario: check that user able to search for invoice by Invoice No
    When Enter invoice No "501111327" to the search input field
    When click search button
    Then "501111327" invoice displayed at the table

 #test