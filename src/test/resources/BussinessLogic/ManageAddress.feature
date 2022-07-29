Feature:ManageAddress functionality

Background: User successfully logged in
Given user open browser with "webdriver.chrome.driver" and "C:\\Local Disk D\\Automation Support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
When user click on initial login page
When user navigate on login button
When user click on my profile
When user enter "9545172923" as username
When user enter "9545172923" as password
When user click on login button

@SmokeTest 
Scenario: Manage address with valid data
When user navigate on login button
When user click on my profile
When user enter "9545172923" as username
When user enter "9545172923" as password
When user click on login button
