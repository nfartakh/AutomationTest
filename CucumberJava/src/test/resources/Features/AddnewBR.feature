Feature: Feature of adding new Business Request

  Scenario: Test of adding new BR with status "OIP" and service type "TM"
    Given the user is in the Business Request home page
    When the user click on the button New Business Request
    And enters Request number , choose FWC , and Department, choose status OIP, and service type TM
    When the user clicks on button Basic characteristics
    And choose the Place of delivery and Company
    When the user click on button New Profile
    And Choose Profile and Level and on site
    And fill Number of days and Other Expertise required
    And click on Save
    And click on button Save of the Business Request
    Then the request is saved 
    
