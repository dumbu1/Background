Feature: feature1

Background:
Given user is "Web Examples - CrossBrowserTesting.com" page
When user clicks on the Selenium Example Page link
Then system should display "Selenium Test Example Page" page

Scenario Outline: scenario1

When user enter "<names1>" on Form Elements
And user enter "<names2>" on textBox
And user clicks on submit button
Then system should display "Selenium Test Example Page" page
Examples:

|names1|names2|
|sheereesh|rameshh|
|rajeshh|rakeshhh|
|paramesh|paraddou|




Scenario: scenario2

Then user check the list box
|Option 1|
|Option 2|
|Option 3|
|Option 4|
Then user click on the radio2 button