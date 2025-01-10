Feature: Validate information about the page

  @PerylothPage
  Scenario: Validate information about the page
    Given that the user navigates to the Peryloth page
    When the user validates the information about the page
    Then the page title should be "Luis Enrique Plata Osorio"
    And there should be exactly 1 `h1` element on the page
    And the only `h1` element should contain "Luis Enrique Plata Osorio"
    And there should be exactly 2 h2 element on the page
    And the only the first h2 element should contain "Unity Developer"
    And the only the second h2 element should contain "Projects"
    And there should be an image inside a `div` with the class `image`
    And there should be a 7 buttons to navigate to the different outside pages
    And there should be greater than 1 `article` in `div` with the class `inner`
    And Say how much `article` there are in `div` with the class `inner`
    And there should be each `article` with a `image` src attribute that is not empty

