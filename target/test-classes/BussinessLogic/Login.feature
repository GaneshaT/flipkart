Feature:login functionality

Background: Application open successfully
Given user open browser with "webdriver.chrome.driver" and "C:\\Local Disk D\\Automation Support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"

@SmokeTest 
Scenario: Login functionality with valid credentials
When user click on initial login page
When user navigate on login button
When user click on my profile
When user enter "9545172923" as username
When user enter "9545172923" as password
When user click on login button
Then Application shows login successfully

