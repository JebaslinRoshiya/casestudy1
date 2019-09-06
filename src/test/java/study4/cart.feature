
Feature: Checking whether cart is present


   Scenario Outline: Availability of cart
    Given Open the TestMe app Homepage
    When Click the SignIn 
    Then User enters the username "<username>"
    Then User enters the password "<password>"
    Then User clicks login
    And User enter the "<item>" in the field
    Then User enters the find details
    Then try to proceed payment without adding any items in the cart
    Then TestMe App doesn't display the cart icon
    

  Examples: 
      | username | password | item |
      | Lalitha | Password123|Head|