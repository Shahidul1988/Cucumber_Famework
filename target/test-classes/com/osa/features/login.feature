Feature: Allow to login registered members with vaild credentials.

  @dataT @regression
  Scenario: We will test forum login for invaild credentials.
    Given I have to open chrome browser
    When Navigate to osa  Home page
    And I have to click on forum button
    And I enter username password
      | vaild_username | invaild_password |
    Then press the login button
    And I have to close the browser
