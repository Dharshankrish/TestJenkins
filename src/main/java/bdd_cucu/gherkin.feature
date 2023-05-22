Feature: Signup a new account

 Scenario: To signup an account for a new user
    Given User enters the linkedin web application
    And User enters his/her first name
    And User enters his/her last name
    And User enters his/her phone number or email id
    And User enters a strong password
    Then User clicks on Agree and join 
    And User is registered successfully if the details are valid


