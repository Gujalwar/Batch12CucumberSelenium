Feature: Login as  different users using Scenario Outline


  Scenario Outline: Login as different user
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>"
    Then The welcome message contains "<welcome message>"

    Examples:
      | username              | password      | welcome message |
      | eurotech@gmail.com    | Test12345!    | Teacher         |
      | sparrowjack@gmail.com | sparrow1      | Jack            |
      | Gylych1110@gmail.com  | Alperenmehmet | Gylych          |

@rerun
  Scenario Outline: DD Account Test "<name>" with "<username>"
    Given The user is on the login page
    When The user logs in using "<username>" and "<password>"
    Then The welcome message contains "<name>"


    Examples:
      | username              | password      | name    |
      | eurotech@gmail.com    | Test12345!    | Teacher |
      | sparrowjack@gmail.com | sparrow1      | Jack    |
      | Gylych1110@gmail.com  | Alperenmehmet | Gylych  |