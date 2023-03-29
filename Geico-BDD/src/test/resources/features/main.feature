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

  @CBCF-15
  Scenario: Main page - Menu - Information
    When user clicks on "Menu" button
    Then user clicks on "Information" link
    Then  user clicks  "Contact Us"
    And verify the title of that page "Contact GEICO Customer Service: Chat, Email & More | GEICO"

  @CBCF-16
  Scenario Outline: Main page - Menu - Information
    When the user clicks on "Menu" button
    Then the user clicks on "Information" link
    And the user clicks on "Web and Mobile" link
    And verify "<links>" are displayed
    Then verify "<currentUrl>"
    Examples:
      | links                            | currentUrl             |
      | Types of Web and Mobile Services | https://www.geico.com/ |
      | GEICO Living                     | https://www.geico.com/ |
      | Social Media                     | https://www.geico.com/ |
      | Site Map                         | https://www.geico.com/ |
      | Accessibility                    | https://www.geico.com/ |

  @CBCF-17
  Scenario: Main - Espanol
    When the user clicks on "Espanol"
    Then verify the title of the page "<title>"

  @CBCF-19
  Scenario Outline: Main - Log In - Access Your Policy
    Then I click a "Log In" button
    Then the user click on "Auto" drop down menu
    And verify "<All policies>" is displayed
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

  @CBCF-20
  Scenario: Main page - Login - New user - Activation page
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





