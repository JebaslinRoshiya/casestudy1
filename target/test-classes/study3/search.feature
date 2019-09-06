Feature: Searching the Product

  Scenario Outline: Successful Product Search
    Given Open the TestMe app Homepage
    When Click the SignIn 
    Then User enters the username "<username>"
    Then User enters the password "<password>"
    Then User clicks login
    And User enter the "<item>" in the field
    Then User enters the find details
    Then Item is displayed
     
    Examples: 
      | username | password | item |
      | Lalitha | Password123|Head|
      
      