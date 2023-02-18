Feature: UI tests for https://www.saucedemo.com/

  @ui
  Scenario: Sort products by name in descending order
    Given the user is on the login page
    When the user logs in with username "standard_user" and password "secret_sauce"
    And the user sorts the products by name in "Z to A" order
    Then the products should be displayed in descending order

  @ui
  Scenario: Clicking on a product name in the lower left corner should fail
    Given the user is on the inventory page
    When the user clicks on the product name in the lower left corner
    Then the test should fail

  @ui
  Scenario: Verify that the cart is empty
    Given the user is on the inventory page
    When the user checks the cart
    Then the cart should be empty

  @ui
  Scenario: Add a product to the cart and verify that "Add to cart" has been replaced with "Remove"
    Given the user is on the inventory page
    When the user adds a product to the cart
    Then the text "Add to cart" should be replaced with "Remove"
