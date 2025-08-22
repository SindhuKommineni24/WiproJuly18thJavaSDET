Feature: Student Registration Form Automation

  Scenario Outline: Fill and submit student registration form
    Given the user is on the practice registration page
    When the user fills in the registration form with "<name>", "<email>", "<gender>", "<mobile>", "<dob>", "<subjects>", "<hobbies>", "<address>", "<picture>", "<state>", "<city>"
    Then the form should be submitted successfully

    Examples:
      | name   | email            | gender | mobile     | dob        | subjects    | hobbies | address              | picture                          | state     | city   |
      | Akhil  | akhil@test.com   | Male   | 9876543210 | 01-01-2004 | Mathematics | Sports  | Vizag, Andhra        | C:\\Users\\akhil\\OneDrive\\Desktop\\Pictures\\Result1.jpeg  | Andhra    | Vizag  |
      | Sindhu | sindhu@test.com  | Female | 9876500000 | 02-02-2003 | Physics     | Music   | Hyderabad, Telangana | C:\\Users\\akhil\\OneDrive\\Desktop\\Pictures\\Result1.jpeg | Telangana | Hyd    |
