Feature: Manage Address Functionality

Background: Application open Manage address page

Given user opens "chrome" browser with exe as
Given user enter url as 
When user click on initial login page
When user navigate on login button
When user click on my profile
When user enter "9545172923" as username
When user enter "9545172923" as password
When user click on login button

@RegressionTest
Scenario: Manage Address finctionality with valid credentials
When user click on Manage addresses
When user click on Add New address
When user enetr "Ganesh" as Name
When user enter "9545172923" as phone number
When user enetr "412207" as pincode
When user enter "Wagholi" as locality
When user enetr "Pravin Boys Hostel, Baif Road", as address
When user enter "Pune" as city
When user click on state dropdown and click on "Maharashtra"
When user enter "BOI" as landmark
When user enter "9545262658" as alternate phone number
When user click "Home" as as address type
When user click on save button
Then application shows address saved successfully



