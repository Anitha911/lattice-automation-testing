@validation
Feature: Validate input fields before saving the form

  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    When user verify the chars min len as 3 and max len as 100 on Company Name
    When user verify the chars min len as 3 and max len as 100 on Contact Name
    When user verify the chars max len as 20 on Contact Number
    When user verify the chars max len as 100 on Company Address
    When user verify the chars max len as 100 on Email
    Then User clicks on save button
    When user verify the inline error message 'Enter Training Company Name' on Company Name
    When user verify the inline error message 'Select company type' on Company Type
