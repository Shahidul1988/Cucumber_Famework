Feature: Verifying our Osa pages title
 Background:
    Given I have to open chrome browser
    When Navigate to osa  Home page
 
  @Home @regression
  Scenario: Verify the Osa home page title
    Then I verify the title
    And I have to close the browser

  @About @regression
  Scenario: Verify the about page Title
    Then I have to click the About page
    And After clicking i need to verify the title
    And I will click This three buttons Our_Mission Our_Vision & Our_Value
    And I have to close the browser

	  
    