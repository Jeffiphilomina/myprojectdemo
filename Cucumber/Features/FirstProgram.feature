

Feature: Application login

Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@SmokeTest @RegressionTest 
Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

 #Reusable
@RegressionTest
Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with "user" and password "4321"
    Then Home Page is displayed
    And Cards are displayed

#Parameterized
@SmokeTest @RegressionTest
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
    
#Data Driven testing
Scenario: User Page default Sign up
	Given User is on Practice landing page
	When User signup into application
	|Jeffi|
	|Philomina|
	|jeffi@gmail.com|
	|543778278828|
	Then Home Page is displayed
	And Cards are displayed

 