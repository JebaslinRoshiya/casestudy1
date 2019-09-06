
Feature: Successful Login in TestMe App
  
  
  Scenario Outline: Successful login
    Given Open the TestMe app Homepage
    When Click the SignIn 
    Then User enters the username "<username>"
    Then User enters the password "<password>"
    Then User clicks login
    Examples: 
      | username | password | 
      | Lalitha | Password123|
     
