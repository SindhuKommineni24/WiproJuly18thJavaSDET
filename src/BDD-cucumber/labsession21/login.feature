Feature: Login Functionality
 
#@regression
#Scenario: Verify the login functionality for valid credentials
#	Given User is on the login page
#	When user enters the username
#	And user enters teh password
#	And user clicks on the login button
#	Then user is naqvigated to home page 
	
#@Sanity

#Scenario: Verify the login functionality for invalid credentials

  #  Given User is on the invalid credentials
  #  When user enters the Invalid username
   # And user enters the Invalid password
   # And user clicks on the login button
   # Then an error message Invalid username and password should be displayed
    
    
 Feature: Login Functionality
 
#@regression

#Scenario: Verify the login functionality for valid credentials

#    Given User is on the login page
#    When user enters the username
#    And user enters teh password
#   And user clicks on the login button
#   Then user is navigated to home page 
    
#@Sanity

#Scenario: Verify the login functionality for invalid credentials

#    Given User is on the invalid credentials page
#   When user enters the Invalid username
#    And user enters the Invalid password
#    Then an error message Invalid username and password should be displayed 


#Background: Given User is on the login page
#@sanity
#Scenario: Verify the login functionality for valid credentials using parameters

  
  # When user enters the "<username>" and "<password>"
   #And user clicks on the login button
   #Then user is navigated to home page
   
   #Examples:
   #|username|password|
#|Admin|admin123|
   #|Admin|admin123|
#|Admin|admin123|
   
 @sanity
Scenario: Login with multiple users
	 Given User is on the login page
	 When user enters credentials
      | username | password  |
      | Admin    | admin123  |  
   And user clicks on the login button	
	Then user is naqvigated to home page
	