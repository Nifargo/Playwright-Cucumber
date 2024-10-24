Feature: Searching new cars

  In order to search new cars
  As a User
  I have to navigate to to carwale.com

  Scenario Outline: Finding new cars

    Given user navigates to carwale website
    When user mousover to newcars
    Then user clics on findsnewCars link
    And user clicks on "<carBrand>" car
    And user validates carTitle as "<carTitle>"


    Examples:
      | carBrand | carTitle    |
      | Toyota   | Toyota Cars |
      | Kia      | Kia Cars    |
      | Honda    | Honda Cars  |
      | BMW      | BMW Cars    |