Feature: log in
#@login

  Scenario: As a user I should able to log in successfully with valid credentials
    Given I am on homepage
    When I enter valid username and password
    Then I should able to log in successfully

