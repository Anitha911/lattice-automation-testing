@serviceAPI
Feature: TechApp All APIs Validation

  Scenario: Login API
    Given user logs in using CheckAuthenticationTechApp
    Then response status should be 200

  Scenario Outline: Validate All Endpoints
    When user calls "<API>" api
    Then response status should be 200

    Examples:
      | API |
      | GetViewTeamMemberWO |
      | AddTeamMemberWO |
      | RemoveTeamMemberWO |
      | AddTeamMember |
      | ViewTeamMember |
      | RemoveTeamMember |
      | GetVanStore |
      | GetMyStockltemCategoryList |
      | GetClientList |
      | GetClientContractList |
      | GetStaffList |
      | GetClientByStaffId |
      | GetClientContractByClientId |
      | GetAreaGroupByClientContractId |
      | AddStaffAttendance |
