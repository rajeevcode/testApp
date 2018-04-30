Feature: Gmail Login
  As a user I should able to login.

  Scenario: user login with valid credential
    Given Launch the App
    And Enter into username field
    And Enter into password field
    When user tap on login button
    Then user should able to login