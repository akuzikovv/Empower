Feature: Geempower Invoice

  Scenario: check that All Invoices page is opened
    Given open custom login page
    When login user
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Invoice" link in the header
    Then All Invoices page is opened

  Scenario: check that user able to search for invoice by
    Given open custom login page
    When login user
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "Invoice" link in the header
