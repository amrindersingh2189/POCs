Feature: This will check the Google website if it is running and search, else throw error

  Scenario: This is Google basic running check scenario
    Given go to google.co.in
    When pass search text in the seachbox
      | Field  | Value           |
      | Search | Chandigarh City |
    And click on Google Search button
    Then check if the title of the page is as per below table
      | Field      | Value                           |
      | Check Tile | Chandigarh City - Google Search |

  Scenario: This is Google basic running check scenario hello
    Given go to google.co.in
    When pass search text in the seachbox
      | Field  | Value       |
      | Search | Hello World |
    And click on Google Search button
    Then check if the title of the page is as per below table
      | Field      | Value                       |
      | Check Tile | Hello World - Google Search |

  Scenario: This is Google basic running check scenario three
    Given go to google.co.in
    When pass search text in the seachbox
      | Field  | Value            |
      | Search | Sydney Australia |
    And click on Google Search button
    Then check if the title of the page is as per below table
      | Field      | Value                            |
      | Check Tile | Sydney Australia - Google Search |
