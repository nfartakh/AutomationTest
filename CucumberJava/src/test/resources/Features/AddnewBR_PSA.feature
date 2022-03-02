
Feature: Feature of adding new Business Request with status PSA 
Scenario: Test of adding new BR with status PSA and service type PTM
    Given the user is in the Business Request home page
    When the user click on the button New Business Request
    And enters Request number , choose FWC , and Department, choose status PSA, and service type PTM
    When the user clicks on button Basic characteristics
    And choose the Place of delivery and Company
    When the user click on button New Profile
    And Choose Profile and Level and on site
    And fill Number of days and Other Expertise required
    And click on Save
    When the user access to tab Everis candidates(s)
    And click on button New candidate
    And fill fields first name, company and recruitment 
    And click on save 
    When the user select candidate added
    And click on button Select as consultant
    And click on yes in the alert appered 
    And fill type of contract by freelance 
    And  click on save 
    When the user access to tab ProfilLevelConsultant 
    And  click on the icon of edit consultant 
    And fill fields Consultant cost, PTM owner and PTM rate 
    And click on Save 
    When the user access to tab Specific contract 
    And fill fields Date SC is signed and Maximum end date 
    And click on Save
    Then the request is saved
  