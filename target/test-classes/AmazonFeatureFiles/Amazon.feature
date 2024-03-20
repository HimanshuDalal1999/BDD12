Feature: Verify Amazon Application

Background:
Given User should be at Home page

@Normal
Scenario: Verify Logo of the Amazon Application
Then User should be able to see Logo of the Amazon

@Normal
Scenario: Verify Iphone Logo
When User enters "I phone 15 pro max" in the search box and click on Search button
Then Logo of Iphone should get displayed

@Changes
Scenario: Verify Car Accessories Section
When User clicks on Ambipure image
Then User should redirects to Car Accessories page

@Normal
Scenario: Verify Headphones Carousel
When User clicks on Headphones Carousel
Then User should be able to see multiple Headphones

@Normal
Scenario: Verify Add to Cart Functionality
When User enters "Nike Joyride" in the search box
And Clicks on Search button
And Click on Product
And Click on Add to Cart button
Then Product should gets added in the Cart
