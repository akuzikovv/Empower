Feature: Geempower Saved Lists

#test
  Scenario: Check that user able to create new list add product to the list, and delete list
    Given open custom login page
    When login user
    When Search for NA "1318501" account
    When Click "1318501" account
    When Click "Skip" button
    And  Dashboard page is opened
    When Click on "SAVED LISTS" link in the header
#    And "All Lists" page is opened
#    When Create new list
#    And new list is created
#    When open list
#    When  add product to the list
#    And product is added to the list
#    When delete list
#    Then list is deleted
