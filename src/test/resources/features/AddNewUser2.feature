@UI @Run
Feature: Add new user 2

  Scenario: Add new user to our website
    Given User navigates to the website1 homepage
    When User clicks on 'Login' button1
    And User clicks on 'Register' button1
    And User fills in some mandatory fields
    And User clicks on 'Register' button2
    And User checks error messages


  Scenario Outline: Complete the rest of mandatory fields
    Given User navigates to register page
    When User adds <username>
    And User inserts <password>

    Examples:
      | username | password |
      | step     | 123      |
      | step1    |456     |



