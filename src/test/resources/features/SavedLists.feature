Feature: Geempower Saved Lists


  Scenario: Check that user able to create new list add product to the list, and delete list
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "SAVED ITEMS" link in the header
    And All Lists page is opened
    When Create new list "1TestAuto"
    And new list is created "1TestAuto"
#    When open list "1TestAuto"
#    When  add product "THQL1120" to the list
#    And product is added to the list
#    When number of items is changes to "1"
#    When delete list
#    Then list is deleted
