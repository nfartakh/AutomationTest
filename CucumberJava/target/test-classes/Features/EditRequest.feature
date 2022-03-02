
Feature: Edit Request already added

  Scenario: Edit request with SC no created 
    Given the user is in the Business Request home page
    When the user click on button Search
    And select request from the grid
    And click on button Edit 
    And Access to tab Basic characteristics
    And click on icon of edit profile 
    And update value of N°days 
    And click on Save 
    And click on save of BR pop up 
    And click on Save of the comment box 
    Then the request is updated 
   
    
  Scenario: Edit request with SC created 
    Given the user is in the Business Request home page
    When the user click on button Search
    And select request from the grid
    And click on button Edit 
    And Access to tab Basic characteristics
    And click on icon of edit profile 
    And update value of N°days 
    And click on Save 
    And click on save of BR pop up
    And click on yes in the sweet alert appeared  
    And click on save of the comment box 
    Then the request is updated 
   