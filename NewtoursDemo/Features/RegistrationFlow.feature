Feature: To test the registration feature of newtours

  Background: 
    Given I am on newtours site
        

  Scenario: To create a user
    Given I click on "Register"
    When I enter "Pinakin" into the FirstName field
    And I enter "Chaubal" into the LastName field
    And I enter "8652027532" into the Phone field
    And I enter "test123@gmail.com" into the Email field
    And I enter "357 Brittany Farms Road" into the Addressone field
    And I enter "Apt 103" into the Addresstwo field
    And I enter "New Britain" into the City field
    And I enter "Connecticut" into the State field
    And I enter "06053" into the PostalCode field
    And I select "ANGOLA" from the Country field
    And I enter "pinakinc" into the UserName field
    And I enter "p9121975" into the Password field
    And I enter "p9121975" into the Confirm Password field
    And I click on the Submit button
    Then confirmation should contain "Thank you"
    
    