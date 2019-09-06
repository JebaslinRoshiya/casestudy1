

Feature: Register in TestMe App


  Scenario: Successful Registration
    Given Open the TestMe App Homepage
    And click on SignUp
    When User enters the username "Lileyo"
    And  User enters the firstname "Rosh"
    And  User enters the lastname "Jacob"
    Then  User enters the password "qwerty"
    And  User enters the confirmpassword "qwerty"
    And  User clicks the gender
    Then  User enters the email "rosh@gmail.com"
    Then  User enters the mobileno "9876543571"
    Then  User enters the DOB 
    Then  User enters the address "Chennai"
    Then User selects the secques
    Then User enters the answer "rody"
    Then User clicks Register

 