
Feature: Delete request already added in Business Request
  
  Scenario: Delete request already exists in the grid 
    Given the user is in the Business Request home page
    When the user click on button Search
    And select request from the grid
    And clicks on button Remove
    And clicks on yes in the sweet alert appeared
    Then The request is deleted
    
