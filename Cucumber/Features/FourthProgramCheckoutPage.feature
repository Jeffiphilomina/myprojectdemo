Feature: Search and Place the order for Products

Scenario: Search Experience for product search in both home and offers page

Given User is on GreenCart landing page
When User searched with Shortname "Tom" and extracted actual name of product
Then User searched for "Tom" shortname in offers page 
And Validate product name in offers page matches with landing page

//parameterised
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on GreenCart landing page
When User searched with Shortname <Name> and extracted actual name of product
Then User searched for <Name> shortname in offers page 
And Validate product name in offers page matches with landing page

Examples:
| Name |
| Tom  |
| Beet |

@PlaceOrder
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on GreenCart landing page
When User searched with Shortname <Name> and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to Checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| Name |
| Tom  |
