@api
Feature: Login API authentication

  Scenario: User logs in successfully using the CheckAuthenticationTechApp API
    Given the API endpoint is "https://demo-techapp.reflexioncafm.com:6443/Service.svc"
    And the login credentials are:
      | username | 0115245     |
      | password | abcd1234$   |
    When I send the login request
    Then the response status code should be 200
    And the response should contain a valid token


  Scenario: Add a team member to a Work Order
    Given the API endpoint is "https://demo-techapp.reflexioncafm.com:6443/Service.svc"
    When I call AddTeamMemberWO API with:
      | WorkOrderId | 12345 |
      | StaffId     | 0115245 |
    Then the response status code should be 200
