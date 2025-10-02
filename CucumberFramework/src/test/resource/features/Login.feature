Feature: Login functionality

    Scenario: Login With Valid Credentials
    Given User has navigated to login page
    When User enters a valid email address "amootooticap9@gmail.com" into email field
    And User has enters valid password "12345" into password field
    And User click on Login button
    Then User should successfully Logged in
