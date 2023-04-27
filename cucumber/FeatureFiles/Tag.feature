#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature:  This is the login feature for Orange HRM
@Positive
Scenario:  This is login1  scenario
   Given user is on login page1
   When The user enters the vaild username1 and password1
   And Clicks on login button1
   Then the user should be navigated to homePage1
   
   @Negative
   Scenario:  This is login2 scenario
   Given user is on login page2
   When The user enters the vaild username2 and password2
   And Clicks on login button2
   Then the user should be navigated to homePage2
