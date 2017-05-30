Feature: Geempower Account Management

  Scenario: Log in to the GEempower
    Given open custom login page
    When login user
    Then account management page is opened

  Scenario: Check that user able to choose appropriate account
    Given open custom login page
    When login user
#    When Click "Approved Accounts" tab
    When Choose "North America" region
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    Then Dashboard page is opened

#  Scenario: Check sorting for table
#    Given open custom login page
#    When login user
#    When Click "Account No." "ascending"
#    Then List of accounts should be sorted by account number "ascending"
#    When Click "Account No." "descending"
#    Then List of accounts should be sorted by account number "descending"
#    When Click "Account Name" "ascending"
#    Then List of accounts should be sorted by account name "ascending"
#    When Click "Account Name" "descending"
#    Then List of accounts should be sorted by account name "descending"
#    When Click "City" "ascending"
#    Then List of accounts should be sorted by city name "ascending"
#    When Click "City" "descending"
#    Then List of accounts should be sorted by city name "descending"
#    When Click "State" "ascending"
#    Then List of accounts should be sorted by state "ascending"
#    When Click "State" "descending"
#    Then List of accounts should be sorted by state "descending"
#    When Click "Sales Org." "ascending"
#    Then List of accounts should be sorted by sales org. "ascending"
#    When Click "Sales Org." "descending"
#    Then List of accounts should be sorted by sales org. "descending"
#    When Click "Sales Channel" "ascending"
#    Then List of accounts should be sorted by sales Channel "ascending"
#    When Click "Sales Channel" "descending"
#    Then List of accounts should be sorted by sales Channel "descending"






