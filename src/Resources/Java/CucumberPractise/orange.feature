@login

Feature: Log in

  Background:
    Given I am on homepage

  Scenario Outline:  User should not able to log in with invalid credentials
    When I enter invalid "<username>" and "<password>"
    Then I should not to log in successfully with valid "<errormassage>"
    Examples:
      | username | password  | errormassage                 |
      | Admin    |   Admin1  | Invalid credentials          |
      |          |   admin   | Username cannot be empty     |
      | Admin    |           | Password cannot be empty     |
      | admin1   |   Admin1  | Invalid credentials          |
      | admin123 |   admin   | Invalid credentials          |
      |          |   admin1  | Username cannot be empty     |
      |          |           | Username cannot be empty     |
      | admin12  |           | Password cannot be empty     |



