Feature: Login

  @validData
  Scenario: Login with correct data
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enter correct data
    And User click on Yala button
    Then User verifes Success message is displayed
    And user Quites browser


  @wrongPassword
  Scenario Outline: Login with correct email and wrong password
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enter correct email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User click on Yala button
    Then User verifies Error is displayed
    And user Quites browser
    Examples:
      | email                     | password       |
      | qohydydyje@mailinator.com | 03130313MR@    |
      | qohydydyje@mailinator.com | 03130313mr@    |
      | qohydydyje@mailinator.com | Ывва03130313ЬК |


