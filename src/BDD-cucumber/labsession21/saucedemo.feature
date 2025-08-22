Feature: SauceDemo Login Feature

 Scenario Outline: Verify login with different users
   Given User is on the SauceDemo login page
  When user enters "<username>" and "<password>"
    Then appropriate result should be displayed

    Examples:
      | username        | password     |
     | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
     | problem_user    | secret_sauce |
| invalid_user    | wrong_pass   |
