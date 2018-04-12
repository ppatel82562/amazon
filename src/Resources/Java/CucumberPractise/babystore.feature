@babystore

Feature: Navigate to baby store
  Scenario: User should be able to navigate to baby store category
    Given user on home page
    When go to shop by department then go to Toys Childern and Baby
    And click on baby
    Then user successfully navigate to baby store