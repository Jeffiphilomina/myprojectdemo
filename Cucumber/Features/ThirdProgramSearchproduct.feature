Feature: Search and Place the order for Products

Scenario: Search Experience for product search in both home and offers page

Given User is on GreenCart landing page
When User searched with Shortname "Tom" and extracted actual name of product
Then User searched for "Tom" shortname in offers page 
And Validate product name in offers page matches with landing page