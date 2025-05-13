Feature: LoginData

  @EnterData
  Scenario: Add Info for car
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enter correct data
    And User click on Yala button
    And user click on OK
    And User Click Link_let_car_work
    And User enter infoData
    And  User click Submit button
    Then User verifes Success message
    And user Quites browser
