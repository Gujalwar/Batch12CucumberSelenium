Feature: Dashboard Page Menu


  Scenario: User should be able to see Dashboard Menus after logged in
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then  The user should be able to see following menu options
      | Developers   |
      | All Posts    |
      | My Account   |