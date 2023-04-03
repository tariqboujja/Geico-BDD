Feature: Main Page Related Scenarios

  Background: Navigate to page
    Given I open url of mainpage


  @CBCF-1
  Scenario: Title of the mainpage
    Then verify Title of the Main Page "An Insurance Company For Your Car And More | GEICO"

  @CBCF-3 @smoke @regression
  Scenario Outline: Verify "Insurance options" are displayed
    And  I click  button "Menu"
    Then I click a button "Insurance"
    Then Verify "<Insurance options>" are displayed

    Examples:
      | Insurance options    |
      | Vehicle Insurance    |
      | Property Insurance   |
      | Business Insurance   |
      | Additional Insurance |

  @CBCF-7 @smoke @regression
  Scenario Outline: Verify "AdditionalInsuranceLinks" are displayed
    And  I click  button "Menu"
    Then I click a button "Insurance"
    Then I click the button "Additional Insurance"
    Then I click "<AdditionalInsuranceLinks>"
    Then Verify "<Url>"

    Examples:
      | AdditionalInsuranceLinks      | Url                                         |
      | Types of Additional Insurance | https://www.geico.com/additional-insurance/ |
      | Umbrella                      | https://www.geico.com/umbrella-insurance/   |
      | Life                          | https://www.geico.com/life-insurance/       |
      | Travel                        | https://www.geico.com/travel-insurance/     |
      | Overseas                      | https://www.geico.com/overseas-insurance/   |
      | Identity Protection           | https://www.geico.com/identity-protection/  |
      | Pet                           | https://www.geico.com/pet-insurance/        |
      | Jewelry                       | https://www.geico.com/jewelry-insurance/    |
      | Event                         | https://www.geico.com/event-insurance/      |
      | Bicycle                       | https://www.geico.com/bicycle-insurance/    |

  @CBCF-9 @smoke @regression

  Scenario Outline: Verify "Information link options" are displayed
    And I click  button "Menu"
    Then I click a button "Information"
    Then Verify "<Information link options>" are displayed
    Examples:
      | Information link options |
      | My Account               |
      | Claims and Roadside Help |
      | Tools and Resources      |
      | About GEICO              |
      | Web and Mobile           |
  @CBCF-9 @smoke @regression
  Scenario: Verify Contact Us is displayed under the Information
    And I click  button "Menu"
    Then I click a button "Information"
    Then Verify Contact Us is displayed










