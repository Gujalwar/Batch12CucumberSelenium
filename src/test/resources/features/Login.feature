@login
Feature: User should be able to login


  Scenario: Login As a Teacher
    Given The user is on the login page
    When  The user enters teacher credentials
    Then  The user should be able to log in


  Scenario: Login As a Student
    Given The user is on the login page
    When  The user enters student credentials
    Then  The user should be able to log in


  Scenario: Login As a Developer
    Given The user is on the login page
    When  The user enters developer credentials
    Then  The user should be able to log in