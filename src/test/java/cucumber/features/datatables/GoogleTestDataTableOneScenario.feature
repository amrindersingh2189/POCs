Feature: This will check the Google website if it is running and search, else throw error

  Scenario: This is Google basic running check scenario
    Given go to google.co.in
    When pass search text in the seachbox
      | Field  | Value            |
      | Search | Hello World      |
      | Search | Chandigarh City  |
      | Search | Amrinder Singh   |
      | Search | Sydney Australia |
    And click on Google Search button
    Then check if the title of the page is as per below table
      | Field      | Value                            |
      | Check Tile | Hello World - Google Search      |
      | Check Tile | Chandigarh City - Google Search  |
      | Check Tile | Amrinder Singh - Google Search   |
      | Check Tile | Sydney Australia - Google Search |
