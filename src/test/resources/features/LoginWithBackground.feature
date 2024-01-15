Feature: User should be able to login

  Background:
    Given The user is on the login page


  @Teacher
  Scenario: Login As a Teacher

    When  The user enters teacher credentials
    Then  The user should be able to log in


  Scenario: Login As a Student

    When  The user enters student credentials
    Then  The user should be able to log in


  Scenario: Login As a Developer

    When  The user enters developer credentials
    Then  The user should be able to log in