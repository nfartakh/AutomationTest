
Feature: Create SC Control from Business Request
 
  Scenario: Create TM request from Business Request
    Given the user is in the Business Request home page
    When the user click on button Search
    And select request from the grid which have Status PSA or PIP and SC no created 
    And clicks on button Edit
    And access to tab Specific contract 
    And clicks on button Create SC 
    And clicks on Yes, and proceed 
    And add an OERP project code 
    Then the SC is created 
    