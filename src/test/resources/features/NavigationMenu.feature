@navigate
Feature: Navigate Menu


  Scenario: Navigating Developers Menu
    Given The user is on the login page
    When  The user enters teacher credentials
    Then  The user should be able to see welcome message
    And   The user navigates to Developers menu
    Then  The user able to see Developer text


  Scenario: Navigating All Posts Menu
    Given The user is on the login page
    When  The user enters student credentials
    Then  The user should be able to see welcome message
    And   The user navigates All Posts menu
    Then  The user able to see Posts text


  Scenario: Navigating My Account Menu
    Given The user is on the login page
    When  The user enters developer credentials
    Then  The user should be able to see welcome message
    And   The user navigates My Account menu
    Then  The user able to see Dashboard text