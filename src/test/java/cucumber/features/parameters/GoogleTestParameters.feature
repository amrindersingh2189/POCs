Feature: This will check the Google website if it is running and search, else throw error

	Scenario: This is Google basic running check scenario
		Given go to google.co.in
		When pass "Hello World" in the seachbox
		And click on Google Search button
		Then check if the title of the page is "Hello World" - Google Search
		
	Scenario: This is Google basic running check scenario
		Given go to google.co.in
		When pass "Chandigarh City" in the seachbox
		And click on Google Search button
		Then check if the title of the page is "Chandigarh City" - Google Search
		
	