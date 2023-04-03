Feature: Main Page Related Scenarios

  Background: Navigate to page
    Given I open url of mainpage



  @CBCF-1 @smoke @regression
  Scenario: Title of the mainpage
    Then verify Title of the Main Page "An Insurance Company For Your Car And More | GEICO"

  @CBCF-4 @regression
  Scenario Outline: Verify the links of Vehicle Insurance on the main page
    When I click on the "Menu" button
    And I click  the "Insurance" button
    Then I click  on "Vehicle Insurance" button
    Then I click on the links on the Insurance "<link>"
    And verify current url "<currentUrl>"

    Examples:
      | link                       | currentUrl                                       |
      | Types of Vehicle Insurance | https://www.geico.com/vehicle-insurance/         |
      | Auto                       | https://www.geico.com/auto-insurance/            |
      | Motorcycle                 | https://www.geico.com/motorcycle-insurance/      |
      | ATV                        | https://www.geico.com/atv-insurance/             |
      | RV                         | https://www.geico.com/rv-insurance/              |
      | Boat/PWC                   | https://www.geico.com/boat-insurance/            |
      | Collector Auto             | https://www.geico.com/collector-auto-insurance/  |
      | Commercial Auto            | https://www.geico.com/commercial-auto-insurance/ |
      | Mexico Auto                | https://www.geico.com/mexico-auto-insurance/     |


  @CBCF-5 @regression
  Scenario Outline: Verify the links of Property Insurance on the main page
    When I click on the "Menu" button
    And I click  the "Insurance" button
    Then I click "Property Insurance" button
    Then I click the links on the Insurance "<link>"
    And verify current url "<currentUrl>"

    Examples:
      | link                        | currentUrl                                   |
      | Types of Property Insurance | https://www.geico.com/property-insurance/    |
      | Homeowners                  | https://www.geico.com/homeowners-insurance/  |
      | Renters                     | https://www.geico.com/renters-insurance/     |
      | Condo/Co-op                 | https://www.geico.com/condo-insurance/       |
      | Mobile Home                 | https://www.geico.com/mobile-home-insurance/ |
      | Landlord                    | https://www.geico.com/landlord-insurance/    |
      | Flood                       | https://www.geico.com/flood-insurance/       |
      | Earthquake                  | https://www.geico.com/earthquake-insurance/  |

  @CBCF-8 @smoke @regression
  Scenario: The Back button of the Menu links
    When I click on the "Menu" button
    And I click  the "Insurance" button
    Then I click Insurance links buttons

  @CBCF-12  @regression
  Scenario: Menu - Information Link - Tools and Resources
    When I click on the "Menu" button
    Then I should click the "Information" link button
    Then I click  "Tools and Resources" link button
    And Verify the links are displayed


  @CBCF-13 @regression
  Scenario Outline: Verify Menu - Information Link - About GEICO
    When I click on the "Menu" button
    Then I should click the "Information" link button
    Then I click the "About GEICO" link button
    And verify ann click "<links>" under Information
    And verify current url "<currentUrl>"
    Examples:
      | links                     | currentUrl                                                                                                                                  |
      | GEICO Links and Resources | https://www.geico.com/about/                                                                                                                |
      | Careers                   | https://careers.geico.com/us/en/?_gl=1*1bsd21f*_ga*MTAzODc4MzgyNS4xNjc5MjgzNzg0*_ga_91H6GD762W*MTY3OTI4Mzc4My4xLjAuMTY3OTI4Mzc4My42MC4wLjA. |
      | Diversity & Inclusion     | https://www.geico.com/about/diversity-and-inclusion/                                                                                        |
      | Corporate Information     | https://www.geico.com/about/corporate/                                                                                                      |
      | Agency Ownership          | https://www.geico.com/own-an-agency/                                                                                                        |
      | In the Community          | https://www.geico.com/about/in-the-community/                                                                                               |
      | Press Releases            | https://www.geico.com/about/pressreleases/                                                                                                  |
      | B2B Services              | https://www.geico.com/about/b2b-services/                                                                                                   |
      | Organization Discount     | https://www.geico.com/about/organization-discount/                                                                                          |
      | Associates & Retirees     | https://www.geico.com/about/associates/                                                                                                     |
      | Insurers                  | https://www.geico.com/about/corporate/corporate-ownership/                                                                                  |
      | GEICO Commercials         | https://www.geico.com/about/commercials/                                                                                                    |

  @CBCF-16 @regression
  Scenario: Main Page: Search Box
    When I click on the "Menu" button
    Then I verify the "Search geico.com" is displayed
    And I verify a "Search box" is displayed
    When I enter "Auto Insurance" in the search box
    Then I click on the "Search" button and verify the current url

  @CBCF-18 @regression
  Scenario:Main page - Login access - Main 3 options
    When I verify the "Log In" button is displayed
    Then I click a "Log In" button
    And  options "Access Your Policy", "Claims Center", and "Location" should be displayed

  @CBCF-21  @regression
  Scenario: Main page Login - Geico Mobile App - Web & Mobile page
    Then I click a "Log In" button
    And click  on "GEICO Mobile App" btn
    Then it should navigate to the Web & Mobile page and verify title "GEICO's Mobile App ~ Free Insurance App | GEICO"

    Then I click a "Log In" button

    Then a user clicks on "Activate Account" link
    And verify  title of the page "Online Service Center | GEICO"

  @CBCF-22
  Scenario: Main page - Login - Claims Center
    When I click a "Log In" button
    Then  user clicks on "Report an accident"
    And verifies the title of the page "Report a Claim"

  @CBCF-23
  Scenario: Main page - Login - Claim Center
    When I click a "Log In" button
    Then I click on "Track a claim" link
    And user verify the title of the page "Access Your Claim"

  @CBCF-25
  Scenario: Main page - Login - Claims Center
    When I click a "Log In" button
    Then I click  "Request roadside assistance"
    And I verify the title of the page "Report a Claim"

  @CBCF-29
  Scenario: Main page Login - Feedback - Website Feedback page
    When I click a "Log In" button
    Then I click  "Feedback" button
    And verify page title "An Insurance Company For Your Car And More | GEICO"


  @CBCF-24  @regression
  Scenario: Main page Login - Claims Center - Report glass-only damage page
    Then I click a "Log In" button
    And click  on "Report glass-only damage" button
    Then it should navigate to the Report Claim page and verify title of the page "Report a Claim"
    And verify the Report a Claim form is displayed

  @CBCF-26  @regression
  Scenario: Main page Login - Location - zip code update
    Then I click a "Log In" button
    And Verify the "Location" sign is displayed
    And Verify the location box is displayed
    Then I type a zip code in the location box
    And  click on the "Update" button
    Then Verify the the new zip code is displayed

  @CBCF-27  @regression
  Scenario:  Main page Login - Location - change Location
    Then I click a "Log In" button
    And Verify the "Location" sign is displayed
    Then I type a zip code in the location box
    And  click on the "Update" button
    Then I click on the Change location button
    Then I type a zip code in the location box
    And  click on the "Update" button
    Then Verify the the new zip code is displayed

  @CBCF-28  @regression
  Scenario: Main page Login - pop-up window - close
    Then I click a "Log In" button
    Then I verify "Access Your Policy" is displayed
    Then I click btn

  @CBCF-30  @regression
  Scenario Outline: Mane Page - Menu - Top Searches
    When I click on the "Menu" button
    Then I verify "Top Searches" is displayed
    Then I click on the "<Top Searches>" link
    And verify title of the page "<title>"

    Examples:
      | Top Searches           | title                                                       |
      | Insurance In Canada    | Information Regarding GEICO Insurance And Canada \| GEICO   |
      | Contact Us             | Contact GEICO Customer Service: Chat, Email & More \| GEICO |
      | Get An Insurance Quote | An Insurance Company For Your Car And More \| GEICO         |

  @CBCF-31  @regression
  Scenario: Main Page - Menu - Dark Mode button
    When I click on the "Menu" button
    Then I verify the "Dark Mode" button is displayed
    And I click the button to change the screen mode
    Then I verify the screen mode is changed
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












