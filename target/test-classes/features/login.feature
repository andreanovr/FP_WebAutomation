@login @regression
Feature: Login

  @positive-test @smoke
  Scenario Outline: TC_084 - Login as a room tenant with valid credentials
    Given user is on home page
    And user choose Masuk
    And user choose Pencari Kost
    And user input email with "<email>"
    And user input password with "<password>"
    When user click on login button
    Then user is on homepage
    Examples:
      | email | password |
      | andreanovr@gmail.com | andreanovr@gmail.com  |

  @positive-test @smoke
  Scenario Outline: TC_070 -  Login as a room owner with valid credentials
    Given user is on home page
    And user choose Masuk
    And user choose Penyewa Kost
    And user input email with "<email>"
    And user input password with "<password>"
    When user click on login button
    Then user is on homepage
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345  |