Feature: This will check the Google website if it is running and search, else throw error

  @web
  Scenario Outline: This is Google basic running check scenario
    Given go to google.co.in
    When pass <searchText> in the seachbox
    And click on Google Search button
    Then check if the title of the page is <title>

    Examples: 
      | searchText      | title                           |
      | Hello World     | Hello World - Google Search     |
      | Chandigarh City | Chandigarh City - Google Search1 |
     # | Amrinder Singh   | Amrinder Singh - Google Search   |
      #| Sydney Australia | Sydney Australia - Google Search |
