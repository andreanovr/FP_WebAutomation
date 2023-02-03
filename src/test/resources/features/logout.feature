@login @regression
Feature: Logout

  @positive-test @smoke
  Scenario Outline: TC_123 - Room Owner - verify user can logout with click the Logout in pop-up "do you want to exit ?"
    Given user is on home page
    And user choose Masuk
    And user choose Pencari Kost
    And user input email with "<email>"
    And user input password with "<password>"
    And user click on login button
    And user is on homepage sign in
    And user click dropdown button
    When user click on logout button
    And user click logout on the pop-up
    Then user is on home page
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345  |

  @positive-test @smoke
  Scenario Outline: TC_124 - Room Owner - verify user can logout with click Cancel in pop-up "do you want to exit ?"
    Given user is on home page
    And user choose Masuk
    And user choose Pencari Kost
    And user input email with "<email>"
    And user input password with "<password>"
    And user click on login button
    And user is on homepage sign in
    And user click dropdown button
    When user click on logout button
    And user click cancel on the pop-up
    Then user is on homepage sign in
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345  |

  @positive-test @smoke
  Scenario Outline: TC_127 - Room Owner - verify user can logout with click the Logout in pop-up "do you want to exit ?"
    Given user is on home page
    And user choose Masuk
    And user choose Pencari Kost
    And user input email with "<email>"
    And user input password with "<password>"
    And user click on login button
    And user is on homepage sign in
    And user click dropdown button
    When user click on logout button
    And user click logout on the pop-up
    Then user is on home page
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345  |

  @positive-test @smoke
  Scenario Outline: TC_128 - Room Owner - verify user can logout with click Cancel in pop-up "do you want to exit ?"
    Given user is on home page
    And user choose Masuk
    And user choose Pencari Kost
    And user input email with "<email>"
    And user input password with "<password>"
    And user click on login button
    And user is on homepage sign in
    And user click dropdown button
    When user click on logout button
    And user click cancel on the pop-up
    Then user is on homepage sign in
    Examples:
      | email | password |
      | fachrulfatahillah3@gmail.com | example12345  |