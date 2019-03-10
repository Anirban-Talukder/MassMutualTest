Feature: Test Validation

  
    Scenario: Verify npv page elements
    
    Given I launch the browser
    When I navigate to npv page
    Then I verify right number of values appeared on the screen 
    And I verify all the values appeared are greater than zero
    And I verify total balance matched the sum of the values
    And I verify all the values are formatted as currencies
    And I verify given total balance is correct
    And I complete my test
    
    
    
   