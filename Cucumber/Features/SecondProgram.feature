

Feature: Application login

Background:

When launch the browser from config variables
And hit the home page url of banking site



 #Reusable
@MobileTest @NetBanking
Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "user" and password "4321"
    Then Home Page is displayed
    And Cards are displayed

#Parameterized
@SmokeTest @Mortgage
Scenario Outline: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

Examples:
 | Username | Password |
 | debituser| hello12  |
 |credituser| lpo213   |
 
 #Regular Expression
 @RegressionTest
 Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with user and password 4321
    Then Home Page is displayed
    And Cards are displayed
    


 