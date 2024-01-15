Feature: Navigate to menu with parameters

  Background:
    Given The user is on the login page
@smoke
  Scenario: Navigate Developers Menu
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then  The welcome message contains "Teacher"
    And   The user navigates "Developers" menu
    Then  The user should be able to see header as "Filter Profiles by Skill or by Location"

  @smoke
  Scenario: Navigate All Post Menu
    When  The user logs in using "sparrowjack@gmail.com" and "sparrow1"
    Then  The welcome message contains "Jack"
    And   The user navigates "All Posts" menu
    Then  The user should be able to see header as "Posts"

  @smoke
  Scenario: Navigate My Account Menu
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then  The welcome message contains "Teacher"
    And   The user navigates "My Account" menu
    Then  The user should be able to see header as "Dashboard"

  @smoke
  Scenario Outline: Navigates All Menus
    When  The user logs in using "<username>" and "<password>"
    Then  The welcome message contains "<Welcome Message>"
    And   The user navigates "<Menu Name>" menu
    Then  The user should be able to see header as "<Header>"

    Examples:
      | username              | password      | Welcome Message | Menu Name  | Header                                  |
      | eurotech@gmail.com    | Test12345!    | Teacher         | Developers | Filter Profiles by Skill or by Location |
      | sparrowjack@gmail.com | sparrow1      | Jack            | All Posts  | Posts                                   |
      | Gylych1110@gmail.com  | Alperenmehmet | Gylych          | My Account | Dashboard                               |