Feature: Geempower Account Management
#test
  Scenario: Ge.015.0033 - Ge.015.0049
    Given open custom login page
    When login user
    Then account management page is opened
    When Choose ASIA region in the region combobox
    When Click Search Account button
    When Click on the Approved Tab
    Then All accounts from ASIA region are displayed in the table
    And  Click RESET button
    When Choose ASIA region in the region combobox
    When Enter "1000270" account number to the Account textbox
    When Click Search Account button
    Then "1000270" account is displayed in the table
    And  Click RESET button
    When Choose ASIA region in the region combobox
    When Enter "1000270" account number to the Account textbox
    When Click Search Account button
    Then "1000270" account is displayed in the table
    And  Click RESET button
    When Choose ASIA region in the region combobox
    When Enter "3M SPECIALTY MATERIALS" account name to the Account textbox
    When Click Search Account button
    Then "3M SPECIALTY MATERIALS" account name is displayed in the table
    And  Click RESET button
    When Choose EMEA region in the region combobox
    When Click Search Account button
    When Click on the Approved Tab
    Then All accounts from EMEA region are displayed in the table
    And  Click RESET button
    When Choose EMEA region in the region combobox
    When Enter "9001051" account number to the Account textbox
    When Click Search Account button
    Then "9001051" account is displayed in the table
    And  Click RESET button
    When Choose Latin America region in the region combobox
    When Click Search Account button
    When Click on the Approved Tab
    Then All accounts from Latin America region are displayed in the table
    And  Click RESET button
    When Choose Latin America region in the region combobox
    When Enter "9000084" account number to the Account textbox
    When Click Search Account button
    Then "9000084" account is displayed in the table
    And  Click RESET button
    When Choose North America region in the region combobox
    When Click Search Account button
    When Click on the Approved Tab
    Then All accounts from North America region are displayed in the table
    And  Click RESET button
    When Choose North America region in the region combobox
    When Enter "1318501" account number to the Account textbox
    When Click Search Account button
    Then "1318501" account is displayed in the table
    When  Click RESET button
    Then  Region and Account fields are blank
    When Click Search Account button
    When Click on the Approved Tab
    When Click on the Next button
    Then Next list of accounts is displayed
    When Click on the Last button
    Then Last list of accounts is displayed
    When Click on the Previous button
    Then Previous list of accounts is displayed
    When Click on the First button
    Then First list of accounts is displayed
#  Scenario: Ge.015.0083
    When Choose ASIA region in the region combobox
    When Enter "1000270" account number to the Account textbox
    When Click Search Account button
    Then "1000270" account is displayed in the table
    When Click on the star button
    When Click Favorites Tab
    Then Favorites tab is opened
    Then "1000270" account is displayed in the table
#    When Click on the star1 button
#    Then "1000270" account isn't displayed in the table





#  Scenario: Check sorting for table
#    Given open custom login page
#    When login user
#    When Click "Account No." "ascending"
#   Then List of accounts should be sorted by account number "ascending"
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
















