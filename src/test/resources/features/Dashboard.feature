Feature: Geempower Dashboard

Feature: Geempower Dashboard
  Background:
    Given open Dashboard page

  Scenario: Ge.016.0001 - Ge.016.0025
    Then  Dashboard page contains all necessary fields, widgets and buttons
    And   Click Next button on every balloon
    Then  For each widget appropriate balloon is displayed
    When  Click Previous button on every balloon
    Then  For each widget appropriate balloon is displayed
    And   Click Skip button
    Then  Training layer is closed
    When  Click on account number in the header
    Then  Necessary fields are shown
    When  Click Change Account button in the dropdown list
    Then  Account Management page is opened
    When  Click on  account number in the list
    Then  Dashboard page is opened1
    Then  Order Status widget contains all necessary elements
    When  Click Total Prices circle
    Then  All Orders page is opened
    And   Click HOME button
    When  Click Open circle
    Then  Open text is displayed in the Status combobox
    And   Click HOME button
    When  Click Shipped circle
    Then  Shipped text is displayed in the Status combobox
    And   Click HOME button
    When  Click OnHold circle
    Then  On hold text is displayed in the Status combobox
    And   Click HOME button
    When  Click Cancelled circle
    Then  Cancelled text is displayed in the Status combobox
    And   Click HOME button
    Then  Check that Track you Order widget contains all necessary elements
    When  Enter order number to the  Enter Order or PO Number textbox
    When  Click Search button
    Then  Entered order is displayed in the table
    And   Click HOME button
    When  Enter PO order number to the  Enter Order or PO Number textbox
    When  Click Search button
    Then  Entered  Po order is displayed in the table
    And   Click HOME button
    Then  Check that Recent Orders widget contains all necessary elements
    When  Click View All button at the Recent Orders widget
    Then  All Orders page is opened
    And   Click HOME button
    When  Click on any Order No at the Recent Orders widget
    Then  Order Details page is opened
    And   Click HOME button
    When  Click on any  Po Order No at the Recent Orders widget
    Then  PO Order Details page is opened
    And   Click HOME button
    When  Click on Any Order at the Recent Orders widget
    Then  Check that status the same in the widget and in the Order Details page
    And   Click HOME button
    Then  Check that Recent Lists widget contains all necessary elements
    When  Click on list name
    Then  List of products from chosen list is displayed at the Saved Lists page
    And   Go to the Saved Lists Page
    When  Create new List
    And   Click HOME button
    Then  Created date is correct
    When  Click on the View All button at the Recent Lists widget
    When  Click sortByDateCreate
    When  Click sortByDateCreateDescending
    Then  Check that Number of items the same in the list and in the widget
    When  Delete list
    Then  List is deleted
    And   Click HOME button
#  Scenario: Ge.016.0042 - Ge.016.0045
    When  Click close cookies bar
    Then  Check that Featured Tools widget contains all necessary elements
    When  Click on Publication Library tool in the widget
    Then  "Publication Library | GE Industrial Solutions" page is opened in the separate tab
    When  Click View All button at the Featured Tools widget
    Then  Then Page "News | GE Industrial Solutions" is opened in the separate tab
#    When  Click on the QUOTES button
#    Then  Then Page "GE empower | Quote" is opened in the separate tab

