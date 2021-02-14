Feature: adding a product to the cart and checkout
Scenario: adding product to cart
Given the product should be in stock
When the user wishes to buy the product
Then user adds the product to cart


Scenario: checking out the product

Given the product should be in cart
When user wants to checkout the products in cart 
Then user makes payment and checks out