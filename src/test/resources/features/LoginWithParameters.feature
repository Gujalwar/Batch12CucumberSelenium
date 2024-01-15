@rerun
Feature: Log in as different user


  Scenario: Login as student with parameters
    Given The user is on the login page
    When  The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then  The user should be able to log in
    Then  The welcome message contains "Teacher"


  Scenario: Login as student with parameter
    Given The user is on the login page
    When  The user logs in using "sparrowjack@gmail.com" and "sparrow1"
    Then  The user should be able to log in
    Then  The welcome message contains "Jack"