Feature: Test Onlys Free page and all your features

  Scenario: Login Successfully
    Given I am on the login Onlys Free page
    When I fill in the login form with valid data
    Then I should be admin user in the Admin Onlys Free page


  Scenario: Go to Categories
    Given I am on the login Onlys Free page
    When I click on the Categories link
    Then I should see the Categories page


  Scenario: Create a new Category
    Given I am on the login Onlys Free page
    When I click on the Categories link
    And I click on the New Category button
    And I fill in the form with valid data
    Then I should see the new category in the Categories page

  Scenario: Delete a Category
    Given I am on the login Onlys Free page
    When I click on the Categories link
    And I click on the Delete button of a category
    Then I should not see the deleted category in the Categories page