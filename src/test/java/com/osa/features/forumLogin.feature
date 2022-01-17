Feature: Login into Osa Forum page
  
    @forum @regression @smoke
  Scenario: Only registered students can login the Osa_page and able to check all the interview_questions with valid username and password.
    Given I open chrome browser
    When I navigate to osa  Home_page
    And I have to verify Home_page
    And I click on forum button
    And Now I have to type Username_"arjuarju2015@gmail.com"
    And Next I have to type Password_"Suhanaalvina2015$"
    Then I have to press the login button
    And I click on interview questions button
    And I have to verify interview_questions page
    Then I click on JAVA button
    And I click on SELENIUM button
    And I click on CUCUMBER button
    And I click on BEHAVIOURAL button
    And I click on TESTNG button
    And I click on LOG4J button
    And I click on ITESTLISTENER button
    And I click on API button
    And I click on DATA_STRUCTURE button
    And I click on COMMOM_INTERVIEW_Q button
    And I click on SQL button
    And I click on STUDENT_PAGE button
    And Next i have to verify the student_page
    And I close the browser

    @forum @regression @smoke
  Scenario Outline: Without registration anyone not able to login the Osa_page.
    Given I open chrome browser
    When I navigate to osa  Home_page
    And I have to verify Home_page
    And I click on forum button
    And Now I have to type Username_<Username>
    And Next I have to type Password_<password>
    Then I have to press the login button
    And I close the browser

    Examples: 
      | Username           | password           |
      | "valid_username"   | "invalid_password" |
      | "invalid_username" | "valid_password "  |
      | "invalid_username" | "valid_password "  |
