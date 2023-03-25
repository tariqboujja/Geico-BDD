Feature: Main Page Related Scenarios

  Background: Navigate to page
    Given I open url of mainpage

  @CBCF-1
  Scenario: Title of the mainpage
    Then verify Title of the Main Page "An Insurance Company For Your Car And More | GEICO"

  @CBCF-2
  Scenario Outline: The Main Page should display a menu bar “Menu” with following links:
    When the user clicks on "Menu" button
    Then verify Menu "<links>" are displayed
    Examples:
      | links            |
      | Insurance        |
      | Information      |
      | Search geico.com |
      | Top Searches     |

  @CBCF-6
  Scenario Outline: The Information link should display "About Geico" with following links:
    When the user clicks on "Menu" button
    And the user clicks on "Insurance" link
    Then the user clicks on "Business Insurance" link
    Then verify "<links>" are displayed
    Examples:
      | links                       |
      | Types of Business Insurance |
      | Business Owners             |
      | General Liability           |
      | Professional Liability      |
      | Cyber Liability             |
      | Workers' Compensation       |
      | Medical Malpractice         |
      | Wellness & Fitness          |
      | Commercial Auto             |

  @CBCF-16
  Scenario Outline: Main page - Menu - Information
    When the user clicks on "Menu" button
    Then the user clicks on "Information" link
    And the user clicks on "Web and Mobile" link
    And verify "<links>" are displayed
    Then verify "<currentUrl>"
    Examples:
      | links                            | currentUrl                                          |
      | Types of Web and Mobile Services | https://www.geico.com/web-and-mobile/               |
      | GEICO Mobile App                 | https://www.geico.com/web-and-mobile/mobile-apps/   |
      | GEICO Living                     | https://living.geico.com/                           |
      | Social Media                     | https://www.geico.com/web-and-mobile/social-media/  |
      | Site Map                         | https://www.geico.com/web-and-mobile/sitemap/       |
      | Accessibility                    | https://www.geico.com/web-and-mobile/accessibility/ |

  @CBCF-17
  Scenario: Main - Espanol
    When the user clicks on "Espanol"
    Then verify the title of the page "<title>"

  @CBCF-19
  Scenario Outline: Main - Log In - Access Your Policy
    When the user clicks on "<Login>"
    Then the user click on "<Auto>" drop down menu
    And verify "<All policies"> is displayed
    Examples:
      | All policies           |
      | Auto                   |
      | Motorcycle             |
      | ATV                    |
      | Homeowners             |
      | Renters                |
      | Condo                  |
      | Mobile Home            |
      | Boat/PWC               |
      | RV                     |
      | Life                   |
      | Umbrella               |
      | Identity Protection    |
      | Landlord               |
      | Flood                  |
      | Travel                 |
      | Overseas               |
      | Business Owners        |
      | General Liability      |
      | Professional Liability |
      | Workers' Compensation  |
