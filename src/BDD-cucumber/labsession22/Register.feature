Feature: Mercury Tour Functionality

@sanity
Scenario: Successful registration with Mercury Tour
  Given User is on the registration page
  When user enters the credentials
    | firstname | lastname  | phone       | email             | address   | city      | state  +  | postalcode | country | username  | password   | confirmpassword |
    | pranavi   | Gangineni | 45637567645 | pranavi@gmail.com | Sri nagar | Hyderabad | Telangana | 508009     | INDIA   | Pranavi15 | Pranavi234 | Pranavi234       |
  Then user clicks on the submit button