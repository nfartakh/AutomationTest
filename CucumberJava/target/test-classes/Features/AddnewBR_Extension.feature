
Feature: Add new business Request with source Extension
  Scenario: Test of adding new Buiness Request with source Extension
    Given the user is in the Business Request home page
    When the user click on the button New Business Request
    And enters Request number choose FWC and choose Service type 
    And Choose source Extension 
    And fill field Linked BR
    And click on the icon on loading extension 
    And click on yes in the swett alert appeared 
    And click on Save 
    Then the extension request is saved 