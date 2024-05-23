Feature:  Test the reset password functionality 

    Scenario: Valid reset email sent  
    Given I go to the returnit app
    When I clear the existing form information 
    And provide valid email credentials 
    Then the reset email is sent succesfully 


    Scenario: InValid  email sent  
    Given I go to the returnit app
    When I clear the existing form information 
    And provide ivalid email credentials 
    Then the Error message is shown to user  