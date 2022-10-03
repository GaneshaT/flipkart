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

@SmokeTest
Scenario: Add To Cart finctionality with valid credentials
When user click on flipkart Logo
When user click on Mobile
When user click on Narzo Mobile
When user click on realme Narzo 30 Pro 5G (Blade Silver, 128 GB)
When user switch to tab
When user click on add to cart
When user navigate back on main page
When user click on cart
Then application shows item added successfully

