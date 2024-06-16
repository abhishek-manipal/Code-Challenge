Feature:  Test the Login functionality 

    Scenario: Valid login functionality 
    Given I go to the return-it app
    When I clear the username and password forms
    And I login using registered credentials
    Then I am logged into successful to dashboard