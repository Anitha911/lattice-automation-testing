
Feature: Validate input fields before saving the form for Training company
  @validationForTrainingCompany
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    When user verify the chars max len as 100 on Company Name
    When user verify the chars max len as 100 on Contact Name
    When user verify the chars max len as 20 on Contact Number
    When user verify the chars max len as 100 on Company Address
    When user verify the chars max len as 100 on Email
    Then User clicks on save button
    When user verify the inline error message 'Enter Training Company Name' on Company Name
    When user verify the inline error message 'Select company type' on Company Type
    When user verify the inline error message 'Invalid Email' on email

  @validationForTrainingCourses
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Courses' tab
    Then User clicks on button 'Add Course'
    When user verify the chars max len as 100 on Course Name
    When user verify the chars max len as 5000 on Course Details
    When user verify the chars max len as 5000 on Course Category
    When user verify the chars max len as 5000 on Course Link
    When user verify the chars max len as 10 on Validity days
    Then User clicks on save button
    When user verify the inline error message 'Enter Course Name' on Course Name
    When user verify the inline error message 'Enter Course Details' on Course Details

  @validationForTrainingLevels
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Levels' tab
    Then User clicks on button 'Add Level'
    When user verify the chars max len as 100 on Training Level Name
    When user verify the chars max len as 3 on Training Weightage
    Then User clicks on save button
    When user verify the inline error message 'Enter Training Level Name' on Training Level Name





