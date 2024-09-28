@smoke
Feature: To search a product and add it to the cart using Amazon

@addtocart
  Scenario: Search for a product using the Amazon website and add it to the cart
  Given User is in Amazon page
   And User click the search box and search a product
   When User click the search button
   And User select a product
   Then User has add a product to the cart